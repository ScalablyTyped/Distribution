package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a member in a data pilot source level.
  *
  * Members are the data items that will appear in a data pilot table as row headers and column headers of the data range (if used in row or column
  * dimensions), or to calculate the values of the data range (if used in data dimensions).
  * @see com.sun.star.sheet.DataPilotSourceLevel
  * @see com.sun.star.sheet.DataPilotSource
  */
trait DataPilotSourceMember
  extends StObject
     with XNamed
     with XPropertySet {
  
  /** specifies whether the member is visible. */
  var IsVisible: Boolean
  
  /**
    * specifies the member's position in its hierarchy level if sorting is manual.
    * @since OOo 2.4
    */
  var Position: Boolean
  
  /** specifies whether details for the member are shown. */
  var ShowDetails: Boolean
}
object DataPilotSourceMember {
  
  @scala.inline
  def apply(
    IsVisible: Boolean,
    Name: String,
    Position: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ShowDetails: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DataPilotSourceMember = {
    val __obj = js.Dynamic.literal(IsVisible = IsVisible.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ShowDetails = ShowDetails.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DataPilotSourceMember]
  }
  
  @scala.inline
  implicit class DataPilotSourceMemberMutableBuilder[Self <: DataPilotSourceMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Boolean): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDetails(value: Boolean): Self = StObject.set(x, "ShowDetails", value.asInstanceOf[js.Any])
  }
}

package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** adds a property to determine the sort order of the column values within the index. Some database drivers may ignore this property. */
trait IndexColumn
  extends StObject
     with Column {
  
  /** is the column sorted in ascending order. */
  var IsAscending: Boolean
}
object IndexColumn {
  
  @scala.inline
  def apply(
    DefaultValue: String,
    Description: String,
    IsAscending: Boolean,
    IsAutoIncrement: Boolean,
    IsCurrency: Boolean,
    IsNullable: Double,
    IsRowVersion: Boolean,
    Name: String,
    Precision: Double,
    PropertySetInfo: XPropertySetInfo,
    Scale: Double,
    Type: Double,
    TypeName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): IndexColumn = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IsAscending = IsAscending.asInstanceOf[js.Any], IsAutoIncrement = IsAutoIncrement.asInstanceOf[js.Any], IsCurrency = IsCurrency.asInstanceOf[js.Any], IsNullable = IsNullable.asInstanceOf[js.Any], IsRowVersion = IsRowVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[IndexColumn]
  }
  
  @scala.inline
  implicit class IndexColumnMutableBuilder[Self <: IndexColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAscending(value: Boolean): Self = StObject.set(x, "IsAscending", value.asInstanceOf[js.Any])
  }
}

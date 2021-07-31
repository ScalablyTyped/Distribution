package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * adds a property to specify the referenced column. This is used to specify foreign keys.
  * @see com.sun.star.sdbcx.KeyColumn
  */
trait KeyColumnDescriptor
  extends StObject
     with Descriptor {
  
  /** is the name of a reference column out of the referenced table. */
  var RelatedColumn: String
}
object KeyColumnDescriptor {
  
  @scala.inline
  def apply(
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    RelatedColumn: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): KeyColumnDescriptor = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelatedColumn = RelatedColumn.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[KeyColumnDescriptor]
  }
  
  @scala.inline
  implicit class KeyColumnDescriptorMutableBuilder[Self <: KeyColumnDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedColumn(value: String): Self = StObject.set(x, "RelatedColumn", value.asInstanceOf[js.Any])
  }
}

package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows the inspection of an object's properties and methods.
  *
  * **Important note:** An object can only be inspected completely if it supports the {@link com.sun.star.lang.XTypeProvider} interface.
  *
  * For details see method {@link XIntrospection.inspect()} .
  * @see XIntrospectionAccess
  */
@js.native
trait XIntrospection extends XInterface {
  
  /**
    * inspects the given object.
    *
    * It identifies all properties supported by the object if they are represented in one of the following ways:
    *
    * **property set  **: If the object supports an {@link XPropertySet} interface, all its properties are adopted.;
    *
    * **attributes  **: All of an object's attributes are considered as properties with same name. If an attribute is read-only, the property also is
    * read-only.;
    *
    * **get/set methods  **: Every method `RetType getX()` defines a property where "X" stands for the property name and "RetType" for its type. The method
    * must not have any parameters, or there is no property access method and "X" has no property. If there is also a method `void setX( [in] RetType )` ,
    * the property "X" also allows write access; otherwise it is read-only.;
    *
    * **Important note:**: If an object implements {@link com.sun.star.container.XNameAccess} , the items that can be accessed are not considered as
    * properties of the object and so are not included in the property list offered by {@link com.sun.star.beans.XIntrospectionAccess.getProperties()} .
    * {@link com.sun.star.container.XNameAccess} items have to be accessed separately by com::sun::star::beans::XIntrospectionAccess::getNameAccess().
    *
    *
    *
    * In addition, the inspect method identifies all listener access methods in the form `add...Listener` / `remove...Listener` (except methods of interface
    * {@link XPropertySet} ) where "..." stands for the listener type.
    *
    * Methods which do not belong to a property nor which represent a listener access nor which are methods of {@link XPropertySet} , {@link
    * com.sun.star.container.XNameAccess} , {@link com.sun.star.container.XIndexAccess} , or {@link com.sun.star.container.XEnumerationAccess} , are
    * considered to be normal methods.
    * @see XIntrospectionAccess
    */
  def inspect(aObject: js.Any): XIntrospectionAccess = js.native
}
object XIntrospection {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    inspect: js.Any => XIntrospectionAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIntrospection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), inspect = js.Any.fromFunction1(inspect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIntrospection]
  }
  
  @scala.inline
  implicit class XIntrospectionOps[Self <: XIntrospection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInspect(value: js.Any => XIntrospectionAccess): Self = this.set("inspect", js.Any.fromFunction1(value))
  }
}

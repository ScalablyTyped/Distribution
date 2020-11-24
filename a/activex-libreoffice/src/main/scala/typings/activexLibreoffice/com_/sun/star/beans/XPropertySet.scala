package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides information about and access to the properties from an implementation.
  *
  * There are three types of properties:
  *
  * bound propertiesconstrained propertiesfree properties
  *
  * You can listen to changes of bound properties with the {@link XPropertyChangeListener} and you can veto changes of constrained properties with the
  * {@link XVetoableChangeListener} .
  *
  * To implement inaccurate name access, you must support the interface {@link XExactName} .
  * @see com.sun.star.beans.XExactName
  */
@js.native
trait XPropertySet extends XInterface {
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  val PropertySetInfo: XPropertySetInfo = js.native
  
  /**
    * adds an {@link XPropertyChangeListener} to the specified property.
    *
    * An empty name ("") registers the listener to all bound properties. If the property is not bound, the behavior is not specified.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see removePropertyChangeListener
    */
  def addPropertyChangeListener(aPropertyName: String, xListener: XPropertyChangeListener): Unit = js.native
  
  /**
    * adds an {@link XVetoableChangeListener} to the specified property with the name PropertyName.
    *
    * An empty name ("") registers the listener to all constrained properties. If the property is not constrained, the behavior is not specified.
    * @see removeVetoableChangeListener
    */
  def addVetoableChangeListener(PropertyName: String, aListener: XVetoableChangeListener): Unit = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  def getPropertySetInfo(): XPropertySetInfo = js.native
  
  /**
    * @param PropertyName This parameter specifies the name of the property.
    * @returns the value of the property with the specified name.
    * @throws UnknownPropertyException if the property does not exist.
    * @throws com::sun::star::lang::WrappedTargetException if the implementation has an internal reason for the exception. In this case the original exception
    */
  def getPropertyValue(PropertyName: String): js.Any = js.native
  
  /**
    * removes an {@link XPropertyChangeListener} from the listener list.
    *
    * It is a "noop" if the listener is not registered.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see addPropertyChangeListener
    */
  def removePropertyChangeListener(aPropertyName: String, aListener: XPropertyChangeListener): Unit = js.native
  
  /**
    * removes an {@link XVetoableChangeListener} from the listener list.
    *
    * It is a "noop" if the listener is not registered.
    * @see addVetoableChangeListener
    */
  def removeVetoableChangeListener(PropertyName: String, aListener: XVetoableChangeListener): Unit = js.native
  
  /**
    * sets the value of the property with the specified name.
    *
    * If it is a bound property the value will be changed before the change event is fired. If it is a constrained property a vetoable event is fired before
    * the property value can be changed.
    * @throws com::sun::star::beans::PropertyVetoException if the property is read-only or vetoable and one of the listeners throws this exception because of a
    */
  def setPropertyValue(aPropertyName: String, aValue: js.Any): Unit = js.native
}
object XPropertySet {
  
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
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
  ): XPropertySet = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XPropertySet]
  }
  
  @scala.inline
  implicit class XPropertySetOps[Self <: XPropertySet] (val x: Self) extends AnyVal {
    
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
    def setPropertySetInfo(value: XPropertySetInfo): Self = this.set("PropertySetInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddPropertyChangeListener(value: (String, XPropertyChangeListener) => Unit): Self = this.set("addPropertyChangeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddVetoableChangeListener(value: (String, XVetoableChangeListener) => Unit): Self = this.set("addVetoableChangeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = this.set("getPropertySetInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPropertyValue(value: String => js.Any): Self = this.set("getPropertyValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovePropertyChangeListener(value: (String, XPropertyChangeListener) => Unit): Self = this.set("removePropertyChangeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveVetoableChangeListener(value: (String, XVetoableChangeListener) => Unit): Self = this.set("removeVetoableChangeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPropertyValue(value: (String, js.Any) => Unit): Self = this.set("setPropertyValue", js.Any.fromFunction2(value))
  }
}

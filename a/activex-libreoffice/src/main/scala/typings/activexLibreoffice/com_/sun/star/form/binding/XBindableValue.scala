package typings.activexLibreoffice.com_.sun.star.form.binding

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies support for being bound to an external value
  * @see XValueBinding
  */
@js.native
trait XBindableValue extends XInterface {
  
  /** retrieves the external instance which currently controls the value of the component */
  var ValueBinding: XValueBinding = js.native
  
  /** retrieves the external instance which currently controls the value of the component */
  def getValueBinding(): XValueBinding = js.native
  
  /**
    * sets an external instance which controls the value of the component
    *
    * Any previously active binding will be revoked. There can be only one!
    * @param aBinding the new binding which is to be used by the component. May be `NULL` , in this case only the current binding is revoked.
    * @throws IncompatibleTypesException if the new binding (provided it's not `NULL` ) supports only types which are incompatible with the types of the bindab
    */
  def setValueBinding(aBinding: XValueBinding): Unit = js.native
}
object XBindableValue {
  
  @scala.inline
  def apply(
    ValueBinding: XValueBinding,
    acquire: () => Unit,
    getValueBinding: () => XValueBinding,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValueBinding: XValueBinding => Unit
  ): XBindableValue = {
    val __obj = js.Dynamic.literal(ValueBinding = ValueBinding.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getValueBinding = js.Any.fromFunction0(getValueBinding), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValueBinding = js.Any.fromFunction1(setValueBinding))
    __obj.asInstanceOf[XBindableValue]
  }
  
  @scala.inline
  implicit class XBindableValueOps[Self <: XBindableValue] (val x: Self) extends AnyVal {
    
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
    def setValueBinding(value: XValueBinding): Self = this.set("ValueBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetValueBinding(value: () => XValueBinding): Self = this.set("getValueBinding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValueBinding(value: XValueBinding => Unit): Self = this.set("setValueBinding", js.Any.fromFunction1(value))
  }
}

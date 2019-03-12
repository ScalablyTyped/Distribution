package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.bindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies support for being bound to an external value
  * @see XValueBinding
  */
trait XBindableValue
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieves the external instance which currently controls the value of the component */
  var ValueBinding: XValueBinding
  /** retrieves the external instance which currently controls the value of the component */
  def getValueBinding(): XValueBinding
  /**
    * sets an external instance which controls the value of the component
    *
    * Any previously active binding will be revoked. There can be only one!
    * @param aBinding the new binding which is to be used by the component. May be `NULL` , in this case only the current binding is revoked.
    * @throws IncompatibleTypesException if the new binding (provided it's not `NULL` ) supports only types which are incompatible with the types of the bindab
    */
  def setValueBinding(aBinding: XValueBinding): scala.Unit
}

object XBindableValue {
  @scala.inline
  def apply(
    ValueBinding: XValueBinding,
    acquire: () => scala.Unit,
    getValueBinding: () => XValueBinding,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setValueBinding: XValueBinding => scala.Unit
  ): XBindableValue = {
    val __obj = js.Dynamic.literal(ValueBinding = ValueBinding, acquire = js.Any.fromFunction0(acquire), getValueBinding = js.Any.fromFunction0(getValueBinding), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValueBinding = js.Any.fromFunction1(setValueBinding))
  
    __obj.asInstanceOf[XBindableValue]
  }
}


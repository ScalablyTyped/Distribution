package typings
package atAngularCoreLib.srcRender3InterfacesPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingStore extends js.Object {
  def setValue(prop: java.lang.String, value: js.Any): scala.Unit
}

object BindingStore {
  @scala.inline
  def apply(setValue: (java.lang.String, js.Any) => scala.Unit): BindingStore = {
    val __obj = js.Dynamic.literal(setValue = js.Any.fromFunction2(setValue))
  
    __obj.asInstanceOf[BindingStore]
  }
}


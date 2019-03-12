package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.typeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypeahead extends js.Object {
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit]
  def hide(): scala.Unit
  def show(): scala.Unit
  def toggle(): scala.Unit
}

object ITypeahead {
  @scala.inline
  def apply(
    $promise: angularLib.angularMod.angularNs.IPromise[scala.Unit],
    hide: () => scala.Unit,
    show: () => scala.Unit,
    toggle: () => scala.Unit
  ): ITypeahead = {
    val __obj = js.Dynamic.literal($promise = $promise, hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[ITypeahead]
  }
}


package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalInstanceService extends js.Object {
  /**
    * A promise that is resolved when a modal is closed and the animation completes.
    */
  var closed: angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * A promise that is resolved when a modal gets opened after downloading content's template and resolving all variables.
    */
  var opened: angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * A promise that is resolved when a modal is rendered.
    */
  var rendered: angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * A promise that is resolved when a modal is closed and rejected when a modal is dismissed.
    */
  var result: angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * A method that can be used to close a modal, passing a result. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    */
  def close(): scala.Unit = js.native
  def close(result: js.Any): scala.Unit = js.native
  /**
    * A method that can be used to dismiss a modal, passing a reason. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    */
  def dismiss(): scala.Unit = js.native
  def dismiss(reason: js.Any): scala.Unit = js.native
}


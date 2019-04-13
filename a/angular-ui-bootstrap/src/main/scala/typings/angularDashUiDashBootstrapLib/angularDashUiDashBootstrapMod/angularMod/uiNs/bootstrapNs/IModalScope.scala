package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalScope
  extends angularLib.angularMod.IRootScopeService {
  /**
    * Close the dialog resolving the promise to the given value. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    *
    * @returns true if the modal was closed; otherwise false
    */
  @JSName("$close")
  def $close(): scala.Boolean = js.native
  @JSName("$close")
  def $close(result: js.Any): scala.Boolean = js.native
  /**
    * Dismiss the dialog without assigning a value to the promise output. If `preventDefault` is called on the `modal.closing` event then the modal will remain open.
    *
    * @returns true if the modal was closed; otherwise false
    */
  @JSName("$dismiss")
  def $dismiss(): scala.Boolean = js.native
  @JSName("$dismiss")
  def $dismiss(reason: js.Any): scala.Boolean = js.native
}


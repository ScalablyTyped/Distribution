package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalStackService extends js.Object {
  /**
    * Closes a modal instance with an optional result.
    */
  def close(modalInstance: IModalInstanceService): scala.Unit = js.native
  def close(modalInstance: IModalInstanceService, result: js.Any): scala.Unit = js.native
  /**
    * Dismisses a modal instance with an optional reason.
    */
  def dismiss(modalInstance: IModalInstanceService): scala.Unit = js.native
  def dismiss(modalInstance: IModalInstanceService, reason: js.Any): scala.Unit = js.native
  /**
    * Dismiss all open modal instances with an optional reason that will be passed to each instance.
    */
  def dismissAll(): scala.Unit = js.native
  def dismissAll(reason: js.Any): scala.Unit = js.native
  /**
    * Gets the topmost modal instance that is open.
    */
  def getTop(): IModalStackedMapKeyValuePair = js.native
  /**
    * Opens a new modal instance.
    */
  def open(modalInstance: IModalInstanceService, modal: js.Any): scala.Unit = js.native
}


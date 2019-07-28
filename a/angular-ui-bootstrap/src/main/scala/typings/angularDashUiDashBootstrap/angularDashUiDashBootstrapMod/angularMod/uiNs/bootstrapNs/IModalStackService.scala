package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalStackService extends js.Object {
  /**
    * Closes a modal instance with an optional result.
    */
  def close(
    modalInstance: typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalInstanceService
  ): Unit = js.native
  def close(
    modalInstance: typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalInstanceService,
    result: js.Any
  ): Unit = js.native
  /**
    * Dismisses a modal instance with an optional reason.
    */
  def dismiss(
    modalInstance: typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalInstanceService
  ): Unit = js.native
  def dismiss(
    modalInstance: typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalInstanceService,
    reason: js.Any
  ): Unit = js.native
  /**
    * Dismiss all open modal instances with an optional reason that will be passed to each instance.
    */
  def dismissAll(): Unit = js.native
  def dismissAll(reason: js.Any): Unit = js.native
  /**
    * Gets the topmost modal instance that is open.
    */
  def getTop(): typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalStackedMapKeyValuePair = js.native
  /**
    * Opens a new modal instance.
    */
  def open(
    modalInstance: typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalInstanceService,
    modal: js.Any
  ): Unit = js.native
}


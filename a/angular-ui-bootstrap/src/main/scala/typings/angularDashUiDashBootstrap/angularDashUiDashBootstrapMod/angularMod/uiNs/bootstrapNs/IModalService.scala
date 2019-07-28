package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalService extends js.Object {
  /**
    * @returns {IPromise}
    */
  def getPromiseChain(): IPromise[_]
  /**
    * @param {IModalSettings} options
    * @returns {IModalInstanceService}
    */
  def open(
    options: typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalSettings
  ): typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalInstanceService
}

object IModalService {
  @scala.inline
  def apply(
    getPromiseChain: () => IPromise[_],
    open: typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalSettings => typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs.IModalInstanceService
  ): IModalService = {
    val __obj = js.Dynamic.literal(getPromiseChain = js.Any.fromFunction0(getPromiseChain), open = js.Any.fromFunction1(open))
  
    __obj.asInstanceOf[IModalService]
  }
}


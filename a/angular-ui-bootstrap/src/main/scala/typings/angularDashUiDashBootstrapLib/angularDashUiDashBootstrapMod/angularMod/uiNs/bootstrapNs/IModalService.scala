package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModalService extends js.Object {
  /**
    * @returns {IPromise}
    */
  def getPromiseChain(): angularLib.angularMod.angularNs.IPromise[_]
  /**
    * @param {IModalSettings} options
    * @returns {IModalInstanceService}
    */
  def open(options: IModalSettings): IModalInstanceService
}

object IModalService {
  @scala.inline
  def apply(
    getPromiseChain: js.Function0[angularLib.angularMod.angularNs.IPromise[_]],
    open: js.Function1[IModalSettings, IModalInstanceService]
  ): IModalService = {
    val __obj = js.Dynamic.literal(getPromiseChain = getPromiseChain, open = open)
  
    __obj.asInstanceOf[IModalService]
  }
}


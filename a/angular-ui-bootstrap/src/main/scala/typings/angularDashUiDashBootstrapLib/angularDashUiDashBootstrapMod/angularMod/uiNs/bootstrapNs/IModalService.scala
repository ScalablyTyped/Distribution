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
    getPromiseChain: () => angularLib.angularMod.angularNs.IPromise[_],
    open: IModalSettings => IModalInstanceService
  ): IModalService = {
    val __obj = js.Dynamic.literal(getPromiseChain = js.Any.fromFunction0(getPromiseChain), open = js.Any.fromFunction1(open))
  
    __obj.asInstanceOf[IModalService]
  }
}


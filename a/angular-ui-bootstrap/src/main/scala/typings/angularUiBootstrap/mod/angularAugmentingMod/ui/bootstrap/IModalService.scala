package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IPromise
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
  def open(options: IModalSettings): IModalInstanceService
}

object IModalService {
  @scala.inline
  def apply(getPromiseChain: () => IPromise[_], open: IModalSettings => IModalInstanceService): IModalService = {
    val __obj = js.Dynamic.literal(getPromiseChain = js.Any.fromFunction0(getPromiseChain), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IModalService]
  }
}


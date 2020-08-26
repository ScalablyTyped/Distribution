package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalService extends js.Object {
  /**
    * @returns {IPromise}
    */
  def getPromiseChain(): IPromise[_] = js.native
  /**
    * @param {IModalSettings} options
    * @returns {IModalInstanceService}
    */
  def open(options: IModalSettings): IModalInstanceService = js.native
}

object IModalService {
  @scala.inline
  def apply(getPromiseChain: () => IPromise[_], open: IModalSettings => IModalInstanceService): IModalService = {
    val __obj = js.Dynamic.literal(getPromiseChain = js.Any.fromFunction0(getPromiseChain), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IModalService]
  }
  @scala.inline
  implicit class IModalServiceOps[Self <: IModalService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPromiseChain(value: () => IPromise[_]): Self = this.set("getPromiseChain", js.Any.fromFunction0(value))
    @scala.inline
    def setOpen(value: IModalSettings => IModalInstanceService): Self = this.set("open", js.Any.fromFunction1(value))
  }
  
}


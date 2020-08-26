package typings.angularUiRouter.mod.angularAugmentingMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUiViewScrollProvider extends js.Object {
  /*
    * Reverts back to using the core $anchorScroll service for scrolling
    * based on the url anchor.
    */
  def useAnchorScroll(): Unit = js.native
}

object IUiViewScrollProvider {
  @scala.inline
  def apply(useAnchorScroll: () => Unit): IUiViewScrollProvider = {
    val __obj = js.Dynamic.literal(useAnchorScroll = js.Any.fromFunction0(useAnchorScroll))
    __obj.asInstanceOf[IUiViewScrollProvider]
  }
  @scala.inline
  implicit class IUiViewScrollProviderOps[Self <: IUiViewScrollProvider] (val x: Self) extends AnyVal {
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
    def setUseAnchorScroll(value: () => Unit): Self = this.set("useAnchorScroll", js.Any.fromFunction0(value))
  }
  
}


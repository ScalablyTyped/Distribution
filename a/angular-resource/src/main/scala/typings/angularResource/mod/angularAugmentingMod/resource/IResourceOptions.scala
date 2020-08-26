package typings.angularResource.mod.angularAugmentingMod.resource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Currently supported options for the $resource factory options argument.
  */
@js.native
trait IResourceOptions extends js.Object {
  /**
    * If true, the request made by a "non-instance" call will be cancelled (if not already completed) by calling
    * $cancelRequest() on the call's return value. This can be overwritten per action. (Defaults to false.)
    */
  var cancellable: js.UndefOr[Boolean] = js.native
  /**
    * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
    */
  var stripTrailingSlashes: js.UndefOr[Boolean] = js.native
}

object IResourceOptions {
  @scala.inline
  def apply(): IResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceOptions]
  }
  @scala.inline
  implicit class IResourceOptionsOps[Self <: IResourceOptions] (val x: Self) extends AnyVal {
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
    def setCancellable(value: Boolean): Self = this.set("cancellable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancellable: Self = this.set("cancellable", js.undefined)
    @scala.inline
    def setStripTrailingSlashes(value: Boolean): Self = this.set("stripTrailingSlashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripTrailingSlashes: Self = this.set("stripTrailingSlashes", js.undefined)
  }
  
}


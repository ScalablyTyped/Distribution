package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceAllObjectsOptions extends js.Object {
  /**
    * If the all objects should be replaced using wait operations. Keep
    * in mind that, when the `safe` option is used, the operation may
    * take a little more than expected.
    */
  val safe: js.UndefOr[Boolean] = js.native
}

object ReplaceAllObjectsOptions {
  @scala.inline
  def apply(): ReplaceAllObjectsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllObjectsOptions]
  }
  @scala.inline
  implicit class ReplaceAllObjectsOptionsOps[Self <: ReplaceAllObjectsOptions] (val x: Self) extends AnyVal {
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
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
  }
  
}


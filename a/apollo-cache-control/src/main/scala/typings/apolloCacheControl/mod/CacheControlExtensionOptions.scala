package typings.apolloCacheControl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheControlExtensionOptions extends js.Object {
  var calculateHttpHeaders: js.UndefOr[Boolean] = js.native
  var defaultMaxAge: js.UndefOr[Double] = js.native
  var stripFormattedExtensions: js.UndefOr[Boolean] = js.native
}

object CacheControlExtensionOptions {
  @scala.inline
  def apply(): CacheControlExtensionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheControlExtensionOptions]
  }
  @scala.inline
  implicit class CacheControlExtensionOptionsOps[Self <: CacheControlExtensionOptions] (val x: Self) extends AnyVal {
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
    def setCalculateHttpHeaders(value: Boolean): Self = this.set("calculateHttpHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculateHttpHeaders: Self = this.set("calculateHttpHeaders", js.undefined)
    @scala.inline
    def setDefaultMaxAge(value: Double): Self = this.set("defaultMaxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMaxAge: Self = this.set("defaultMaxAge", js.undefined)
    @scala.inline
    def setStripFormattedExtensions(value: Boolean): Self = this.set("stripFormattedExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripFormattedExtensions: Self = this.set("stripFormattedExtensions", js.undefined)
  }
  
}


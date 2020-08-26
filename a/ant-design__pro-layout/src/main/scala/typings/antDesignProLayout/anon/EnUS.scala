package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnUS extends js.Object {
  var `en-US`: Appsettingcontentwidth = js.native
  var `it-IT`: Appsettingcontentwidthfixed = js.native
  var `zh-CN`: Appsettingcontentwidth = js.native
  var `zh-TW`: Appsettingcontentwidthfixed = js.native
}

object EnUS {
  @scala.inline
  def apply(
    `en-US`: Appsettingcontentwidth,
    `it-IT`: Appsettingcontentwidthfixed,
    `zh-CN`: Appsettingcontentwidth,
    `zh-TW`: Appsettingcontentwidthfixed
  ): EnUS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("en-US")(`en-US`.asInstanceOf[js.Any])
    __obj.updateDynamic("it-IT")(`it-IT`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-CN")(`zh-CN`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-TW")(`zh-TW`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnUS]
  }
  @scala.inline
  implicit class EnUSOps[Self <: EnUS] (val x: Self) extends AnyVal {
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
    def `setEn-US`(value: Appsettingcontentwidth): Self = this.set("en-US", value.asInstanceOf[js.Any])
    @scala.inline
    def `setIt-IT`(value: Appsettingcontentwidthfixed): Self = this.set("it-IT", value.asInstanceOf[js.Any])
    @scala.inline
    def `setZh-CN`(value: Appsettingcontentwidth): Self = this.set("zh-CN", value.asInstanceOf[js.Any])
    @scala.inline
    def `setZh-TW`(value: Appsettingcontentwidthfixed): Self = this.set("zh-TW", value.asInstanceOf[js.Any])
  }
  
}


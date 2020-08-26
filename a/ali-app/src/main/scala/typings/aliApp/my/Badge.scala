package typings.aliApp.my

import typings.aliApp.aliAppStrings.more
import typings.aliApp.aliAppStrings.none
import typings.aliApp.aliAppStrings.num
import typings.aliApp.aliAppStrings.point
import typings.aliApp.aliAppStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge extends js.Object {
  /** 需要飘红的选项的索引，从0开始 */
  var index: Double = js.native
  /**
    * 自定义飘红文案：
    *
    * 1、type为none/point/more时本文案可不填
    * 2、type为num时本文案为小数或<=0均不显示, >100 显示"..."
    */
  var text: String = js.native
  /**
    * 飘红类型，支持 none（无红点）/ point（纯红点） / num（数字红点）/ text（文案红点）/ more（...）
    *
    */
  var `type`: none | point | num | text | more | String = js.native
}

object Badge {
  @scala.inline
  def apply(index: Double, text: String, `type`: none | point | num | text | more | String): Badge = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
  @scala.inline
  implicit class BadgeOps[Self <: Badge] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: none | point | num | text | more | String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


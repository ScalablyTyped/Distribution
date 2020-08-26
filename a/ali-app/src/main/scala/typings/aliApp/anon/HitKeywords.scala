package typings.aliApp.anon

import typings.aliApp.my.TextRiskIdentificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HitKeywords extends js.Object {
  /**
    * 仅当识别命中了 type 为 keyword 时，才会返回该字段
    */
  var hitKeywords: js.UndefOr[js.Array[String]] = js.native
  /**
    * 识别命中得分，最高分100分。仅当识别没有命中 keyword ，但入参中包含了广告或涉政或涉黄时，才会返回该字段
    */
  var score: js.UndefOr[String] = js.native
  /**
    * 目标内容文本识别到的类型，keyword 表示关键词、0 表示广告、1表示涉政、2表示涉黄、3表示低俗辱骂
    */
  var `type`: TextRiskIdentificationType = js.native
}

object HitKeywords {
  @scala.inline
  def apply(`type`: TextRiskIdentificationType): HitKeywords = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitKeywords]
  }
  @scala.inline
  implicit class HitKeywordsOps[Self <: HitKeywords] (val x: Self) extends AnyVal {
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
    def setType(value: TextRiskIdentificationType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitKeywordsVarargs(value: String*): Self = this.set("hitKeywords", js.Array(value :_*))
    @scala.inline
    def setHitKeywords(value: js.Array[String]): Self = this.set("hitKeywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitKeywords: Self = this.set("hitKeywords", js.undefined)
    @scala.inline
    def setScore(value: String): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
  
}


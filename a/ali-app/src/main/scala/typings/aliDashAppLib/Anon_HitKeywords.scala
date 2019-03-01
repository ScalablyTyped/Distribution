package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HitKeywords extends js.Object {
  /**
  				 * 仅当识别命中了 type 为 keyword 时，才会返回该字段
  				 */
  var hitKeywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  				 * 识别命中得分，最高分100分。仅当识别没有命中 keyword ，但入参中包含了广告或涉政或涉黄时，才会返回该字段
  				 */
  var score: js.UndefOr[java.lang.String] = js.undefined
  /**
  				 * 目标内容文本识别到的类型，keyword 表示关键词、0 表示广告、1表示涉政、2表示涉黄、3表示低俗辱骂
  				 */
  var `type`: aliDashAppLib.myNs.TextRiskIdentificationType
}

object Anon_HitKeywords {
  @scala.inline
  def apply(
    `type`: aliDashAppLib.myNs.TextRiskIdentificationType,
    hitKeywords: js.Array[java.lang.String] = null,
    score: java.lang.String = null
  ): Anon_HitKeywords = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (hitKeywords != null) __obj.updateDynamic("hitKeywords")(hitKeywords)
    if (score != null) __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[Anon_HitKeywords]
  }
}


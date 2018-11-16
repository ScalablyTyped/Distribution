package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextRiskIdentificationOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要进行风险识别的文本内容
  		 */
  var content: java.lang.String
  @JSName("success")
  var success_TextRiskIdentificationOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Result, scala.Unit]] = js.undefined
  /**
  		 * 识别类型：keyword 表示关键词、0 表示广告、1表示涉政、2表示涉黄、3表示低俗辱骂
  		 */
  var `type`: js.Array[TextRiskIdentificationType]
}


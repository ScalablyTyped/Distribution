package typings.aliDashApp.my

import typings.aliDashApp.Anon_Fail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRiskIdentificationOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要进行风险识别的文本内容
  		 */
  var content: String
  @JSName("success")
  var success_TextRiskIdentificationOptions: js.UndefOr[js.Function1[/* res */ Anon_Fail, Unit]] = js.undefined
  /**
  		 * 识别类型：keyword 表示关键词、0 表示广告、1表示涉政、2表示涉黄、3表示低俗辱骂
  		 */
  var `type`: js.Array[TextRiskIdentificationType]
}

object TextRiskIdentificationOptions {
  @scala.inline
  def apply(
    content: String,
    `type`: js.Array[TextRiskIdentificationType],
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_Fail => Unit = null
  ): TextRiskIdentificationOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[TextRiskIdentificationOptions]
  }
}


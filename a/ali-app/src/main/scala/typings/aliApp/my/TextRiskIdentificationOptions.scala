package typings.aliApp.my

import typings.aliApp.anon.Fail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextRiskIdentificationOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要进行风险识别的文本内容
    */
  var content: String = js.native
  
  @JSName("success")
  var success_TextRiskIdentificationOptions: js.UndefOr[js.Function1[/* res */ Fail, Unit]] = js.native
  
  /**
    * 识别类型：keyword 表示关键词、0 表示广告、1表示涉政、2表示涉黄、3表示低俗辱骂
    */
  var `type`: js.Array[TextRiskIdentificationType] = js.native
}
object TextRiskIdentificationOptions {
  
  @scala.inline
  def apply(content: String, `type`: js.Array[TextRiskIdentificationType]): TextRiskIdentificationOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRiskIdentificationOptions]
  }
  
  @scala.inline
  implicit class TextRiskIdentificationOptionsOps[Self <: TextRiskIdentificationOptions] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: TextRiskIdentificationType*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[TextRiskIdentificationType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ Fail => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}

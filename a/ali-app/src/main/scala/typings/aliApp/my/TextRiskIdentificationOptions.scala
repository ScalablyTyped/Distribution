package typings.aliApp.my

import typings.aliApp.anon.Fail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextRiskIdentificationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 需要进行风险识别的文本内容
    */
  var content: String
  
  @JSName("success")
  var success_TextRiskIdentificationOptions: js.UndefOr[js.Function1[/* res */ Fail, Unit]] = js.undefined
  
  /**
    * 识别类型：keyword 表示关键词、0 表示广告、1表示涉政、2表示涉黄、3表示低俗辱骂
    */
  var `type`: js.Array[TextRiskIdentificationType]
}
object TextRiskIdentificationOptions {
  
  inline def apply(content: String, `type`: js.Array[TextRiskIdentificationType]): TextRiskIdentificationOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRiskIdentificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextRiskIdentificationOptions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ Fail => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: js.Array[TextRiskIdentificationType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: TextRiskIdentificationType*): Self = StObject.set(x, "type", js.Array(value*))
  }
}

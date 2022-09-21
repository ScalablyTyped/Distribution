package typings.aliApp.anon

import typings.aliApp.my.TextRiskIdentificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HitKeywords extends StObject {
  
  /**
    * 仅当识别命中了 type 为 keyword 时，才会返回该字段
    */
  var hitKeywords: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 识别命中得分，最高分100分。仅当识别没有命中 keyword ，但入参中包含了广告或涉政或涉黄时，才会返回该字段
    */
  var score: js.UndefOr[String] = js.undefined
  
  /**
    * 目标内容文本识别到的类型，keyword 表示关键词、0 表示广告、1表示涉政、2表示涉黄、3表示低俗辱骂
    */
  var `type`: TextRiskIdentificationType
}
object HitKeywords {
  
  inline def apply(`type`: TextRiskIdentificationType): HitKeywords = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitKeywords]
  }
  
  extension [Self <: HitKeywords](x: Self) {
    
    inline def setHitKeywords(value: js.Array[String]): Self = StObject.set(x, "hitKeywords", value.asInstanceOf[js.Any])
    
    inline def setHitKeywordsUndefined: Self = StObject.set(x, "hitKeywords", js.undefined)
    
    inline def setHitKeywordsVarargs(value: String*): Self = StObject.set(x, "hitKeywords", js.Array(value*))
    
    inline def setScore(value: String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setType(value: TextRiskIdentificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

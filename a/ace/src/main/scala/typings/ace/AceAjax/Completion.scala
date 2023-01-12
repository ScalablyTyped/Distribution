package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completion extends StObject {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var docHTML: js.UndefOr[String] = js.undefined
  
  var exactMatch: js.UndefOr[Double] = js.undefined
  
  var meta: String
  
  var score: js.UndefOr[Double] = js.undefined
  
  var snippet: js.UndefOr[Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: String
}
object Completion {
  
  inline def apply(meta: String, value: String): Completion = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Completion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Completion] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDocHTML(value: String): Self = StObject.set(x, "docHTML", value.asInstanceOf[js.Any])
    
    inline def setDocHTMLUndefined: Self = StObject.set(x, "docHTML", js.undefined)
    
    inline def setExactMatch(value: Double): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    inline def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setSnippet(value: Any): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

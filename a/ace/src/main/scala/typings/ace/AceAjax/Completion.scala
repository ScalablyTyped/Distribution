package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Completion extends StObject {
  
  var caption: js.UndefOr[String] = js.native
  
  var docHTML: js.UndefOr[String] = js.native
  
  var exactMatch: js.UndefOr[Double] = js.native
  
  var meta: String = js.native
  
  var score: js.UndefOr[Double] = js.native
  
  var snippet: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: String = js.native
}
object Completion {
  
  @scala.inline
  def apply(meta: String, value: String): Completion = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Completion]
  }
  
  @scala.inline
  implicit class CompletionMutableBuilder[Self <: Completion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDocHTML(value: String): Self = StObject.set(x, "docHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocHTMLUndefined: Self = StObject.set(x, "docHTML", js.undefined)
    
    @scala.inline
    def setExactMatch(value: Double): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
    
    @scala.inline
    def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setSnippet(value: js.Any): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

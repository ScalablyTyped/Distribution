package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptOptions extends StObject {
  
  var beforePrompt: js.UndefOr[js.Function] = js.undefined
  
  var onEndPrompt: js.UndefOr[js.Function] = js.undefined
  
  var onMatch: js.UndefOr[js.Function] = js.undefined
  
  var onStartPrompt: js.UndefOr[js.Function] = js.undefined
  
  var options: js.Any
  
  var question: String
  
  var smart: js.UndefOr[Boolean] = js.undefined
}
object PromptOptions {
  
  inline def apply(options: js.Any, question: String): PromptOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  
  extension [Self <: PromptOptions](x: Self) {
    
    inline def setBeforePrompt(value: js.Function): Self = StObject.set(x, "beforePrompt", value.asInstanceOf[js.Any])
    
    inline def setBeforePromptUndefined: Self = StObject.set(x, "beforePrompt", js.undefined)
    
    inline def setOnEndPrompt(value: js.Function): Self = StObject.set(x, "onEndPrompt", value.asInstanceOf[js.Any])
    
    inline def setOnEndPromptUndefined: Self = StObject.set(x, "onEndPrompt", js.undefined)
    
    inline def setOnMatch(value: js.Function): Self = StObject.set(x, "onMatch", value.asInstanceOf[js.Any])
    
    inline def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
    
    inline def setOnStartPrompt(value: js.Function): Self = StObject.set(x, "onStartPrompt", value.asInstanceOf[js.Any])
    
    inline def setOnStartPromptUndefined: Self = StObject.set(x, "onStartPrompt", js.undefined)
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
    
    inline def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
  }
}

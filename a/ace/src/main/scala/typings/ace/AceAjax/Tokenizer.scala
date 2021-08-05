package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokenizer extends StObject {
  
  /**
    * Returns an object containing two properties: `tokens`, which contains all the tokens; and `state`, the current state.
    **/
  def getLineTokens(): js.Any
}
object Tokenizer {
  
  inline def apply(getLineTokens: () => js.Any): Tokenizer = {
    val __obj = js.Dynamic.literal(getLineTokens = js.Any.fromFunction0(getLineTokens))
    __obj.asInstanceOf[Tokenizer]
  }
  
  extension [Self <: Tokenizer](x: Self) {
    
    inline def setGetLineTokens(value: () => js.Any): Self = StObject.set(x, "getLineTokens", js.Any.fromFunction0(value))
  }
}

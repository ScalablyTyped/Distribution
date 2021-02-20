package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokenizer extends StObject {
  
  /**
    * Returns an object containing two properties: `tokens`, which contains all the tokens; and `state`, the current state.
    **/
  def getLineTokens(): js.Any = js.native
}
object Tokenizer {
  
  @scala.inline
  def apply(getLineTokens: () => js.Any): Tokenizer = {
    val __obj = js.Dynamic.literal(getLineTokens = js.Any.fromFunction0(getLineTokens))
    __obj.asInstanceOf[Tokenizer]
  }
  
  @scala.inline
  implicit class TokenizerMutableBuilder[Self <: Tokenizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLineTokens(value: () => js.Any): Self = StObject.set(x, "getLineTokens", js.Any.fromFunction0(value))
  }
}

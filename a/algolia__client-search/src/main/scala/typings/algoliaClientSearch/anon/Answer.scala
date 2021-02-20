package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Answer extends StObject {
  
  var _answer: js.UndefOr[Extract] = js.native
}
object Answer {
  
  @scala.inline
  def apply(): Answer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Answer]
  }
  
  @scala.inline
  implicit class AnswerMutableBuilder[Self <: Answer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_answer(value: Extract): Self = StObject.set(x, "_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_answerUndefined: Self = StObject.set(x, "_answer", js.undefined)
  }
}

package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerCorrectBoolean extends StObject {
  
  var answerCorrect: Boolean
}
object AnswerCorrectBoolean {
  
  inline def apply(answerCorrect: Boolean): AnswerCorrectBoolean = {
    val __obj = js.Dynamic.literal(answerCorrect = answerCorrect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerCorrectBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnswerCorrectBoolean] (val x: Self) extends AnyVal {
    
    inline def setAnswerCorrect(value: Boolean): Self = StObject.set(x, "answerCorrect", value.asInstanceOf[js.Any])
  }
}

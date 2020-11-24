package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnswerCorrectBoolean extends js.Object {
  
  var answerCorrect: Boolean = js.native
}
object AnswerCorrectBoolean {
  
  @scala.inline
  def apply(answerCorrect: Boolean): AnswerCorrectBoolean = {
    val __obj = js.Dynamic.literal(answerCorrect = answerCorrect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerCorrectBoolean]
  }
  
  @scala.inline
  implicit class AnswerCorrectBooleanOps[Self <: AnswerCorrectBoolean] (val x: Self) extends AnyVal {
    
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
    def setAnswerCorrect(value: Boolean): Self = this.set("answerCorrect", value.asInstanceOf[js.Any])
  }
}

package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Answer extends js.Object {
  
  var _answer: js.UndefOr[Extract] = js.native
}
object Answer {
  
  @scala.inline
  def apply(): Answer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Answer]
  }
  
  @scala.inline
  implicit class AnswerOps[Self <: Answer] (val x: Self) extends AnyVal {
    
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
    def set_answer(value: Extract): Self = this.set("_answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_answer: Self = this.set("_answer", js.undefined)
  }
}

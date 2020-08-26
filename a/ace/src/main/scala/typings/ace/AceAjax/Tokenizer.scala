package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokenizer extends js.Object {
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
  implicit class TokenizerOps[Self <: Tokenizer] (val x: Self) extends AnyVal {
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
    def setGetLineTokens(value: () => js.Any): Self = this.set("getLineTokens", js.Any.fromFunction0(value))
  }
  
}


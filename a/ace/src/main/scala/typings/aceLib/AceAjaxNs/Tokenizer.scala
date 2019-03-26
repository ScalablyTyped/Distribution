package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokenizer extends js.Object {
  /**
    * Returns an object containing two properties: `tokens`, which contains all the tokens; and `state`, the current state.
    **/
  def getLineTokens(): js.Any
}

@JSGlobal("AceAjax.Tokenizer")
@js.native
class TokenizerCls protected () extends Tokenizer {
  /**
    * Constructs a new tokenizer based on the given rules and flags.
    * @param rules The highlighting rules
    * @param flag Any additional regular expression flags to pass (like "i" for case insensitive)
    **/
  def this(rules: js.Any, flag: java.lang.String) = this()
  /**
    * Returns an object containing two properties: `tokens`, which contains all the tokens; and `state`, the current state.
    **/
  /* CompleteClass */
  override def getLineTokens(): js.Any = js.native
}

object Tokenizer {
  @scala.inline
  def apply(getLineTokens: () => js.Any): Tokenizer = {
    val __obj = js.Dynamic.literal(getLineTokens = js.Any.fromFunction0(getLineTokens))
  
    __obj.asInstanceOf[Tokenizer]
  }
}


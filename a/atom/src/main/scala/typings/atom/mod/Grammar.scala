package typings.atom.mod

import typings.atom.atomBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grammar extends js.Object {
  
  /** The name of the Grammar. */
  val name: String = js.native
  
  // Event Subscription
  def onDidUpdate(callback: js.Function0[Unit]): Disposable = js.native
  
  /** Undocumented: scope name of the Grammar. */
  val scopeName: String = js.native
  
  /**
    *  Tokenizes the line of text.
    *  @param line A string of text to tokenize.
    *  @param ruleStack An optional array of rules previously returned from this
    *  method. This should be null when tokenizing the first line in the file.
    *  @param firstLine A optional boolean denoting whether this is the first line
    *  in the file which defaults to `false`.
    *  @return An object representing the result of the tokenize.
    */
  def tokenizeLine(line: String): TokenizeLineResult = js.native
  def tokenizeLine(line: String, ruleStack: js.UndefOr[scala.Nothing], firstLine: Boolean): TokenizeLineResult = js.native
  /**
    *  Tokenizes the line of text.
    *  @param line A string of text to tokenize.
    *  @param ruleStack An optional array of rules previously returned from this
    *  method. This should be null when tokenizing the first line in the file.
    *  @param firstLine A optional boolean denoting whether this is the first line
    *  in the file which defaults to `false`.
    *  @return An object representing the result of the tokenize.
    */
  def tokenizeLine(line: String, ruleStack: js.Array[GrammarRule]): TokenizeLineResult = js.native
  def tokenizeLine(line: String, ruleStack: Null, firstLine: Boolean): TokenizeLineResult = js.native
  @JSName("tokenizeLine")
  def tokenizeLine_false(line: String, ruleStack: js.Array[GrammarRule], firstLine: `false`): TokenizeLineResult = js.native
  
  // Tokenizing
  /**
    *  Tokenize all lines in the given text.
    *  @param text A string containing one or more lines.
    *  @return An array of token arrays for each line tokenized.
    */
  def tokenizeLines(text: String): js.Array[js.Array[GrammarToken]] = js.native
}

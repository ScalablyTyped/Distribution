package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grammar extends js.Object {
  /** The name of the Grammar. */
  val name: java.lang.String = js.native
  /** Undocumented: scope name of the Grammar. */
  val scopeName: java.lang.String = js.native
  // Event Subscription
  def onDidUpdate(callback: js.Function0[scala.Unit]): Disposable = js.native
  /**
       *  Tokenizes the line of text.
       *  @param line A string of text to tokenize.
       *  @param ruleStack An optional array of rules previously returned from this
       *  method. This should be null when tokenizing the first line in the file.
       *  @param firstLine A optional boolean denoting whether this is the first line
       *  in the file which defaults to `false`.
       *  @return An object representing the result of the tokenize.
       */
  def tokenizeLine(line: java.lang.String): TokenizeLineResult = js.native
  /**
       *  Tokenizes the line of text.
       *  @param line A string of text to tokenize.
       *  @param ruleStack An optional array of rules previously returned from this
       *  method. This should be null when tokenizing the first line in the file.
       *  @param firstLine A optional boolean denoting whether this is the first line
       *  in the file which defaults to `false`.
       *  @return An object representing the result of the tokenize.
       */
  def tokenizeLine(line: java.lang.String, ruleStack: js.Array[GrammarRule]): TokenizeLineResult = js.native
  /**
       *  Tokenizes the line of text.
       *  @param line A string of text to tokenize.
       *  @param ruleStack An optional array of rules previously returned from this
       *  method. This should be null when tokenizing the first line in the file.
       *  @param firstLine A optional boolean denoting whether this is the first line
       *  in the file which defaults to `false`.
       *  @return An object representing the result of the tokenize.
       */
  def tokenizeLine(
    line: java.lang.String,
    ruleStack: js.Array[GrammarRule],
    firstLine: atomLib.atomLibNumbers.`false`
  ): TokenizeLineResult = js.native
  /**
       *  Tokenizes the line of text.
       *  @param line A string of text to tokenize.
       *  @param ruleStack An optional array of rules previously returned from this
       *  method. This should be null when tokenizing the first line in the file.
       *  @param firstLine A optional boolean denoting whether this is the first line
       *  in the file which defaults to `false`.
       *  @return An object representing the result of the tokenize.
       */
  def tokenizeLine(line: java.lang.String, ruleStack: scala.Null, firstLine: scala.Boolean): TokenizeLineResult = js.native
  // Tokenizing
  /**
       *  Tokenize all lines in the given text.
       *  @param text A string containing one or more lines.
       *  @return An array of token arrays for each line tokenized.
       */
  def tokenizeLines(text: java.lang.String): js.Array[js.Array[GrammarToken]] = js.native
}


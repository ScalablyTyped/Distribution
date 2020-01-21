package typings.angularCompiler.mlParserLexerMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The _Tokenizer uses objects of this type to move through the input text,
  * extracting "parsed characters". These could be more than one actual character
  * if the text contains escape sequences.
  */
@js.native
trait CharacterCursor extends js.Object {
  /** Advance the cursor by one parsed character. */
  def advance(): Unit = js.native
  /** The number of characters left before the end of the cursor. */
  def charsLeft(): Double = js.native
  /** The number of characters between `this` cursor and `other` cursor. */
  def diff(other: this.type): Double = js.native
  /** Get the parsed characters from the marked start point to the current point. */
  def getChars(start: this.type): String = js.native
  /** Get a span from the marked start point to the current point. */
  def getSpan(): ParseSourceSpan = js.native
  def getSpan(start: this.type): ParseSourceSpan = js.native
  def getSpan(start: this.type, leadingTriviaCodePoints: js.Array[Double]): ParseSourceSpan = js.native
  /** Initialize the cursor. */
  def init(): Unit = js.native
  /** The parsed character at the current cursor position. */
  def peek(): Double = js.native
}


package typings.antlr4.lexerMod

import typings.antlr4.errorErrorsMod.RecognitionException
import typings.antlr4.recognizerMod.Recognizer
import typings.antlr4.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/Lexer", "Lexer")
@js.native
class Lexer () extends Recognizer {
  var column: js.Any = js.native
  var inputStream: js.Any = js.native
  var line: js.Any = js.native
  var sourceName: js.Any = js.native
  var text: String = js.native
  var `type`: js.Any = js.native
  def charIndex(): Double = js.native
  def emit(): Token = js.native
  def emitEOF(): Token = js.native
  def emitToken(): Unit = js.native
  def getAllTokens(): js.Array[Token] = js.native
  def getCharErrorDisplay(c: String): String = js.native
  def getErrorDisplay(s: String): String = js.native
  def getErrorDisplayForChar(c: String): String = js.native
  def more(): Unit = js.native
  def nextToken(): Token = js.native
  def notifyListeners(e: RecognitionException): Unit = js.native
  def popMode(): js.Any = js.native
  def pushMode(mode: js.Any): Unit = js.native
  def recover(re: RecognitionException): Unit = js.native
  def reset(): Unit = js.native
  def skip(): Unit = js.native
}

/* static members */
@JSImport("antlr4/Lexer", "Lexer")
@js.native
object Lexer extends js.Object {
  val DEFAULT_MODE: Double = js.native
  val DEFAULT_TOKEN_CHANNEL: js.Any = js.native
  val HIDDEN: js.Any = js.native
  val MAX_CHAR_VALUE: Double = js.native
  val MIN_CHAR_VALUE: Double = js.native
  val MORE: Double = js.native
  val SKIP: Double = js.native
}


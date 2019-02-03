package typings
package antlr4Lib.lexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/Lexer", "Lexer")
@js.native
class Lexer ()
  extends antlr4Lib.recognizerMod.Recognizer {
  var column: js.Any = js.native
  var inputStream: js.Any = js.native
  var line: js.Any = js.native
  var sourceName: js.Any = js.native
  var text: java.lang.String = js.native
  var `type`: js.Any = js.native
  def charIndex(): scala.Double = js.native
  def emit(): antlr4Lib.tokenMod.Token = js.native
  def emitEOF(): antlr4Lib.tokenMod.Token = js.native
  def emitToken(): scala.Unit = js.native
  def getAllTokens(): js.Array[antlr4Lib.tokenMod.Token] = js.native
  def getCharErrorDisplay(c: java.lang.String): java.lang.String = js.native
  def getErrorDisplay(s: java.lang.String): java.lang.String = js.native
  def getErrorDisplayForChar(c: java.lang.String): java.lang.String = js.native
  def more(): scala.Unit = js.native
  def nextToken(): antlr4Lib.tokenMod.Token = js.native
  def notifyListeners(e: antlr4Lib.errorErrorsMod.RecognitionException): scala.Unit = js.native
  def popMode(): js.Any = js.native
  def pushMode(mode: js.Any): scala.Unit = js.native
  def recover(re: antlr4Lib.errorErrorsMod.RecognitionException): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def skip(): scala.Unit = js.native
}

/* static members */
@JSImport("antlr4/Lexer", "Lexer")
@js.native
object Lexer extends js.Object {
  val DEFAULT_MODE: scala.Double = js.native
  val DEFAULT_TOKEN_CHANNEL: js.Any = js.native
  val HIDDEN: js.Any = js.native
  val MAX_CHAR_VALUE: scala.Double = js.native
  val MIN_CHAR_VALUE: scala.Double = js.native
  val MORE: scala.Double = js.native
  val SKIP: scala.Double = js.native
}


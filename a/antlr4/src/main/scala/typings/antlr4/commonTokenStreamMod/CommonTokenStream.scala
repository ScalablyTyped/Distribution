package typings.antlr4.commonTokenStreamMod

import typings.antlr4.bufferedTokenStreamMod.BufferedTokenStream
import typings.antlr4.lexerMod.Lexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/CommonTokenStream", "CommonTokenStream")
@js.native
class CommonTokenStream protected () extends BufferedTokenStream {
  def this(lexer: Lexer) = this()
  def this(lexer: Lexer, channel: js.Any) = this()
  def getNumberOfOnChannelTokens(): Double = js.native
}


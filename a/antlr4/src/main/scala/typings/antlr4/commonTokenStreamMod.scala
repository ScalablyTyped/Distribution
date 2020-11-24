package typings.antlr4

import typings.antlr4.bufferedTokenStreamMod.BufferedTokenStream
import typings.antlr4.lexerMod.Lexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antlr4/CommonTokenStream", JSImport.Namespace)
@js.native
object commonTokenStreamMod extends js.Object {
  
  @js.native
  class CommonTokenStream protected () extends BufferedTokenStream {
    def this(lexer: Lexer) = this()
    def this(lexer: Lexer, channel: js.Any) = this()
    
    def getNumberOfOnChannelTokens(): Double = js.native
  }
}

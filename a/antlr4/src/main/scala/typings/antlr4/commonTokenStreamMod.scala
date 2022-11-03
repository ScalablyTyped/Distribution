package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTokenStreamMod {
  
  @JSImport("antlr4/CommonTokenStream", JSImport.Default)
  @js.native
  open class default protected () extends CommonTokenStream {
    def this(lexer: typings.antlr4.lexerMod.default) = this()
    def this(lexer: typings.antlr4.lexerMod.default, channel: Double) = this()
  }
  
  @js.native
  trait CommonTokenStream
    extends typings.antlr4.bufferedTokenStreamMod.default {
    
    def getNumberOfOnChannelTokens(): Double = js.native
  }
}

package typings.antlr4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4", JSImport.Namespace)
@js.native
object antlr4Mod extends js.Object {
  @js.native
  class CommonToken protected ()
    extends typings.antlr4.tokenMod.CommonToken {
    def this(source: js.Any, `type`: js.Any, channel: js.Any, start: Double, stop: Double) = this()
  }
  
  @js.native
  class CommonTokenStream protected ()
    extends typings.antlr4.commonTokenStreamMod.CommonTokenStream {
    def this(lexer: typings.antlr4.lexerMod.Lexer) = this()
    def this(lexer: typings.antlr4.lexerMod.Lexer, channel: js.Any) = this()
  }
  
  @js.native
  class InputStream protected ()
    extends typings.antlr4.inputStreamMod.InputStream {
    def this(data: String) = this()
    def this(data: String, decodeToUnicodeCodePoints: Boolean) = this()
  }
  
  @js.native
  class Interval protected ()
    extends typings.antlr4.intervalSetMod.Interval {
    def this(start: Double, stop: Double) = this()
  }
  
  @js.native
  class IntervalSet ()
    extends typings.antlr4.intervalSetMod.IntervalSet
  
  @js.native
  class Lexer ()
    extends typings.antlr4.lexerMod.Lexer
  
  @js.native
  class Parser protected ()
    extends typings.antlr4.parserMod.Parser {
    def this(input: typings.antlr4.commonTokenStreamMod.CommonTokenStream) = this()
  }
  
  @js.native
  class ParserRuleContext protected ()
    extends typings.antlr4.parserRuleContextMod.ParserRuleContext {
    def this(parent: js.Any, invokingState: Double) = this()
  }
  
  @js.native
  class Recognizer ()
    extends typings.antlr4.recognizerMod.Recognizer
  
  @js.native
  class Token ()
    extends typings.antlr4.tokenMod.Token
  
  /* static members */
  @js.native
  object CommonToken extends js.Object {
    val EMPTY_SOURCE: js.Any = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object ParserRuleContext extends js.Object {
    val EMPTY: typings.antlr4.parserRuleContextMod.ParserRuleContext = js.native
  }
  
  /* static members */
  @js.native
  object Token extends js.Object {
    val EOF: Double = js.native
    val EPSILON: Double = js.native
    val HIDDEN_CHANNEL: Double = js.native
    val INVALID_TYPE: Double = js.native
    val MIN_USER_TOKEN_TYPE: Double = js.native
  }
  
  type AntlrRule = typings.antlr4.parserRuleContextMod.ParserRuleContext
}


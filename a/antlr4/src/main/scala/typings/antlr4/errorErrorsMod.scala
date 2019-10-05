package typings.antlr4

import typings.antlr4.antlr4Numbers.`-1`
import typings.antlr4.errorErrorsMod.RecognitionException
import typings.antlr4.inputStreamMod.InputStream
import typings.antlr4.parserRuleContextMod.ParserRuleContext
import typings.antlr4.recognizerMod.Recognizer
import typings.antlr4.tokenMod.Token
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/error/Errors", JSImport.Namespace)
@js.native
object errorErrorsMod extends js.Object {
  @js.native
  class FailedPredicateException () extends RecognitionException
  
  @js.native
  class InputMismatchException () extends RecognitionException
  
  @js.native
  class LexerNoViableAltException () extends RecognitionException
  
  @js.native
  class NoViableAltException () extends RecognitionException
  
  @js.native
  class ParseCancellationException () extends RecognitionException
  
  @js.native
  class RecognitionException () extends Error {
    var ctx: ParserRuleContext = js.native
    var input: InputStream = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var offendingState: `-1` = js.native
    var offendingToken: Token = js.native
    var recognizer: Recognizer = js.native
    def getExpectedTokens(): js.Array[Token] = js.native
  }
  
}


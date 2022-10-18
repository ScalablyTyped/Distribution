package typings.antlr4

import typings.antlr4.antlr4Ints.`-1`
import typings.antlr4.inputStreamMod.InputStream
import typings.antlr4.parserRuleContextMod.ParserRuleContext
import typings.antlr4.recognizerMod.Recognizer
import typings.antlr4.tokenMod.Token
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorErrorsMod {
  
  @JSImport("antlr4/error/Errors", "FailedPredicateException")
  @js.native
  open class FailedPredicateException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "InputMismatchException")
  @js.native
  open class InputMismatchException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "LexerNoViableAltException")
  @js.native
  open class LexerNoViableAltException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "NoViableAltException")
  @js.native
  open class NoViableAltException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "ParseCancellationException")
  @js.native
  open class ParseCancellationException () extends RecognitionException
  
  @JSImport("antlr4/error/Errors", "RecognitionException")
  @js.native
  open class RecognitionException ()
    extends StObject
       with Error {
    
    var ctx: ParserRuleContext = js.native
    
    def getExpectedTokens(): js.Array[Token] = js.native
    
    var input: InputStream = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var offendingState: `-1` = js.native
    
    var offendingToken: Token = js.native
    
    var recognizer: Recognizer = js.native
  }
}

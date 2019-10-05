package typings.antlr4

import typings.antlr4.errorErrorStrategyMod.ErrorStrategy
import typings.antlr4.recognizerMod.Recognizer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/error/ErrorStrategy", JSImport.Namespace)
@js.native
object errorErrorStrategyMod extends js.Object {
  @js.native
  class BailErrorStrategy () extends ErrorStrategy
  
  @js.native
  class DefaultErrorStrategy () extends ErrorStrategy
  
  @js.native
  class ErrorStrategy () extends js.Object {
    def inErrorRecoveryMode(recognizer: Recognizer): Unit = js.native
    def recover(recognizer: Recognizer, e: Error): Unit = js.native
    def recoverInline(recognizer: Recognizer): Unit = js.native
    def reportError(recognizer: Recognizer): Unit = js.native
    def reset(recognizer: Recognizer): Unit = js.native
    def sync(recognizer: Recognizer): Unit = js.native
  }
  
}


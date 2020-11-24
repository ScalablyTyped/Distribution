package typings.antlr4

import typings.antlr4.inputStreamMod.InputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antlr4/Token", JSImport.Namespace)
@js.native
object tokenMod extends js.Object {
  
  @js.native
  class CommonToken protected () extends Token {
    def this(source: js.Any, `type`: js.Any, channel: js.Any, start: Double, stop: Double) = this()
  }
  /* static members */
  @js.native
  object CommonToken extends js.Object {
    
    val EMPTY_SOURCE: js.Any = js.native
  }
  
  @js.native
  class Token () extends js.Object {
    
    var channel: js.Any = js.native
    
    var column: Double = js.native
    
    def getInputStream(): InputStream = js.native
    
    def getTokenSource(): js.Any = js.native
    
    var line: Double = js.native
    
    var source: js.Any = js.native
    
    var start: Double = js.native
    
    var stop: Double = js.native
    
    val text: String = js.native
    
    var tokenIndex: Double = js.native
    
    var `type`: js.Any = js.native
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
}

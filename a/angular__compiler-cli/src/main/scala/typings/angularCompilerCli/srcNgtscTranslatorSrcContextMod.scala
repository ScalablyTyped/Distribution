package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorSrcContextMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/context", "Context")
  @js.native
  open class Context protected () extends StObject {
    def this(isStatement: Boolean) = this()
    
    val isStatement: Boolean = js.native
    
    def withExpressionMode: Context = js.native
    
    def withStatementMode: Context = js.native
  }
}

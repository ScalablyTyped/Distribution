package typings.angularCompilerCli

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fatalLinkerErrorMod {
  
  @JSImport("@angular/compiler-cli/linker/src/fatal_linker_error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/fatal_linker_error", "FatalLinkerError")
  @js.native
  open class FatalLinkerError protected ()
    extends StObject
       with Error {
    /**
      * Create a new FatalLinkerError.
      *
      * @param node The AST node where the error occurred.
      * @param message A description of the error.
      */
    def this(node: Any, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var node: Any = js.native
    
    val `type`: /* "FatalLinkerError" */ String = js.native
  }
  
  inline def isFatalLinkerError(e: Any): /* is @angular/compiler-cli.@angular/compiler-cli/linker/src/fatal_linker_error.FatalLinkerError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFatalLinkerError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/linker/src/fatal_linker_error.FatalLinkerError */ Boolean]
}

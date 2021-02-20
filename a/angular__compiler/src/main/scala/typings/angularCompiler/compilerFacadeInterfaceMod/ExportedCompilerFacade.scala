package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportedCompilerFacade extends StObject {
  
  var ɵcompilerFacade: CompilerFacade = js.native
}
object ExportedCompilerFacade {
  
  @scala.inline
  def apply(ɵcompilerFacade: CompilerFacade): ExportedCompilerFacade = {
    val __obj = js.Dynamic.literal(ɵcompilerFacade = ɵcompilerFacade.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportedCompilerFacade]
  }
  
  @scala.inline
  implicit class ExportedCompilerFacadeMutableBuilder[Self <: ExportedCompilerFacade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setƟcompilerFacade(value: CompilerFacade): Self = StObject.set(x, "\u0275compilerFacade", value.asInstanceOf[js.Any])
  }
}

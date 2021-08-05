package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportedCompilerFacade extends StObject {
  
  var ɵcompilerFacade: CompilerFacade
}
object ExportedCompilerFacade {
  
  inline def apply(ɵcompilerFacade: CompilerFacade): ExportedCompilerFacade = {
    val __obj = js.Dynamic.literal(ɵcompilerFacade = ɵcompilerFacade.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportedCompilerFacade]
  }
  
  extension [Self <: ExportedCompilerFacade](x: Self) {
    
    inline def setƟcompilerFacade(value: CompilerFacade): Self = StObject.set(x, "\u0275compilerFacade", value.asInstanceOf[js.Any])
  }
}

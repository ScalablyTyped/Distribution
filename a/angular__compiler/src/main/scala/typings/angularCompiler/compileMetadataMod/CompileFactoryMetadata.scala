package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileFactoryMetadata
  extends StObject
     with CompileIdentifierMetadata {
  
  var diDeps: js.Array[CompileDiDependencyMetadata]
}
object CompileFactoryMetadata {
  
  inline def apply(diDeps: js.Array[CompileDiDependencyMetadata], reference: js.Any): CompileFactoryMetadata = {
    val __obj = js.Dynamic.literal(diDeps = diDeps.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileFactoryMetadata]
  }
  
  extension [Self <: CompileFactoryMetadata](x: Self) {
    
    inline def setDiDeps(value: js.Array[CompileDiDependencyMetadata]): Self = StObject.set(x, "diDeps", value.asInstanceOf[js.Any])
    
    inline def setDiDepsVarargs(value: CompileDiDependencyMetadata*): Self = StObject.set(x, "diDeps", js.Array(value :_*))
  }
}

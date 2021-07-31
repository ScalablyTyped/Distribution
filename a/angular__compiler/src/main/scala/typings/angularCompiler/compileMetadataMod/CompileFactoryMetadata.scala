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
  
  @scala.inline
  def apply(diDeps: js.Array[CompileDiDependencyMetadata], reference: js.Any): CompileFactoryMetadata = {
    val __obj = js.Dynamic.literal(diDeps = diDeps.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileFactoryMetadata]
  }
  
  @scala.inline
  implicit class CompileFactoryMetadataMutableBuilder[Self <: CompileFactoryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiDeps(value: js.Array[CompileDiDependencyMetadata]): Self = StObject.set(x, "diDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiDepsVarargs(value: CompileDiDependencyMetadata*): Self = StObject.set(x, "diDeps", js.Array(value :_*))
  }
}

package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/handler.NgModuleResolution> */
trait ReadonlyNgModuleResolutio extends StObject {
  
  val injectorImports: js.Array[Expression]
}
object ReadonlyNgModuleResolutio {
  
  inline def apply(injectorImports: js.Array[Expression]): ReadonlyNgModuleResolutio = {
    val __obj = js.Dynamic.literal(injectorImports = injectorImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyNgModuleResolutio]
  }
  
  extension [Self <: ReadonlyNgModuleResolutio](x: Self) {
    
    inline def setInjectorImports(value: js.Array[Expression]): Self = StObject.set(x, "injectorImports", value.asInstanceOf[js.Any])
    
    inline def setInjectorImportsVarargs(value: Expression*): Self = StObject.set(x, "injectorImports", js.Array(value*))
  }
}

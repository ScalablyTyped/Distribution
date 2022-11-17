package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@angular/compiler-cli.@angular/compiler-cli/linker/src/file_linker/linker_options.LinkerOptions> */
trait PartialLinkerOptions extends StObject {
  
  var linkerJitMode: js.UndefOr[Boolean] = js.undefined
  
  var sourceMapping: js.UndefOr[Boolean] = js.undefined
  
  var unknownDeclarationVersionHandling: js.UndefOr["ignore" | "warn" | "error"] = js.undefined
}
object PartialLinkerOptions {
  
  inline def apply(): PartialLinkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLinkerOptions]
  }
  
  extension [Self <: PartialLinkerOptions](x: Self) {
    
    inline def setLinkerJitMode(value: Boolean): Self = StObject.set(x, "linkerJitMode", value.asInstanceOf[js.Any])
    
    inline def setLinkerJitModeUndefined: Self = StObject.set(x, "linkerJitMode", js.undefined)
    
    inline def setSourceMapping(value: Boolean): Self = StObject.set(x, "sourceMapping", value.asInstanceOf[js.Any])
    
    inline def setSourceMappingUndefined: Self = StObject.set(x, "sourceMapping", js.undefined)
    
    inline def setUnknownDeclarationVersionHandling(value: "ignore" | "warn" | "error"): Self = StObject.set(x, "unknownDeclarationVersionHandling", value.asInstanceOf[js.Any])
    
    inline def setUnknownDeclarationVersionHandlingUndefined: Self = StObject.set(x, "unknownDeclarationVersionHandling", js.undefined)
  }
}

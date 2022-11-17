package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerLinkerOptionsMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/linker_options", "DEFAULT_LINKER_OPTIONS")
  @js.native
  val DEFAULT_LINKER_OPTIONS: LinkerOptions = js.native
  
  trait LinkerOptions extends StObject {
    
    /**
      * This option tells the linker to generate information used by a downstream JIT compiler.
      *
      * Specifically, in JIT mode, NgModule definitions must describe the `declarations`, `imports`,
      * `exports`, etc, which are otherwise not needed.
      */
    var linkerJitMode: Boolean
    
    /**
      * Whether to use source-mapping to compute the original source for external templates.
      * The default is `true`.
      */
    var sourceMapping: Boolean
    
    /**
      * How to handle a situation where a partial declaration matches none of the supported
      * partial-linker versions.
      *
      * - `error` - the version mismatch is a fatal error.
      * - `warn` - a warning is sent to the logger but the most recent partial-linker
      *   will attempt to process the declaration anyway.
      * - `ignore` - the most recent partial-linker will, silently, attempt to process
      *   the declaration.
      *
      * The default is `error`.
      */
    var unknownDeclarationVersionHandling: "ignore" | "warn" | "error"
  }
  object LinkerOptions {
    
    inline def apply(
      linkerJitMode: Boolean,
      sourceMapping: Boolean,
      unknownDeclarationVersionHandling: "ignore" | "warn" | "error"
    ): LinkerOptions = {
      val __obj = js.Dynamic.literal(linkerJitMode = linkerJitMode.asInstanceOf[js.Any], sourceMapping = sourceMapping.asInstanceOf[js.Any], unknownDeclarationVersionHandling = unknownDeclarationVersionHandling.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkerOptions]
    }
    
    extension [Self <: LinkerOptions](x: Self) {
      
      inline def setLinkerJitMode(value: Boolean): Self = StObject.set(x, "linkerJitMode", value.asInstanceOf[js.Any])
      
      inline def setSourceMapping(value: Boolean): Self = StObject.set(x, "sourceMapping", value.asInstanceOf[js.Any])
      
      inline def setUnknownDeclarationVersionHandling(value: "ignore" | "warn" | "error"): Self = StObject.set(x, "unknownDeclarationVersionHandling", value.asInstanceOf[js.Any])
    }
  }
}

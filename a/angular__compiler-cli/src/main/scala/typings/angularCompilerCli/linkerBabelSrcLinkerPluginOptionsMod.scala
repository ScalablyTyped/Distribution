package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerBabelSrcLinkerPluginOptionsMod {
  
  /* Inlined parent std.Partial<@angular/compiler-cli.@angular/compiler-cli/linker.LinkerOptions> */
  trait LinkerPluginOptions extends StObject {
    
    /**
      * File-system, used to load up the input source-map and content.
      */
    var fileSystem: ReadonlyFileSystem
    
    var linkerJitMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Logger used by the linker.
      */
    var logger: Logger
    
    var sourceMapping: js.UndefOr[Boolean] = js.undefined
    
    var unknownDeclarationVersionHandling: js.UndefOr["ignore" | "warn" | "error"] = js.undefined
  }
  object LinkerPluginOptions {
    
    inline def apply(fileSystem: ReadonlyFileSystem, logger: Logger): LinkerPluginOptions = {
      val __obj = js.Dynamic.literal(fileSystem = fileSystem.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkerPluginOptions]
    }
    
    extension [Self <: LinkerPluginOptions](x: Self) {
      
      inline def setFileSystem(value: ReadonlyFileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
      
      inline def setLinkerJitMode(value: Boolean): Self = StObject.set(x, "linkerJitMode", value.asInstanceOf[js.Any])
      
      inline def setLinkerJitModeUndefined: Self = StObject.set(x, "linkerJitMode", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setSourceMapping(value: Boolean): Self = StObject.set(x, "sourceMapping", value.asInstanceOf[js.Any])
      
      inline def setSourceMappingUndefined: Self = StObject.set(x, "sourceMapping", js.undefined)
      
      inline def setUnknownDeclarationVersionHandling(value: "ignore" | "warn" | "error"): Self = StObject.set(x, "unknownDeclarationVersionHandling", value.asInstanceOf[js.Any])
      
      inline def setUnknownDeclarationVersionHandlingUndefined: Self = StObject.set(x, "unknownDeclarationVersionHandling", js.undefined)
    }
  }
}

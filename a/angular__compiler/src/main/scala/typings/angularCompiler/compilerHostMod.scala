package typings.angularCompiler

import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolverHost
import typings.angularCompiler.summaryResolverMod.AotSummaryResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/compiler_host", JSImport.Namespace)
@js.native
object compilerHostMod extends js.Object {
  @js.native
  trait AotCompilerHost
    extends StaticSymbolResolverHost
       with AotSummaryResolverHost {
    /**
      * Converts a file path to a module name that can be used as an `import.
      * I.e. `path/to/importedFile.ts` should be imported by `path/to/containingFile.ts`.
      *
      * See ImportResolver.
      */
    def fileNameToModuleName(importedFilePath: String, containingFilePath: String): String = js.native
    /**
      * Loads a resource (e.g. html / css)
      */
    def loadResource(path: String): js.Promise[String] | String = js.native
    /**
      * Converts a path that refers to a resource into an absolute filePath
      * that can be later on used for loading the resource via `loadResource.
      */
    def resourceNameToFileName(resourceName: String, containingFileName: String): String | Null = js.native
  }
  
}


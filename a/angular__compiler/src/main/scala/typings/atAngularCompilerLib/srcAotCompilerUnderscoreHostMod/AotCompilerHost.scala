package typings
package atAngularCompilerLib.srcAotCompilerUnderscoreHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AotCompilerHost
  extends atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolverHost
     with atAngularCompilerLib.srcAotSummaryUnderscoreResolverMod.AotSummaryResolverHost {
  /**
    * Converts a file path to a module name that can be used as an `import.
    * I.e. `path/to/importedFile.ts` should be imported by `path/to/containingFile.ts`.
    *
    * See ImportResolver.
    */
  def fileNameToModuleName(importedFilePath: java.lang.String, containingFilePath: java.lang.String): java.lang.String = js.native
  /**
    * Loads a resource (e.g. html / css)
    */
  def loadResource(path: java.lang.String): js.Promise[java.lang.String] | java.lang.String = js.native
  /**
    * Converts a path that refers to a resource into an absolute filePath
    * that can be later on used for loading the resource via `loadResource.
    */
  def resourceNameToFileName(resourceName: java.lang.String, containingFileName: java.lang.String): java.lang.String | scala.Null = js.native
}


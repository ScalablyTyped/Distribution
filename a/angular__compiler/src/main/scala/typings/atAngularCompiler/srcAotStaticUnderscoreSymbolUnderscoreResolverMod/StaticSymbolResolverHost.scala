package typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticSymbolResolverHost extends js.Object {
  /**
    * Return a ModuleMetadata for the given module.
    * Angular CLI will produce this metadata for a module whenever a .d.ts files is
    * produced and the module has exported variables or classes with decorators. Module metadata can
    * also be produced directly from TypeScript sources by using MetadataCollector in tools/metadata.
    *
    * @param modulePath is a string identifier for a module as an absolute path.
    * @returns the metadata for the given module.
    */
  def getMetadataFor(modulePath: String): js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /**
    * Get a file suitable for display to the user that should be relative to the project directory
    * or the current directory.
    */
  def getOutputName(filePath: String): String = js.native
  /**
    * Converts a module name that is used in an `import` to a file path.
    * I.e.
    * `path/to/containingFile.ts` containing `import {...} from 'module-name'`.
    */
  def moduleNameToFileName(moduleName: String): String | Null = js.native
  def moduleNameToFileName(moduleName: String, containingFile: String): String | Null = js.native
}


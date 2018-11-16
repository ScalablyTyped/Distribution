package typings
package atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod

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
  def getMetadataFor(modulePath: java.lang.String): js.UndefOr[js.Array[ScalablyTyped.runtime.StringDictionary[_]]] = js.native
  /**
       * Get a file suitable for display to the user that should be relative to the project directory
       * or the current directory.
       */
  def getOutputName(filePath: java.lang.String): java.lang.String = js.native
  /**
       * Converts a module name that is used in an `import` to a file path.
       * I.e.
       * `path/to/containingFile.ts` containing `import {...} from 'module-name'`.
       */
  def moduleNameToFileName(moduleName: java.lang.String): java.lang.String | scala.Null = js.native
  /**
       * Converts a module name that is used in an `import` to a file path.
       * I.e.
       * `path/to/containingFile.ts` containing `import {...} from 'module-name'`.
       */
  def moduleNameToFileName(moduleName: java.lang.String, containingFile: java.lang.String): java.lang.String | scala.Null = js.native
}


package typings.angularCompilerCli.anon

import typings.angularCompilerCli.ngccSrcPackagesConfigurationMod.NgccEntryPointConfig
import typings.angularCompilerCli.ngccSrcPackagesConfigurationMod.RawNgccPackageConfig
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/compiler-cli.@angular/compiler-cli/ngcc/src/packages/configuration.ProcessedNgccPackageConfig */
trait ProcessedNgccPackageConfi extends StObject {
  
  /**
    * The entry-points to configure for this package.
    *
    * In contrast to `RawNgccPackageConfig`, the paths are absolute and take the path of the specific
    * instance of the package into account.
    */
  var entryPoints: Map[AbsoluteFsPath, NgccEntryPointConfig]
  
  /**
    * A collection of regexes that match deep imports to ignore, for this package, rather than
    * displaying a warning.
    */
  var ignorableDeepImportMatchers: js.Array[js.RegExp]
  
  /**
    * The absolute path to this instance of the package.
    * Note that there may be multiple instances of a package inside a project in nested
    * `node_modules/`. For example, one at `<project-root>/node_modules/some-package/` and one at
    * `<project-root>/node_modules/other-package/node_modules/some-package/`.
    */
  var packagePath: AbsoluteFsPath
}
object ProcessedNgccPackageConfi {
  
  inline def apply(
    entryPoints: Map[AbsoluteFsPath, NgccEntryPointConfig],
    ignorableDeepImportMatchers: js.Array[js.RegExp],
    packagePath: AbsoluteFsPath
  ): ProcessedNgccPackageConfi = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], ignorableDeepImportMatchers = ignorableDeepImportMatchers.asInstanceOf[js.Any], packagePath = packagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedNgccPackageConfi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessedNgccPackageConfi] (val x: Self) extends AnyVal {
    
    inline def setEntryPoints(value: Map[AbsoluteFsPath, NgccEntryPointConfig]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setIgnorableDeepImportMatchers(value: js.Array[js.RegExp]): Self = StObject.set(x, "ignorableDeepImportMatchers", value.asInstanceOf[js.Any])
    
    inline def setIgnorableDeepImportMatchersVarargs(value: js.RegExp*): Self = StObject.set(x, "ignorableDeepImportMatchers", js.Array(value*))
    
    inline def setPackagePath(value: AbsoluteFsPath): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
  }
}

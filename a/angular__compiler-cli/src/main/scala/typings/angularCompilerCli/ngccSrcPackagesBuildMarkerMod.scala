package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPointPackageJson
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.PackageJsonFormatProperties
import typings.angularCompilerCli.ngccSrcWritingPackageJsonUpdaterMod.PackageJsonUpdater
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcPackagesBuildMarkerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/build_marker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/build_marker", "NGCC_VERSION")
  @js.native
  val NGCC_VERSION: /* "14.2.10" */ String = js.native
  
  inline def cleanPackageJson(packageJson: EntryPointPackageJson): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanPackageJson")(packageJson.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasBeenProcessed(packageJson: EntryPointPackageJson, format: PackageJsonFormatProperties): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBeenProcessed")(packageJson.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def markAsProcessed(
    pkgJsonUpdater: PackageJsonUpdater,
    packageJson: EntryPointPackageJson,
    packageJsonPath: AbsoluteFsPath,
    formatProperties: js.Array[PackageJsonFormatProperties]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markAsProcessed")(pkgJsonUpdater.asInstanceOf[js.Any], packageJson.asInstanceOf[js.Any], packageJsonPath.asInstanceOf[js.Any], formatProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def needsCleaning(packageJson: EntryPointPackageJson): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("needsCleaning")(packageJson.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

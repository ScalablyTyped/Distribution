package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.anon.Packages
import typings.appBuilderLib.outCoreMod.Target
import typings.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typings.appBuilderLib.outTargetsArchiveMod.ArchiveOptions
import typings.builderUtilRuntime.outUpdateInfoMod.BlockMapDataHolder
import typings.builderUtilRuntime.outUpdateInfoMod.PackageFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsDifferentialUpdateInfoBuilderMod {
  
  @JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", "BLOCK_MAP_FILE_SUFFIX")
  @js.native
  val BLOCK_MAP_FILE_SUFFIX: /* ".blockmap" */ String = js.native
  
  inline def appendBlockmap(file: String): js.Promise[BlockMapDataHolder] = ^.asInstanceOf[js.Dynamic].applyDynamic("appendBlockmap")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockMapDataHolder]]
  
  inline def configureDifferentialAwareArchiveOptions(archiveOptions: ArchiveOptions): ArchiveOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("configureDifferentialAwareArchiveOptions")(archiveOptions.asInstanceOf[js.Any]).asInstanceOf[ArchiveOptions]
  
  inline def createBlockmap(file: String, target: Target, packager: PlatformPackager[Any]): js.Promise[BlockMapDataHolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlockmap")(file.asInstanceOf[js.Any], target.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BlockMapDataHolder]]
  inline def createBlockmap(file: String, target: Target, packager: PlatformPackager[Any], safeArtifactName: String): js.Promise[BlockMapDataHolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlockmap")(file.asInstanceOf[js.Any], target.asInstanceOf[js.Any], packager.asInstanceOf[js.Any], safeArtifactName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BlockMapDataHolder]]
  
  inline def createNsisWebDifferentialUpdateInfo(artifactPath: String, packageFiles: StringDictionary[PackageFileInfo]): Packages | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createNsisWebDifferentialUpdateInfo")(artifactPath.asInstanceOf[js.Any], packageFiles.asInstanceOf[js.Any])).asInstanceOf[Packages | Null]
}

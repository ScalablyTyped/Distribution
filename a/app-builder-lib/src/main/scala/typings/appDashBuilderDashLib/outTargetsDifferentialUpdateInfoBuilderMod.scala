package typings.appDashBuilderDashLib

import org.scalablytyped.runtime.StringDictionary
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.Dotblockmap
import typings.appDashBuilderDashLib.outCoreMod.Target
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.appDashBuilderDashLib.outTargetsArchiveMod.ArchiveOptions
import typings.builderDashUtilDashRuntime.outUpdateInfoMod.BlockMapDataHolder
import typings.builderDashUtilDashRuntime.outUpdateInfoMod.PackageFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", JSImport.Namespace)
@js.native
object outTargetsDifferentialUpdateInfoBuilderMod extends js.Object {
  val BLOCK_MAP_FILE_SUFFIX: Dotblockmap = js.native
  def appendBlockmap(file: String): js.Promise[BlockMapDataHolder] = js.native
  def configureDifferentialAwareArchiveOptions(archiveOptions: ArchiveOptions): ArchiveOptions = js.native
  def createBlockmap(file: String, target: Target, packager: PlatformPackager[_]): js.Promise[BlockMapDataHolder] = js.native
  def createBlockmap(file: String, target: Target, packager: PlatformPackager[_], safeArtifactName: String): js.Promise[BlockMapDataHolder] = js.native
  def createNsisWebDifferentialUpdateInfo(artifactPath: String, packageFiles: StringDictionary[PackageFileInfo]): Anon_Arch | Null = js.native
}


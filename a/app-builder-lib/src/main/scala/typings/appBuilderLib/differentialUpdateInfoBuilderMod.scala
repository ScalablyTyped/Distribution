package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.appBuilderLibStrings.Dotblockmap
import typings.appBuilderLib.archiveMod.ArchiveOptions
import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtilRuntime.updateInfoMod.BlockMapDataHolder
import typings.builderUtilRuntime.updateInfoMod.PackageFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/differentialUpdateInfoBuilder", JSImport.Namespace)
@js.native
object differentialUpdateInfoBuilderMod extends js.Object {
  val BLOCK_MAP_FILE_SUFFIX: Dotblockmap = js.native
  def appendBlockmap(file: String): js.Promise[BlockMapDataHolder] = js.native
  def configureDifferentialAwareArchiveOptions(archiveOptions: ArchiveOptions): ArchiveOptions = js.native
  def createBlockmap(file: String, target: Target, packager: PlatformPackager[_]): js.Promise[BlockMapDataHolder] = js.native
  def createBlockmap(file: String, target: Target, packager: PlatformPackager[_], safeArtifactName: String): js.Promise[BlockMapDataHolder] = js.native
  def createNsisWebDifferentialUpdateInfo(artifactPath: String, packageFiles: StringDictionary[PackageFileInfo]): AnonPackages | Null = js.native
}


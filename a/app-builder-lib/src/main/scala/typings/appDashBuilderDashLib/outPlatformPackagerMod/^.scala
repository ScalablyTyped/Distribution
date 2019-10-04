package typings.appDashBuilderDashLib.outPlatformPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/platformPackager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def chooseNotNull(): js.UndefOr[String | Null] = js.native
  def chooseNotNull(v1: js.UndefOr[scala.Nothing], v2: String): js.UndefOr[String | Null] = js.native
  def chooseNotNull(v1: String): js.UndefOr[String | Null] = js.native
  def chooseNotNull(v1: String, v2: String): js.UndefOr[String | Null] = js.native
  def chooseNotNull(v1: Null, v2: String): js.UndefOr[String | Null] = js.native
  def computeSafeArtifactNameIfNeeded(suggestedName: String, safeNameProducer: js.Function0[String]): String | Null = js.native
  def computeSafeArtifactNameIfNeeded(suggestedName: Null, safeNameProducer: js.Function0[String]): String | Null = js.native
  def isSafeGithubName(name: String): Boolean = js.native
  def isSafeToUnpackElectronOnRemoteBuildServer(packager: PlatformPackager[_]): Boolean = js.native
  def normalizeExt(ext: String): String = js.native
  def resolveFunction[T](executor: T, name: String): T = js.native
  def resolveFunction[T](executor: String, name: String): T = js.native
}


package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outCoreMod.Target
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.builderDashUtil.outArchMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/remoteBuilder/RemoteBuilder", JSImport.Namespace)
@js.native
object outRemoteBuilderRemoteBuilderMod extends js.Object {
  @js.native
  class RemoteBuilder protected () extends js.Object {
    def this(packager: PlatformPackager[_]) = this()
    var _build: js.Any = js.native
    var artifactInfoToArtifactCreatedEvent: js.Any = js.native
    var buildStarted: js.Any = js.native
    val packager: PlatformPackager[_] = js.native
    val toBuild: js.Any = js.native
    def build(): js.Promise[_] = js.native
    def scheduleBuild(target: Target, arch: Arch, unpackedDirectory: String): Unit = js.native
  }
  
}


package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/remoteBuilder/RemoteBuilder", JSImport.Namespace)
@js.native
object remoteBuilderMod extends js.Object {
  
  @js.native
  class RemoteBuilder protected () extends js.Object {
    def this(packager: PlatformPackager[_]) = this()
    
    var _build: js.Any = js.native
    
    var artifactInfoToArtifactCreatedEvent: js.Any = js.native
    
    def build(): js.Promise[_] = js.native
    
    var buildStarted: js.Any = js.native
    
    val packager: PlatformPackager[_] = js.native
    
    def scheduleBuild(target: Target, arch: Arch, unpackedDirectory: String): Unit = js.native
    
    val toBuild: js.Any = js.native
  }
}

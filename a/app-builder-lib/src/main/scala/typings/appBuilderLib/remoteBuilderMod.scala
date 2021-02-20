package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteBuilderMod {
  
  @JSImport("app-builder-lib/out/remoteBuilder/RemoteBuilder", "RemoteBuilder")
  @js.native
  class RemoteBuilder protected () extends StObject {
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

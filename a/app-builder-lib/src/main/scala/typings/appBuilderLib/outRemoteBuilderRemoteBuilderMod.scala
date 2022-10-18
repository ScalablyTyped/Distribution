package typings.appBuilderLib

import typings.appBuilderLib.outCoreMod.Target
import typings.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typings.builderUtil.outArchMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outRemoteBuilderRemoteBuilderMod {
  
  @JSImport("app-builder-lib/out/remoteBuilder/RemoteBuilder", "RemoteBuilder")
  @js.native
  open class RemoteBuilder protected () extends StObject {
    def this(packager: PlatformPackager[Any]) = this()
    
    /* private */ var _build: Any = js.native
    
    /* private */ var artifactInfoToArtifactCreatedEvent: Any = js.native
    
    def build(): js.Promise[Any] = js.native
    
    /* private */ var buildStarted: Any = js.native
    
    val packager: PlatformPackager[Any] = js.native
    
    def scheduleBuild(target: Target, arch: Arch, unpackedDirectory: String): Unit = js.native
    
    /* private */ val toBuild: Any = js.native
  }
}

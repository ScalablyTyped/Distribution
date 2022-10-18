package typings.appBuilderLib

import typings.appBuilderLib.outPackagerMod.Packager
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outRemoteBuilderProjectInfoManagerMod {
  
  @JSImport("app-builder-lib/out/remoteBuilder/ProjectInfoManager", "ProjectInfoManager")
  @js.native
  open class ProjectInfoManager protected () extends StObject {
    def this(packager: Packager) = this()
    
    val infoFile: Lazy[String] = js.native
    
    val packager: Packager = js.native
    
    /* private */ var saveConfigurationAndMetadata: Any = js.native
  }
}

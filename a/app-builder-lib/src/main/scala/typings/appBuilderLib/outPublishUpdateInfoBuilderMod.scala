package typings.appBuilderLib

import typings.appBuilderLib.outPackagerMod.Packager
import typings.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typings.builderUtilRuntime.outPublishOptionsMod.PublishConfiguration
import typings.builderUtilRuntime.outUpdateInfoMod.UpdateInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPublishUpdateInfoBuilderMod {
  
  @JSImport("app-builder-lib/out/publish/updateInfoBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeUpdateInfoFiles(updateInfoFileTasks: js.Array[UpdateInfoFileTask], packager: Packager): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdateInfoFiles")(updateInfoFileTasks.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait UpdateInfoFileTask extends StObject {
    
    val file: String
    
    val info: UpdateInfo
    
    val packager: PlatformPackager[Any]
    
    val publishConfiguration: PublishConfiguration
  }
  object UpdateInfoFileTask {
    
    inline def apply(
      file: String,
      info: UpdateInfo,
      packager: PlatformPackager[Any],
      publishConfiguration: PublishConfiguration
    ): UpdateInfoFileTask = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], publishConfiguration = publishConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateInfoFileTask]
    }
    
    extension [Self <: UpdateInfoFileTask](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: UpdateInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setPackager(value: PlatformPackager[Any]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      inline def setPublishConfiguration(value: PublishConfiguration): Self = StObject.set(x, "publishConfiguration", value.asInstanceOf[js.Any])
    }
  }
}

package typings.appBuilderLib

import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.builderUtilRuntime.updateInfoMod.UpdateInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateInfoBuilderMod {
  
  @JSImport("app-builder-lib/out/publish/updateInfoBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def writeUpdateInfoFiles(updateInfoFileTasks: js.Array[UpdateInfoFileTask], packager: Packager): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdateInfoFiles")(updateInfoFileTasks.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait UpdateInfoFileTask extends StObject {
    
    val file: String
    
    val info: UpdateInfo
    
    val packager: PlatformPackager[js.Any]
    
    val publishConfiguration: PublishConfiguration
  }
  object UpdateInfoFileTask {
    
    @scala.inline
    def apply(
      file: String,
      info: UpdateInfo,
      packager: PlatformPackager[js.Any],
      publishConfiguration: PublishConfiguration
    ): UpdateInfoFileTask = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], publishConfiguration = publishConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateInfoFileTask]
    }
    
    @scala.inline
    implicit class UpdateInfoFileTaskMutableBuilder[Self <: UpdateInfoFileTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: UpdateInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackager(value: PlatformPackager[js.Any]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishConfiguration(value: PublishConfiguration): Self = StObject.set(x, "publishConfiguration", value.asInstanceOf[js.Any])
    }
  }
}

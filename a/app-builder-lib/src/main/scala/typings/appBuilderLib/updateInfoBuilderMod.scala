package typings.appBuilderLib

import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.builderUtilRuntime.updateInfoMod.UpdateInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateInfoBuilderMod {
  
  @JSImport("app-builder-lib/out/publish/updateInfoBuilder", "writeUpdateInfoFiles")
  @js.native
  def writeUpdateInfoFiles(updateInfoFileTasks: js.Array[UpdateInfoFileTask], packager: Packager): js.Promise[Unit] = js.native
  
  @js.native
  trait UpdateInfoFileTask extends StObject {
    
    val file: String = js.native
    
    val info: UpdateInfo = js.native
    
    val packager: PlatformPackager[_] = js.native
    
    val publishConfiguration: PublishConfiguration = js.native
  }
  object UpdateInfoFileTask {
    
    @scala.inline
    def apply(
      file: String,
      info: UpdateInfo,
      packager: PlatformPackager[_],
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
      def setPackager(value: PlatformPackager[_]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishConfiguration(value: PublishConfiguration): Self = StObject.set(x, "publishConfiguration", value.asInstanceOf[js.Any])
    }
  }
}

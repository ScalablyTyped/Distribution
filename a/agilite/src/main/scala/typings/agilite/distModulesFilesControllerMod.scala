package typings.agilite

import typings.agilite.distAgiliteInterfaceMod.ConfigInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulesFilesControllerMod {
  
  @JSImport("agilite/dist/modules/files/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Files {
    def this(config: ConfigInterface) = this()
  }
  
  @js.native
  trait Files extends StObject {
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def deleteFile(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteFile(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteFile(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteFile(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getFile(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: String, byteStartRange: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: String, byteStartRange: String, byteEndRange: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: String, byteStartRange: String, byteEndRange: String, responseType: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: String,
      byteStartRange: String,
      byteEndRange: String,
      responseType: Any,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: String,
      byteStartRange: String,
      byteEndRange: String,
      responseType: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: String, byteStartRange: String, byteEndRange: Unit, responseType: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: String,
      byteStartRange: String,
      byteEndRange: Unit,
      responseType: Any,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: String,
      byteStartRange: String,
      byteEndRange: Unit,
      responseType: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: String, byteStartRange: Unit, byteEndRange: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: String, byteStartRange: Unit, byteEndRange: String, responseType: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: String,
      byteStartRange: Unit,
      byteEndRange: String,
      responseType: Any,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: String,
      byteStartRange: Unit,
      byteEndRange: String,
      responseType: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: String, byteStartRange: Unit, byteEndRange: Unit, responseType: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: String,
      byteStartRange: Unit,
      byteEndRange: Unit,
      responseType: Any,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: String,
      byteStartRange: Unit,
      byteEndRange: Unit,
      responseType: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: Unit, byteStartRange: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: Unit, byteStartRange: String, byteEndRange: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: Unit, byteStartRange: String, byteEndRange: String, responseType: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: Unit,
      byteStartRange: String,
      byteEndRange: String,
      responseType: Any,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: Unit,
      byteStartRange: String,
      byteEndRange: String,
      responseType: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: Unit, byteStartRange: String, byteEndRange: Unit, responseType: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: Unit,
      byteStartRange: String,
      byteEndRange: Unit,
      responseType: Any,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: Unit,
      byteStartRange: String,
      byteEndRange: Unit,
      responseType: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: Unit, byteStartRange: Unit, byteEndRange: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: Unit, byteStartRange: Unit, byteEndRange: String, responseType: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: Unit,
      byteStartRange: Unit,
      byteEndRange: String,
      responseType: Any,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: Unit,
      byteStartRange: Unit,
      byteEndRange: String,
      responseType: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: Unit, byteStartRange: Unit, byteEndRange: Unit, responseType: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(recordId: Unit, byteStartRange: Unit, byteEndRange: Unit, responseType: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFile(
      recordId: Unit,
      byteStartRange: Unit,
      byteEndRange: Unit,
      responseType: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getFileInfo(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFileInfo(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFileInfo(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFileInfo(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getFileName(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFileName(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFileName(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getFileName(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getPublicFile(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getPublicFile(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getPublicFile(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getPublicFile(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var responseType: Any = js.native
    
    var teamId: String = js.native
    
    def unzip(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def unzip(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def unzip(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def unzip(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def uploadFile(
      fileName: js.UndefOr[String],
      contentType: js.UndefOr[String],
      data: js.UndefOr[Any],
      persistFile: js.UndefOr[Boolean],
      isPublic: js.UndefOr[Boolean],
      logProfileKey: js.UndefOr[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
  }
}

package typings.agilite

import typings.agilite.distAgiliteInterfaceMod.ConfigInterface
import typings.agilite.distUtilsUtilsInterfaceMod.OutputFormatInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulesBatchLoggingControllerMod {
  
  @JSImport("agilite/dist/modules/batch-logging/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BatchLogging {
    def this(config: ConfigInterface) = this()
  }
  
  @js.native
  trait BatchLogging extends StObject {
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def createLogEntry(
      profileKey: js.UndefOr[String],
      category: js.UndefOr[String],
      subCategory: js.UndefOr[String],
      code: js.UndefOr[String],
      message: js.UndefOr[String],
      contentType: js.UndefOr[String],
      data: js.UndefOr[Any]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def deleteData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getByProfileKey(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getByProfileKey(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getByProfileKey(profileKey: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getByProfileKey(profileKey: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(
      profileKeys: js.Array[String],
      recordIds: js.Array[String],
      slimResult: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(
      profileKeys: js.Array[String],
      recordIds: js.Array[String],
      slimResult: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: Unit, slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: Unit, slimResult: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: Unit, slimResult: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String], slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String], slimResult: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String], slimResult: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: Unit, slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: Unit, slimResult: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: Unit, slimResult: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getLogs(
      profileKey: js.UndefOr[String],
      qry: js.UndefOr[String],
      fieldsToReturn: js.UndefOr[String],
      qryOptions: js.UndefOr[Any],
      page: js.UndefOr[Any],
      pageLimit: js.UndefOr[Any]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var outputFormat: OutputFormatInterface = js.native
    
    def postData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def putData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def resetLogs(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetLogs(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetLogs(profileKey: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetLogs(profileKey: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var teamId: String = js.native
  }
}

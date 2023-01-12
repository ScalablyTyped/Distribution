package typings.agilite

import typings.agilite.distAgiliteInterfaceMod.ConfigInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulesUtilitiesControllerMod {
  
  @JSImport("agilite/dist/modules/utilities/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Utils {
    def this(config: ConfigInterface) = this()
  }
  
  trait ResponseType extends StObject {
    
    var ARRAY_BUFFER: String
    
    var BLOB: String
    
    var DOCUMENT: String
    
    var JSON: String
    
    var STREAM: String
    
    var TEXT: String
  }
  object ResponseType {
    
    inline def apply(ARRAY_BUFFER: String, BLOB: String, DOCUMENT: String, JSON: String, STREAM: String, TEXT: String): ResponseType = {
      val __obj = js.Dynamic.literal(ARRAY_BUFFER = ARRAY_BUFFER.asInstanceOf[js.Any], BLOB = BLOB.asInstanceOf[js.Any], DOCUMENT = DOCUMENT.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], STREAM = STREAM.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseType] (val x: Self) extends AnyVal {
      
      inline def setARRAY_BUFFER(value: String): Self = StObject.set(x, "ARRAY_BUFFER", value.asInstanceOf[js.Any])
      
      inline def setBLOB(value: String): Self = StObject.set(x, "BLOB", value.asInstanceOf[js.Any])
      
      inline def setDOCUMENT(value: String): Self = StObject.set(x, "DOCUMENT", value.asInstanceOf[js.Any])
      
      inline def setJSON(value: String): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setSTREAM(value: String): Self = StObject.set(x, "STREAM", value.asInstanceOf[js.Any])
      
      inline def setTEXT(value: String): Self = StObject.set(x, "TEXT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Utils extends StObject {
    
    def JSToXML(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def JSToXML(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def JSToXML(data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def JSToXML(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def XMLToJS(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def XMLToJS(data: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def XMLToJS(data: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def XMLToJS(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def account(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def account(logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def dashboardReports(startDate: String, endDate: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def dashboardReports(startDate: String, endDate: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def decodeXML(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def decodeXML(data: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def decodeXML(data: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def decodeXML(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def encodeXML(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def encodeXML(data: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def encodeXML(data: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def encodeXML(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def exportData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Boolean, solutionsArray: js.Array[Any]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Boolean, solutionsArray: js.Array[Any], includeData: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: js.Array[Any],
      includeData: Boolean,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: js.Array[Any],
      includeData: Boolean,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: js.Array[Any],
      includeData: Boolean,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: js.Array[Any],
      includeData: Unit,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: js.Array[Any],
      includeData: Unit,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: js.Array[Any],
      includeData: Unit,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Boolean, solutionsArray: Unit, includeData: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Boolean, solutionsArray: Unit, includeData: Boolean, includeCredentials: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Boolean, solutionsArray: Unit, includeData: Unit, includeCredentials: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Unit, solutionsArray: js.Array[Any]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Unit, solutionsArray: js.Array[Any], includeData: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: js.Array[Any],
      includeData: Boolean,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: js.Array[Any],
      includeData: Boolean,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: js.Array[Any],
      includeData: Boolean,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: js.Array[Any],
      includeData: Unit,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: js.Array[Any],
      includeData: Unit,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: js.Array[Any],
      includeData: Unit,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Unit, solutionsArray: Unit, includeData: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Unit, solutionsArray: Unit, includeData: Boolean, includeCredentials: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(includeModules: Unit, solutionsArray: Unit, includeData: Unit, includeCredentials: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def exportData(
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def formatDateTime(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def formatDateTime(dateTimeValue: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def formatDateTime(dateTimeValue: String, formatKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def formatDateTime(dateTimeValue: String, formatKey: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def formatDateTime(dateTimeValue: String, formatKey: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def formatDateTime(dateTimeValue: Unit, formatKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def formatDateTime(dateTimeValue: Unit, formatKey: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def formatDateTime(dateTimeValue: Unit, formatKey: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def generateOCR(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generateOCR(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def generatePDF(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generatePDF(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generatePDF(data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generatePDF(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def generateUUID(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generateUUID(logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def generateUsername(fullName: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generateUsername(fullName: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generateUsername(fullName: String, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generateUsername(fullName: String, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getIP(): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getUserAgent(): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def homePageReports(): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def html2json(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def html2json(data: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def html2json(data: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def html2json(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def importData(fileId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(fileId: String, includeModules: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(fileId: String, includeModules: Boolean, solutionsArray: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(fileId: String, includeModules: Boolean, solutionsArray: js.Array[String], includeData: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: js.Array[String],
      includeData: Boolean,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: js.Array[String],
      includeData: Boolean,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: js.Array[String],
      includeData: Boolean,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: js.Array[String],
      includeData: Unit,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: js.Array[String],
      includeData: Unit,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: js.Array[String],
      includeData: Unit,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(fileId: String, includeModules: Boolean, solutionsArray: Unit, includeData: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Boolean,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(fileId: String, includeModules: Unit, solutionsArray: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(fileId: String, includeModules: Unit, solutionsArray: js.Array[String], includeData: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: js.Array[String],
      includeData: Boolean,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: js.Array[String],
      includeData: Boolean,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: js.Array[String],
      includeData: Boolean,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: js.Array[String],
      includeData: Unit,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: js.Array[String],
      includeData: Unit,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: js.Array[String],
      includeData: Unit,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(fileId: String, includeModules: Unit, solutionsArray: Unit, includeData: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Boolean,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Boolean
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def importData(
      fileId: String,
      includeModules: Unit,
      solutionsArray: Unit,
      includeData: Unit,
      includeCredentials: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def jsonDiff(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def jsonDiff(data: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def jsonDiff(data: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def jsonDiff(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var responseType: ResponseType = js.native
    
    def returnISOLanguages(): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var teamId: String = js.native
  }
}

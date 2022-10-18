package typings.agilite

import typings.agilite.distAgiliteInterfaceMod.ConfigInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulesNumberingControllerMod {
  
  @JSImport("agilite/dist/modules/numbering/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Numbering {
    def this(config: ConfigInterface) = this()
  }
  
  @js.native
  trait Numbering extends StObject {
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def deleteData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def generate(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: String, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: String, outputFormat: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: String, outputFormat: String, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: String, outputFormat: String, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: String, outputFormat: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: String, outputFormat: Unit, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: String, outputFormat: Unit, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: Unit, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: Unit, outputFormat: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: Unit, outputFormat: String, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: Unit, outputFormat: String, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: Unit, outputFormat: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: Unit, outputFormat: Unit, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generate(profileKey: Unit, outputFormat: Unit, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
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
    
    var outputFormat: OutputFormat = js.native
    
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
    
    def resetCounters(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetCounters(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetCounters(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetCounters(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var teamId: String = js.native
  }
  
  trait OutputFormat extends StObject {
    
    var JSON: String
    
    var STRING: String
  }
  object OutputFormat {
    
    inline def apply(JSON: String, STRING: String): OutputFormat = {
      val __obj = js.Dynamic.literal(JSON = JSON.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputFormat]
    }
    
    extension [Self <: OutputFormat](x: Self) {
      
      inline def setJSON(value: String): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setSTRING(value: String): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
    }
  }
}

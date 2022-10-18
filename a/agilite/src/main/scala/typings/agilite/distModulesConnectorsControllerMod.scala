package typings.agilite

import typings.agilite.distAgiliteInterfaceMod.ConfigInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulesConnectorsControllerMod {
  
  @JSImport("agilite/dist/modules/connectors/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Connectors {
    def this(config: ConfigInterface) = this()
  }
  
  @js.native
  trait Connectors extends StObject {
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def deleteData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def execute(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: String, data: Any, isResponseFile: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: String, data: Any, isResponseFile: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: String, data: Any, isResponseFile: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: String, data: Unit, isResponseFile: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: String, data: Unit, isResponseFile: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: String, data: Unit, isResponseFile: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: Unit, data: Any, isResponseFile: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: Unit, data: Any, isResponseFile: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: Unit, data: Any, isResponseFile: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: Unit, data: Unit, isResponseFile: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: Unit, data: Unit, isResponseFile: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: String, routeKey: Unit, data: Unit, isResponseFile: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: String, data: Any, isResponseFile: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: String, data: Any, isResponseFile: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: String, data: Any, isResponseFile: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: String, data: Unit, isResponseFile: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: String, data: Unit, isResponseFile: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: String, data: Unit, isResponseFile: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: Unit, data: Any, isResponseFile: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: Unit, data: Any, isResponseFile: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: Unit, data: Any, isResponseFile: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: Unit, data: Unit, isResponseFile: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: Unit, data: Unit, isResponseFile: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def execute(profileKey: Unit, routeKey: Unit, data: Unit, isResponseFile: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
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
    
    def postData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def putData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any, resetService: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any, resetService: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any, resetService: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Unit, resetService: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Unit, resetService: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Unit, resetService: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any, resetService: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any, resetService: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any, resetService: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Unit, resetService: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Unit, resetService: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Unit, resetService: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def resetConnectionPool(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetConnectionPool(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetConnectionPool(profileKey: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetConnectionPool(profileKey: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var teamId: String = js.native
  }
}

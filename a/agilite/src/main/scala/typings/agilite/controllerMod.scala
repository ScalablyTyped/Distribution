package typings.agilite

import typings.agilite.agiliteInterfaceMod.ConfigInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controllerMod {
  
  @JSImport("agilite/dist/modules/api-keys/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ApiKeys {
    def this(config: ConfigInterface) = this()
  }
  
  @js.native
  trait ApiKeys extends StObject {
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def deleteData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def disableApiKey(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def disableApiKey(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def enableApiKey(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def enableApiKey(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def generateApiKey(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def generateApiKey(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: Unit, slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String], slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: Unit, slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def postData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def putData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def resetApiKeys(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def resetApiKeys(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var teamId: String = js.native
  }
}

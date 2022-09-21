package typings.agilite

import typings.agilite.agiliteInterfaceMod.ConfigInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rolesControllerMod {
  
  @JSImport("agilite/dist/modules/roles/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Roles {
    def this(config: ConfigInterface) = this()
  }
  
  @js.native
  trait Roles extends StObject {
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def changeConditionalLevels(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def changeConditionalLevels(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def changeConditionalLevels(recordId: String, conditionalLevels: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def changeConditionalLevels(recordId: String, conditionalLevels: js.Array[String], logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def changeConditionalLevels(recordId: String, conditionalLevels: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def changeConditionalLevels(recordId: Unit, conditionalLevels: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def changeConditionalLevels(recordId: Unit, conditionalLevels: js.Array[String], logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def changeConditionalLevels(recordId: Unit, conditionalLevels: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def deleteData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
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
    
    def getRole(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: js.Array[String], conditionalLevels: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: js.Array[String], conditionalLevels: js.Array[String], data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: js.Array[String], conditionalLevels: js.Array[String], data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(
      roleNames: js.Array[String],
      conditionalLevels: js.Array[String],
      data: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: js.Array[String], conditionalLevels: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: js.Array[String], conditionalLevels: Unit, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: js.Array[String], conditionalLevels: Unit, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: Unit, conditionalLevels: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: Unit, conditionalLevels: js.Array[String], data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: Unit, conditionalLevels: js.Array[String], data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: Unit, conditionalLevels: js.Array[String], data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: Unit, conditionalLevels: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: Unit, conditionalLevels: Unit, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getRole(roleNames: Unit, conditionalLevels: Unit, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
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
    
    def reAssignResponsibleUser(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(recordId: String, responsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(recordId: String, responsibleUser: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(recordId: String, responsibleUser: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(recordId: Unit, responsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(recordId: Unit, responsibleUser: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(recordId: Unit, responsibleUser: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var teamId: String = js.native
  }
}

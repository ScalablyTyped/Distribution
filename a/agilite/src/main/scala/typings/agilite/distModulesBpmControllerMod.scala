package typings.agilite

import typings.agilite.distAgiliteInterfaceMod.ConfigInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulesBpmControllerMod {
  
  @JSImport("agilite/dist/modules/bpm/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BPM {
    def this(config: ConfigInterface) = this()
  }
  
  @js.native
  trait BPM extends StObject {
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def assignRole(
      processKey: js.UndefOr[String],
      bpmRecordId: js.UndefOr[String],
      roleName: js.UndefOr[String],
      currentUser: js.UndefOr[String],
      responsibleUsers: js.UndefOr[js.Array[String]],
      logProfileKey: js.UndefOr[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def clearHistoryData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def clearHistoryData(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def clearHistoryData(profileKey: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def clearHistoryData(profileKey: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def deleteBPMStubs(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteBPMStubs(processKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteBPMStubs(processKey: String, bpmRecordIds: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteBPMStubs(processKey: String, bpmRecordIds: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteBPMStubs(processKey: String, bpmRecordIds: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteBPMStubs(processKey: Unit, bpmRecordIds: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteBPMStubs(processKey: Unit, bpmRecordIds: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteBPMStubs(processKey: Unit, bpmRecordIds: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def deleteData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def execute(
      processKey: js.UndefOr[String],
      bpmRecordId: js.UndefOr[String],
      optionSelected: js.UndefOr[String],
      currentUser: js.UndefOr[String],
      currentStep: js.UndefOr[String],
      comments: js.UndefOr[String],
      data: js.UndefOr[Any],
      includeHistory: js.UndefOr[Boolean],
      includeStepOptions: js.UndefOr[Boolean],
      includeVisibleObjects: js.UndefOr[Boolean],
      includeKeywords: js.UndefOr[Boolean],
      isoLanguage: js.UndefOr[String],
      logProfileKey: js.UndefOr[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getActiveSteps(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveSteps(processKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveSteps(processKey: String, isoLanguage: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveSteps(processKey: String, isoLanguage: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveSteps(processKey: String, isoLanguage: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveSteps(processKey: Unit, isoLanguage: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveSteps(processKey: Unit, isoLanguage: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveSteps(processKey: Unit, isoLanguage: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getActiveUsers(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveUsers(processKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveUsers(processKey: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getActiveUsers(processKey: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getAssignedRoles(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: String, bpmRecordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: String, bpmRecordId: String, roleNames: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: String, bpmRecordId: String, roleNames: js.Array[String], logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: String, bpmRecordId: String, roleNames: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: String, bpmRecordId: Unit, roleNames: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: String, bpmRecordId: Unit, roleNames: js.Array[String], logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: String, bpmRecordId: Unit, roleNames: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: Unit, bpmRecordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: Unit, bpmRecordId: String, roleNames: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: Unit, bpmRecordId: String, roleNames: js.Array[String], logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: Unit, bpmRecordId: String, roleNames: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: Unit, bpmRecordId: Unit, roleNames: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: Unit, bpmRecordId: Unit, roleNames: js.Array[String], logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getAssignedRoles(processKey: Unit, bpmRecordId: Unit, roleNames: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
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
    
    def getRecordState(
      processKeys: js.UndefOr[js.Array[String]],
      bpmRecordIds: js.UndefOr[js.Array[String]],
      stepNames: js.UndefOr[js.Array[String]],
      responsibleUsers: js.UndefOr[js.Array[String]],
      relevantUsers: js.UndefOr[js.Array[String]],
      relevantRoles: js.UndefOr[js.Array[String]],
      eventStamps: js.UndefOr[js.Array[String]],
      eventStartDate: js.UndefOr[String],
      eventEndDate: js.UndefOr[String],
      includeHistory: js.UndefOr[Boolean],
      includeStepOptions: js.UndefOr[Boolean],
      includeVisibleObjects: js.UndefOr[Boolean],
      includeKeywords: js.UndefOr[Boolean],
      page: js.UndefOr[Any],
      pageLimit: js.UndefOr[Any],
      sort: js.UndefOr[String],
      isoLanguage: js.UndefOr[String],
      logProfileKey: js.UndefOr[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getResponsibleRoles(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getResponsibleRoles(processKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getResponsibleRoles(processKey: String, responsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getResponsibleRoles(processKey: String, responsibleUser: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getResponsibleRoles(processKey: String, responsibleUser: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getResponsibleRoles(processKey: Unit, responsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getResponsibleRoles(processKey: Unit, responsibleUser: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getResponsibleRoles(processKey: Unit, responsibleUser: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def lockRecord(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def lockRecord(bpmRecordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def lockRecord(bpmRecordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def lockRecord(bpmRecordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
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
    def reAssignResponsibleUser(processKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(processKey: String, currentResponsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(processKey: String, currentResponsibleUser: String, newResponsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: String,
      newResponsibleUser: String,
      roleNames: js.Array[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: String,
      newResponsibleUser: String,
      roleNames: js.Array[String],
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: String,
      newResponsibleUser: String,
      roleNames: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: String,
      newResponsibleUser: Unit,
      roleNames: js.Array[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: String,
      newResponsibleUser: Unit,
      roleNames: js.Array[String],
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: String,
      newResponsibleUser: Unit,
      roleNames: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(processKey: String, currentResponsibleUser: Unit, newResponsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: Unit,
      newResponsibleUser: String,
      roleNames: js.Array[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: Unit,
      newResponsibleUser: String,
      roleNames: js.Array[String],
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: Unit,
      newResponsibleUser: String,
      roleNames: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: Unit,
      newResponsibleUser: Unit,
      roleNames: js.Array[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: Unit,
      newResponsibleUser: Unit,
      roleNames: js.Array[String],
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: String,
      currentResponsibleUser: Unit,
      newResponsibleUser: Unit,
      roleNames: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(processKey: Unit, currentResponsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(processKey: Unit, currentResponsibleUser: String, newResponsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: String,
      newResponsibleUser: String,
      roleNames: js.Array[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: String,
      newResponsibleUser: String,
      roleNames: js.Array[String],
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: String,
      newResponsibleUser: String,
      roleNames: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: String,
      newResponsibleUser: Unit,
      roleNames: js.Array[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: String,
      newResponsibleUser: Unit,
      roleNames: js.Array[String],
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: String,
      newResponsibleUser: Unit,
      roleNames: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(processKey: Unit, currentResponsibleUser: Unit, newResponsibleUser: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: Unit,
      newResponsibleUser: String,
      roleNames: js.Array[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: Unit,
      newResponsibleUser: String,
      roleNames: js.Array[String],
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: Unit,
      newResponsibleUser: String,
      roleNames: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: Unit,
      newResponsibleUser: Unit,
      roleNames: js.Array[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: Unit,
      newResponsibleUser: Unit,
      roleNames: js.Array[String],
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def reAssignResponsibleUser(
      processKey: Unit,
      currentResponsibleUser: Unit,
      newResponsibleUser: Unit,
      roleNames: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def registerBPMRecord(
      processKey: js.UndefOr[String],
      currentUser: js.UndefOr[String],
      includeHistory: js.UndefOr[Boolean],
      includeStepOptions: js.UndefOr[Boolean],
      includeVisibleObjects: js.UndefOr[Boolean],
      includeKeywords: js.UndefOr[Boolean],
      isoLanguage: js.UndefOr[String],
      logProfileKey: js.UndefOr[String]
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var teamId: String = js.native
    
    def unlockRecord(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def unlockRecord(bpmRecordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def unlockRecord(bpmRecordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def unlockRecord(bpmRecordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
  }
}

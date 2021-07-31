package typings.agilite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("agilite", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Agilite {
    def this(config: AgiliteConfig) = this()
    
    /* CompleteClass */
    var ApiKeys: typings.agilite.mod.ApiKeys = js.native
    
    /* CompleteClass */
    var BPM: typings.agilite.mod.BPM = js.native
    
    /* CompleteClass */
    var Connectors: typings.agilite.mod.Connectors = js.native
    
    /* CompleteClass */
    var DataMappings: typings.agilite.mod.DataMappings = js.native
    
    /* CompleteClass */
    var Files: typings.agilite.mod.Files = js.native
    
    /* CompleteClass */
    var Keywords: typings.agilite.mod.Keywords = js.native
    
    /* CompleteClass */
    var Numbering: typings.agilite.mod.Numbering = js.native
    
    /* CompleteClass */
    var Roles: typings.agilite.mod.Roles = js.native
    
    /* CompleteClass */
    var Templates: typings.agilite.mod.Templates = js.native
    
    /* CompleteClass */
    var TierStructures: typings.agilite.mod.TierStructures = js.native
    
    /* CompleteClass */
    var Utils: typings.agilite.mod.Utils = js.native
    
    /* CompleteClass */
    var appName: typings.agilite.mod.appName = js.native
    
    /* CompleteClass */
    var config: AgiliteConfig = js.native
    
    /* CompleteClass */
    override def executeCRUDRequest(appName: String, reqType: String, data: js.Any, headers: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def getConfig(): AgiliteConfig = js.native
    
    /* CompleteClass */
    var reqType: typings.agilite.mod.reqType = js.native
  }
  
  @JSImport("agilite", "ApiKeys")
  @js.native
  class ApiKeys protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def deleteData(recordId: String): js.Any = js.native
    
    def disableApiKey(recordId: String): js.Any = js.native
    
    def enableApiKey(recordId: String): js.Any = js.native
    
    def generateApiKey(recordId: String): js.Any = js.native
    
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
    
    def postData(data: js.Any): js.Any = js.native
    
    def putData(recordId: String, data: js.Any): js.Any = js.native
    
    def resetApiKeys(recordId: String): js.Any = js.native
  }
  
  @JSImport("agilite", "BPM")
  @js.native
  class BPM protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def clearHistoryData(profileKey: String): js.Any = js.native
    
    def deleteData(recordId: String): js.Any = js.native
    
    def execute(
      processKey: String,
      bpmRecordId: String,
      optionSelected: String,
      currentUser: String,
      comments: String,
      data: js.Any
    ): js.Any = js.native
    
    def getActiveSteps(processKey: String): js.Any = js.native
    
    def getActiveUsers(processKey: String): js.Any = js.native
    
    def getByProfileKey(profileKey: String): js.Any = js.native
    
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
    
    // tslint:disable-next-line max-line-length
    def getRecordState(
      processKeys: js.Array[String],
      bpmRecordIds: js.Array[String],
      stepNames: js.Array[String],
      responsibleUsers: js.Array[String],
      relevantUsers: js.Array[String],
      includeHistory: Boolean,
      includeStepOptions: Boolean,
      includeVisibleObjects: Boolean,
      page: js.Any,
      pageLimit: js.Any
    ): js.Any = js.native
    
    def postData(data: js.Any): js.Any = js.native
    
    def putData(recordId: String, data: js.Any): js.Any = js.native
    
    def registerBPMRecord(processKey: String, currentUser: String): js.Any = js.native
  }
  
  @JSImport("agilite", "Connectors")
  @js.native
  class Connectors protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def deleteData(recordId: String): js.Any = js.native
    
    def execute(profileKey: String, routeKey: String, data: js.Any): js.Any = js.native
    
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
    
    def postData(data: js.Any): js.Any = js.native
    
    def putData(recordId: String, data: js.Any): js.Any = js.native
  }
  
  @JSImport("agilite", "DataMappings")
  @js.native
  class DataMappings protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def deleteData(recordId: String): js.Any = js.native
    
    def execute(profileKey: String, data: js.Any): js.Any = js.native
    
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
    
    def postData(data: js.Any): js.Any = js.native
    
    def putData(recordId: String, data: js.Any): js.Any = js.native
  }
  
  @JSImport("agilite", "Files")
  @js.native
  class Files protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def deleteFile(recordId: String): js.Any = js.native
    
    def getFile(recordId: String, responseType: js.Any): js.Any = js.native
    
    def getFileName(recordId: String): js.Any = js.native
    
    var responseType: typings.agilite.mod.responseType = js.native
    
    def uploadFile(fileName: String, contentType: String, data: js.Any): js.Any = js.native
  }
  
  @JSImport("agilite", "Keywords")
  @js.native
  class Keywords protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def deleteData(recordId: String): js.Any = js.native
    
    def getByProfileKey(profileKey: String, sort: String, outputFormat: String): js.Any = js.native
    
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
    
    def getLabelByValue(profileKey: String, value: String, outputFormat: String): js.Any = js.native
    
    def getProfileKeysByGroup(groupName: String, sort: String): js.Any = js.native
    
    def getValueByLabel(profileKey: String, label: String, outputFormat: String): js.Any = js.native
    
    var outputFormat: typings.agilite.mod.outputFormat = js.native
    
    def postData(data: js.Any): js.Any = js.native
    
    def putData(recordId: String, data: js.Any): js.Any = js.native
    
    var sort: typings.agilite.mod.sort = js.native
  }
  
  @JSImport("agilite", "Numbering")
  @js.native
  class Numbering protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def deleteData(recordId: String): js.Any = js.native
    
    def generate(profileKey: String, outputFormat: String, data: js.Any): js.Any = js.native
    
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
    
    var outputFormat: typings.agilite.mod.outputFormat = js.native
    
    def postData(data: js.Any): js.Any = js.native
    
    def putData(recordId: String, data: js.Any): js.Any = js.native
    
    def resetCounters(recordId: String): js.Any = js.native
  }
  
  @JSImport("agilite", "Roles")
  @js.native
  class Roles protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def assignRole(
      processKey: String,
      bpmRecordId: String,
      roleName: String,
      currentUser: String,
      responsibleUsers: js.Array[String]
    ): js.Any = js.native
    
    def changeConditionalLevels(recordId: String, conditionalLevels: js.Array[String]): js.Any = js.native
    
    def deleteData(recordId: String): js.Any = js.native
    
    def getAssignedRoles(processKey: String, bpmRecordId: String, roleNames: js.Array[String]): js.Any = js.native
    
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
    
    def getRole(roleNames: js.Array[String], conditionalLevels: js.Array[String], data: js.Any): js.Any = js.native
    
    def postData(data: js.Any): js.Any = js.native
    
    def putData(recordId: String, data: js.Any): js.Any = js.native
    
    def reAssignResponsibleUser(recordId: String, responsibleUser: String): js.Any = js.native
  }
  
  @JSImport("agilite", "Templates")
  @js.native
  class Templates protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def deleteData(recordId: String): js.Any = js.native
    
    def execute(profileKey: String, data: js.Any): js.Any = js.native
    
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
    
    def postData(data: js.Any): js.Any = js.native
    
    def putData(recordId: String, data: js.Any): js.Any = js.native
  }
  
  @JSImport("agilite", "TierStructures")
  @js.native
  class TierStructures protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def deleteData(recordId: String): js.Any = js.native
    
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
    
    def getTierByKey(
      tierKeys: js.Array[String],
      includeValues: Boolean,
      includeMetaData: Boolean,
      includeTierEntries: Boolean,
      sortValues: String,
      valuesOutputFormat: String
    ): js.Any = js.native
    
    var outputFormat: typings.agilite.mod.outputFormat = js.native
    
    def postData(data: js.Any): js.Any = js.native
    
    def putData(recordId: String, data: js.Any): js.Any = js.native
    
    var sort: typings.agilite.mod.sort = js.native
  }
  
  @JSImport("agilite", "Utils")
  @js.native
  class Utils protected () extends StObject {
    def this(config: AgiliteConfig) = this()
    
    def JSToXML(data: String): js.Any = js.native
    
    def XMLToJS(data: String): js.Any = js.native
    
    def account(): js.Any = js.native
    
    def dashboardReports(startDate: js.Any, endDate: js.Any): js.Any = js.native
    
    def decodeXML(data: String): js.Any = js.native
    
    def encodeXML(data: String): js.Any = js.native
    
    def exportData(includeModules: js.Any): js.Any = js.native
    
    def formatDateTime(dateTimeValue: String, formatKey: String): js.Any = js.native
    
    def generatePDF(data: js.Any): js.Any = js.native
    
    def generateUUID(): js.Any = js.native
    
    def html2json(data: String): js.Any = js.native
    
    def importData(fileId: String): js.Any = js.native
    
    var responseType: typings.agilite.mod.responseType = js.native
  }
  
  trait Agilite extends StObject {
    
    var ApiKeys: typings.agilite.mod.ApiKeys
    
    var BPM: typings.agilite.mod.BPM
    
    var Connectors: typings.agilite.mod.Connectors
    
    var DataMappings: typings.agilite.mod.DataMappings
    
    var Files: typings.agilite.mod.Files
    
    var Keywords: typings.agilite.mod.Keywords
    
    var Numbering: typings.agilite.mod.Numbering
    
    var Roles: typings.agilite.mod.Roles
    
    var Templates: typings.agilite.mod.Templates
    
    var TierStructures: typings.agilite.mod.TierStructures
    
    var Utils: typings.agilite.mod.Utils
    
    var appName: typings.agilite.mod.appName
    
    var config: AgiliteConfig
    
    def executeCRUDRequest(appName: String, reqType: String, data: js.Any, headers: js.Any): js.Any
    
    def getConfig(): AgiliteConfig
    
    var reqType: typings.agilite.mod.reqType
  }
  object Agilite {
    
    @scala.inline
    def apply(
      ApiKeys: ApiKeys,
      BPM: BPM,
      Connectors: Connectors,
      DataMappings: DataMappings,
      Files: Files,
      Keywords: Keywords,
      Numbering: Numbering,
      Roles: Roles,
      Templates: Templates,
      TierStructures: TierStructures,
      Utils: Utils,
      appName: appName,
      config: AgiliteConfig,
      executeCRUDRequest: (String, String, js.Any, js.Any) => js.Any,
      getConfig: () => AgiliteConfig,
      reqType: reqType
    ): Agilite = {
      val __obj = js.Dynamic.literal(ApiKeys = ApiKeys.asInstanceOf[js.Any], BPM = BPM.asInstanceOf[js.Any], Connectors = Connectors.asInstanceOf[js.Any], DataMappings = DataMappings.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Numbering = Numbering.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any], Templates = Templates.asInstanceOf[js.Any], TierStructures = TierStructures.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], executeCRUDRequest = js.Any.fromFunction4(executeCRUDRequest), getConfig = js.Any.fromFunction0(getConfig), reqType = reqType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agilite]
    }
    
    @scala.inline
    implicit class AgiliteMutableBuilder[Self <: Agilite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKeys(value: ApiKeys): Self = StObject.set(x, "ApiKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppName(value: appName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBPM(value: BPM): Self = StObject.set(x, "BPM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: AgiliteConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectors(value: Connectors): Self = StObject.set(x, "Connectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMappings(value: DataMappings): Self = StObject.set(x, "DataMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecuteCRUDRequest(value: (String, String, js.Any, js.Any) => js.Any): Self = StObject.set(x, "executeCRUDRequest", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFiles(value: Files): Self = StObject.set(x, "Files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetConfig(value: () => AgiliteConfig): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeywords(value: Keywords): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumbering(value: Numbering): Self = StObject.set(x, "Numbering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqType(value: reqType): Self = StObject.set(x, "reqType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoles(value: Roles): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplates(value: Templates): Self = StObject.set(x, "Templates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTierStructures(value: TierStructures): Self = StObject.set(x, "TierStructures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtils(value: Utils): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
    }
  }
  
  trait AgiliteConfig extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var apiServerUrl: js.UndefOr[String] = js.undefined
    
    var teamId: js.UndefOr[String] = js.undefined
  }
  object AgiliteConfig {
    
    @scala.inline
    def apply(): AgiliteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgiliteConfig]
    }
    
    @scala.inline
    implicit class AgiliteConfigMutableBuilder[Self <: AgiliteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setApiServerUrl(value: String): Self = StObject.set(x, "apiServerUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiServerUrlUndefined: Self = StObject.set(x, "apiServerUrl", js.undefined)
      
      @scala.inline
      def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
    }
  }
  
  trait appName extends StObject {
    
    var MODULE_KEY_API_KEYS: String
    
    var MODULE_KEY_BOT_BUILDER: String
    
    var MODULE_KEY_BPM: String
    
    var MODULE_KEY_CONNECTORS: String
    
    var MODULE_KEY_DATA_MAPPING: String
    
    var MODULE_KEY_FILES: String
    
    var MODULE_KEY_KEYWORDS: String
    
    var MODULE_KEY_NUMBERING: String
    
    var MODULE_KEY_ROLES: String
    
    var MODULE_KEY_TEMPLATES: String
    
    var MODULE_KEY_TIER_STRUCTURES: String
    
    var MODULE_KEY_UTILS: String
  }
  object appName {
    
    @scala.inline
    def apply(
      MODULE_KEY_API_KEYS: String,
      MODULE_KEY_BOT_BUILDER: String,
      MODULE_KEY_BPM: String,
      MODULE_KEY_CONNECTORS: String,
      MODULE_KEY_DATA_MAPPING: String,
      MODULE_KEY_FILES: String,
      MODULE_KEY_KEYWORDS: String,
      MODULE_KEY_NUMBERING: String,
      MODULE_KEY_ROLES: String,
      MODULE_KEY_TEMPLATES: String,
      MODULE_KEY_TIER_STRUCTURES: String,
      MODULE_KEY_UTILS: String
    ): appName = {
      val __obj = js.Dynamic.literal(MODULE_KEY_API_KEYS = MODULE_KEY_API_KEYS.asInstanceOf[js.Any], MODULE_KEY_BOT_BUILDER = MODULE_KEY_BOT_BUILDER.asInstanceOf[js.Any], MODULE_KEY_BPM = MODULE_KEY_BPM.asInstanceOf[js.Any], MODULE_KEY_CONNECTORS = MODULE_KEY_CONNECTORS.asInstanceOf[js.Any], MODULE_KEY_DATA_MAPPING = MODULE_KEY_DATA_MAPPING.asInstanceOf[js.Any], MODULE_KEY_FILES = MODULE_KEY_FILES.asInstanceOf[js.Any], MODULE_KEY_KEYWORDS = MODULE_KEY_KEYWORDS.asInstanceOf[js.Any], MODULE_KEY_NUMBERING = MODULE_KEY_NUMBERING.asInstanceOf[js.Any], MODULE_KEY_ROLES = MODULE_KEY_ROLES.asInstanceOf[js.Any], MODULE_KEY_TEMPLATES = MODULE_KEY_TEMPLATES.asInstanceOf[js.Any], MODULE_KEY_TIER_STRUCTURES = MODULE_KEY_TIER_STRUCTURES.asInstanceOf[js.Any], MODULE_KEY_UTILS = MODULE_KEY_UTILS.asInstanceOf[js.Any])
      __obj.asInstanceOf[appName]
    }
    
    @scala.inline
    implicit class appNameMutableBuilder[Self <: appName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMODULE_KEY_API_KEYS(value: String): Self = StObject.set(x, "MODULE_KEY_API_KEYS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_BOT_BUILDER(value: String): Self = StObject.set(x, "MODULE_KEY_BOT_BUILDER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_BPM(value: String): Self = StObject.set(x, "MODULE_KEY_BPM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_CONNECTORS(value: String): Self = StObject.set(x, "MODULE_KEY_CONNECTORS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_DATA_MAPPING(value: String): Self = StObject.set(x, "MODULE_KEY_DATA_MAPPING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_FILES(value: String): Self = StObject.set(x, "MODULE_KEY_FILES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_KEYWORDS(value: String): Self = StObject.set(x, "MODULE_KEY_KEYWORDS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_NUMBERING(value: String): Self = StObject.set(x, "MODULE_KEY_NUMBERING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_ROLES(value: String): Self = StObject.set(x, "MODULE_KEY_ROLES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_TEMPLATES(value: String): Self = StObject.set(x, "MODULE_KEY_TEMPLATES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_TIER_STRUCTURES(value: String): Self = StObject.set(x, "MODULE_KEY_TIER_STRUCTURES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_KEY_UTILS(value: String): Self = StObject.set(x, "MODULE_KEY_UTILS", value.asInstanceOf[js.Any])
    }
  }
  
  trait outputFormat extends StObject {
    
    var ARRAY: String
    
    var JSON: String
    
    var STRING: String
  }
  object outputFormat {
    
    @scala.inline
    def apply(ARRAY: String, JSON: String, STRING: String): outputFormat = {
      val __obj = js.Dynamic.literal(ARRAY = ARRAY.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
      __obj.asInstanceOf[outputFormat]
    }
    
    @scala.inline
    implicit class outputFormatMutableBuilder[Self <: outputFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARRAY(value: String): Self = StObject.set(x, "ARRAY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSON(value: String): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTRING(value: String): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
    }
  }
  
  trait reqType extends StObject {
    
    var DELETE: String
    
    var GET: String
    
    var POST: String
    
    var PUT: String
  }
  object reqType {
    
    @scala.inline
    def apply(DELETE: String, GET: String, POST: String, PUT: String): reqType = {
      val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any])
      __obj.asInstanceOf[reqType]
    }
    
    @scala.inline
    implicit class reqTypeMutableBuilder[Self <: reqType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDELETE(value: String): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET(value: String): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOST(value: String): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUT(value: String): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
    }
  }
  
  trait responseType extends StObject {
    
    var ARRAY_BUFFER: String
    
    var BLOB: String
    
    var DOCUMENT: String
    
    var JSON: String
    
    var STREAM: String
    
    var TEXT: String
  }
  object responseType {
    
    @scala.inline
    def apply(ARRAY_BUFFER: String, BLOB: String, DOCUMENT: String, JSON: String, STREAM: String, TEXT: String): responseType = {
      val __obj = js.Dynamic.literal(ARRAY_BUFFER = ARRAY_BUFFER.asInstanceOf[js.Any], BLOB = BLOB.asInstanceOf[js.Any], DOCUMENT = DOCUMENT.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], STREAM = STREAM.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any])
      __obj.asInstanceOf[responseType]
    }
    
    @scala.inline
    implicit class responseTypeMutableBuilder[Self <: responseType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setARRAY_BUFFER(value: String): Self = StObject.set(x, "ARRAY_BUFFER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBLOB(value: String): Self = StObject.set(x, "BLOB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDOCUMENT(value: String): Self = StObject.set(x, "DOCUMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSON(value: String): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTREAM(value: String): Self = StObject.set(x, "STREAM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTEXT(value: String): Self = StObject.set(x, "TEXT", value.asInstanceOf[js.Any])
    }
  }
  
  trait sort extends StObject {
    
    var ASC: String
    
    var ASC_VALUE: String
    
    var DESC: String
    
    var DESC_VALUE: String
  }
  object sort {
    
    @scala.inline
    def apply(ASC: String, ASC_VALUE: String, DESC: String, DESC_VALUE: String): sort = {
      val __obj = js.Dynamic.literal(ASC = ASC.asInstanceOf[js.Any], ASC_VALUE = ASC_VALUE.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any], DESC_VALUE = DESC_VALUE.asInstanceOf[js.Any])
      __obj.asInstanceOf[sort]
    }
    
    @scala.inline
    implicit class sortMutableBuilder[Self <: sort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setASC(value: String): Self = StObject.set(x, "ASC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setASC_VALUE(value: String): Self = StObject.set(x, "ASC_VALUE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDESC(value: String): Self = StObject.set(x, "DESC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDESC_VALUE(value: String): Self = StObject.set(x, "DESC_VALUE", value.asInstanceOf[js.Any])
    }
  }
}

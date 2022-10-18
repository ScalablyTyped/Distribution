package typings.agilite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUtilsInterfaceMod {
  
  trait AxiosInterface extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var headers: Any
    
    var method: String
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object AxiosInterface {
    
    inline def apply(headers: Any, method: String, url: String): AxiosInterface = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxiosInterface]
    }
    
    extension [Self <: AxiosInterface](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnumsInterface extends StObject {
    
    var HEADER_API_KEY: String
    
    var HEADER_APPLICATION_JSON: String
    
    var HEADER_BPM_RECORD_ID: String
    
    var HEADER_BPM_RECORD_IDS: String
    
    var HEADER_BYTE_END_RANGE: String
    
    var HEADER_BYTE_START_RANGE: String
    
    var HEADER_CATEGORY: String
    
    var HEADER_CODE: String
    
    var HEADER_COMMENTS: String
    
    var HEADER_CONDITIONAL_LEVELS: String
    
    var HEADER_CONTENT_TYPE: String
    
    var HEADER_CURRENT_RESPONSIBLE_USER: String
    
    var HEADER_CURRENT_STEP: String
    
    var HEADER_CURRENT_USER: String
    
    var HEADER_DATE_TIME_VALUE: String
    
    var HEADER_END_DATE: String
    
    var HEADER_EVENT_END_DATE: String
    
    var HEADER_EVENT_STAMPS: String
    
    var HEADER_EVENT_START_DATE: String
    
    var HEADER_FIELDS_TO_RETURN: String
    
    var HEADER_FILE_ID: String
    
    var HEADER_FILE_NAME: String
    
    var HEADER_FORMAT_KEY: String
    
    var HEADER_FULL_NAME: String
    
    var HEADER_GROUP_NAME: String
    
    var HEADER_INCLUDE_CREDENTIALS: String
    
    var HEADER_INCLUDE_DATA: String
    
    var HEADER_INCLUDE_HISTORY: String
    
    var HEADER_INCLUDE_KEYWORDS: String
    
    var HEADER_INCLUDE_META_DATA: String
    
    var HEADER_INCLUDE_MODULES: String
    
    var HEADER_INCLUDE_STEP_OPTIONS: String
    
    var HEADER_INCLUDE_TIER_ENTRIES: String
    
    var HEADER_INCLUDE_VALUES: String
    
    var HEADER_INCLUDE_VISIBLE_OBJECTS: String
    
    var HEADER_ISO_LANGUAGE: String
    
    var HEADER_IS_PUBLIC: String
    
    var HEADER_LABEL: String
    
    var HEADER_LABEL_KEY: String
    
    var HEADER_LOG_PROFILE_KEY: String
    
    var HEADER_MESSAGE: String
    
    var HEADER_NEW_RESPONSIBLE_USER: String
    
    var HEADER_OCTET_STREAM: String
    
    var HEADER_OPTION_SELECTED: String
    
    var HEADER_OUTPUT_FORMAT: String
    
    var HEADER_PAGE: String
    
    var HEADER_PAGE_LIMIT: String
    
    var HEADER_PERSIST_FILE: String
    
    var HEADER_PROCESS_KEY: String
    
    var HEADER_PROCESS_KEYS: String
    
    var HEADER_PROFILE_KEY: String
    
    var HEADER_PROFILE_KEYS: String
    
    var HEADER_PUBLISH: String
    
    var HEADER_QRY_OPTIONS: String
    
    var HEADER_RECORD_ID: String
    
    var HEADER_RECORD_IDS: String
    
    var HEADER_RELEVANT_ROLES: String
    
    var HEADER_RELEVANT_USERS: String
    
    var HEADER_RESET_SERVICE: String
    
    var HEADER_RESPONSIBLE_USER: String
    
    var HEADER_RESPONSIBLE_USERS: String
    
    var HEADER_ROLE_NAME: String
    
    var HEADER_ROLE_NAMES: String
    
    var HEADER_ROUTE_KEY: String
    
    var HEADER_SLIM_RESULT: String
    
    var HEADER_SORT: String
    
    var HEADER_SORT_BY: String
    
    var HEADER_SORT_VALUES: String
    
    var HEADER_START_DATE: String
    
    var HEADER_STEP_NAMES: String
    
    var HEADER_SUB_CATEGORY: String
    
    var HEADER_TEAM_NAME: String
    
    var HEADER_TEXT_PLAIN: String
    
    var HEADER_TIER_KEYS: String
    
    var HEADER_VALUE: String
    
    var HEADER_VALUES_OUTPUT_FORMAT: String
    
    var HEADER_VALUE_KEY: String
    
    var METHOD_DELETE: String
    
    var METHOD_GET: String
    
    var METHOD_POST: String
    
    var METHOD_PUT: String
    
    var MODULE_KEY_ADMIN: String
    
    var MODULE_KEY_ADMIN_SOLUTIONS: String
    
    var MODULE_KEY_API_KEYS: String
    
    var MODULE_KEY_BATCH_ACTIONS: String
    
    var MODULE_KEY_BATCH_LOGGING: String
    
    var MODULE_KEY_BOT_BUILDER: String
    
    var MODULE_KEY_BPM: String
    
    var MODULE_KEY_CONNECTORS: String
    
    var MODULE_KEY_DATA_MAPPING: String
    
    var MODULE_KEY_EVENTS: String
    
    var MODULE_KEY_FILES: String
    
    var MODULE_KEY_GET_FILE_INFO: String
    
    var MODULE_KEY_KEYWORDS: String
    
    var MODULE_KEY_NODE_RED: String
    
    var MODULE_KEY_NUMBERING: String
    
    var MODULE_KEY_REPORTS: String
    
    var MODULE_KEY_ROLES: String
    
    var MODULE_KEY_TEMPLATES: String
    
    var MODULE_KEY_TIER_STRUCTURES: String
    
    var MODULE_KEY_UTILS: String
    
    var SEPARATOR_COMMA: String
    
    var STRING_CREATE_LOG_ENTRY: String
    
    var STRING_DATA: String
    
    var STRING_DISABLE: String
    
    var STRING_EMPTY: String
    
    var STRING_ENABLE: String
    
    var STRING_EXECUTE: String
    
    var STRING_GENERATE: String
    
    var STRING_GET_BY_PROFILE_KEY: String
    
    var STRING_GET_LOGS: String
    
    var STRING_RESET: String
    
    var STRING_RESET_CONNECTION_POOL: String
    
    var STRING_RESET_LOGS: String
    
    var STRING_SUBSCRIBE: String
    
    var URL_API_SERVER: String
    
    var VALUE_ARRAY_LOWER: String
    
    var VALUE_ARRAY_PROPER: String
    
    var VALUE_BOOLEAN_LOWER: String
    
    var VALUE_JSON_LOWER: String
    
    var VALUE_NUMBER_LOWER: String
    
    var VALUE_OBJECT_PROPER: String
    
    var VALUE_STRING_LOWER: String
  }
  object EnumsInterface {
    
    inline def apply(
      HEADER_API_KEY: String,
      HEADER_APPLICATION_JSON: String,
      HEADER_BPM_RECORD_ID: String,
      HEADER_BPM_RECORD_IDS: String,
      HEADER_BYTE_END_RANGE: String,
      HEADER_BYTE_START_RANGE: String,
      HEADER_CATEGORY: String,
      HEADER_CODE: String,
      HEADER_COMMENTS: String,
      HEADER_CONDITIONAL_LEVELS: String,
      HEADER_CONTENT_TYPE: String,
      HEADER_CURRENT_RESPONSIBLE_USER: String,
      HEADER_CURRENT_STEP: String,
      HEADER_CURRENT_USER: String,
      HEADER_DATE_TIME_VALUE: String,
      HEADER_END_DATE: String,
      HEADER_EVENT_END_DATE: String,
      HEADER_EVENT_STAMPS: String,
      HEADER_EVENT_START_DATE: String,
      HEADER_FIELDS_TO_RETURN: String,
      HEADER_FILE_ID: String,
      HEADER_FILE_NAME: String,
      HEADER_FORMAT_KEY: String,
      HEADER_FULL_NAME: String,
      HEADER_GROUP_NAME: String,
      HEADER_INCLUDE_CREDENTIALS: String,
      HEADER_INCLUDE_DATA: String,
      HEADER_INCLUDE_HISTORY: String,
      HEADER_INCLUDE_KEYWORDS: String,
      HEADER_INCLUDE_META_DATA: String,
      HEADER_INCLUDE_MODULES: String,
      HEADER_INCLUDE_STEP_OPTIONS: String,
      HEADER_INCLUDE_TIER_ENTRIES: String,
      HEADER_INCLUDE_VALUES: String,
      HEADER_INCLUDE_VISIBLE_OBJECTS: String,
      HEADER_ISO_LANGUAGE: String,
      HEADER_IS_PUBLIC: String,
      HEADER_LABEL: String,
      HEADER_LABEL_KEY: String,
      HEADER_LOG_PROFILE_KEY: String,
      HEADER_MESSAGE: String,
      HEADER_NEW_RESPONSIBLE_USER: String,
      HEADER_OCTET_STREAM: String,
      HEADER_OPTION_SELECTED: String,
      HEADER_OUTPUT_FORMAT: String,
      HEADER_PAGE: String,
      HEADER_PAGE_LIMIT: String,
      HEADER_PERSIST_FILE: String,
      HEADER_PROCESS_KEY: String,
      HEADER_PROCESS_KEYS: String,
      HEADER_PROFILE_KEY: String,
      HEADER_PROFILE_KEYS: String,
      HEADER_PUBLISH: String,
      HEADER_QRY_OPTIONS: String,
      HEADER_RECORD_ID: String,
      HEADER_RECORD_IDS: String,
      HEADER_RELEVANT_ROLES: String,
      HEADER_RELEVANT_USERS: String,
      HEADER_RESET_SERVICE: String,
      HEADER_RESPONSIBLE_USER: String,
      HEADER_RESPONSIBLE_USERS: String,
      HEADER_ROLE_NAME: String,
      HEADER_ROLE_NAMES: String,
      HEADER_ROUTE_KEY: String,
      HEADER_SLIM_RESULT: String,
      HEADER_SORT: String,
      HEADER_SORT_BY: String,
      HEADER_SORT_VALUES: String,
      HEADER_START_DATE: String,
      HEADER_STEP_NAMES: String,
      HEADER_SUB_CATEGORY: String,
      HEADER_TEAM_NAME: String,
      HEADER_TEXT_PLAIN: String,
      HEADER_TIER_KEYS: String,
      HEADER_VALUE: String,
      HEADER_VALUES_OUTPUT_FORMAT: String,
      HEADER_VALUE_KEY: String,
      METHOD_DELETE: String,
      METHOD_GET: String,
      METHOD_POST: String,
      METHOD_PUT: String,
      MODULE_KEY_ADMIN: String,
      MODULE_KEY_ADMIN_SOLUTIONS: String,
      MODULE_KEY_API_KEYS: String,
      MODULE_KEY_BATCH_ACTIONS: String,
      MODULE_KEY_BATCH_LOGGING: String,
      MODULE_KEY_BOT_BUILDER: String,
      MODULE_KEY_BPM: String,
      MODULE_KEY_CONNECTORS: String,
      MODULE_KEY_DATA_MAPPING: String,
      MODULE_KEY_EVENTS: String,
      MODULE_KEY_FILES: String,
      MODULE_KEY_GET_FILE_INFO: String,
      MODULE_KEY_KEYWORDS: String,
      MODULE_KEY_NODE_RED: String,
      MODULE_KEY_NUMBERING: String,
      MODULE_KEY_REPORTS: String,
      MODULE_KEY_ROLES: String,
      MODULE_KEY_TEMPLATES: String,
      MODULE_KEY_TIER_STRUCTURES: String,
      MODULE_KEY_UTILS: String,
      SEPARATOR_COMMA: String,
      STRING_CREATE_LOG_ENTRY: String,
      STRING_DATA: String,
      STRING_DISABLE: String,
      STRING_EMPTY: String,
      STRING_ENABLE: String,
      STRING_EXECUTE: String,
      STRING_GENERATE: String,
      STRING_GET_BY_PROFILE_KEY: String,
      STRING_GET_LOGS: String,
      STRING_RESET: String,
      STRING_RESET_CONNECTION_POOL: String,
      STRING_RESET_LOGS: String,
      STRING_SUBSCRIBE: String,
      URL_API_SERVER: String,
      VALUE_ARRAY_LOWER: String,
      VALUE_ARRAY_PROPER: String,
      VALUE_BOOLEAN_LOWER: String,
      VALUE_JSON_LOWER: String,
      VALUE_NUMBER_LOWER: String,
      VALUE_OBJECT_PROPER: String,
      VALUE_STRING_LOWER: String
    ): EnumsInterface = {
      val __obj = js.Dynamic.literal(HEADER_API_KEY = HEADER_API_KEY.asInstanceOf[js.Any], HEADER_APPLICATION_JSON = HEADER_APPLICATION_JSON.asInstanceOf[js.Any], HEADER_BPM_RECORD_ID = HEADER_BPM_RECORD_ID.asInstanceOf[js.Any], HEADER_BPM_RECORD_IDS = HEADER_BPM_RECORD_IDS.asInstanceOf[js.Any], HEADER_BYTE_END_RANGE = HEADER_BYTE_END_RANGE.asInstanceOf[js.Any], HEADER_BYTE_START_RANGE = HEADER_BYTE_START_RANGE.asInstanceOf[js.Any], HEADER_CATEGORY = HEADER_CATEGORY.asInstanceOf[js.Any], HEADER_CODE = HEADER_CODE.asInstanceOf[js.Any], HEADER_COMMENTS = HEADER_COMMENTS.asInstanceOf[js.Any], HEADER_CONDITIONAL_LEVELS = HEADER_CONDITIONAL_LEVELS.asInstanceOf[js.Any], HEADER_CONTENT_TYPE = HEADER_CONTENT_TYPE.asInstanceOf[js.Any], HEADER_CURRENT_RESPONSIBLE_USER = HEADER_CURRENT_RESPONSIBLE_USER.asInstanceOf[js.Any], HEADER_CURRENT_STEP = HEADER_CURRENT_STEP.asInstanceOf[js.Any], HEADER_CURRENT_USER = HEADER_CURRENT_USER.asInstanceOf[js.Any], HEADER_DATE_TIME_VALUE = HEADER_DATE_TIME_VALUE.asInstanceOf[js.Any], HEADER_END_DATE = HEADER_END_DATE.asInstanceOf[js.Any], HEADER_EVENT_END_DATE = HEADER_EVENT_END_DATE.asInstanceOf[js.Any], HEADER_EVENT_STAMPS = HEADER_EVENT_STAMPS.asInstanceOf[js.Any], HEADER_EVENT_START_DATE = HEADER_EVENT_START_DATE.asInstanceOf[js.Any], HEADER_FIELDS_TO_RETURN = HEADER_FIELDS_TO_RETURN.asInstanceOf[js.Any], HEADER_FILE_ID = HEADER_FILE_ID.asInstanceOf[js.Any], HEADER_FILE_NAME = HEADER_FILE_NAME.asInstanceOf[js.Any], HEADER_FORMAT_KEY = HEADER_FORMAT_KEY.asInstanceOf[js.Any], HEADER_FULL_NAME = HEADER_FULL_NAME.asInstanceOf[js.Any], HEADER_GROUP_NAME = HEADER_GROUP_NAME.asInstanceOf[js.Any], HEADER_INCLUDE_CREDENTIALS = HEADER_INCLUDE_CREDENTIALS.asInstanceOf[js.Any], HEADER_INCLUDE_DATA = HEADER_INCLUDE_DATA.asInstanceOf[js.Any], HEADER_INCLUDE_HISTORY = HEADER_INCLUDE_HISTORY.asInstanceOf[js.Any], HEADER_INCLUDE_KEYWORDS = HEADER_INCLUDE_KEYWORDS.asInstanceOf[js.Any], HEADER_INCLUDE_META_DATA = HEADER_INCLUDE_META_DATA.asInstanceOf[js.Any], HEADER_INCLUDE_MODULES = HEADER_INCLUDE_MODULES.asInstanceOf[js.Any], HEADER_INCLUDE_STEP_OPTIONS = HEADER_INCLUDE_STEP_OPTIONS.asInstanceOf[js.Any], HEADER_INCLUDE_TIER_ENTRIES = HEADER_INCLUDE_TIER_ENTRIES.asInstanceOf[js.Any], HEADER_INCLUDE_VALUES = HEADER_INCLUDE_VALUES.asInstanceOf[js.Any], HEADER_INCLUDE_VISIBLE_OBJECTS = HEADER_INCLUDE_VISIBLE_OBJECTS.asInstanceOf[js.Any], HEADER_ISO_LANGUAGE = HEADER_ISO_LANGUAGE.asInstanceOf[js.Any], HEADER_IS_PUBLIC = HEADER_IS_PUBLIC.asInstanceOf[js.Any], HEADER_LABEL = HEADER_LABEL.asInstanceOf[js.Any], HEADER_LABEL_KEY = HEADER_LABEL_KEY.asInstanceOf[js.Any], HEADER_LOG_PROFILE_KEY = HEADER_LOG_PROFILE_KEY.asInstanceOf[js.Any], HEADER_MESSAGE = HEADER_MESSAGE.asInstanceOf[js.Any], HEADER_NEW_RESPONSIBLE_USER = HEADER_NEW_RESPONSIBLE_USER.asInstanceOf[js.Any], HEADER_OCTET_STREAM = HEADER_OCTET_STREAM.asInstanceOf[js.Any], HEADER_OPTION_SELECTED = HEADER_OPTION_SELECTED.asInstanceOf[js.Any], HEADER_OUTPUT_FORMAT = HEADER_OUTPUT_FORMAT.asInstanceOf[js.Any], HEADER_PAGE = HEADER_PAGE.asInstanceOf[js.Any], HEADER_PAGE_LIMIT = HEADER_PAGE_LIMIT.asInstanceOf[js.Any], HEADER_PERSIST_FILE = HEADER_PERSIST_FILE.asInstanceOf[js.Any], HEADER_PROCESS_KEY = HEADER_PROCESS_KEY.asInstanceOf[js.Any], HEADER_PROCESS_KEYS = HEADER_PROCESS_KEYS.asInstanceOf[js.Any], HEADER_PROFILE_KEY = HEADER_PROFILE_KEY.asInstanceOf[js.Any], HEADER_PROFILE_KEYS = HEADER_PROFILE_KEYS.asInstanceOf[js.Any], HEADER_PUBLISH = HEADER_PUBLISH.asInstanceOf[js.Any], HEADER_QRY_OPTIONS = HEADER_QRY_OPTIONS.asInstanceOf[js.Any], HEADER_RECORD_ID = HEADER_RECORD_ID.asInstanceOf[js.Any], HEADER_RECORD_IDS = HEADER_RECORD_IDS.asInstanceOf[js.Any], HEADER_RELEVANT_ROLES = HEADER_RELEVANT_ROLES.asInstanceOf[js.Any], HEADER_RELEVANT_USERS = HEADER_RELEVANT_USERS.asInstanceOf[js.Any], HEADER_RESET_SERVICE = HEADER_RESET_SERVICE.asInstanceOf[js.Any], HEADER_RESPONSIBLE_USER = HEADER_RESPONSIBLE_USER.asInstanceOf[js.Any], HEADER_RESPONSIBLE_USERS = HEADER_RESPONSIBLE_USERS.asInstanceOf[js.Any], HEADER_ROLE_NAME = HEADER_ROLE_NAME.asInstanceOf[js.Any], HEADER_ROLE_NAMES = HEADER_ROLE_NAMES.asInstanceOf[js.Any], HEADER_ROUTE_KEY = HEADER_ROUTE_KEY.asInstanceOf[js.Any], HEADER_SLIM_RESULT = HEADER_SLIM_RESULT.asInstanceOf[js.Any], HEADER_SORT = HEADER_SORT.asInstanceOf[js.Any], HEADER_SORT_BY = HEADER_SORT_BY.asInstanceOf[js.Any], HEADER_SORT_VALUES = HEADER_SORT_VALUES.asInstanceOf[js.Any], HEADER_START_DATE = HEADER_START_DATE.asInstanceOf[js.Any], HEADER_STEP_NAMES = HEADER_STEP_NAMES.asInstanceOf[js.Any], HEADER_SUB_CATEGORY = HEADER_SUB_CATEGORY.asInstanceOf[js.Any], HEADER_TEAM_NAME = HEADER_TEAM_NAME.asInstanceOf[js.Any], HEADER_TEXT_PLAIN = HEADER_TEXT_PLAIN.asInstanceOf[js.Any], HEADER_TIER_KEYS = HEADER_TIER_KEYS.asInstanceOf[js.Any], HEADER_VALUE = HEADER_VALUE.asInstanceOf[js.Any], HEADER_VALUES_OUTPUT_FORMAT = HEADER_VALUES_OUTPUT_FORMAT.asInstanceOf[js.Any], HEADER_VALUE_KEY = HEADER_VALUE_KEY.asInstanceOf[js.Any], METHOD_DELETE = METHOD_DELETE.asInstanceOf[js.Any], METHOD_GET = METHOD_GET.asInstanceOf[js.Any], METHOD_POST = METHOD_POST.asInstanceOf[js.Any], METHOD_PUT = METHOD_PUT.asInstanceOf[js.Any], MODULE_KEY_ADMIN = MODULE_KEY_ADMIN.asInstanceOf[js.Any], MODULE_KEY_ADMIN_SOLUTIONS = MODULE_KEY_ADMIN_SOLUTIONS.asInstanceOf[js.Any], MODULE_KEY_API_KEYS = MODULE_KEY_API_KEYS.asInstanceOf[js.Any], MODULE_KEY_BATCH_ACTIONS = MODULE_KEY_BATCH_ACTIONS.asInstanceOf[js.Any], MODULE_KEY_BATCH_LOGGING = MODULE_KEY_BATCH_LOGGING.asInstanceOf[js.Any], MODULE_KEY_BOT_BUILDER = MODULE_KEY_BOT_BUILDER.asInstanceOf[js.Any], MODULE_KEY_BPM = MODULE_KEY_BPM.asInstanceOf[js.Any], MODULE_KEY_CONNECTORS = MODULE_KEY_CONNECTORS.asInstanceOf[js.Any], MODULE_KEY_DATA_MAPPING = MODULE_KEY_DATA_MAPPING.asInstanceOf[js.Any], MODULE_KEY_EVENTS = MODULE_KEY_EVENTS.asInstanceOf[js.Any], MODULE_KEY_FILES = MODULE_KEY_FILES.asInstanceOf[js.Any], MODULE_KEY_GET_FILE_INFO = MODULE_KEY_GET_FILE_INFO.asInstanceOf[js.Any], MODULE_KEY_KEYWORDS = MODULE_KEY_KEYWORDS.asInstanceOf[js.Any], MODULE_KEY_NODE_RED = MODULE_KEY_NODE_RED.asInstanceOf[js.Any], MODULE_KEY_NUMBERING = MODULE_KEY_NUMBERING.asInstanceOf[js.Any], MODULE_KEY_REPORTS = MODULE_KEY_REPORTS.asInstanceOf[js.Any], MODULE_KEY_ROLES = MODULE_KEY_ROLES.asInstanceOf[js.Any], MODULE_KEY_TEMPLATES = MODULE_KEY_TEMPLATES.asInstanceOf[js.Any], MODULE_KEY_TIER_STRUCTURES = MODULE_KEY_TIER_STRUCTURES.asInstanceOf[js.Any], MODULE_KEY_UTILS = MODULE_KEY_UTILS.asInstanceOf[js.Any], SEPARATOR_COMMA = SEPARATOR_COMMA.asInstanceOf[js.Any], STRING_CREATE_LOG_ENTRY = STRING_CREATE_LOG_ENTRY.asInstanceOf[js.Any], STRING_DATA = STRING_DATA.asInstanceOf[js.Any], STRING_DISABLE = STRING_DISABLE.asInstanceOf[js.Any], STRING_EMPTY = STRING_EMPTY.asInstanceOf[js.Any], STRING_ENABLE = STRING_ENABLE.asInstanceOf[js.Any], STRING_EXECUTE = STRING_EXECUTE.asInstanceOf[js.Any], STRING_GENERATE = STRING_GENERATE.asInstanceOf[js.Any], STRING_GET_BY_PROFILE_KEY = STRING_GET_BY_PROFILE_KEY.asInstanceOf[js.Any], STRING_GET_LOGS = STRING_GET_LOGS.asInstanceOf[js.Any], STRING_RESET = STRING_RESET.asInstanceOf[js.Any], STRING_RESET_CONNECTION_POOL = STRING_RESET_CONNECTION_POOL.asInstanceOf[js.Any], STRING_RESET_LOGS = STRING_RESET_LOGS.asInstanceOf[js.Any], STRING_SUBSCRIBE = STRING_SUBSCRIBE.asInstanceOf[js.Any], URL_API_SERVER = URL_API_SERVER.asInstanceOf[js.Any], VALUE_ARRAY_LOWER = VALUE_ARRAY_LOWER.asInstanceOf[js.Any], VALUE_ARRAY_PROPER = VALUE_ARRAY_PROPER.asInstanceOf[js.Any], VALUE_BOOLEAN_LOWER = VALUE_BOOLEAN_LOWER.asInstanceOf[js.Any], VALUE_JSON_LOWER = VALUE_JSON_LOWER.asInstanceOf[js.Any], VALUE_NUMBER_LOWER = VALUE_NUMBER_LOWER.asInstanceOf[js.Any], VALUE_OBJECT_PROPER = VALUE_OBJECT_PROPER.asInstanceOf[js.Any], VALUE_STRING_LOWER = VALUE_STRING_LOWER.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumsInterface]
    }
    
    extension [Self <: EnumsInterface](x: Self) {
      
      inline def setHEADER_API_KEY(value: String): Self = StObject.set(x, "HEADER_API_KEY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_APPLICATION_JSON(value: String): Self = StObject.set(x, "HEADER_APPLICATION_JSON", value.asInstanceOf[js.Any])
      
      inline def setHEADER_BPM_RECORD_ID(value: String): Self = StObject.set(x, "HEADER_BPM_RECORD_ID", value.asInstanceOf[js.Any])
      
      inline def setHEADER_BPM_RECORD_IDS(value: String): Self = StObject.set(x, "HEADER_BPM_RECORD_IDS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_BYTE_END_RANGE(value: String): Self = StObject.set(x, "HEADER_BYTE_END_RANGE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_BYTE_START_RANGE(value: String): Self = StObject.set(x, "HEADER_BYTE_START_RANGE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_CATEGORY(value: String): Self = StObject.set(x, "HEADER_CATEGORY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_CODE(value: String): Self = StObject.set(x, "HEADER_CODE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_COMMENTS(value: String): Self = StObject.set(x, "HEADER_COMMENTS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_CONDITIONAL_LEVELS(value: String): Self = StObject.set(x, "HEADER_CONDITIONAL_LEVELS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_CONTENT_TYPE(value: String): Self = StObject.set(x, "HEADER_CONTENT_TYPE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_CURRENT_RESPONSIBLE_USER(value: String): Self = StObject.set(x, "HEADER_CURRENT_RESPONSIBLE_USER", value.asInstanceOf[js.Any])
      
      inline def setHEADER_CURRENT_STEP(value: String): Self = StObject.set(x, "HEADER_CURRENT_STEP", value.asInstanceOf[js.Any])
      
      inline def setHEADER_CURRENT_USER(value: String): Self = StObject.set(x, "HEADER_CURRENT_USER", value.asInstanceOf[js.Any])
      
      inline def setHEADER_DATE_TIME_VALUE(value: String): Self = StObject.set(x, "HEADER_DATE_TIME_VALUE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_END_DATE(value: String): Self = StObject.set(x, "HEADER_END_DATE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_EVENT_END_DATE(value: String): Self = StObject.set(x, "HEADER_EVENT_END_DATE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_EVENT_STAMPS(value: String): Self = StObject.set(x, "HEADER_EVENT_STAMPS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_EVENT_START_DATE(value: String): Self = StObject.set(x, "HEADER_EVENT_START_DATE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_FIELDS_TO_RETURN(value: String): Self = StObject.set(x, "HEADER_FIELDS_TO_RETURN", value.asInstanceOf[js.Any])
      
      inline def setHEADER_FILE_ID(value: String): Self = StObject.set(x, "HEADER_FILE_ID", value.asInstanceOf[js.Any])
      
      inline def setHEADER_FILE_NAME(value: String): Self = StObject.set(x, "HEADER_FILE_NAME", value.asInstanceOf[js.Any])
      
      inline def setHEADER_FORMAT_KEY(value: String): Self = StObject.set(x, "HEADER_FORMAT_KEY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_FULL_NAME(value: String): Self = StObject.set(x, "HEADER_FULL_NAME", value.asInstanceOf[js.Any])
      
      inline def setHEADER_GROUP_NAME(value: String): Self = StObject.set(x, "HEADER_GROUP_NAME", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_CREDENTIALS(value: String): Self = StObject.set(x, "HEADER_INCLUDE_CREDENTIALS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_DATA(value: String): Self = StObject.set(x, "HEADER_INCLUDE_DATA", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_HISTORY(value: String): Self = StObject.set(x, "HEADER_INCLUDE_HISTORY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_KEYWORDS(value: String): Self = StObject.set(x, "HEADER_INCLUDE_KEYWORDS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_META_DATA(value: String): Self = StObject.set(x, "HEADER_INCLUDE_META_DATA", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_MODULES(value: String): Self = StObject.set(x, "HEADER_INCLUDE_MODULES", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_STEP_OPTIONS(value: String): Self = StObject.set(x, "HEADER_INCLUDE_STEP_OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_TIER_ENTRIES(value: String): Self = StObject.set(x, "HEADER_INCLUDE_TIER_ENTRIES", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_VALUES(value: String): Self = StObject.set(x, "HEADER_INCLUDE_VALUES", value.asInstanceOf[js.Any])
      
      inline def setHEADER_INCLUDE_VISIBLE_OBJECTS(value: String): Self = StObject.set(x, "HEADER_INCLUDE_VISIBLE_OBJECTS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_ISO_LANGUAGE(value: String): Self = StObject.set(x, "HEADER_ISO_LANGUAGE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_IS_PUBLIC(value: String): Self = StObject.set(x, "HEADER_IS_PUBLIC", value.asInstanceOf[js.Any])
      
      inline def setHEADER_LABEL(value: String): Self = StObject.set(x, "HEADER_LABEL", value.asInstanceOf[js.Any])
      
      inline def setHEADER_LABEL_KEY(value: String): Self = StObject.set(x, "HEADER_LABEL_KEY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_LOG_PROFILE_KEY(value: String): Self = StObject.set(x, "HEADER_LOG_PROFILE_KEY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_MESSAGE(value: String): Self = StObject.set(x, "HEADER_MESSAGE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_NEW_RESPONSIBLE_USER(value: String): Self = StObject.set(x, "HEADER_NEW_RESPONSIBLE_USER", value.asInstanceOf[js.Any])
      
      inline def setHEADER_OCTET_STREAM(value: String): Self = StObject.set(x, "HEADER_OCTET_STREAM", value.asInstanceOf[js.Any])
      
      inline def setHEADER_OPTION_SELECTED(value: String): Self = StObject.set(x, "HEADER_OPTION_SELECTED", value.asInstanceOf[js.Any])
      
      inline def setHEADER_OUTPUT_FORMAT(value: String): Self = StObject.set(x, "HEADER_OUTPUT_FORMAT", value.asInstanceOf[js.Any])
      
      inline def setHEADER_PAGE(value: String): Self = StObject.set(x, "HEADER_PAGE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_PAGE_LIMIT(value: String): Self = StObject.set(x, "HEADER_PAGE_LIMIT", value.asInstanceOf[js.Any])
      
      inline def setHEADER_PERSIST_FILE(value: String): Self = StObject.set(x, "HEADER_PERSIST_FILE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_PROCESS_KEY(value: String): Self = StObject.set(x, "HEADER_PROCESS_KEY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_PROCESS_KEYS(value: String): Self = StObject.set(x, "HEADER_PROCESS_KEYS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_PROFILE_KEY(value: String): Self = StObject.set(x, "HEADER_PROFILE_KEY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_PROFILE_KEYS(value: String): Self = StObject.set(x, "HEADER_PROFILE_KEYS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_PUBLISH(value: String): Self = StObject.set(x, "HEADER_PUBLISH", value.asInstanceOf[js.Any])
      
      inline def setHEADER_QRY_OPTIONS(value: String): Self = StObject.set(x, "HEADER_QRY_OPTIONS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_RECORD_ID(value: String): Self = StObject.set(x, "HEADER_RECORD_ID", value.asInstanceOf[js.Any])
      
      inline def setHEADER_RECORD_IDS(value: String): Self = StObject.set(x, "HEADER_RECORD_IDS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_RELEVANT_ROLES(value: String): Self = StObject.set(x, "HEADER_RELEVANT_ROLES", value.asInstanceOf[js.Any])
      
      inline def setHEADER_RELEVANT_USERS(value: String): Self = StObject.set(x, "HEADER_RELEVANT_USERS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_RESET_SERVICE(value: String): Self = StObject.set(x, "HEADER_RESET_SERVICE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_RESPONSIBLE_USER(value: String): Self = StObject.set(x, "HEADER_RESPONSIBLE_USER", value.asInstanceOf[js.Any])
      
      inline def setHEADER_RESPONSIBLE_USERS(value: String): Self = StObject.set(x, "HEADER_RESPONSIBLE_USERS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_ROLE_NAME(value: String): Self = StObject.set(x, "HEADER_ROLE_NAME", value.asInstanceOf[js.Any])
      
      inline def setHEADER_ROLE_NAMES(value: String): Self = StObject.set(x, "HEADER_ROLE_NAMES", value.asInstanceOf[js.Any])
      
      inline def setHEADER_ROUTE_KEY(value: String): Self = StObject.set(x, "HEADER_ROUTE_KEY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_SLIM_RESULT(value: String): Self = StObject.set(x, "HEADER_SLIM_RESULT", value.asInstanceOf[js.Any])
      
      inline def setHEADER_SORT(value: String): Self = StObject.set(x, "HEADER_SORT", value.asInstanceOf[js.Any])
      
      inline def setHEADER_SORT_BY(value: String): Self = StObject.set(x, "HEADER_SORT_BY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_SORT_VALUES(value: String): Self = StObject.set(x, "HEADER_SORT_VALUES", value.asInstanceOf[js.Any])
      
      inline def setHEADER_START_DATE(value: String): Self = StObject.set(x, "HEADER_START_DATE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_STEP_NAMES(value: String): Self = StObject.set(x, "HEADER_STEP_NAMES", value.asInstanceOf[js.Any])
      
      inline def setHEADER_SUB_CATEGORY(value: String): Self = StObject.set(x, "HEADER_SUB_CATEGORY", value.asInstanceOf[js.Any])
      
      inline def setHEADER_TEAM_NAME(value: String): Self = StObject.set(x, "HEADER_TEAM_NAME", value.asInstanceOf[js.Any])
      
      inline def setHEADER_TEXT_PLAIN(value: String): Self = StObject.set(x, "HEADER_TEXT_PLAIN", value.asInstanceOf[js.Any])
      
      inline def setHEADER_TIER_KEYS(value: String): Self = StObject.set(x, "HEADER_TIER_KEYS", value.asInstanceOf[js.Any])
      
      inline def setHEADER_VALUE(value: String): Self = StObject.set(x, "HEADER_VALUE", value.asInstanceOf[js.Any])
      
      inline def setHEADER_VALUES_OUTPUT_FORMAT(value: String): Self = StObject.set(x, "HEADER_VALUES_OUTPUT_FORMAT", value.asInstanceOf[js.Any])
      
      inline def setHEADER_VALUE_KEY(value: String): Self = StObject.set(x, "HEADER_VALUE_KEY", value.asInstanceOf[js.Any])
      
      inline def setMETHOD_DELETE(value: String): Self = StObject.set(x, "METHOD_DELETE", value.asInstanceOf[js.Any])
      
      inline def setMETHOD_GET(value: String): Self = StObject.set(x, "METHOD_GET", value.asInstanceOf[js.Any])
      
      inline def setMETHOD_POST(value: String): Self = StObject.set(x, "METHOD_POST", value.asInstanceOf[js.Any])
      
      inline def setMETHOD_PUT(value: String): Self = StObject.set(x, "METHOD_PUT", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_ADMIN(value: String): Self = StObject.set(x, "MODULE_KEY_ADMIN", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_ADMIN_SOLUTIONS(value: String): Self = StObject.set(x, "MODULE_KEY_ADMIN_SOLUTIONS", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_API_KEYS(value: String): Self = StObject.set(x, "MODULE_KEY_API_KEYS", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_BATCH_ACTIONS(value: String): Self = StObject.set(x, "MODULE_KEY_BATCH_ACTIONS", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_BATCH_LOGGING(value: String): Self = StObject.set(x, "MODULE_KEY_BATCH_LOGGING", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_BOT_BUILDER(value: String): Self = StObject.set(x, "MODULE_KEY_BOT_BUILDER", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_BPM(value: String): Self = StObject.set(x, "MODULE_KEY_BPM", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_CONNECTORS(value: String): Self = StObject.set(x, "MODULE_KEY_CONNECTORS", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_DATA_MAPPING(value: String): Self = StObject.set(x, "MODULE_KEY_DATA_MAPPING", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_EVENTS(value: String): Self = StObject.set(x, "MODULE_KEY_EVENTS", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_FILES(value: String): Self = StObject.set(x, "MODULE_KEY_FILES", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_GET_FILE_INFO(value: String): Self = StObject.set(x, "MODULE_KEY_GET_FILE_INFO", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_KEYWORDS(value: String): Self = StObject.set(x, "MODULE_KEY_KEYWORDS", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_NODE_RED(value: String): Self = StObject.set(x, "MODULE_KEY_NODE_RED", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_NUMBERING(value: String): Self = StObject.set(x, "MODULE_KEY_NUMBERING", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_REPORTS(value: String): Self = StObject.set(x, "MODULE_KEY_REPORTS", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_ROLES(value: String): Self = StObject.set(x, "MODULE_KEY_ROLES", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_TEMPLATES(value: String): Self = StObject.set(x, "MODULE_KEY_TEMPLATES", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_TIER_STRUCTURES(value: String): Self = StObject.set(x, "MODULE_KEY_TIER_STRUCTURES", value.asInstanceOf[js.Any])
      
      inline def setMODULE_KEY_UTILS(value: String): Self = StObject.set(x, "MODULE_KEY_UTILS", value.asInstanceOf[js.Any])
      
      inline def setSEPARATOR_COMMA(value: String): Self = StObject.set(x, "SEPARATOR_COMMA", value.asInstanceOf[js.Any])
      
      inline def setSTRING_CREATE_LOG_ENTRY(value: String): Self = StObject.set(x, "STRING_CREATE_LOG_ENTRY", value.asInstanceOf[js.Any])
      
      inline def setSTRING_DATA(value: String): Self = StObject.set(x, "STRING_DATA", value.asInstanceOf[js.Any])
      
      inline def setSTRING_DISABLE(value: String): Self = StObject.set(x, "STRING_DISABLE", value.asInstanceOf[js.Any])
      
      inline def setSTRING_EMPTY(value: String): Self = StObject.set(x, "STRING_EMPTY", value.asInstanceOf[js.Any])
      
      inline def setSTRING_ENABLE(value: String): Self = StObject.set(x, "STRING_ENABLE", value.asInstanceOf[js.Any])
      
      inline def setSTRING_EXECUTE(value: String): Self = StObject.set(x, "STRING_EXECUTE", value.asInstanceOf[js.Any])
      
      inline def setSTRING_GENERATE(value: String): Self = StObject.set(x, "STRING_GENERATE", value.asInstanceOf[js.Any])
      
      inline def setSTRING_GET_BY_PROFILE_KEY(value: String): Self = StObject.set(x, "STRING_GET_BY_PROFILE_KEY", value.asInstanceOf[js.Any])
      
      inline def setSTRING_GET_LOGS(value: String): Self = StObject.set(x, "STRING_GET_LOGS", value.asInstanceOf[js.Any])
      
      inline def setSTRING_RESET(value: String): Self = StObject.set(x, "STRING_RESET", value.asInstanceOf[js.Any])
      
      inline def setSTRING_RESET_CONNECTION_POOL(value: String): Self = StObject.set(x, "STRING_RESET_CONNECTION_POOL", value.asInstanceOf[js.Any])
      
      inline def setSTRING_RESET_LOGS(value: String): Self = StObject.set(x, "STRING_RESET_LOGS", value.asInstanceOf[js.Any])
      
      inline def setSTRING_SUBSCRIBE(value: String): Self = StObject.set(x, "STRING_SUBSCRIBE", value.asInstanceOf[js.Any])
      
      inline def setURL_API_SERVER(value: String): Self = StObject.set(x, "URL_API_SERVER", value.asInstanceOf[js.Any])
      
      inline def setVALUE_ARRAY_LOWER(value: String): Self = StObject.set(x, "VALUE_ARRAY_LOWER", value.asInstanceOf[js.Any])
      
      inline def setVALUE_ARRAY_PROPER(value: String): Self = StObject.set(x, "VALUE_ARRAY_PROPER", value.asInstanceOf[js.Any])
      
      inline def setVALUE_BOOLEAN_LOWER(value: String): Self = StObject.set(x, "VALUE_BOOLEAN_LOWER", value.asInstanceOf[js.Any])
      
      inline def setVALUE_JSON_LOWER(value: String): Self = StObject.set(x, "VALUE_JSON_LOWER", value.asInstanceOf[js.Any])
      
      inline def setVALUE_NUMBER_LOWER(value: String): Self = StObject.set(x, "VALUE_NUMBER_LOWER", value.asInstanceOf[js.Any])
      
      inline def setVALUE_OBJECT_PROPER(value: String): Self = StObject.set(x, "VALUE_OBJECT_PROPER", value.asInstanceOf[js.Any])
      
      inline def setVALUE_STRING_LOWER(value: String): Self = StObject.set(x, "VALUE_STRING_LOWER", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnumsTypeDetectInterface extends StObject {
    
    var ARGS: String
    
    var ARRAY: String
    
    var ARRAY_BUFFER: String
    
    var BOOLEAN: String
    
    var DATA_VIEW: String
    
    var DATE: String
    
    var FLOAT32ARRAY: String
    
    var FLOAT64ARRAY: String
    
    var FUNCTION: String
    
    var INT16ARRAY: String
    
    var INT32ARRAY: String
    
    var INT8ARRAY: String
    
    var MAP: String
    
    var NULL: String
    
    var NUMBER: String
    
    var OBJECT: String
    
    var PROMISE: String
    
    var REGEX: String
    
    var SET: String
    
    var STRING: String
    
    var SYMBOL: String
    
    var UINT16ARRAY: String
    
    var UINT32ARRAY: String
    
    var UINT8ARRAY: String
    
    var UINT8CLAMPEDARRAY: String
    
    var UNDEFINED: String
    
    var WEAK_MAP: String
    
    var WEAK_SET: String
  }
  object EnumsTypeDetectInterface {
    
    inline def apply(
      ARGS: String,
      ARRAY: String,
      ARRAY_BUFFER: String,
      BOOLEAN: String,
      DATA_VIEW: String,
      DATE: String,
      FLOAT32ARRAY: String,
      FLOAT64ARRAY: String,
      FUNCTION: String,
      INT16ARRAY: String,
      INT32ARRAY: String,
      INT8ARRAY: String,
      MAP: String,
      NULL: String,
      NUMBER: String,
      OBJECT: String,
      PROMISE: String,
      REGEX: String,
      SET: String,
      STRING: String,
      SYMBOL: String,
      UINT16ARRAY: String,
      UINT32ARRAY: String,
      UINT8ARRAY: String,
      UINT8CLAMPEDARRAY: String,
      UNDEFINED: String,
      WEAK_MAP: String,
      WEAK_SET: String
    ): EnumsTypeDetectInterface = {
      val __obj = js.Dynamic.literal(ARGS = ARGS.asInstanceOf[js.Any], ARRAY = ARRAY.asInstanceOf[js.Any], ARRAY_BUFFER = ARRAY_BUFFER.asInstanceOf[js.Any], BOOLEAN = BOOLEAN.asInstanceOf[js.Any], DATA_VIEW = DATA_VIEW.asInstanceOf[js.Any], DATE = DATE.asInstanceOf[js.Any], FLOAT32ARRAY = FLOAT32ARRAY.asInstanceOf[js.Any], FLOAT64ARRAY = FLOAT64ARRAY.asInstanceOf[js.Any], FUNCTION = FUNCTION.asInstanceOf[js.Any], INT16ARRAY = INT16ARRAY.asInstanceOf[js.Any], INT32ARRAY = INT32ARRAY.asInstanceOf[js.Any], INT8ARRAY = INT8ARRAY.asInstanceOf[js.Any], MAP = MAP.asInstanceOf[js.Any], NULL = NULL.asInstanceOf[js.Any], NUMBER = NUMBER.asInstanceOf[js.Any], OBJECT = OBJECT.asInstanceOf[js.Any], PROMISE = PROMISE.asInstanceOf[js.Any], REGEX = REGEX.asInstanceOf[js.Any], SET = SET.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any], SYMBOL = SYMBOL.asInstanceOf[js.Any], UINT16ARRAY = UINT16ARRAY.asInstanceOf[js.Any], UINT32ARRAY = UINT32ARRAY.asInstanceOf[js.Any], UINT8ARRAY = UINT8ARRAY.asInstanceOf[js.Any], UINT8CLAMPEDARRAY = UINT8CLAMPEDARRAY.asInstanceOf[js.Any], UNDEFINED = UNDEFINED.asInstanceOf[js.Any], WEAK_MAP = WEAK_MAP.asInstanceOf[js.Any], WEAK_SET = WEAK_SET.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnumsTypeDetectInterface]
    }
    
    extension [Self <: EnumsTypeDetectInterface](x: Self) {
      
      inline def setARGS(value: String): Self = StObject.set(x, "ARGS", value.asInstanceOf[js.Any])
      
      inline def setARRAY(value: String): Self = StObject.set(x, "ARRAY", value.asInstanceOf[js.Any])
      
      inline def setARRAY_BUFFER(value: String): Self = StObject.set(x, "ARRAY_BUFFER", value.asInstanceOf[js.Any])
      
      inline def setBOOLEAN(value: String): Self = StObject.set(x, "BOOLEAN", value.asInstanceOf[js.Any])
      
      inline def setDATA_VIEW(value: String): Self = StObject.set(x, "DATA_VIEW", value.asInstanceOf[js.Any])
      
      inline def setDATE(value: String): Self = StObject.set(x, "DATE", value.asInstanceOf[js.Any])
      
      inline def setFLOAT32ARRAY(value: String): Self = StObject.set(x, "FLOAT32ARRAY", value.asInstanceOf[js.Any])
      
      inline def setFLOAT64ARRAY(value: String): Self = StObject.set(x, "FLOAT64ARRAY", value.asInstanceOf[js.Any])
      
      inline def setFUNCTION(value: String): Self = StObject.set(x, "FUNCTION", value.asInstanceOf[js.Any])
      
      inline def setINT16ARRAY(value: String): Self = StObject.set(x, "INT16ARRAY", value.asInstanceOf[js.Any])
      
      inline def setINT32ARRAY(value: String): Self = StObject.set(x, "INT32ARRAY", value.asInstanceOf[js.Any])
      
      inline def setINT8ARRAY(value: String): Self = StObject.set(x, "INT8ARRAY", value.asInstanceOf[js.Any])
      
      inline def setMAP(value: String): Self = StObject.set(x, "MAP", value.asInstanceOf[js.Any])
      
      inline def setNULL(value: String): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
      
      inline def setNUMBER(value: String): Self = StObject.set(x, "NUMBER", value.asInstanceOf[js.Any])
      
      inline def setOBJECT(value: String): Self = StObject.set(x, "OBJECT", value.asInstanceOf[js.Any])
      
      inline def setPROMISE(value: String): Self = StObject.set(x, "PROMISE", value.asInstanceOf[js.Any])
      
      inline def setREGEX(value: String): Self = StObject.set(x, "REGEX", value.asInstanceOf[js.Any])
      
      inline def setSET(value: String): Self = StObject.set(x, "SET", value.asInstanceOf[js.Any])
      
      inline def setSTRING(value: String): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
      
      inline def setSYMBOL(value: String): Self = StObject.set(x, "SYMBOL", value.asInstanceOf[js.Any])
      
      inline def setUINT16ARRAY(value: String): Self = StObject.set(x, "UINT16ARRAY", value.asInstanceOf[js.Any])
      
      inline def setUINT32ARRAY(value: String): Self = StObject.set(x, "UINT32ARRAY", value.asInstanceOf[js.Any])
      
      inline def setUINT8ARRAY(value: String): Self = StObject.set(x, "UINT8ARRAY", value.asInstanceOf[js.Any])
      
      inline def setUINT8CLAMPEDARRAY(value: String): Self = StObject.set(x, "UINT8CLAMPEDARRAY", value.asInstanceOf[js.Any])
      
      inline def setUNDEFINED(value: String): Self = StObject.set(x, "UNDEFINED", value.asInstanceOf[js.Any])
      
      inline def setWEAK_MAP(value: String): Self = StObject.set(x, "WEAK_MAP", value.asInstanceOf[js.Any])
      
      inline def setWEAK_SET(value: String): Self = StObject.set(x, "WEAK_SET", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutputFormatInterface extends StObject {
    
    var JSON: String
    
    var STRING: String
  }
  object OutputFormatInterface {
    
    inline def apply(JSON: String, STRING: String): OutputFormatInterface = {
      val __obj = js.Dynamic.literal(JSON = JSON.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputFormatInterface]
    }
    
    extension [Self <: OutputFormatInterface](x: Self) {
      
      inline def setJSON(value: String): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setSTRING(value: String): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
    }
  }
}

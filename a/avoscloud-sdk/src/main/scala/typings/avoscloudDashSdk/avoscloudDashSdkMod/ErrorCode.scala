package typings.avoscloudDashSdk.avoscloudDashSdkMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSImport("avoscloud-sdk", "ErrorCode")
@js.native
object ErrorCode extends js.Object {
  @js.native
  sealed trait ACCOUNT_ALREADY_LINKED extends ErrorCode
  
  @js.native
  sealed trait AGGREGATE_ERROR extends ErrorCode
  
  @js.native
  sealed trait CACHE_MISS extends ErrorCode
  
  @js.native
  sealed trait COMMAND_UNAVAILABLE extends ErrorCode
  
  @js.native
  sealed trait CONNECTION_FAILED extends ErrorCode
  
  @js.native
  sealed trait DUPLICATE_VALUE extends ErrorCode
  
  @js.native
  sealed trait EMAIL_MISSING extends ErrorCode
  
  @js.native
  sealed trait EMAIL_NOT_FOUND extends ErrorCode
  
  @js.native
  sealed trait EMAIL_TAKEN extends ErrorCode
  
  @js.native
  sealed trait EXCEEDED_QUOTA extends ErrorCode
  
  @js.native
  sealed trait FILE_DELETE_ERROR extends ErrorCode
  
  @js.native
  sealed trait FILE_READ_ERROR extends ErrorCode
  
  @js.native
  sealed trait FILE_SAVE_ERROR extends ErrorCode
  
  @js.native
  sealed trait FILE_TOO_LARGE extends ErrorCode
  
  @js.native
  sealed trait INCORRECT_TYPE extends ErrorCode
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR extends ErrorCode
  
  @js.native
  sealed trait INVALID_ACL extends ErrorCode
  
  @js.native
  sealed trait INVALID_CHANNEL_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_CLASS_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_CONTENT_LENGTH extends ErrorCode
  
  @js.native
  sealed trait INVALID_EMAIL_ADDRESS extends ErrorCode
  
  @js.native
  sealed trait INVALID_EVENT_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_FILE_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_IMAGE_DATA extends ErrorCode
  
  @js.native
  sealed trait INVALID_JSON extends ErrorCode
  
  @js.native
  sealed trait INVALID_KEY_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_LINKED_SESSION extends ErrorCode
  
  @js.native
  sealed trait INVALID_NESTED_KEY extends ErrorCode
  
  @js.native
  sealed trait INVALID_POINTER extends ErrorCode
  
  @js.native
  sealed trait INVALID_PUSH_TIME_ERROR extends ErrorCode
  
  @js.native
  sealed trait INVALID_QUERY extends ErrorCode
  
  @js.native
  sealed trait INVALID_ROLE_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_SESSION_TOKEN extends ErrorCode
  
  @js.native
  sealed trait LINKED_ID_MISSING extends ErrorCode
  
  @js.native
  sealed trait MISSING_CONTENT_LENGTH extends ErrorCode
  
  @js.native
  sealed trait MISSING_CONTENT_TYPE extends ErrorCode
  
  @js.native
  sealed trait MISSING_OBJECT_ID extends ErrorCode
  
  @js.native
  sealed trait MUST_CREATE_USER_THROUGH_SIGNUP extends ErrorCode
  
  @js.native
  sealed trait NOT_INITIALIZED extends ErrorCode
  
  @js.native
  sealed trait OBJECT_NOT_FOUND extends ErrorCode
  
  @js.native
  sealed trait OBJECT_TOO_LARGE extends ErrorCode
  
  @js.native
  sealed trait OPERATION_FORBIDDEN extends ErrorCode
  
  @js.native
  sealed trait OTHER_CAUSE extends ErrorCode
  
  @js.native
  sealed trait PASSWORD_MISSING extends ErrorCode
  
  @js.native
  sealed trait PUSH_MISCONFIGURED extends ErrorCode
  
  @js.native
  sealed trait REQUEST_LIMIT_EXCEEDED extends ErrorCode
  
  @js.native
  sealed trait SCRIPT_FAILED extends ErrorCode
  
  @js.native
  sealed trait SESSION_MISSING extends ErrorCode
  
  @js.native
  sealed trait TIMEOUT extends ErrorCode
  
  @js.native
  sealed trait UNSAVED_FILE_ERROR extends ErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_SERVICE extends ErrorCode
  
  @js.native
  sealed trait USERNAME_MISSING extends ErrorCode
  
  @js.native
  sealed trait USERNAME_TAKEN extends ErrorCode
  
  @js.native
  sealed trait VALIDATION_ERROR extends ErrorCode
  
  @js.native
  sealed trait X_DOMAIN_REQUEST extends ErrorCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
  /* 208 */ @js.native
  object ACCOUNT_ALREADY_LINKED extends TopLevel[ACCOUNT_ALREADY_LINKED with Double]
  
  /* 600 */ @js.native
  object AGGREGATE_ERROR extends TopLevel[AGGREGATE_ERROR with Double]
  
  /* 120 */ @js.native
  object CACHE_MISS extends TopLevel[CACHE_MISS with Double]
  
  /* 108 */ @js.native
  object COMMAND_UNAVAILABLE extends TopLevel[COMMAND_UNAVAILABLE with Double]
  
  /* 100 */ @js.native
  object CONNECTION_FAILED extends TopLevel[CONNECTION_FAILED with Double]
  
  /* 137 */ @js.native
  object DUPLICATE_VALUE extends TopLevel[DUPLICATE_VALUE with Double]
  
  /* 204 */ @js.native
  object EMAIL_MISSING extends TopLevel[EMAIL_MISSING with Double]
  
  /* 205 */ @js.native
  object EMAIL_NOT_FOUND extends TopLevel[EMAIL_NOT_FOUND with Double]
  
  /* 203 */ @js.native
  object EMAIL_TAKEN extends TopLevel[EMAIL_TAKEN with Double]
  
  /* 140 */ @js.native
  object EXCEEDED_QUOTA extends TopLevel[EXCEEDED_QUOTA with Double]
  
  /* 153 */ @js.native
  object FILE_DELETE_ERROR extends TopLevel[FILE_DELETE_ERROR with Double]
  
  /* 601 */ @js.native
  object FILE_READ_ERROR extends TopLevel[FILE_READ_ERROR with Double]
  
  /* 130 */ @js.native
  object FILE_SAVE_ERROR extends TopLevel[FILE_SAVE_ERROR with Double]
  
  /* 129 */ @js.native
  object FILE_TOO_LARGE extends TopLevel[FILE_TOO_LARGE with Double]
  
  /* 111 */ @js.native
  object INCORRECT_TYPE extends TopLevel[INCORRECT_TYPE with Double]
  
  /* 1 */ @js.native
  object INTERNAL_SERVER_ERROR extends TopLevel[INTERNAL_SERVER_ERROR with Double]
  
  /* 123 */ @js.native
  object INVALID_ACL extends TopLevel[INVALID_ACL with Double]
  
  /* 112 */ @js.native
  object INVALID_CHANNEL_NAME extends TopLevel[INVALID_CHANNEL_NAME with Double]
  
  /* 103 */ @js.native
  object INVALID_CLASS_NAME extends TopLevel[INVALID_CLASS_NAME with Double]
  
  /* 128 */ @js.native
  object INVALID_CONTENT_LENGTH extends TopLevel[INVALID_CONTENT_LENGTH with Double]
  
  /* 125 */ @js.native
  object INVALID_EMAIL_ADDRESS extends TopLevel[INVALID_EMAIL_ADDRESS with Double]
  
  /* 160 */ @js.native
  object INVALID_EVENT_NAME extends TopLevel[INVALID_EVENT_NAME with Double]
  
  /* 122 */ @js.native
  object INVALID_FILE_NAME extends TopLevel[INVALID_FILE_NAME with Double]
  
  /* 150 */ @js.native
  object INVALID_IMAGE_DATA extends TopLevel[INVALID_IMAGE_DATA with Double]
  
  /* 107 */ @js.native
  object INVALID_JSON extends TopLevel[INVALID_JSON with Double]
  
  /* 105 */ @js.native
  object INVALID_KEY_NAME extends TopLevel[INVALID_KEY_NAME with Double]
  
  /* 251 */ @js.native
  object INVALID_LINKED_SESSION extends TopLevel[INVALID_LINKED_SESSION with Double]
  
  /* 121 */ @js.native
  object INVALID_NESTED_KEY extends TopLevel[INVALID_NESTED_KEY with Double]
  
  /* 106 */ @js.native
  object INVALID_POINTER extends TopLevel[INVALID_POINTER with Double]
  
  /* 152 */ @js.native
  object INVALID_PUSH_TIME_ERROR extends TopLevel[INVALID_PUSH_TIME_ERROR with Double]
  
  /* 102 */ @js.native
  object INVALID_QUERY extends TopLevel[INVALID_QUERY with Double]
  
  /* 139 */ @js.native
  object INVALID_ROLE_NAME extends TopLevel[INVALID_ROLE_NAME with Double]
  
  /* 209 */ @js.native
  object INVALID_SESSION_TOKEN extends TopLevel[INVALID_SESSION_TOKEN with Double]
  
  /* 250 */ @js.native
  object LINKED_ID_MISSING extends TopLevel[LINKED_ID_MISSING with Double]
  
  /* 127 */ @js.native
  object MISSING_CONTENT_LENGTH extends TopLevel[MISSING_CONTENT_LENGTH with Double]
  
  /* 126 */ @js.native
  object MISSING_CONTENT_TYPE extends TopLevel[MISSING_CONTENT_TYPE with Double]
  
  /* 104 */ @js.native
  object MISSING_OBJECT_ID extends TopLevel[MISSING_OBJECT_ID with Double]
  
  /* 207 */ @js.native
  object MUST_CREATE_USER_THROUGH_SIGNUP extends TopLevel[MUST_CREATE_USER_THROUGH_SIGNUP with Double]
  
  /* 109 */ @js.native
  object NOT_INITIALIZED extends TopLevel[NOT_INITIALIZED with Double]
  
  /* 101 */ @js.native
  object OBJECT_NOT_FOUND extends TopLevel[OBJECT_NOT_FOUND with Double]
  
  /* 116 */ @js.native
  object OBJECT_TOO_LARGE extends TopLevel[OBJECT_TOO_LARGE with Double]
  
  /* 119 */ @js.native
  object OPERATION_FORBIDDEN extends TopLevel[OPERATION_FORBIDDEN with Double]
  
  /* -1 */ @js.native
  object OTHER_CAUSE extends TopLevel[OTHER_CAUSE with Double]
  
  /* 201 */ @js.native
  object PASSWORD_MISSING extends TopLevel[PASSWORD_MISSING with Double]
  
  /* 115 */ @js.native
  object PUSH_MISCONFIGURED extends TopLevel[PUSH_MISCONFIGURED with Double]
  
  /* 155 */ @js.native
  object REQUEST_LIMIT_EXCEEDED extends TopLevel[REQUEST_LIMIT_EXCEEDED with Double]
  
  /* 141 */ @js.native
  object SCRIPT_FAILED extends TopLevel[SCRIPT_FAILED with Double]
  
  /* 206 */ @js.native
  object SESSION_MISSING extends TopLevel[SESSION_MISSING with Double]
  
  /* 124 */ @js.native
  object TIMEOUT extends TopLevel[TIMEOUT with Double]
  
  /* 151 */ @js.native
  object UNSAVED_FILE_ERROR extends TopLevel[UNSAVED_FILE_ERROR with Double]
  
  /* 252 */ @js.native
  object UNSUPPORTED_SERVICE extends TopLevel[UNSUPPORTED_SERVICE with Double]
  
  /* 200 */ @js.native
  object USERNAME_MISSING extends TopLevel[USERNAME_MISSING with Double]
  
  /* 202 */ @js.native
  object USERNAME_TAKEN extends TopLevel[USERNAME_TAKEN with Double]
  
  /* 142 */ @js.native
  object VALIDATION_ERROR extends TopLevel[VALIDATION_ERROR with Double]
  
  /* 602 */ @js.native
  object X_DOMAIN_REQUEST extends TopLevel[X_DOMAIN_REQUEST with Double]
  
}


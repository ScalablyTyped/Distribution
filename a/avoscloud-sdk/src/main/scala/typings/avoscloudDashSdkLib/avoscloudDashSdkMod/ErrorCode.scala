package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSImport("avoscloud-sdk", "ErrorCode")
@js.native
object ErrorCode extends js.Object {
  @js.native
  sealed trait ACCOUNT_ALREADY_LINKED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait AGGREGATE_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait CACHE_MISS
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait COMMAND_UNAVAILABLE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait CONNECTION_FAILED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait DUPLICATE_VALUE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait EMAIL_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait EMAIL_NOT_FOUND
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait EMAIL_TAKEN
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait EXCEEDED_QUOTA
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait FILE_DELETE_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait FILE_READ_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait FILE_SAVE_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait FILE_TOO_LARGE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INCORRECT_TYPE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_ACL
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_CHANNEL_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_CLASS_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_CONTENT_LENGTH
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_EMAIL_ADDRESS
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_EVENT_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_FILE_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_IMAGE_DATA
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_JSON
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_KEY_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_LINKED_SESSION
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_NESTED_KEY
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_POINTER
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_PUSH_TIME_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_QUERY
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_ROLE_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait INVALID_SESSION_TOKEN
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait LINKED_ID_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait MISSING_CONTENT_LENGTH
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait MISSING_CONTENT_TYPE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait MISSING_OBJECT_ID
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait MUST_CREATE_USER_THROUGH_SIGNUP
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait NOT_INITIALIZED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait OBJECT_NOT_FOUND
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait OBJECT_TOO_LARGE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait OPERATION_FORBIDDEN
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait OTHER_CAUSE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait PASSWORD_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait PUSH_MISCONFIGURED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait REQUEST_LIMIT_EXCEEDED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait SCRIPT_FAILED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait SESSION_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait TIMEOUT
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait UNSAVED_FILE_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_SERVICE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait USERNAME_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait USERNAME_TAKEN
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait VALIDATION_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  @js.native
  sealed trait X_DOMAIN_REQUEST
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode
  
  /* 208 */ val ACCOUNT_ALREADY_LINKED: ACCOUNT_ALREADY_LINKED with scala.Double = js.native
  /* 600 */ val AGGREGATE_ERROR: AGGREGATE_ERROR with scala.Double = js.native
  /* 120 */ val CACHE_MISS: CACHE_MISS with scala.Double = js.native
  /* 108 */ val COMMAND_UNAVAILABLE: COMMAND_UNAVAILABLE with scala.Double = js.native
  /* 100 */ val CONNECTION_FAILED: CONNECTION_FAILED with scala.Double = js.native
  /* 137 */ val DUPLICATE_VALUE: DUPLICATE_VALUE with scala.Double = js.native
  /* 204 */ val EMAIL_MISSING: EMAIL_MISSING with scala.Double = js.native
  /* 205 */ val EMAIL_NOT_FOUND: EMAIL_NOT_FOUND with scala.Double = js.native
  /* 203 */ val EMAIL_TAKEN: EMAIL_TAKEN with scala.Double = js.native
  /* 140 */ val EXCEEDED_QUOTA: EXCEEDED_QUOTA with scala.Double = js.native
  /* 153 */ val FILE_DELETE_ERROR: FILE_DELETE_ERROR with scala.Double = js.native
  /* 601 */ val FILE_READ_ERROR: FILE_READ_ERROR with scala.Double = js.native
  /* 130 */ val FILE_SAVE_ERROR: FILE_SAVE_ERROR with scala.Double = js.native
  /* 129 */ val FILE_TOO_LARGE: FILE_TOO_LARGE with scala.Double = js.native
  /* 111 */ val INCORRECT_TYPE: INCORRECT_TYPE with scala.Double = js.native
  /* 1 */ val INTERNAL_SERVER_ERROR: INTERNAL_SERVER_ERROR with scala.Double = js.native
  /* 123 */ val INVALID_ACL: INVALID_ACL with scala.Double = js.native
  /* 112 */ val INVALID_CHANNEL_NAME: INVALID_CHANNEL_NAME with scala.Double = js.native
  /* 103 */ val INVALID_CLASS_NAME: INVALID_CLASS_NAME with scala.Double = js.native
  /* 128 */ val INVALID_CONTENT_LENGTH: INVALID_CONTENT_LENGTH with scala.Double = js.native
  /* 125 */ val INVALID_EMAIL_ADDRESS: INVALID_EMAIL_ADDRESS with scala.Double = js.native
  /* 160 */ val INVALID_EVENT_NAME: INVALID_EVENT_NAME with scala.Double = js.native
  /* 122 */ val INVALID_FILE_NAME: INVALID_FILE_NAME with scala.Double = js.native
  /* 150 */ val INVALID_IMAGE_DATA: INVALID_IMAGE_DATA with scala.Double = js.native
  /* 107 */ val INVALID_JSON: INVALID_JSON with scala.Double = js.native
  /* 105 */ val INVALID_KEY_NAME: INVALID_KEY_NAME with scala.Double = js.native
  /* 251 */ val INVALID_LINKED_SESSION: INVALID_LINKED_SESSION with scala.Double = js.native
  /* 121 */ val INVALID_NESTED_KEY: INVALID_NESTED_KEY with scala.Double = js.native
  /* 106 */ val INVALID_POINTER: INVALID_POINTER with scala.Double = js.native
  /* 152 */ val INVALID_PUSH_TIME_ERROR: INVALID_PUSH_TIME_ERROR with scala.Double = js.native
  /* 102 */ val INVALID_QUERY: INVALID_QUERY with scala.Double = js.native
  /* 139 */ val INVALID_ROLE_NAME: INVALID_ROLE_NAME with scala.Double = js.native
  /* 209 */ val INVALID_SESSION_TOKEN: INVALID_SESSION_TOKEN with scala.Double = js.native
  /* 250 */ val LINKED_ID_MISSING: LINKED_ID_MISSING with scala.Double = js.native
  /* 127 */ val MISSING_CONTENT_LENGTH: MISSING_CONTENT_LENGTH with scala.Double = js.native
  /* 126 */ val MISSING_CONTENT_TYPE: MISSING_CONTENT_TYPE with scala.Double = js.native
  /* 104 */ val MISSING_OBJECT_ID: MISSING_OBJECT_ID with scala.Double = js.native
  /* 207 */ val MUST_CREATE_USER_THROUGH_SIGNUP: MUST_CREATE_USER_THROUGH_SIGNUP with scala.Double = js.native
  /* 109 */ val NOT_INITIALIZED: NOT_INITIALIZED with scala.Double = js.native
  /* 101 */ val OBJECT_NOT_FOUND: OBJECT_NOT_FOUND with scala.Double = js.native
  /* 116 */ val OBJECT_TOO_LARGE: OBJECT_TOO_LARGE with scala.Double = js.native
  /* 119 */ val OPERATION_FORBIDDEN: OPERATION_FORBIDDEN with scala.Double = js.native
  /* -1 */ val OTHER_CAUSE: OTHER_CAUSE with scala.Double = js.native
  /* 201 */ val PASSWORD_MISSING: PASSWORD_MISSING with scala.Double = js.native
  /* 115 */ val PUSH_MISCONFIGURED: PUSH_MISCONFIGURED with scala.Double = js.native
  /* 155 */ val REQUEST_LIMIT_EXCEEDED: REQUEST_LIMIT_EXCEEDED with scala.Double = js.native
  /* 141 */ val SCRIPT_FAILED: SCRIPT_FAILED with scala.Double = js.native
  /* 206 */ val SESSION_MISSING: SESSION_MISSING with scala.Double = js.native
  /* 124 */ val TIMEOUT: TIMEOUT with scala.Double = js.native
  /* 151 */ val UNSAVED_FILE_ERROR: UNSAVED_FILE_ERROR with scala.Double = js.native
  /* 252 */ val UNSUPPORTED_SERVICE: UNSUPPORTED_SERVICE with scala.Double = js.native
  /* 200 */ val USERNAME_MISSING: USERNAME_MISSING with scala.Double = js.native
  /* 202 */ val USERNAME_TAKEN: USERNAME_TAKEN with scala.Double = js.native
  /* 142 */ val VALIDATION_ERROR: VALIDATION_ERROR with scala.Double = js.native
  /* 602 */ val X_DOMAIN_REQUEST: X_DOMAIN_REQUEST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[avoscloudDashSdkLib.avoscloudDashSdkMod.ErrorCode with scala.Double] = js.native
}


package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSImport("avoscloud-sdk/AV", "ErrorCode")
@js.native
object ErrorCode extends js.Object {
  @js.native
  sealed trait ACCOUNT_ALREADY_LINKED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait AGGREGATE_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait CACHE_MISS
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait COMMAND_UNAVAILABLE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait CONNECTION_FAILED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait DUPLICATE_VALUE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait EMAIL_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait EMAIL_NOT_FOUND
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait EMAIL_TAKEN
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait EXCEEDED_QUOTA
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait FILE_DELETE_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait FILE_READ_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait FILE_SAVE_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait FILE_TOO_LARGE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INCORRECT_TYPE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_ACL
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_CHANNEL_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_CLASS_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_CONTENT_LENGTH
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_EMAIL_ADDRESS
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_EVENT_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_FILE_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_IMAGE_DATA
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_JSON
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_KEY_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_LINKED_SESSION
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_NESTED_KEY
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_POINTER
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_PUSH_TIME_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_QUERY
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_ROLE_NAME
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait INVALID_SESSION_TOKEN
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait LINKED_ID_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait MISSING_CONTENT_LENGTH
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait MISSING_CONTENT_TYPE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait MISSING_OBJECT_ID
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait MUST_CREATE_USER_THROUGH_SIGNUP
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait NOT_INITIALIZED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait OBJECT_NOT_FOUND
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait OBJECT_TOO_LARGE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait OPERATION_FORBIDDEN
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait OTHER_CAUSE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait PASSWORD_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait PUSH_MISCONFIGURED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait REQUEST_LIMIT_EXCEEDED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait SCRIPT_FAILED
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait SESSION_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait TIMEOUT
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait UNSAVED_FILE_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_SERVICE
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait USERNAME_MISSING
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait USERNAME_TAKEN
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait VALIDATION_ERROR
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
  @js.native
  sealed trait X_DOMAIN_REQUEST
    extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ErrorCode
  
}


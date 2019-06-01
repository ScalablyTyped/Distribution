package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CTIExceptions extends js.Object

@JSGlobal("connect.CTIExceptions")
@js.native
object CTIExceptions extends js.Object {
  @js.native
  sealed trait ACCESS_DENIED_EXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  @js.native
  sealed trait BAD_ENDPOINT_EXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  @js.native
  sealed trait INVALID_AGENT_ARNEXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  @js.native
  sealed trait INVALID_CONFIGURATION_EXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  @js.native
  sealed trait INVALID_CONTACT_TYPE_EXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  @js.native
  sealed trait INVALID_STATE_EXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  @js.native
  sealed trait PAGINATION_EXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  @js.native
  sealed trait REFRESH_TOKEN_EXPIRED_EXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  @js.native
  sealed trait SEND_DATA_FAILED_EXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  @js.native
  sealed trait UNAUTHORIZED_EXCEPTION
    extends amazonDashConnectDashStreamsLib.connectNs.CTIExceptions
  
  /* "AccessDeniedException" */ val ACCESS_DENIED_EXCEPTION: ACCESS_DENIED_EXCEPTION with java.lang.String = js.native
  /* "BadEndpointException" */ val BAD_ENDPOINT_EXCEPTION: BAD_ENDPOINT_EXCEPTION with java.lang.String = js.native
  /* "InvalidAgentARNException" */ val INVALID_AGENT_ARNEXCEPTION: INVALID_AGENT_ARNEXCEPTION with java.lang.String = js.native
  /* "InvalidConfigurationException" */ val INVALID_CONFIGURATION_EXCEPTION: INVALID_CONFIGURATION_EXCEPTION with java.lang.String = js.native
  /* "InvalidContactTypeException" */ val INVALID_CONTACT_TYPE_EXCEPTION: INVALID_CONTACT_TYPE_EXCEPTION with java.lang.String = js.native
  /* "InvalidStateException" */ val INVALID_STATE_EXCEPTION: INVALID_STATE_EXCEPTION with java.lang.String = js.native
  /* "PaginationException" */ val PAGINATION_EXCEPTION: PAGINATION_EXCEPTION with java.lang.String = js.native
  /* "RefreshTokenExpiredException" */ val REFRESH_TOKEN_EXPIRED_EXCEPTION: REFRESH_TOKEN_EXPIRED_EXCEPTION with java.lang.String = js.native
  /* "SendDataFailedException" */ val SEND_DATA_FAILED_EXCEPTION: SEND_DATA_FAILED_EXCEPTION with java.lang.String = js.native
  /* "UnauthorizedException" */ val UNAUTHORIZED_EXCEPTION: UNAUTHORIZED_EXCEPTION with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[amazonDashConnectDashStreamsLib.connectNs.CTIExceptions with java.lang.String] = js.native
}


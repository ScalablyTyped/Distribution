package typings.amazonDashConnectDashStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CTIExceptions extends js.Object

@JSGlobal("connect.CTIExceptions")
@js.native
object CTIExceptions extends js.Object {
  @js.native
  sealed trait ACCESS_DENIED_EXCEPTION extends CTIExceptions
  
  @js.native
  sealed trait BAD_ENDPOINT_EXCEPTION extends CTIExceptions
  
  @js.native
  sealed trait INVALID_AGENT_ARNEXCEPTION extends CTIExceptions
  
  @js.native
  sealed trait INVALID_CONFIGURATION_EXCEPTION extends CTIExceptions
  
  @js.native
  sealed trait INVALID_CONTACT_TYPE_EXCEPTION extends CTIExceptions
  
  @js.native
  sealed trait INVALID_STATE_EXCEPTION extends CTIExceptions
  
  @js.native
  sealed trait PAGINATION_EXCEPTION extends CTIExceptions
  
  @js.native
  sealed trait REFRESH_TOKEN_EXPIRED_EXCEPTION extends CTIExceptions
  
  @js.native
  sealed trait SEND_DATA_FAILED_EXCEPTION extends CTIExceptions
  
  @js.native
  sealed trait UNAUTHORIZED_EXCEPTION extends CTIExceptions
  
  /* "AccessDeniedException" */ val ACCESS_DENIED_EXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.ACCESS_DENIED_EXCEPTION with String = js.native
  /* "BadEndpointException" */ val BAD_ENDPOINT_EXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.BAD_ENDPOINT_EXCEPTION with String = js.native
  /* "InvalidAgentARNException" */ val INVALID_AGENT_ARNEXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.INVALID_AGENT_ARNEXCEPTION with String = js.native
  /* "InvalidConfigurationException" */ val INVALID_CONFIGURATION_EXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.INVALID_CONFIGURATION_EXCEPTION with String = js.native
  /* "InvalidContactTypeException" */ val INVALID_CONTACT_TYPE_EXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.INVALID_CONTACT_TYPE_EXCEPTION with String = js.native
  /* "InvalidStateException" */ val INVALID_STATE_EXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.INVALID_STATE_EXCEPTION with String = js.native
  /* "PaginationException" */ val PAGINATION_EXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.PAGINATION_EXCEPTION with String = js.native
  /* "RefreshTokenExpiredException" */ val REFRESH_TOKEN_EXPIRED_EXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.REFRESH_TOKEN_EXPIRED_EXCEPTION with String = js.native
  /* "SendDataFailedException" */ val SEND_DATA_FAILED_EXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.SEND_DATA_FAILED_EXCEPTION with String = js.native
  /* "UnauthorizedException" */ val UNAUTHORIZED_EXCEPTION: typings.amazonDashConnectDashStreams.connect.CTIExceptions.UNAUTHORIZED_EXCEPTION with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CTIExceptions with String] = js.native
}


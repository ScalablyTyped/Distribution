package typings.amazonDashConnectDashStreams.connect

import org.scalablytyped.runtime.TopLevel
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.ACCESS_DENIED_EXCEPTION
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.BAD_ENDPOINT_EXCEPTION
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.INVALID_AGENT_ARNEXCEPTION
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.INVALID_CONFIGURATION_EXCEPTION
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.INVALID_CONTACT_TYPE_EXCEPTION
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.INVALID_STATE_EXCEPTION
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.PAGINATION_EXCEPTION
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.REFRESH_TOKEN_EXPIRED_EXCEPTION
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.SEND_DATA_FAILED_EXCEPTION
import typings.amazonDashConnectDashStreams.connect.CTIExceptions.UNAUTHORIZED_EXCEPTION
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CTIExceptions with String] = js.native
  /* "AccessDeniedException" */ @js.native
  object ACCESS_DENIED_EXCEPTION extends TopLevel[ACCESS_DENIED_EXCEPTION with String]
  
  /* "BadEndpointException" */ @js.native
  object BAD_ENDPOINT_EXCEPTION extends TopLevel[BAD_ENDPOINT_EXCEPTION with String]
  
  /* "InvalidAgentARNException" */ @js.native
  object INVALID_AGENT_ARNEXCEPTION extends TopLevel[INVALID_AGENT_ARNEXCEPTION with String]
  
  /* "InvalidConfigurationException" */ @js.native
  object INVALID_CONFIGURATION_EXCEPTION extends TopLevel[INVALID_CONFIGURATION_EXCEPTION with String]
  
  /* "InvalidContactTypeException" */ @js.native
  object INVALID_CONTACT_TYPE_EXCEPTION extends TopLevel[INVALID_CONTACT_TYPE_EXCEPTION with String]
  
  /* "InvalidStateException" */ @js.native
  object INVALID_STATE_EXCEPTION extends TopLevel[INVALID_STATE_EXCEPTION with String]
  
  /* "PaginationException" */ @js.native
  object PAGINATION_EXCEPTION extends TopLevel[PAGINATION_EXCEPTION with String]
  
  /* "RefreshTokenExpiredException" */ @js.native
  object REFRESH_TOKEN_EXPIRED_EXCEPTION extends TopLevel[REFRESH_TOKEN_EXPIRED_EXCEPTION with String]
  
  /* "SendDataFailedException" */ @js.native
  object SEND_DATA_FAILED_EXCEPTION extends TopLevel[SEND_DATA_FAILED_EXCEPTION with String]
  
  /* "UnauthorizedException" */ @js.native
  object UNAUTHORIZED_EXCEPTION extends TopLevel[UNAUTHORIZED_EXCEPTION with String]
  
}


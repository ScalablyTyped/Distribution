package typings.amazonConnectStreams.connect

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
  
}


package typings.awsCrt.distNativeEventstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends StObject
@JSImport("aws-crt/dist/native/eventstream", "MessageType")
@js.native
object MessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType & Double] = js.native
  
  /** Application error */
  @js.native
  sealed trait ApplicationError
    extends StObject
       with MessageType
  /* 1 */ val ApplicationError: typings.awsCrt.distNativeEventstreamMod.MessageType.ApplicationError & Double = js.native
  
  /** Application message */
  @js.native
  sealed trait ApplicationMessage
    extends StObject
       with MessageType
  /* 0 */ val ApplicationMessage: typings.awsCrt.distNativeEventstreamMod.MessageType.ApplicationMessage & Double = js.native
  
  /** Connect */
  @js.native
  sealed trait Connect
    extends StObject
       with MessageType
  /* 4 */ val Connect: typings.awsCrt.distNativeEventstreamMod.MessageType.Connect & Double = js.native
  
  /**
    * Connect acknowledgement
    *
    * If the {@link MessageFlags.ConnectionAccepted ConnectionAccepted} flag is not present, the connection has been rejected.
    */
  @js.native
  sealed trait ConnectAck
    extends StObject
       with MessageType
  /* 5 */ val ConnectAck: typings.awsCrt.distNativeEventstreamMod.MessageType.ConnectAck & Double = js.native
  
  /**
    * Internal error
    */
  @js.native
  sealed trait InternalError
    extends StObject
       with MessageType
  /* 7 */ val InternalError: typings.awsCrt.distNativeEventstreamMod.MessageType.InternalError & Double = js.native
  
  /** Ping */
  @js.native
  sealed trait Ping
    extends StObject
       with MessageType
  /* 2 */ val Ping: typings.awsCrt.distNativeEventstreamMod.MessageType.Ping & Double = js.native
  
  /** Ping response */
  @js.native
  sealed trait PingResponse
    extends StObject
       with MessageType
  /* 3 */ val PingResponse: typings.awsCrt.distNativeEventstreamMod.MessageType.PingResponse & Double = js.native
  
  /**
    * Protocol error
    */
  @js.native
  sealed trait ProtocolError
    extends StObject
       with MessageType
  /* 6 */ val ProtocolError: typings.awsCrt.distNativeEventstreamMod.MessageType.ProtocolError & Double = js.native
}

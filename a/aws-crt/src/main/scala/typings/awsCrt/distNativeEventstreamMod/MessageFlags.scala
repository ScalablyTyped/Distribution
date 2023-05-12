package typings.awsCrt.distNativeEventstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageFlags extends StObject
@JSImport("aws-crt/dist/native/eventstream", "MessageFlags")
@js.native
object MessageFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageFlags & Double] = js.native
  
  /**
    * Connection accepted
    *
    * If this flag is absent from a {@link MessageType.ConnectAck ConnectAck} message, the connection has been
    * rejected.
    */
  @js.native
  sealed trait ConnectionAccepted
    extends StObject
       with MessageFlags
  /* 1 */ val ConnectionAccepted: typings.awsCrt.distNativeEventstreamMod.MessageFlags.ConnectionAccepted & Double = js.native
  
  /** Nothing */
  @js.native
  sealed trait None
    extends StObject
       with MessageFlags
  /* 0 */ val None: typings.awsCrt.distNativeEventstreamMod.MessageFlags.None & Double = js.native
  
  /**
    * Terminate stream
    *
    * This message may be used with any message type.
    * The sender will close their connection after the message is written to the wire.
    * The receiver will close their connection after delivering the message to the user.
    */
  @js.native
  sealed trait TerminateStream
    extends StObject
       with MessageFlags
  /* 2 */ val TerminateStream: typings.awsCrt.distNativeEventstreamMod.MessageFlags.TerminateStream & Double = js.native
}

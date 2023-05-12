package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QoS extends StObject
@JSImport("aws-crt/dist/common/mqtt5_packet", "QoS")
@js.native
object QoS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QoS & Double] = js.native
  
  /**
    * A level of service that ensures that the message arrives at the receiver at least once.
    */
  @js.native
  sealed trait AtLeastOnce
    extends StObject
       with QoS
  /* 1 */ val AtLeastOnce: typings.awsCrt.distCommonMqtt5PacketMod.QoS.AtLeastOnce & Double = js.native
  
  /**
    * The message is delivered according to the capabilities of the underlying network. No response is sent by the
    * receiver and no retry is performed by the sender. The message arrives at the receiver either once or not at all.
    */
  @js.native
  sealed trait AtMostOnce
    extends StObject
       with QoS
  /* 0 */ val AtMostOnce: typings.awsCrt.distCommonMqtt5PacketMod.QoS.AtMostOnce & Double = js.native
  
  /**
    * A level of service that ensures that the message arrives at the receiver exactly once.
    */
  @js.native
  sealed trait ExactlyOnce
    extends StObject
       with QoS
  /* 2 */ val ExactlyOnce: typings.awsCrt.distCommonMqtt5PacketMod.QoS.ExactlyOnce & Double = js.native
}

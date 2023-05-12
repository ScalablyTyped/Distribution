package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RetainHandlingType extends StObject
@JSImport("aws-crt/dist/common/mqtt5_packet", "RetainHandlingType")
@js.native
object RetainHandlingType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RetainHandlingType & Double] = js.native
  
  /**
    * Subscriptions must not trigger any retained message publishes from the server.
    */
  @js.native
  sealed trait DontSend
    extends StObject
       with RetainHandlingType
  /* 2 */ val DontSend: typings.awsCrt.distCommonMqtt5PacketMod.RetainHandlingType.DontSend & Double = js.native
  
  /**
    * The server should always send all retained messages on topics that match a subscription's filter.
    */
  @js.native
  sealed trait SendOnSubscribe
    extends StObject
       with RetainHandlingType
  /* 0 */ val SendOnSubscribe: typings.awsCrt.distCommonMqtt5PacketMod.RetainHandlingType.SendOnSubscribe & Double = js.native
  
  /**
    * The server should send retained messages on topics that match the subscription's filter, but only for the
    * first matching subscription, per session.
    */
  @js.native
  sealed trait SendOnSubscribeIfNew
    extends StObject
       with RetainHandlingType
  /* 1 */ val SendOnSubscribeIfNew: typings.awsCrt.distCommonMqtt5PacketMod.RetainHandlingType.SendOnSubscribeIfNew & Double = js.native
}

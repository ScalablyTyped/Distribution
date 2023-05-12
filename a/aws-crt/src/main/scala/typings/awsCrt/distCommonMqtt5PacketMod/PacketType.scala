package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PacketType extends StObject
@JSImport("aws-crt/dist/common/mqtt5_packet", "PacketType")
@js.native
object PacketType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PacketType & Double] = js.native
  
  @js.native
  sealed trait Auth
    extends StObject
       with PacketType
  /* 15 */ val Auth: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Auth & Double = js.native
  
  @js.native
  sealed trait Connack
    extends StObject
       with PacketType
  /* 2 */ val Connack: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Connack & Double = js.native
  
  @js.native
  sealed trait Connect
    extends StObject
       with PacketType
  /* 1 */ val Connect: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Connect & Double = js.native
  
  @js.native
  sealed trait Disconnect
    extends StObject
       with PacketType
  /* 14 */ val Disconnect: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Disconnect & Double = js.native
  
  @js.native
  sealed trait Pingreq
    extends StObject
       with PacketType
  /* 12 */ val Pingreq: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pingreq & Double = js.native
  
  @js.native
  sealed trait Pingresp
    extends StObject
       with PacketType
  /* 13 */ val Pingresp: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pingresp & Double = js.native
  
  @js.native
  sealed trait Puback
    extends StObject
       with PacketType
  /* 4 */ val Puback: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Puback & Double = js.native
  
  @js.native
  sealed trait Pubcomp
    extends StObject
       with PacketType
  /* 7 */ val Pubcomp: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pubcomp & Double = js.native
  
  @js.native
  sealed trait Publish
    extends StObject
       with PacketType
  /* 3 */ val Publish: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Publish & Double = js.native
  
  @js.native
  sealed trait Pubrec
    extends StObject
       with PacketType
  /* 5 */ val Pubrec: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pubrec & Double = js.native
  
  @js.native
  sealed trait Pubrel
    extends StObject
       with PacketType
  /* 6 */ val Pubrel: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Pubrel & Double = js.native
  
  @js.native
  sealed trait Suback
    extends StObject
       with PacketType
  /* 9 */ val Suback: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Suback & Double = js.native
  
  @js.native
  sealed trait Subscribe
    extends StObject
       with PacketType
  /* 8 */ val Subscribe: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Subscribe & Double = js.native
  
  @js.native
  sealed trait Unsuback
    extends StObject
       with PacketType
  /* 11 */ val Unsuback: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Unsuback & Double = js.native
  
  @js.native
  sealed trait Unsubscribe
    extends StObject
       with PacketType
  /* 10 */ val Unsubscribe: typings.awsCrt.distCommonMqtt5PacketMod.PacketType.Unsubscribe & Double = js.native
}

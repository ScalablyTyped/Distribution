package typings.awsCrt.distCommonMqtt5PacketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPacket extends StObject {
  
  /**
    * Always set on packets coming from the client to the user.  Ignored if set on packets that come from the
    * user to the client.
    *
    * The primary use is to allow users to distinguish between packets in polymorphic situations (for example,
    * the result of a publish attempt which might be a Puback (QoS 1) or Pubcomp (QoS 2, when we support it).
    */
  var `type`: js.UndefOr[PacketType] = js.undefined
}
object IPacket {
  
  inline def apply(): IPacket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPacket] (val x: Self) extends AnyVal {
    
    inline def setType(value: PacketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

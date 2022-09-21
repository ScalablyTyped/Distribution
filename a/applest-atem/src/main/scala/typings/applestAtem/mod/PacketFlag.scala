package typings.applestAtem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PacketFlag extends StObject
@JSImport("applest-atem", "PacketFlag")
@js.native
object PacketFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PacketFlag & Double] = js.native
  
  @js.native
  sealed trait Ack
    extends StObject
       with PacketFlag
  /* 0x16 */ val Ack: typings.applestAtem.mod.PacketFlag.Ack & Double = js.native
  
  @js.native
  sealed trait Connect
    extends StObject
       with PacketFlag
  /* 0x02 */ val Connect: typings.applestAtem.mod.PacketFlag.Connect & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with PacketFlag
  /* 0x08 */ val Error: typings.applestAtem.mod.PacketFlag.Error & Double = js.native
  
  @js.native
  sealed trait Repeat
    extends StObject
       with PacketFlag
  /* 0x04 */ val Repeat: typings.applestAtem.mod.PacketFlag.Repeat & Double = js.native
  
  @js.native
  sealed trait Sync
    extends StObject
       with PacketFlag
  /* 0x01 */ val Sync: typings.applestAtem.mod.PacketFlag.Sync & Double = js.native
}

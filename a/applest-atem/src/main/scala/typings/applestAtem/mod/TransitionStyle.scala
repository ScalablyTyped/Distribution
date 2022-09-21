package typings.applestAtem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransitionStyle extends StObject
@JSImport("applest-atem", "TransitionStyle")
@js.native
object TransitionStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransitionStyle & Double] = js.native
  
  @js.native
  sealed trait DIP
    extends StObject
       with TransitionStyle
  /* 0x01 */ val DIP: typings.applestAtem.mod.TransitionStyle.DIP & Double = js.native
  
  @js.native
  sealed trait DVE
    extends StObject
       with TransitionStyle
  /* 0x03 */ val DVE: typings.applestAtem.mod.TransitionStyle.DVE & Double = js.native
  
  @js.native
  sealed trait MIX
    extends StObject
       with TransitionStyle
  /* 0x00 */ val MIX: typings.applestAtem.mod.TransitionStyle.MIX & Double = js.native
  
  @js.native
  sealed trait STING
    extends StObject
       with TransitionStyle
  /* 0x04 */ val STING: typings.applestAtem.mod.TransitionStyle.STING & Double = js.native
  
  @js.native
  sealed trait WIPE
    extends StObject
       with TransitionStyle
  /* 0x02 */ val WIPE: typings.applestAtem.mod.TransitionStyle.WIPE & Double = js.native
}

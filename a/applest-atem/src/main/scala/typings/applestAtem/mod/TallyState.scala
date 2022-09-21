package typings.applestAtem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TallyState extends StObject
@JSImport("applest-atem", "TallyState")
@js.native
object TallyState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TallyState & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TallyState
  /* 0x00 */ val None: typings.applestAtem.mod.TallyState.None & Double = js.native
  
  @js.native
  sealed trait Preview
    extends StObject
       with TallyState
  /* 0x02 */ val Preview: typings.applestAtem.mod.TallyState.Preview & Double = js.native
  
  @js.native
  sealed trait Program
    extends StObject
       with TallyState
  /* 0x01 */ val Program: typings.applestAtem.mod.TallyState.Program & Double = js.native
}

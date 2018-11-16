package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpTextLevelEffect extends js.Object

@JSGlobal("PowerPoint.PpTextLevelEffect")
@js.native
object PpTextLevelEffect extends js.Object {
  @js.native
  sealed trait ppAnimateByAllLevels
    extends activexDashPowerpointLib.PowerPointNs.PpTextLevelEffect
  
  @js.native
  sealed trait ppAnimateByFifthLevel
    extends activexDashPowerpointLib.PowerPointNs.PpTextLevelEffect
  
  @js.native
  sealed trait ppAnimateByFirstLevel
    extends activexDashPowerpointLib.PowerPointNs.PpTextLevelEffect
  
  @js.native
  sealed trait ppAnimateByFourthLevel
    extends activexDashPowerpointLib.PowerPointNs.PpTextLevelEffect
  
  @js.native
  sealed trait ppAnimateBySecondLevel
    extends activexDashPowerpointLib.PowerPointNs.PpTextLevelEffect
  
  @js.native
  sealed trait ppAnimateByThirdLevel
    extends activexDashPowerpointLib.PowerPointNs.PpTextLevelEffect
  
  @js.native
  sealed trait ppAnimateLevelMixed
    extends activexDashPowerpointLib.PowerPointNs.PpTextLevelEffect
  
  @js.native
  sealed trait ppAnimateLevelNone
    extends activexDashPowerpointLib.PowerPointNs.PpTextLevelEffect
  
  /* 16 */ val ppAnimateByAllLevels: ppAnimateByAllLevels with scala.Double = js.native
  /* 5 */ val ppAnimateByFifthLevel: ppAnimateByFifthLevel with scala.Double = js.native
  /* 1 */ val ppAnimateByFirstLevel: ppAnimateByFirstLevel with scala.Double = js.native
  /* 4 */ val ppAnimateByFourthLevel: ppAnimateByFourthLevel with scala.Double = js.native
  /* 2 */ val ppAnimateBySecondLevel: ppAnimateBySecondLevel with scala.Double = js.native
  /* 3 */ val ppAnimateByThirdLevel: ppAnimateByThirdLevel with scala.Double = js.native
  /* -2 */ val ppAnimateLevelMixed: ppAnimateLevelMixed with scala.Double = js.native
  /* 0 */ val ppAnimateLevelNone: ppAnimateLevelNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpTextLevelEffect with scala.Double] = js.native
}


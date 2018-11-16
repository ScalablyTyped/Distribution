package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpTextUnitEffect extends js.Object

@JSGlobal("PowerPoint.PpTextUnitEffect")
@js.native
object PpTextUnitEffect extends js.Object {
  @js.native
  sealed trait ppAnimateByCharacter
    extends activexDashPowerpointLib.PowerPointNs.PpTextUnitEffect
  
  @js.native
  sealed trait ppAnimateByParagraph
    extends activexDashPowerpointLib.PowerPointNs.PpTextUnitEffect
  
  @js.native
  sealed trait ppAnimateByWord
    extends activexDashPowerpointLib.PowerPointNs.PpTextUnitEffect
  
  @js.native
  sealed trait ppAnimateUnitMixed
    extends activexDashPowerpointLib.PowerPointNs.PpTextUnitEffect
  
  /* 2 */ val ppAnimateByCharacter: ppAnimateByCharacter with scala.Double = js.native
  /* 0 */ val ppAnimateByParagraph: ppAnimateByParagraph with scala.Double = js.native
  /* 1 */ val ppAnimateByWord: ppAnimateByWord with scala.Double = js.native
  /* -2 */ val ppAnimateUnitMixed: ppAnimateUnitMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpTextUnitEffect with scala.Double] = js.native
}


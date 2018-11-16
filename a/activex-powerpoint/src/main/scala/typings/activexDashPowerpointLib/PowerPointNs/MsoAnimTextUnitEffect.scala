package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAnimTextUnitEffect extends js.Object

@JSGlobal("PowerPoint.MsoAnimTextUnitEffect")
@js.native
object MsoAnimTextUnitEffect extends js.Object {
  @js.native
  sealed trait msoAnimTextUnitEffectByCharacter
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTextUnitEffect
  
  @js.native
  sealed trait msoAnimTextUnitEffectByParagraph
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTextUnitEffect
  
  @js.native
  sealed trait msoAnimTextUnitEffectByWord
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTextUnitEffect
  
  @js.native
  sealed trait msoAnimTextUnitEffectMixed
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimTextUnitEffect
  
  /* 1 */ val msoAnimTextUnitEffectByCharacter: msoAnimTextUnitEffectByCharacter with scala.Double = js.native
  /* 0 */ val msoAnimTextUnitEffectByParagraph: msoAnimTextUnitEffectByParagraph with scala.Double = js.native
  /* 2 */ val msoAnimTextUnitEffectByWord: msoAnimTextUnitEffectByWord with scala.Double = js.native
  /* -1 */ val msoAnimTextUnitEffectMixed: msoAnimTextUnitEffectMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoAnimTextUnitEffect with scala.Double] = js.native
}


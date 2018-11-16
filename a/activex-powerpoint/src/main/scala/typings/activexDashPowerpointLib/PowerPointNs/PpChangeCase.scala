package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpChangeCase extends js.Object

@JSGlobal("PowerPoint.PpChangeCase")
@js.native
object PpChangeCase extends js.Object {
  @js.native
  sealed trait ppCaseLower
    extends activexDashPowerpointLib.PowerPointNs.PpChangeCase
  
  @js.native
  sealed trait ppCaseSentence
    extends activexDashPowerpointLib.PowerPointNs.PpChangeCase
  
  @js.native
  sealed trait ppCaseTitle
    extends activexDashPowerpointLib.PowerPointNs.PpChangeCase
  
  @js.native
  sealed trait ppCaseToggle
    extends activexDashPowerpointLib.PowerPointNs.PpChangeCase
  
  @js.native
  sealed trait ppCaseUpper
    extends activexDashPowerpointLib.PowerPointNs.PpChangeCase
  
  /* 2 */ val ppCaseLower: ppCaseLower with scala.Double = js.native
  /* 1 */ val ppCaseSentence: ppCaseSentence with scala.Double = js.native
  /* 4 */ val ppCaseTitle: ppCaseTitle with scala.Double = js.native
  /* 5 */ val ppCaseToggle: ppCaseToggle with scala.Double = js.native
  /* 3 */ val ppCaseUpper: ppCaseUpper with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpChangeCase with scala.Double] = js.native
}


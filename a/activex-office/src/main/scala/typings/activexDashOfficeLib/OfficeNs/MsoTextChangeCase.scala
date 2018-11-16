package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextChangeCase extends js.Object

@JSGlobal("Office.MsoTextChangeCase")
@js.native
object MsoTextChangeCase extends js.Object {
  @js.native
  sealed trait msoCaseLower
    extends activexDashOfficeLib.OfficeNs.MsoTextChangeCase
  
  @js.native
  sealed trait msoCaseSentence
    extends activexDashOfficeLib.OfficeNs.MsoTextChangeCase
  
  @js.native
  sealed trait msoCaseTitle
    extends activexDashOfficeLib.OfficeNs.MsoTextChangeCase
  
  @js.native
  sealed trait msoCaseToggle
    extends activexDashOfficeLib.OfficeNs.MsoTextChangeCase
  
  @js.native
  sealed trait msoCaseUpper
    extends activexDashOfficeLib.OfficeNs.MsoTextChangeCase
  
  /* 2 */ val msoCaseLower: msoCaseLower with scala.Double = js.native
  /* 1 */ val msoCaseSentence: msoCaseSentence with scala.Double = js.native
  /* 4 */ val msoCaseTitle: msoCaseTitle with scala.Double = js.native
  /* 5 */ val msoCaseToggle: msoCaseToggle with scala.Double = js.native
  /* 3 */ val msoCaseUpper: msoCaseUpper with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextChangeCase with scala.Double] = js.native
}


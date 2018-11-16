package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDisplayUnit extends js.Object

@JSGlobal("Office.XlDisplayUnit")
@js.native
object XlDisplayUnit extends js.Object {
  @js.native
  sealed trait xlDisplayUnitCustom
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlDisplayUnitNone
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlHundredMillions
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlHundredThousands
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlHundreds
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlMillionMillions
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlMillions
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlTenMillions
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlTenThousands
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlThousandMillions
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  @js.native
  sealed trait xlThousands
    extends activexDashOfficeLib.OfficeNs.XlDisplayUnit
  
  /* -4114 */ val xlDisplayUnitCustom: xlDisplayUnitCustom with scala.Double = js.native
  /* -4142 */ val xlDisplayUnitNone: xlDisplayUnitNone with scala.Double = js.native
  /* -8 */ val xlHundredMillions: xlHundredMillions with scala.Double = js.native
  /* -5 */ val xlHundredThousands: xlHundredThousands with scala.Double = js.native
  /* -2 */ val xlHundreds: xlHundreds with scala.Double = js.native
  /* -10 */ val xlMillionMillions: xlMillionMillions with scala.Double = js.native
  /* -6 */ val xlMillions: xlMillions with scala.Double = js.native
  /* -7 */ val xlTenMillions: xlTenMillions with scala.Double = js.native
  /* -4 */ val xlTenThousands: xlTenThousands with scala.Double = js.native
  /* -9 */ val xlThousandMillions: xlThousandMillions with scala.Double = js.native
  /* -3 */ val xlThousands: xlThousands with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlDisplayUnit with scala.Double] = js.native
}


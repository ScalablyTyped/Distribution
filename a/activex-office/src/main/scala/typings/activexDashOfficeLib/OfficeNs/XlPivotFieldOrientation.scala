package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotFieldOrientation extends js.Object

@JSGlobal("Office.XlPivotFieldOrientation")
@js.native
object XlPivotFieldOrientation extends js.Object {
  @js.native
  sealed trait xlColumnField
    extends activexDashOfficeLib.OfficeNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlDataField
    extends activexDashOfficeLib.OfficeNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlHidden
    extends activexDashOfficeLib.OfficeNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlPageField
    extends activexDashOfficeLib.OfficeNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlRowField
    extends activexDashOfficeLib.OfficeNs.XlPivotFieldOrientation
  
  /* 2 */ val xlColumnField: xlColumnField with scala.Double = js.native
  /* 4 */ val xlDataField: xlDataField with scala.Double = js.native
  /* 0 */ val xlHidden: xlHidden with scala.Double = js.native
  /* 3 */ val xlPageField: xlPageField with scala.Double = js.native
  /* 1 */ val xlRowField: xlRowField with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlPivotFieldOrientation with scala.Double] = js.native
}


package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotFieldOrientation extends js.Object

@JSGlobal("PowerPoint.XlPivotFieldOrientation")
@js.native
object XlPivotFieldOrientation extends js.Object {
  @js.native
  sealed trait xlColumnField
    extends activexDashPowerpointLib.PowerPointNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlDataField
    extends activexDashPowerpointLib.PowerPointNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlHidden
    extends activexDashPowerpointLib.PowerPointNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlPageField
    extends activexDashPowerpointLib.PowerPointNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlRowField
    extends activexDashPowerpointLib.PowerPointNs.XlPivotFieldOrientation
  
  /* 2 */ val xlColumnField: xlColumnField with scala.Double = js.native
  /* 4 */ val xlDataField: xlDataField with scala.Double = js.native
  /* 0 */ val xlHidden: xlHidden with scala.Double = js.native
  /* 3 */ val xlPageField: xlPageField with scala.Double = js.native
  /* 1 */ val xlRowField: xlRowField with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlPivotFieldOrientation with scala.Double] = js.native
}


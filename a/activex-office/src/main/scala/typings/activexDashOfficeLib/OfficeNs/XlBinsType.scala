package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlBinsType extends js.Object

@JSGlobal("Office.XlBinsType")
@js.native
object XlBinsType extends js.Object {
  @js.native
  sealed trait xlBinsTypeAutomatic
    extends activexDashOfficeLib.OfficeNs.XlBinsType
  
  @js.native
  sealed trait xlBinsTypeBinCount
    extends activexDashOfficeLib.OfficeNs.XlBinsType
  
  @js.native
  sealed trait xlBinsTypeBinSize
    extends activexDashOfficeLib.OfficeNs.XlBinsType
  
  @js.native
  sealed trait xlBinsTypeCategorical
    extends activexDashOfficeLib.OfficeNs.XlBinsType
  
  @js.native
  sealed trait xlBinsTypeManual
    extends activexDashOfficeLib.OfficeNs.XlBinsType
  
  /* 0 */ val xlBinsTypeAutomatic: xlBinsTypeAutomatic with scala.Double = js.native
  /* 4 */ val xlBinsTypeBinCount: xlBinsTypeBinCount with scala.Double = js.native
  /* 3 */ val xlBinsTypeBinSize: xlBinsTypeBinSize with scala.Double = js.native
  /* 1 */ val xlBinsTypeCategorical: xlBinsTypeCategorical with scala.Double = js.native
  /* 2 */ val xlBinsTypeManual: xlBinsTypeManual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlBinsType with scala.Double] = js.native
}


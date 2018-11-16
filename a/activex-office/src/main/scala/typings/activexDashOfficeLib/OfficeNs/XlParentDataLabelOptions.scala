package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlParentDataLabelOptions extends js.Object

@JSGlobal("Office.XlParentDataLabelOptions")
@js.native
object XlParentDataLabelOptions extends js.Object {
  @js.native
  sealed trait xlParentDataLabelOptionsBanner
    extends activexDashOfficeLib.OfficeNs.XlParentDataLabelOptions
  
  @js.native
  sealed trait xlParentDataLabelOptionsNone
    extends activexDashOfficeLib.OfficeNs.XlParentDataLabelOptions
  
  @js.native
  sealed trait xlParentDataLabelOptionsOverlapping
    extends activexDashOfficeLib.OfficeNs.XlParentDataLabelOptions
  
  /* 1 */ val xlParentDataLabelOptionsBanner: xlParentDataLabelOptionsBanner with scala.Double = js.native
  /* 0 */ val xlParentDataLabelOptionsNone: xlParentDataLabelOptionsNone with scala.Double = js.native
  /* 2 */ val xlParentDataLabelOptionsOverlapping: xlParentDataLabelOptionsOverlapping with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlParentDataLabelOptions with scala.Double] = js.native
}


package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataLabelsType extends js.Object

@JSGlobal("Office.XlDataLabelsType")
@js.native
object XlDataLabelsType extends js.Object {
  @js.native
  sealed trait xlDataLabelsShowBubbleSizes
    extends activexDashOfficeLib.OfficeNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowLabel
    extends activexDashOfficeLib.OfficeNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowLabelAndPercent
    extends activexDashOfficeLib.OfficeNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowNone
    extends activexDashOfficeLib.OfficeNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowPercent
    extends activexDashOfficeLib.OfficeNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowValue
    extends activexDashOfficeLib.OfficeNs.XlDataLabelsType
  
  /* 6 */ val xlDataLabelsShowBubbleSizes: xlDataLabelsShowBubbleSizes with scala.Double = js.native
  /* 4 */ val xlDataLabelsShowLabel: xlDataLabelsShowLabel with scala.Double = js.native
  /* 5 */ val xlDataLabelsShowLabelAndPercent: xlDataLabelsShowLabelAndPercent with scala.Double = js.native
  /* -4142 */ val xlDataLabelsShowNone: xlDataLabelsShowNone with scala.Double = js.native
  /* 3 */ val xlDataLabelsShowPercent: xlDataLabelsShowPercent with scala.Double = js.native
  /* 2 */ val xlDataLabelsShowValue: xlDataLabelsShowValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlDataLabelsType with scala.Double] = js.native
}


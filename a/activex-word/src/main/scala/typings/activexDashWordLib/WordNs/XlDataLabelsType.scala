package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataLabelsType extends js.Object

@JSGlobal("Word.XlDataLabelsType")
@js.native
object XlDataLabelsType extends js.Object {
  @js.native
  sealed trait xlDataLabelsShowBubbleSizes
    extends activexDashWordLib.WordNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowLabel
    extends activexDashWordLib.WordNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowLabelAndPercent
    extends activexDashWordLib.WordNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowNone
    extends activexDashWordLib.WordNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowPercent
    extends activexDashWordLib.WordNs.XlDataLabelsType
  
  @js.native
  sealed trait xlDataLabelsShowValue
    extends activexDashWordLib.WordNs.XlDataLabelsType
  
  /* 6 */ val xlDataLabelsShowBubbleSizes: xlDataLabelsShowBubbleSizes with scala.Double = js.native
  /* 4 */ val xlDataLabelsShowLabel: xlDataLabelsShowLabel with scala.Double = js.native
  /* 5 */ val xlDataLabelsShowLabelAndPercent: xlDataLabelsShowLabelAndPercent with scala.Double = js.native
  /* -4142 */ val xlDataLabelsShowNone: xlDataLabelsShowNone with scala.Double = js.native
  /* 3 */ val xlDataLabelsShowPercent: xlDataLabelsShowPercent with scala.Double = js.native
  /* 2 */ val xlDataLabelsShowValue: xlDataLabelsShowValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlDataLabelsType with scala.Double] = js.native
}


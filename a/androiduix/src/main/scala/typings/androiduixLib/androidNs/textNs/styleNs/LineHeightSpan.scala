package typings
package androiduixLib.androidNs.textNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeightSpan extends ParagraphStyle {
  def chooseHeight(
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    spanstartv: scala.Double,
    v: scala.Double,
    fm: androiduixLib.androidNs.graphicsNs.PaintNs.FontMetricsInt
  ): scala.Unit
}

object LineHeightSpan {
  @scala.inline
  def apply(
    chooseHeight: js.Function6[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      androiduixLib.androidNs.graphicsNs.PaintNs.FontMetricsInt, 
      scala.Unit
    ]
  ): LineHeightSpan = {
    val __obj = js.Dynamic.literal(chooseHeight = chooseHeight)
  
    __obj.asInstanceOf[LineHeightSpan]
  }
}


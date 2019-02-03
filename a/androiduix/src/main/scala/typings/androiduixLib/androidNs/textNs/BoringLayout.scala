package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.BoringLayout")
@js.native
class BoringLayout protected ()
  extends Layout
     with androiduixLib.androidNs.textNs.TextUtilsNs.EllipsizeCallback {
  def this(source: java.lang.String, paint: TextPaint, outerwidth: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, spacingmult: scala.Double, spacingadd: scala.Double, metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics, includepad: scala.Boolean) = this()
  def this(source: java.lang.String, paint: TextPaint, outerwidth: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, spacingmult: scala.Double, spacingadd: scala.Double, metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics, includepad: scala.Boolean, ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt) = this()
  def this(source: java.lang.String, paint: TextPaint, outerwidth: scala.Double, align: androiduixLib.androidNs.textNs.LayoutNs.Alignment, spacingmult: scala.Double, spacingadd: scala.Double, metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics, includepad: scala.Boolean, ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt, ellipsizedWidth: scala.Double) = this()
  var mBottom: scala.Double = js.native
  var mBottomPadding: js.Any = js.native
  var mDesc: scala.Double = js.native
  var mDirect: js.Any = js.native
  var mEllipsizedCount: js.Any = js.native
  var mEllipsizedStart: js.Any = js.native
  var mEllipsizedWidth: js.Any = js.native
  var mMax: js.Any = js.native
  var mTopPadding: js.Any = js.native
  /* CompleteClass */
  override def ellipsized(start: scala.Double, end: scala.Double): scala.Unit = js.native
  def init(
    source: java.lang.String,
    paint: TextPaint,
    outerwidth: scala.Double,
    align: androiduixLib.androidNs.textNs.LayoutNs.Alignment,
    spacingmult: scala.Double,
    spacingadd: scala.Double,
    metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics,
    includepad: scala.Boolean,
    trustWidth: scala.Boolean
  ): scala.Unit = js.native
  def replaceOrMake(
    source: java.lang.String,
    paint: TextPaint,
    outerwidth: scala.Double,
    align: androiduixLib.androidNs.textNs.LayoutNs.Alignment,
    spacingmult: scala.Double,
    spacingadd: scala.Double,
    metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics,
    includepad: scala.Boolean
  ): BoringLayout = js.native
  def replaceOrMake(
    source: java.lang.String,
    paint: TextPaint,
    outerwidth: scala.Double,
    align: androiduixLib.androidNs.textNs.LayoutNs.Alignment,
    spacingmult: scala.Double,
    spacingadd: scala.Double,
    metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics,
    includepad: scala.Boolean,
    ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt
  ): BoringLayout = js.native
  def replaceOrMake(
    source: java.lang.String,
    paint: TextPaint,
    outerwidth: scala.Double,
    align: androiduixLib.androidNs.textNs.LayoutNs.Alignment,
    spacingmult: scala.Double,
    spacingadd: scala.Double,
    metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics,
    includepad: scala.Boolean,
    ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt,
    ellipsizedWidth: scala.Double
  ): BoringLayout = js.native
}

/* static members */
@JSGlobal("android.text.BoringLayout")
@js.native
object BoringLayout extends js.Object {
  var FIRST_RIGHT_TO_LEFT: js.Any = js.native
  var sTemp: js.Any = js.native
  def isBoring(text: java.lang.String, paint: androiduixLib.androidNs.textNs.TextPaint): androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics = js.native
  def isBoring(
    text: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    textDir: androiduixLib.androidNs.textNs.TextDirectionHeuristic
  ): androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics = js.native
  def isBoring(
    text: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    textDir: androiduixLib.androidNs.textNs.TextDirectionHeuristic,
    metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics
  ): androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics = js.native
  def make(
    source: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    outerwidth: scala.Double,
    align: androiduixLib.androidNs.textNs.LayoutNs.Alignment,
    spacingmult: scala.Double,
    spacingadd: scala.Double,
    metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics,
    includepad: scala.Boolean
  ): androiduixLib.androidNs.textNs.BoringLayout = js.native
  def make(
    source: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    outerwidth: scala.Double,
    align: androiduixLib.androidNs.textNs.LayoutNs.Alignment,
    spacingmult: scala.Double,
    spacingadd: scala.Double,
    metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics,
    includepad: scala.Boolean,
    ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt
  ): androiduixLib.androidNs.textNs.BoringLayout = js.native
  def make(
    source: java.lang.String,
    paint: androiduixLib.androidNs.textNs.TextPaint,
    outerwidth: scala.Double,
    align: androiduixLib.androidNs.textNs.LayoutNs.Alignment,
    spacingmult: scala.Double,
    spacingadd: scala.Double,
    metrics: androiduixLib.androidNs.textNs.BoringLayoutNs.Metrics,
    includepad: scala.Boolean,
    ellipsize: androiduixLib.androidNs.textNs.TextUtilsNs.TruncateAt,
    ellipsizedWidth: scala.Double
  ): androiduixLib.androidNs.textNs.BoringLayout = js.native
}


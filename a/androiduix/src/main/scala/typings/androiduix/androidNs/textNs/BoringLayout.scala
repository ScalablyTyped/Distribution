package typings.androiduix.androidNs.textNs

import typings.androiduix.androidNs.textNs.BoringLayoutNs.Metrics
import typings.androiduix.androidNs.textNs.LayoutNs.Alignment
import typings.androiduix.androidNs.textNs.TextUtilsNs.EllipsizeCallback
import typings.androiduix.androidNs.textNs.TextUtilsNs.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.BoringLayout")
@js.native
class BoringLayout protected ()
  extends Layout
     with EllipsizeCallback {
  def this(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean
  ) = this()
  def this(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt
  ) = this()
  def this(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ) = this()
  var mBottom: Double = js.native
  var mBottomPadding: js.Any = js.native
  var mDesc: Double = js.native
  var mDirect: js.Any = js.native
  var mEllipsizedCount: js.Any = js.native
  var mEllipsizedStart: js.Any = js.native
  var mEllipsizedWidth: js.Any = js.native
  var mMax: js.Any = js.native
  var mTopPadding: js.Any = js.native
  /* CompleteClass */
  override def ellipsized(start: Double, end: Double): Unit = js.native
  def init(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    trustWidth: Boolean
  ): Unit = js.native
  def replaceOrMake(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean
  ): BoringLayout = js.native
  def replaceOrMake(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt
  ): BoringLayout = js.native
  def replaceOrMake(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ): BoringLayout = js.native
}

/* static members */
@JSGlobal("android.text.BoringLayout")
@js.native
object BoringLayout extends js.Object {
  var FIRST_RIGHT_TO_LEFT: js.Any = js.native
  var sTemp: js.Any = js.native
  def isBoring(text: String, paint: TextPaint): Metrics = js.native
  def isBoring(text: String, paint: TextPaint, textDir: TextDirectionHeuristic): Metrics = js.native
  def isBoring(text: String, paint: TextPaint, textDir: TextDirectionHeuristic, metrics: Metrics): Metrics = js.native
  def make(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean
  ): BoringLayout = js.native
  def make(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt
  ): BoringLayout = js.native
  def make(
    source: String,
    paint: TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ): BoringLayout = js.native
}


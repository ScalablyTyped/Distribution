package typings.androiduix.global.android.text

import typings.androiduix.android.text.BoringLayout.Metrics
import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.TextDirectionHeuristic
import typings.androiduix.android.text.TextUtils.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.BoringLayout")
@js.native
class BoringLayout protected ()
  extends typings.androiduix.android.text.BoringLayout {
  def this(
    source: String,
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean
  ) = this()
  def this(
    source: String,
    paint: typings.androiduix.android.text.TextPaint,
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
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: Double
  ) = this()
  def this(
    source: String,
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ) = this()
}
/* static members */
@JSGlobal("android.text.BoringLayout")
@js.native
object BoringLayout extends js.Object {
  
  var FIRST_RIGHT_TO_LEFT: js.Any = js.native
  
  def isBoring(text: String, paint: typings.androiduix.android.text.TextPaint): typings.androiduix.android.text.BoringLayout.Metrics = js.native
  def isBoring(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    textDir: js.UndefOr[scala.Nothing],
    metrics: typings.androiduix.android.text.BoringLayout.Metrics
  ): typings.androiduix.android.text.BoringLayout.Metrics = js.native
  def isBoring(text: String, paint: typings.androiduix.android.text.TextPaint, textDir: TextDirectionHeuristic): typings.androiduix.android.text.BoringLayout.Metrics = js.native
  def isBoring(
    text: String,
    paint: typings.androiduix.android.text.TextPaint,
    textDir: TextDirectionHeuristic,
    metrics: typings.androiduix.android.text.BoringLayout.Metrics
  ): typings.androiduix.android.text.BoringLayout.Metrics = js.native
  
  def make(
    source: String,
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: typings.androiduix.android.text.BoringLayout.Metrics,
    includepad: Boolean
  ): typings.androiduix.android.text.BoringLayout = js.native
  def make(
    source: String,
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: typings.androiduix.android.text.BoringLayout.Metrics,
    includepad: Boolean,
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: Double
  ): typings.androiduix.android.text.BoringLayout = js.native
  def make(
    source: String,
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: typings.androiduix.android.text.BoringLayout.Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt
  ): typings.androiduix.android.text.BoringLayout = js.native
  def make(
    source: String,
    paint: typings.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: typings.androiduix.android.text.BoringLayout.Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ): typings.androiduix.android.text.BoringLayout = js.native
  
  var sTemp: js.Any = js.native
  
  @js.native
  class Metrics ()
    extends typings.androiduix.android.text.BoringLayout.Metrics
}

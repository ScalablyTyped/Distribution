package typings.androiduix.android.text

import typings.androiduix.android.graphics.Paint.FontMetricsInt
import typings.androiduix.android.text.BoringLayout.Metrics
import typings.androiduix.android.text.Layout.Alignment
import typings.androiduix.android.text.TextUtils.EllipsizeCallback
import typings.androiduix.android.text.TextUtils.TruncateAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoringLayout
  extends Layout
     with EllipsizeCallback {
  
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
  
  var mBottom: Double = js.native
  
  var mBottomPadding: js.Any = js.native
  
  var mDesc: Double = js.native
  
  var mDirect: js.Any = js.native
  
  var mEllipsizedCount: js.Any = js.native
  
  var mEllipsizedStart: js.Any = js.native
  
  var mEllipsizedWidth: js.Any = js.native
  
  var mMax: js.Any = js.native
  
  var mTopPadding: js.Any = js.native
  
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
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: Double
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
object BoringLayout {
  
  @js.native
  trait Metrics extends FontMetricsInt {
    
    var width: Double = js.native
  }
  object Metrics {
    
    @scala.inline
    def apply(ascent: Double, bottom: Double, descent: Double, leading: Double, top: Double, width: Double): Metrics = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

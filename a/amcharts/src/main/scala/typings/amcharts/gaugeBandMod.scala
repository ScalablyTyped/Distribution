package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaugeBandMod {
  
  @JSImport("amcharts/GaugeBand", JSImport.Default)
  @js.native
  class default () extends GaugeBand
  
  @js.native
  trait GaugeBand extends StObject {
    
    /**
      * Opacity of band fill. Will use axis.bandAlpha if not set any.
      */
    var alpha: Double = js.native
    
    /**
      * When rolled-over, band will display balloon if you set some text for this property.
      */
    var balloonText: String = js.native
    
    /**
      * Color of a band.
      */
    var color: String = js.native
    
    /**
      * End value of a fill.
      */
    var endValue: Double = js.native
    
    /**
      * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
      * Negative value means the color will be darker than the original,
      * and positive number means the color will be lighter.
      * @default []
      */
    var gradientRatio: js.Array[Double] = js.native
    
    /**
      * Unique id of a band.
      */
    var id: String = js.native
    
    /**
      * Inner radius of a band. If not set any, the band will end with the end of minor ticks.
      * Set 0 if you want the band to be drawn to the axis center.
      */
    var innerRadius: js.Any = js.native
    
    /**
      * Band radius. If not set any, the band will start with the axis outline.
      */
    var radius: js.Any = js.native
    
    /**
      * Sets end value for the band.
      */
    def setEndValue(value: Double): Unit = js.native
    
    /**
      * Sets start value for the band.
      */
    def setStartValue(value: Double): Unit = js.native
    
    /**
      * Start value of a fill.
      */
    var startValue: Double = js.native
    
    /**
      * Gauge band can be clickable and can lead to some page.
      */
    var url: String = js.native
  }
  object GaugeBand {
    
    @scala.inline
    def apply(
      alpha: Double,
      balloonText: String,
      color: String,
      endValue: Double,
      gradientRatio: js.Array[Double],
      id: String,
      innerRadius: js.Any,
      radius: js.Any,
      setEndValue: Double => Unit,
      setStartValue: Double => Unit,
      startValue: Double,
      url: String
    ): GaugeBand = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endValue = endValue.asInstanceOf[js.Any], gradientRatio = gradientRatio.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setEndValue = js.Any.fromFunction1(setEndValue), setStartValue = js.Any.fromFunction1(setStartValue), startValue = startValue.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeBand]
    }
    
    @scala.inline
    implicit class GaugeBandMutableBuilder[Self <: GaugeBand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalloonText(value: String): Self = StObject.set(x, "balloonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientRatio(value: js.Array[Double]): Self = StObject.set(x, "gradientRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientRatioVarargs(value: Double*): Self = StObject.set(x, "gradientRatio", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRadius(value: js.Any): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: js.Any): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetEndValue(value: Double => Unit): Self = StObject.set(x, "setEndValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStartValue(value: Double => Unit): Self = StObject.set(x, "setStartValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}

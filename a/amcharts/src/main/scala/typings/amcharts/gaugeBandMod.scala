package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaugeBandMod {
  
  @JSImport("amcharts/GaugeBand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GaugeBand {
    
    /**
      * Opacity of band fill. Will use axis.bandAlpha if not set any.
      */
    /* CompleteClass */
    var alpha: Double = js.native
    
    /**
      * When rolled-over, band will display balloon if you set some text for this property.
      */
    /* CompleteClass */
    var balloonText: String = js.native
    
    /**
      * Color of a band.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * End value of a fill.
      */
    /* CompleteClass */
    var endValue: Double = js.native
    
    /**
      * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
      * Negative value means the color will be darker than the original,
      * and positive number means the color will be lighter.
      * @default []
      */
    /* CompleteClass */
    var gradientRatio: js.Array[Double] = js.native
    
    /**
      * Unique id of a band.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * Inner radius of a band. If not set any, the band will end with the end of minor ticks.
      * Set 0 if you want the band to be drawn to the axis center.
      */
    /* CompleteClass */
    var innerRadius: Any = js.native
    
    /**
      * Band radius. If not set any, the band will start with the axis outline.
      */
    /* CompleteClass */
    var radius: Any = js.native
    
    /**
      * Sets end value for the band.
      */
    /* CompleteClass */
    override def setEndValue(value: Double): Unit = js.native
    
    /**
      * Sets start value for the band.
      */
    /* CompleteClass */
    override def setStartValue(value: Double): Unit = js.native
    
    /**
      * Start value of a fill.
      */
    /* CompleteClass */
    var startValue: Double = js.native
    
    /**
      * Gauge band can be clickable and can lead to some page.
      */
    /* CompleteClass */
    var url: String = js.native
  }
  
  trait GaugeBand extends StObject {
    
    /**
      * Opacity of band fill. Will use axis.bandAlpha if not set any.
      */
    var alpha: Double
    
    /**
      * When rolled-over, band will display balloon if you set some text for this property.
      */
    var balloonText: String
    
    /**
      * Color of a band.
      */
    var color: String
    
    /**
      * End value of a fill.
      */
    var endValue: Double
    
    /**
      * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
      * Negative value means the color will be darker than the original,
      * and positive number means the color will be lighter.
      * @default []
      */
    var gradientRatio: js.Array[Double]
    
    /**
      * Unique id of a band.
      */
    var id: String
    
    /**
      * Inner radius of a band. If not set any, the band will end with the end of minor ticks.
      * Set 0 if you want the band to be drawn to the axis center.
      */
    var innerRadius: Any
    
    /**
      * Band radius. If not set any, the band will start with the axis outline.
      */
    var radius: Any
    
    /**
      * Sets end value for the band.
      */
    def setEndValue(value: Double): Unit
    
    /**
      * Sets start value for the band.
      */
    def setStartValue(value: Double): Unit
    
    /**
      * Start value of a fill.
      */
    var startValue: Double
    
    /**
      * Gauge band can be clickable and can lead to some page.
      */
    var url: String
  }
  object GaugeBand {
    
    inline def apply(
      alpha: Double,
      balloonText: String,
      color: String,
      endValue: Double,
      gradientRatio: js.Array[Double],
      id: String,
      innerRadius: Any,
      radius: Any,
      setEndValue: Double => Unit,
      setStartValue: Double => Unit,
      startValue: Double,
      url: String
    ): GaugeBand = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endValue = endValue.asInstanceOf[js.Any], gradientRatio = gradientRatio.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setEndValue = js.Any.fromFunction1(setEndValue), setStartValue = js.Any.fromFunction1(setStartValue), startValue = startValue.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeBand]
    }
    
    extension [Self <: GaugeBand](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBalloonText(value: String): Self = StObject.set(x, "balloonText", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      inline def setGradientRatio(value: js.Array[Double]): Self = StObject.set(x, "gradientRatio", value.asInstanceOf[js.Any])
      
      inline def setGradientRatioVarargs(value: Double*): Self = StObject.set(x, "gradientRatio", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInnerRadius(value: Any): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Any): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setSetEndValue(value: Double => Unit): Self = StObject.set(x, "setEndValue", js.Any.fromFunction1(value))
      
      inline def setSetStartValue(value: Double => Unit): Self = StObject.set(x, "setStartValue", js.Any.fromFunction1(value))
      
      inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}

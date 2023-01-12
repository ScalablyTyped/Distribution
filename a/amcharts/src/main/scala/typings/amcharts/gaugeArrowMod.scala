package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gaugeArrowMod {
  
  @JSImport("amcharts/GaugeArrow", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GaugeArrow {
    
    /**
      * Opacity of an arrow.
      * @default 1
      */
    /* CompleteClass */
    var alpha: Double = js.native
    
    /**
      * Axis of the arrow. You can use reference to the axis or id of the axis.
      * If you don't set any axis, the first axis of a chart will be used.
      * @default GaugeAxis
      */
    /* CompleteClass */
    var axis: typings.amcharts.gaugeAxisMod.default = js.native
    
    /**
      * Opacity of arrow border.
      * @default 1
      */
    /* CompleteClass */
    var borderAlpha: Double = js.native
    
    /**
      * In case you need the arrow to rotate only clock-wise, set this property to true.
      * @default false
      */
    /* CompleteClass */
    var clockWiseOnly: Boolean = js.native
    
    /**
      * Color of an arrow.
      * @default #000000
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Unique id of an arrow.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * Inner radius of an arrow.
      * @default 0
      */
    /* CompleteClass */
    var innerRadius: Any = js.native
    
    /**
      * Opacity of a nail, holding the arrow.
      * @default 1
      */
    /* CompleteClass */
    var nailAlpha: Double = js.native
    
    /**
      * Opacity of nail border.
      * @default 0
      */
    /* CompleteClass */
    var nailBorderAlpha: Double = js.native
    
    /**
      * Thickness of nail border.
      * @default 1
      */
    /* CompleteClass */
    var nailBorderThickness: Double = js.native
    
    /**
      * Radius of a nail, holding the arrow.
      * @default 8
      */
    /* CompleteClass */
    var nailRadius: Double = js.native
    
    /**
      * Radius of an arrow.
      * @default '90%'
      */
    /* CompleteClass */
    var radius: Any = js.native
    
    /**
      * Sets value for the arrow.
      * Arrow will animate to this value if you do it after chart is written to it's container.
      */
    /* CompleteClass */
    override def setValue(value: Double): Unit = js.native
    
    /**
      * Width of arrow root.
      * @default 8
      */
    /* CompleteClass */
    var startWidth: Double = js.native
    
    /**
      * Value to which the arrow should point at.
      */
    /* CompleteClass */
    var value: Double = js.native
  }
  
  trait GaugeArrow extends StObject {
    
    /**
      * Opacity of an arrow.
      * @default 1
      */
    var alpha: Double
    
    /**
      * Axis of the arrow. You can use reference to the axis or id of the axis.
      * If you don't set any axis, the first axis of a chart will be used.
      * @default GaugeAxis
      */
    var axis: typings.amcharts.gaugeAxisMod.default
    
    /**
      * Opacity of arrow border.
      * @default 1
      */
    var borderAlpha: Double
    
    /**
      * In case you need the arrow to rotate only clock-wise, set this property to true.
      * @default false
      */
    var clockWiseOnly: Boolean
    
    /**
      * Color of an arrow.
      * @default #000000
      */
    var color: String
    
    /**
      * Unique id of an arrow.
      */
    var id: String
    
    /**
      * Inner radius of an arrow.
      * @default 0
      */
    var innerRadius: Any
    
    /**
      * Opacity of a nail, holding the arrow.
      * @default 1
      */
    var nailAlpha: Double
    
    /**
      * Opacity of nail border.
      * @default 0
      */
    var nailBorderAlpha: Double
    
    /**
      * Thickness of nail border.
      * @default 1
      */
    var nailBorderThickness: Double
    
    /**
      * Radius of a nail, holding the arrow.
      * @default 8
      */
    var nailRadius: Double
    
    /**
      * Radius of an arrow.
      * @default '90%'
      */
    var radius: Any
    
    /**
      * Sets value for the arrow.
      * Arrow will animate to this value if you do it after chart is written to it's container.
      */
    def setValue(value: Double): Unit
    
    /**
      * Width of arrow root.
      * @default 8
      */
    var startWidth: Double
    
    /**
      * Value to which the arrow should point at.
      */
    var value: Double
  }
  object GaugeArrow {
    
    inline def apply(
      alpha: Double,
      axis: typings.amcharts.gaugeAxisMod.default,
      borderAlpha: Double,
      clockWiseOnly: Boolean,
      color: String,
      id: String,
      innerRadius: Any,
      nailAlpha: Double,
      nailBorderAlpha: Double,
      nailBorderThickness: Double,
      nailRadius: Double,
      radius: Any,
      setValue: Double => Unit,
      startWidth: Double,
      value: Double
    ): GaugeArrow = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], clockWiseOnly = clockWiseOnly.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], nailAlpha = nailAlpha.asInstanceOf[js.Any], nailBorderAlpha = nailBorderAlpha.asInstanceOf[js.Any], nailBorderThickness = nailBorderThickness.asInstanceOf[js.Any], nailRadius = nailRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), startWidth = startWidth.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeArrow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GaugeArrow] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAxis(value: typings.amcharts.gaugeAxisMod.default): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setBorderAlpha(value: Double): Self = StObject.set(x, "borderAlpha", value.asInstanceOf[js.Any])
      
      inline def setClockWiseOnly(value: Boolean): Self = StObject.set(x, "clockWiseOnly", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInnerRadius(value: Any): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setNailAlpha(value: Double): Self = StObject.set(x, "nailAlpha", value.asInstanceOf[js.Any])
      
      inline def setNailBorderAlpha(value: Double): Self = StObject.set(x, "nailBorderAlpha", value.asInstanceOf[js.Any])
      
      inline def setNailBorderThickness(value: Double): Self = StObject.set(x, "nailBorderThickness", value.asInstanceOf[js.Any])
      
      inline def setNailRadius(value: Double): Self = StObject.set(x, "nailRadius", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Any): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Double => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      inline def setStartWidth(value: Double): Self = StObject.set(x, "startWidth", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guideMod {
  
  @JSImport("amcharts/Guide", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Guide {
    
    /**
      * If you set it to true, the guide will be displayed above the graphs.
      */
    /* CompleteClass */
    var above: Boolean = js.native
    
    /**
      * Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines.
      */
    /* CompleteClass */
    var angle: Double = js.native
    
    /**
      * Baloon fill color.
      */
    /* CompleteClass */
    var balloonColor: String = js.native
    
    /**
      * The text which will be displayed if the user rolls-over the guide.
      */
    /* CompleteClass */
    var balloonText: String = js.native
    
    /**
      * Specifies if label should be bold or not.
      */
    /* CompleteClass */
    var boldLabel: Boolean = js.native
    
    /**
      * Category of the guide (in case the guide is for category axis).
      */
    /* CompleteClass */
    var category: String = js.native
    
    /**
      * Dash length.
      */
    /* CompleteClass */
    var dashLength: Double = js.native
    
    /**
      * Date of the guide (in case the guide is for category axis and parseDates is set to true).
      */
    /* CompleteClass */
    var date: js.Date = js.native
    
    /**
      * Works if a guide is added to CategoryAxis and this axis is non-date-based.
      * If you set it to true, the guide will start (or be placed, if it's not a fill) on the
      * beginning of the category cell and will end at the end of toCategory cell.
      */
    /* CompleteClass */
    var expand: Boolean = js.native
    
    /**
      * Fill opacity. Value range is 0 - 1.
      */
    /* CompleteClass */
    var fillAlpha: Double = js.native
    
    /**
      * Fill color.
      */
    /* CompleteClass */
    var fillColor: String = js.native
    
    /**
      * Font size of guide label.
      */
    /* CompleteClass */
    var fontSize: String = js.native
    
    /**
      * Unique id of a Guide. You don't need to set it, unless you want to.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * Specifies whether label should be placed inside or outside plot area.
      */
    /* CompleteClass */
    var inside: Boolean = js.native
    
    /**
      * The label which will be displayed near the guide.
      */
    /* CompleteClass */
    var label: String = js.native
    
    /**
      * Rotation angle of a guide label.
      */
    /* CompleteClass */
    var labelRotation: Double = js.native
    
    /**
      * Line opacity.
      */
    /* CompleteClass */
    var lineAlpha: Double = js.native
    
    /**
      * Line color.
      */
    /* CompleteClass */
    var lineColor: String = js.native
    
    /**
      * Line thickness.
      */
    /* CompleteClass */
    var lineThickness: Double = js.native
    
    /**
      * Position of guide label. Possible values are "left" or "right" for horizontal axis
      * and "top" or "bottom" for vertical axis.
      */
    /* CompleteClass */
    var position: String = js.native
    
    /**
      * Tick length.
      */
    /* CompleteClass */
    var tickLength: Double = js.native
    
    /**
      * Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines.
      */
    /* CompleteClass */
    var toAngle: Double = js.native
    
    /**
      * To category of the guide (in case the guide is for category axis).
      */
    /* CompleteClass */
    var toCategory: String = js.native
    
    /**
      * To date of the guide (in case the guide is for category axis and parseDates is set to true).
      * If you have both date and toDate, the space between these two dates can be filled with color.
      */
    /* CompleteClass */
    var toDate: js.Date = js.native
    
    /**
      * To value of the guide (in case the guide is for value axis).
      */
    /* CompleteClass */
    var toValue: Double = js.native
    
    /**
      * Value of the guide (in case the guide is for value axis).
      */
    /* CompleteClass */
    var value: Double = js.native
    
    /**
      * Value axis of a guide. As you can add guides directly to the chart,
      * you might need to specify which which value axis should be used.
      */
    /* CompleteClass */
    var valueAxis: typings.amcharts.valueAxisMod.default = js.native
  }
  
  trait Guide extends StObject {
    
    /**
      * If you set it to true, the guide will be displayed above the graphs.
      */
    var above: Boolean
    
    /**
      * Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines.
      */
    var angle: Double
    
    /**
      * Baloon fill color.
      */
    var balloonColor: String
    
    /**
      * The text which will be displayed if the user rolls-over the guide.
      */
    var balloonText: String
    
    /**
      * Specifies if label should be bold or not.
      */
    var boldLabel: Boolean
    
    /**
      * Category of the guide (in case the guide is for category axis).
      */
    var category: String
    
    /**
      * Dash length.
      */
    var dashLength: Double
    
    /**
      * Date of the guide (in case the guide is for category axis and parseDates is set to true).
      */
    var date: js.Date
    
    /**
      * Works if a guide is added to CategoryAxis and this axis is non-date-based.
      * If you set it to true, the guide will start (or be placed, if it's not a fill) on the
      * beginning of the category cell and will end at the end of toCategory cell.
      */
    var expand: Boolean
    
    /**
      * Fill opacity. Value range is 0 - 1.
      */
    var fillAlpha: Double
    
    /**
      * Fill color.
      */
    var fillColor: String
    
    /**
      * Font size of guide label.
      */
    var fontSize: String
    
    /**
      * Unique id of a Guide. You don't need to set it, unless you want to.
      */
    var id: String
    
    /**
      * Specifies whether label should be placed inside or outside plot area.
      */
    var inside: Boolean
    
    /**
      * The label which will be displayed near the guide.
      */
    var label: String
    
    /**
      * Rotation angle of a guide label.
      */
    var labelRotation: Double
    
    /**
      * Line opacity.
      */
    var lineAlpha: Double
    
    /**
      * Line color.
      */
    var lineColor: String
    
    /**
      * Line thickness.
      */
    var lineThickness: Double
    
    /**
      * Position of guide label. Possible values are "left" or "right" for horizontal axis
      * and "top" or "bottom" for vertical axis.
      */
    var position: String
    
    /**
      * Tick length.
      */
    var tickLength: Double
    
    /**
      * Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines.
      */
    var toAngle: Double
    
    /**
      * To category of the guide (in case the guide is for category axis).
      */
    var toCategory: String
    
    /**
      * To date of the guide (in case the guide is for category axis and parseDates is set to true).
      * If you have both date and toDate, the space between these two dates can be filled with color.
      */
    var toDate: js.Date
    
    /**
      * To value of the guide (in case the guide is for value axis).
      */
    var toValue: Double
    
    /**
      * Value of the guide (in case the guide is for value axis).
      */
    var value: Double
    
    /**
      * Value axis of a guide. As you can add guides directly to the chart,
      * you might need to specify which which value axis should be used.
      */
    var valueAxis: typings.amcharts.valueAxisMod.default
  }
  object Guide {
    
    inline def apply(
      above: Boolean,
      angle: Double,
      balloonColor: String,
      balloonText: String,
      boldLabel: Boolean,
      category: String,
      dashLength: Double,
      date: js.Date,
      expand: Boolean,
      fillAlpha: Double,
      fillColor: String,
      fontSize: String,
      id: String,
      inside: Boolean,
      label: String,
      labelRotation: Double,
      lineAlpha: Double,
      lineColor: String,
      lineThickness: Double,
      position: String,
      tickLength: Double,
      toAngle: Double,
      toCategory: String,
      toDate: js.Date,
      toValue: Double,
      value: Double,
      valueAxis: typings.amcharts.valueAxisMod.default
    ): Guide = {
      val __obj = js.Dynamic.literal(above = above.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], balloonColor = balloonColor.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], boldLabel = boldLabel.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], lineAlpha = lineAlpha.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], lineThickness = lineThickness.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], toAngle = toAngle.asInstanceOf[js.Any], toCategory = toCategory.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAxis = valueAxis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guide]
    }
    
    extension [Self <: Guide](x: Self) {
      
      inline def setAbove(value: Boolean): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setBalloonColor(value: String): Self = StObject.set(x, "balloonColor", value.asInstanceOf[js.Any])
      
      inline def setBalloonText(value: String): Self = StObject.set(x, "balloonText", value.asInstanceOf[js.Any])
      
      inline def setBoldLabel(value: Boolean): Self = StObject.set(x, "boldLabel", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setDashLength(value: Double): Self = StObject.set(x, "dashLength", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInside(value: Boolean): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      inline def setLineAlpha(value: Double): Self = StObject.set(x, "lineAlpha", value.asInstanceOf[js.Any])
      
      inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      inline def setLineThickness(value: Double): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
      
      inline def setToAngle(value: Double): Self = StObject.set(x, "toAngle", value.asInstanceOf[js.Any])
      
      inline def setToCategory(value: String): Self = StObject.set(x, "toCategory", value.asInstanceOf[js.Any])
      
      inline def setToDate(value: js.Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToValue(value: Double): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueAxis(value: typings.amcharts.valueAxisMod.default): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    }
  }
}

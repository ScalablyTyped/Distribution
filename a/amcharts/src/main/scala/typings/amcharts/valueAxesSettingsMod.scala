package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueAxesSettingsMod {
  
  @JSImport("amcharts/ValueAxesSettings", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ValueAxesSettings {
    
    /**
      * Specifies whether number for gridCount is specified automatically, according to the axis size.
      * @default true
      */
    /* CompleteClass */
    var autoGridCount: Boolean = js.native
    
    /**
      * Axis opacity.
      */
    /* CompleteClass */
    var axisAlpha: Double = js.native
    
    /**
      * Axis color.
      */
    /* CompleteClass */
    var axisColor: String = js.native
    
    /**
      * Thickness of the axis.
      */
    /* CompleteClass */
    var axisThickness: Double = js.native
    
    /**
      * Label color.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Length of a dash. By default, the grid line is not dashed.
      */
    /* CompleteClass */
    var dashLength: Double = js.native
    
    /**
      * Fill opacity. Every second space between grid lines can be filled with color.
      */
    /* CompleteClass */
    var fillAlpha: Double = js.native
    
    /**
      * Fill color. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      */
    /* CompleteClass */
    var fillColor: String = js.native
    
    /**
      * Opacity of grid lines.
      */
    /* CompleteClass */
    var gridAlpha: Double = js.native
    
    /**
      * Color of grid lines.
      */
    /* CompleteClass */
    var gridColor: String = js.native
    
    /**
      * Approximate number of grid lines. autoGridCount should be set to false,
      * otherwise this property will be ignored.
      */
    /* CompleteClass */
    var gridCount: Double = js.native
    
    /**
      * Thickness of grid lines.
      */
    /* CompleteClass */
    var gridThickness: Double = js.native
    
    /**
      * Specifies whether guide values should be included when calculating min and max of the axis.
      */
    /* CompleteClass */
    var includeGuidesInMinMax: Boolean = js.native
    
    /**
      * If true, the axis will include hidden graphs when calculating min and max values.
      */
    /* CompleteClass */
    var includeHidden: Boolean = js.native
    
    /**
      * Specifies whether values should be placed inside or outside plot area.
      * In case you set this to false, you'll have to adjust marginLeft or marginRight in
      * [[PanelsSettings]] in order labels to be visible.
      * @default true
      */
    /* CompleteClass */
    var inside: Boolean = js.native
    
    /**
      * Specifies whether values on axis can only be integers or both integers and doubles.
      */
    /* CompleteClass */
    var integersOnly: Boolean = js.native
    
    /**
      * Frequency at which labels should be placed.
      */
    /* CompleteClass */
    var labelFrequency: Double = js.native
    
    /**
      * Specifies whether value labels are displayed.
      */
    /* CompleteClass */
    var labelsEnabled: Boolean = js.native
    
    /**
      * Set to true if value axis is logarithmic, false otherwise.
      */
    /* CompleteClass */
    var logarithmic: Boolean = js.native
    
    /**
      * The distance of the axis to the plot area, in pixels. Useful if you have more then one axis on the same side.
      */
    /* CompleteClass */
    var offset: Double = js.native
    
    /**
      * Position of the value axis. Possible values are "left" and "right".
      */
    /* CompleteClass */
    var position: String = js.native
    
    /**
      * Set to true if value axis is reversed (smaller values on top), false otherwise.
      */
    /* CompleteClass */
    var reversed: Boolean = js.native
    
    /**
      * Specifies if first label of value axis should be displayed.
      */
    /* CompleteClass */
    var showFirstLabel: Boolean = js.native
    
    /**
      * Specifies if last label of value axis should be displayed.
      */
    /* CompleteClass */
    var showLastLabel: Boolean = js.native
    
    /**
      * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
      */
    /* CompleteClass */
    var stackType: String = js.native
    
    /**
      * Tick length.
      */
    /* CompleteClass */
    var tickLength: Double = js.native
    
    /**
      * Unit which will be added to the value label.
      */
    /* CompleteClass */
    var unit: String = js.native
    
    /**
      * Position of the unit. Possible values are "left" or "right".
      */
    /* CompleteClass */
    var unitPosition: String = js.native
  }
  
  trait ValueAxesSettings extends StObject {
    
    /**
      * Specifies whether number for gridCount is specified automatically, according to the axis size.
      * @default true
      */
    var autoGridCount: Boolean
    
    /**
      * Axis opacity.
      */
    var axisAlpha: Double
    
    /**
      * Axis color.
      */
    var axisColor: String
    
    /**
      * Thickness of the axis.
      */
    var axisThickness: Double
    
    /**
      * Label color.
      */
    var color: String
    
    /**
      * Length of a dash. By default, the grid line is not dashed.
      */
    var dashLength: Double
    
    /**
      * Fill opacity. Every second space between grid lines can be filled with color.
      */
    var fillAlpha: Double
    
    /**
      * Fill color. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      */
    var fillColor: String
    
    /**
      * Opacity of grid lines.
      */
    var gridAlpha: Double
    
    /**
      * Color of grid lines.
      */
    var gridColor: String
    
    /**
      * Approximate number of grid lines. autoGridCount should be set to false,
      * otherwise this property will be ignored.
      */
    var gridCount: Double
    
    /**
      * Thickness of grid lines.
      */
    var gridThickness: Double
    
    /**
      * Specifies whether guide values should be included when calculating min and max of the axis.
      */
    var includeGuidesInMinMax: Boolean
    
    /**
      * If true, the axis will include hidden graphs when calculating min and max values.
      */
    var includeHidden: Boolean
    
    /**
      * Specifies whether values should be placed inside or outside plot area.
      * In case you set this to false, you'll have to adjust marginLeft or marginRight in
      * [[PanelsSettings]] in order labels to be visible.
      * @default true
      */
    var inside: Boolean
    
    /**
      * Specifies whether values on axis can only be integers or both integers and doubles.
      */
    var integersOnly: Boolean
    
    /**
      * Frequency at which labels should be placed.
      */
    var labelFrequency: Double
    
    /**
      * Specifies whether value labels are displayed.
      */
    var labelsEnabled: Boolean
    
    /**
      * Set to true if value axis is logarithmic, false otherwise.
      */
    var logarithmic: Boolean
    
    /**
      * The distance of the axis to the plot area, in pixels. Useful if you have more then one axis on the same side.
      */
    var offset: Double
    
    /**
      * Position of the value axis. Possible values are "left" and "right".
      */
    var position: String
    
    /**
      * Set to true if value axis is reversed (smaller values on top), false otherwise.
      */
    var reversed: Boolean
    
    /**
      * Specifies if first label of value axis should be displayed.
      */
    var showFirstLabel: Boolean
    
    /**
      * Specifies if last label of value axis should be displayed.
      */
    var showLastLabel: Boolean
    
    /**
      * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
      */
    var stackType: String
    
    /**
      * Tick length.
      */
    var tickLength: Double
    
    /**
      * Unit which will be added to the value label.
      */
    var unit: String
    
    /**
      * Position of the unit. Possible values are "left" or "right".
      */
    var unitPosition: String
  }
  object ValueAxesSettings {
    
    @scala.inline
    def apply(
      autoGridCount: Boolean,
      axisAlpha: Double,
      axisColor: String,
      axisThickness: Double,
      color: String,
      dashLength: Double,
      fillAlpha: Double,
      fillColor: String,
      gridAlpha: Double,
      gridColor: String,
      gridCount: Double,
      gridThickness: Double,
      includeGuidesInMinMax: Boolean,
      includeHidden: Boolean,
      inside: Boolean,
      integersOnly: Boolean,
      labelFrequency: Double,
      labelsEnabled: Boolean,
      logarithmic: Boolean,
      offset: Double,
      position: String,
      reversed: Boolean,
      showFirstLabel: Boolean,
      showLastLabel: Boolean,
      stackType: String,
      tickLength: Double,
      unit: String,
      unitPosition: String
    ): ValueAxesSettings = {
      val __obj = js.Dynamic.literal(autoGridCount = autoGridCount.asInstanceOf[js.Any], axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridThickness = gridThickness.asInstanceOf[js.Any], includeGuidesInMinMax = includeGuidesInMinMax.asInstanceOf[js.Any], includeHidden = includeHidden.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], integersOnly = integersOnly.asInstanceOf[js.Any], labelFrequency = labelFrequency.asInstanceOf[js.Any], labelsEnabled = labelsEnabled.asInstanceOf[js.Any], logarithmic = logarithmic.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], showFirstLabel = showFirstLabel.asInstanceOf[js.Any], showLastLabel = showLastLabel.asInstanceOf[js.Any], stackType = stackType.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unitPosition = unitPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueAxesSettings]
    }
    
    @scala.inline
    implicit class ValueAxesSettingsMutableBuilder[Self <: ValueAxesSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoGridCount(value: Boolean): Self = StObject.set(x, "autoGridCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisAlpha(value: Double): Self = StObject.set(x, "axisAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisColor(value: String): Self = StObject.set(x, "axisColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisThickness(value: Double): Self = StObject.set(x, "axisThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashLength(value: Double): Self = StObject.set(x, "dashLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAlpha(value: Double): Self = StObject.set(x, "gridAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColor(value: String): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCount(value: Double): Self = StObject.set(x, "gridCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridThickness(value: Double): Self = StObject.set(x, "gridThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeGuidesInMinMax(value: Boolean): Self = StObject.set(x, "includeGuidesInMinMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeHidden(value: Boolean): Self = StObject.set(x, "includeHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInside(value: Boolean): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegersOnly(value: Boolean): Self = StObject.set(x, "integersOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFrequency(value: Double): Self = StObject.set(x, "labelFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsEnabled(value: Boolean): Self = StObject.set(x, "labelsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogarithmic(value: Boolean): Self = StObject.set(x, "logarithmic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFirstLabel(value: Boolean): Self = StObject.set(x, "showFirstLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLastLabel(value: Boolean): Self = StObject.set(x, "showLastLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackType(value: String): Self = StObject.set(x, "stackType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitPosition(value: String): Self = StObject.set(x, "unitPosition", value.asInstanceOf[js.Any])
    }
  }
}

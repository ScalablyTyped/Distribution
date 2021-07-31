package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisBaseMod {
  
  @JSImport("amcharts/AxisBase", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with AxisBase {
    
    /**
      * Adds guide to the axis.
      */
    /* CompleteClass */
    override def addGuide(guide: typings.amcharts.guideMod.default): Unit = js.native
    
    /**
      * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
      * @default true
      */
    /* CompleteClass */
    var autoGridCount: Boolean = js.native
    
    /**
      * Axis opacity. Value range is 0 - 1.
      * @default 1
      */
    /* CompleteClass */
    var axisAlpha: Double = js.native
    
    /**
      * Axis color.  #000000
      */
    /* CompleteClass */
    var axisColor: String = js.native
    
    /**
      * Thickness of the axis.
      * @default 1
      */
    /* CompleteClass */
    var axisThickness: Double = js.native
    
    /**
      * Color of axis value labels. Will use chart's color if not set.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Length of a dash. 0 means line is not dashed.
      */
    /* CompleteClass */
    var dashLength: Double = js.native
    
    /**
      * Fill opacity. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      */
    /* CompleteClass */
    var fillAlpha: Double = js.native
    
    /**
      * Fill color. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      * @default "#FFFFFF"
      */
    /* CompleteClass */
    var fillColor: String = js.native
    
    /**
      * Size of value labels text. Will use chart's fontSize if not set.
      */
    /* CompleteClass */
    var fontSize: String = js.native
    
    /**
      * Opacity of grid lines. 0.2
      */
    /* CompleteClass */
    var gridAlpha: Double = js.native
    
    /**
      * Color of grid lines. #000000
      */
    /* CompleteClass */
    var gridColor: String = js.native
    
    /**
      * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
      * the number is approximate. The default value is 5. If you set autoGridCount to true,
      * this property is ignored.
      * @default 5
      */
    /* CompleteClass */
    var gridCount: Double = js.native
    
    /**
      * Thickness of grid lines.
      * @default 1
      */
    /* CompleteClass */
    var gridThickness: Double = js.native
    
    /**
      * The array of guides belonging to this axis.
      */
    /* CompleteClass */
    var guides: js.Array[js.Any] = js.native
    
    /**
      * If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin,
      * set ignoreAxisWidth to true.
      */
    /* CompleteClass */
    var ignoreAxisWidth: Boolean = js.native
    
    /**
      * Specifies whether values should be placed inside or outside plot area.
      */
    /* CompleteClass */
    var inside: Boolean = js.native
    
    /**
      * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
      * @default 1
      */
    /* CompleteClass */
    var labelFrequency: Double = js.native
    
    /**
      * Rotation angle of a label. Only horizontal axis' values can be rotated.
      * If you set this for vertical axis, the setting will be ignored.
      */
    /* CompleteClass */
    var labelRotation: Double = js.native
    
    /**
      * Specifies whether axis displays category axis' labels and value axis' values.
      * @default true
      */
    /* CompleteClass */
    var labelsEnabled: Boolean = js.native
    
    /**
      * The distance of the axis to the plot area, in pixels. Negative values can also be used.
      */
    /* CompleteClass */
    var offset: Double = js.native
    
    /**
      * Possible values are: "top", "bottom", "left", "right".
      * If axis is vertical, default position is "left".
      * If axis is horizontal, default position is "bottom".
      */
    /* CompleteClass */
    var position: String = js.native
    
    /**
      * Removes guide from the axis.
      */
    /* CompleteClass */
    override def removeGuide(guide: typings.amcharts.guideMod.default): Unit = js.native
    
    /**
      * Whether to show first axis label or not.
      * @default true
      */
    /* CompleteClass */
    var showFirstLabel: Boolean = js.native
    
    /**
      * Whether to show last axis label or not.
      * @default true
      */
    /* CompleteClass */
    var showLastLabel: Boolean = js.native
    
    /**
      * Length of the tick marks.
      * @default 5
      */
    /* CompleteClass */
    var tickLength: Double = js.native
    
    /**
      * Title of the axis.
      */
    /* CompleteClass */
    var title: String = js.native
    
    /**
      * Specifies if title should be bold or not.
      * @default true
      */
    /* CompleteClass */
    var titleBold: Boolean = js.native
    
    /**
      * Color of axis title. Will use text color of chart if not set any.
      */
    /* CompleteClass */
    var titleColor: String = js.native
    
    /**
      * Font size of axis title. Will use font size of chart plus two pixels if not set any.
      */
    /* CompleteClass */
    var titlefontSize: String = js.native
  }
  
  trait AxisBase extends StObject {
    
    /**
      * Adds guide to the axis.
      */
    def addGuide(guide: typings.amcharts.guideMod.default): Unit
    
    /**
      * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
      * @default true
      */
    var autoGridCount: Boolean
    
    /**
      * Axis opacity. Value range is 0 - 1.
      * @default 1
      */
    var axisAlpha: Double
    
    /**
      * Axis color.  #000000
      */
    var axisColor: String
    
    /**
      * Thickness of the axis.
      * @default 1
      */
    var axisThickness: Double
    
    /**
      * Color of axis value labels. Will use chart's color if not set.
      */
    var color: String
    
    /**
      * Length of a dash. 0 means line is not dashed.
      */
    var dashLength: Double
    
    /**
      * Fill opacity. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      */
    var fillAlpha: Double
    
    /**
      * Fill color. Every second space between grid lines can be filled with color.
      * Set fillAlpha to a value greater than 0 to see the fills.
      * @default "#FFFFFF"
      */
    var fillColor: String
    
    /**
      * Size of value labels text. Will use chart's fontSize if not set.
      */
    var fontSize: String
    
    /**
      * Opacity of grid lines. 0.2
      */
    var gridAlpha: Double
    
    /**
      * Color of grid lines. #000000
      */
    var gridColor: String
    
    /**
      * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
      * the number is approximate. The default value is 5. If you set autoGridCount to true,
      * this property is ignored.
      * @default 5
      */
    var gridCount: Double
    
    /**
      * Thickness of grid lines.
      * @default 1
      */
    var gridThickness: Double
    
    /**
      * The array of guides belonging to this axis.
      */
    var guides: js.Array[js.Any]
    
    /**
      * If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin,
      * set ignoreAxisWidth to true.
      */
    var ignoreAxisWidth: Boolean
    
    /**
      * Specifies whether values should be placed inside or outside plot area.
      */
    var inside: Boolean
    
    /**
      * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
      * @default 1
      */
    var labelFrequency: Double
    
    /**
      * Rotation angle of a label. Only horizontal axis' values can be rotated.
      * If you set this for vertical axis, the setting will be ignored.
      */
    var labelRotation: Double
    
    /**
      * Specifies whether axis displays category axis' labels and value axis' values.
      * @default true
      */
    var labelsEnabled: Boolean
    
    /**
      * The distance of the axis to the plot area, in pixels. Negative values can also be used.
      */
    var offset: Double
    
    /**
      * Possible values are: "top", "bottom", "left", "right".
      * If axis is vertical, default position is "left".
      * If axis is horizontal, default position is "bottom".
      */
    var position: String
    
    /**
      * Removes guide from the axis.
      */
    def removeGuide(guide: typings.amcharts.guideMod.default): Unit
    
    /**
      * Whether to show first axis label or not.
      * @default true
      */
    var showFirstLabel: Boolean
    
    /**
      * Whether to show last axis label or not.
      * @default true
      */
    var showLastLabel: Boolean
    
    /**
      * Length of the tick marks.
      * @default 5
      */
    var tickLength: Double
    
    /**
      * Title of the axis.
      */
    var title: String
    
    /**
      * Specifies if title should be bold or not.
      * @default true
      */
    var titleBold: Boolean
    
    /**
      * Color of axis title. Will use text color of chart if not set any.
      */
    var titleColor: String
    
    /**
      * Font size of axis title. Will use font size of chart plus two pixels if not set any.
      */
    var titlefontSize: String
  }
  object AxisBase {
    
    @scala.inline
    def apply(
      addGuide: typings.amcharts.guideMod.default => Unit,
      autoGridCount: Boolean,
      axisAlpha: Double,
      axisColor: String,
      axisThickness: Double,
      color: String,
      dashLength: Double,
      fillAlpha: Double,
      fillColor: String,
      fontSize: String,
      gridAlpha: Double,
      gridColor: String,
      gridCount: Double,
      gridThickness: Double,
      guides: js.Array[js.Any],
      ignoreAxisWidth: Boolean,
      inside: Boolean,
      labelFrequency: Double,
      labelRotation: Double,
      labelsEnabled: Boolean,
      offset: Double,
      position: String,
      removeGuide: typings.amcharts.guideMod.default => Unit,
      showFirstLabel: Boolean,
      showLastLabel: Boolean,
      tickLength: Double,
      title: String,
      titleBold: Boolean,
      titleColor: String,
      titlefontSize: String
    ): AxisBase = {
      val __obj = js.Dynamic.literal(addGuide = js.Any.fromFunction1(addGuide), autoGridCount = autoGridCount.asInstanceOf[js.Any], axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridThickness = gridThickness.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any], ignoreAxisWidth = ignoreAxisWidth.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], labelFrequency = labelFrequency.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], labelsEnabled = labelsEnabled.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeGuide = js.Any.fromFunction1(removeGuide), showFirstLabel = showFirstLabel.asInstanceOf[js.Any], showLastLabel = showLastLabel.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleBold = titleBold.asInstanceOf[js.Any], titleColor = titleColor.asInstanceOf[js.Any], titlefontSize = titlefontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisBase]
    }
    
    @scala.inline
    implicit class AxisBaseMutableBuilder[Self <: AxisBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddGuide(value: typings.amcharts.guideMod.default => Unit): Self = StObject.set(x, "addGuide", js.Any.fromFunction1(value))
      
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
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAlpha(value: Double): Self = StObject.set(x, "gridAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColor(value: String): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCount(value: Double): Self = StObject.set(x, "gridCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridThickness(value: Double): Self = StObject.set(x, "gridThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuides(value: js.Array[js.Any]): Self = StObject.set(x, "guides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuidesVarargs(value: js.Any*): Self = StObject.set(x, "guides", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreAxisWidth(value: Boolean): Self = StObject.set(x, "ignoreAxisWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInside(value: Boolean): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFrequency(value: Double): Self = StObject.set(x, "labelFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelRotation(value: Double): Self = StObject.set(x, "labelRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsEnabled(value: Boolean): Self = StObject.set(x, "labelsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveGuide(value: typings.amcharts.guideMod.default => Unit): Self = StObject.set(x, "removeGuide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowFirstLabel(value: Boolean): Self = StObject.set(x, "showFirstLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLastLabel(value: Boolean): Self = StObject.set(x, "showLastLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBold(value: Boolean): Self = StObject.set(x, "titleBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlefontSize(value: String): Self = StObject.set(x, "titlefontSize", value.asInstanceOf[js.Any])
    }
  }
}

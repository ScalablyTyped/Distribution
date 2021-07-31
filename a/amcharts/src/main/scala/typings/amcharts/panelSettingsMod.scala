package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelSettingsMod {
  
  @JSImport("amcharts/PanelSettings", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PanelsSettings {
    
    /**
      * The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D" is > 0).
      */
    /* CompleteClass */
    var angle: Double = js.native
    
    /**
      * Opacity of panel background. Possible values are 1 and 0. Values like 0.5 will not make it half-transparent.
      */
    /* CompleteClass */
    var backgroundAlpha: Double = js.native
    
    /**
      * Background color of panels. Set backgroundAlpha to > 0 value in order to make background visible.
      * @default "#FFFFFF"
      */
    /* CompleteClass */
    var backgroundColor: String = js.native
    
    /**
      * The gap in pixels between two columns of the same category.
      */
    /* CompleteClass */
    var columnSpacing: Double = js.native
    
    /**
      * Relative width of columns. Valid values 0 - 1.
      */
    /* CompleteClass */
    var columnWidth: Double = js.native
    
    /**
      * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is > 0).
      */
    /* CompleteClass */
    var depth3D: Double = js.native
    
    /**
      * Font family.
      */
    /* CompleteClass */
    var fontFamily: String = js.native
    
    /**
      * Font size.
      */
    /* CompleteClass */
    var fontSize: String = js.native
    
    /**
      * Number of pixels between the container's bottom border and plot area.
      * @default 1
      */
    /* CompleteClass */
    var marginBottom: Double = js.native
    
    /**
      * Number of pixels between the container's left border and plot area.
      * If your left valueAxis values ar not placed inside the plot area,
      * you should set marginLeft to 80 or some close value.
      */
    /* CompleteClass */
    var marginLeft: Double = js.native
    
    /**
      * Number of pixels between the container's left border and plot area.
      * If your right valueAxis values ar not placed inside the plot area,
      * you should set marginRight to 80 or some close value.
      */
    /* CompleteClass */
    var marginRight: Double = js.native
    
    /**
      * Number of pixels between the container's top border and plot area.
      */
    /* CompleteClass */
    var marginTop: Double = js.native
    
    /**
      * This setting affects touch-screen devices only.
      * If a chart is on a page, and panEventsEnabled are set to true,
      * the page won't move if the user touches the chart first.
      * If a chart is big enough and occupies all the screen of your touch device,
      * the user won’t be able to move the page at all. That's why the default value is "false".
      * If you think that selecting or or panning the chart is a primary purpose of your chart users,
      * you should set panEventsEnabled to true.
      */
    /* CompleteClass */
    var panEventsEnabled: Boolean = js.native
    
    /**
      * Gap between panels.
      * @default 8
      */
    /* CompleteClass */
    var panelSpacing: Double = js.native
    
    /**
      * The opacity of plot area's border.
      */
    /* CompleteClass */
    var plotAreaBorderAlpha: Double = js.native
    
    /**
      * The color of the plot area's border.
      */
    /* CompleteClass */
    var plotAreaBorderColor: String = js.native
    
    /**
      * Opacity of plot area fill.
      */
    /* CompleteClass */
    var plotAreaFillAlphas: Double = js.native
    
    /**
      * Specifies the colors used to tint the background gradient fill of the plot area. String or Array of Strings
      */
    /* CompleteClass */
    var plotAreaFillColors: js.Any = js.native
    
    /**
      * Prefixes which are used to make big numbers shorter: 2M instead of 2000000, etc.
      * Prefixes are used on value axes and in the legend.
      * To enable prefixes, set usePrefixes property to true.
      * [
      *     {number:1e+3,prefix:"k"},
      *     {number:1e+6,prefix:"M"},
      *     {number:1e+9,prefix:"G"},
      *     {number:1e+12,prefix:"T"},
      *     {number:1e+15,prefix:"P"},
      *     {number:1e+18,prefix:"E"},
      *     {number:1e+21,prefix:"Z"},
      *     {number:1e+24,prefix:"Y"}
      * ]
      */
    /* CompleteClass */
    var prefixesOfBigNumbers: js.Array[js.Any] = js.native
    
    /**
      * Prefixes which are used to make small numbers shorter: 2μ instead of 0.000002, etc.
      * Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes property to true.
      * [
      *     {number:1e-24, prefix:"y"},
      *     {number:1e-21, prefix:"z"},
      *     {number:1e-18, prefix:"a"},
      *     {number:1e-15, prefix:"f"},
      *     {number:1e-12, prefix:"p"},
      *     {number:1e-9, prefix:"n"},
      *     {number:1e-6, prefix:"μ"},
      *     {number:1e-3, prefix:"m"}
      * ]
      */
    /* CompleteClass */
    var prefixesOfSmallNumbers: js.Array[js.Any] = js.native
    
    /**
      * Specifies whether the animation should be sequenced or all objects should appear at once.
      */
    /* CompleteClass */
    var sequencedAnimation: Boolean = js.native
    
    /**
      * The initial opacity of the column/line.
      * If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha.
      */
    /* CompleteClass */
    var startAlpha: Double = js.native
    
    /**
      * Duration of the animation, in seconds.
      */
    /* CompleteClass */
    var startDuration: Double = js.native
    
    /**
      * Possible values are: "linear", "<", ">" "<>", "elastic", "bounce".
      */
    /* CompleteClass */
    var startEffect: String = js.native
    
    /**
      * If true, prefixes will be used for big and small numbers.
      */
    /* CompleteClass */
    var usePrefixes: Boolean = js.native
  }
  
  trait PanelsSettings extends StObject {
    
    /**
      * The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D" is > 0).
      */
    var angle: Double
    
    /**
      * Opacity of panel background. Possible values are 1 and 0. Values like 0.5 will not make it half-transparent.
      */
    var backgroundAlpha: Double
    
    /**
      * Background color of panels. Set backgroundAlpha to > 0 value in order to make background visible.
      * @default "#FFFFFF"
      */
    var backgroundColor: String
    
    /**
      * The gap in pixels between two columns of the same category.
      */
    var columnSpacing: Double
    
    /**
      * Relative width of columns. Valid values 0 - 1.
      */
    var columnWidth: Double
    
    /**
      * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is > 0).
      */
    var depth3D: Double
    
    /**
      * Font family.
      */
    var fontFamily: String
    
    /**
      * Font size.
      */
    var fontSize: String
    
    /**
      * Number of pixels between the container's bottom border and plot area.
      * @default 1
      */
    var marginBottom: Double
    
    /**
      * Number of pixels between the container's left border and plot area.
      * If your left valueAxis values ar not placed inside the plot area,
      * you should set marginLeft to 80 or some close value.
      */
    var marginLeft: Double
    
    /**
      * Number of pixels between the container's left border and plot area.
      * If your right valueAxis values ar not placed inside the plot area,
      * you should set marginRight to 80 or some close value.
      */
    var marginRight: Double
    
    /**
      * Number of pixels between the container's top border and plot area.
      */
    var marginTop: Double
    
    /**
      * This setting affects touch-screen devices only.
      * If a chart is on a page, and panEventsEnabled are set to true,
      * the page won't move if the user touches the chart first.
      * If a chart is big enough and occupies all the screen of your touch device,
      * the user won’t be able to move the page at all. That's why the default value is "false".
      * If you think that selecting or or panning the chart is a primary purpose of your chart users,
      * you should set panEventsEnabled to true.
      */
    var panEventsEnabled: Boolean
    
    /**
      * Gap between panels.
      * @default 8
      */
    var panelSpacing: Double
    
    /**
      * The opacity of plot area's border.
      */
    var plotAreaBorderAlpha: Double
    
    /**
      * The color of the plot area's border.
      */
    var plotAreaBorderColor: String
    
    /**
      * Opacity of plot area fill.
      */
    var plotAreaFillAlphas: Double
    
    /**
      * Specifies the colors used to tint the background gradient fill of the plot area. String or Array of Strings
      */
    var plotAreaFillColors: js.Any
    
    /**
      * Prefixes which are used to make big numbers shorter: 2M instead of 2000000, etc.
      * Prefixes are used on value axes and in the legend.
      * To enable prefixes, set usePrefixes property to true.
      * [
      *     {number:1e+3,prefix:"k"},
      *     {number:1e+6,prefix:"M"},
      *     {number:1e+9,prefix:"G"},
      *     {number:1e+12,prefix:"T"},
      *     {number:1e+15,prefix:"P"},
      *     {number:1e+18,prefix:"E"},
      *     {number:1e+21,prefix:"Z"},
      *     {number:1e+24,prefix:"Y"}
      * ]
      */
    var prefixesOfBigNumbers: js.Array[js.Any]
    
    /**
      * Prefixes which are used to make small numbers shorter: 2μ instead of 0.000002, etc.
      * Prefixes are used on value axes and in the legend. To enable prefixes, set usePrefixes property to true.
      * [
      *     {number:1e-24, prefix:"y"},
      *     {number:1e-21, prefix:"z"},
      *     {number:1e-18, prefix:"a"},
      *     {number:1e-15, prefix:"f"},
      *     {number:1e-12, prefix:"p"},
      *     {number:1e-9, prefix:"n"},
      *     {number:1e-6, prefix:"μ"},
      *     {number:1e-3, prefix:"m"}
      * ]
      */
    var prefixesOfSmallNumbers: js.Array[js.Any]
    
    /**
      * Specifies whether the animation should be sequenced or all objects should appear at once.
      */
    var sequencedAnimation: Boolean
    
    /**
      * The initial opacity of the column/line.
      * If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha.
      */
    var startAlpha: Double
    
    /**
      * Duration of the animation, in seconds.
      */
    var startDuration: Double
    
    /**
      * Possible values are: "linear", "<", ">" "<>", "elastic", "bounce".
      */
    var startEffect: String
    
    /**
      * If true, prefixes will be used for big and small numbers.
      */
    var usePrefixes: Boolean
  }
  object PanelsSettings {
    
    @scala.inline
    def apply(
      angle: Double,
      backgroundAlpha: Double,
      backgroundColor: String,
      columnSpacing: Double,
      columnWidth: Double,
      depth3D: Double,
      fontFamily: String,
      fontSize: String,
      marginBottom: Double,
      marginLeft: Double,
      marginRight: Double,
      marginTop: Double,
      panEventsEnabled: Boolean,
      panelSpacing: Double,
      plotAreaBorderAlpha: Double,
      plotAreaBorderColor: String,
      plotAreaFillAlphas: Double,
      plotAreaFillColors: js.Any,
      prefixesOfBigNumbers: js.Array[js.Any],
      prefixesOfSmallNumbers: js.Array[js.Any],
      sequencedAnimation: Boolean,
      startAlpha: Double,
      startDuration: Double,
      startEffect: String,
      usePrefixes: Boolean
    ): PanelsSettings = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], columnSpacing = columnSpacing.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], depth3D = depth3D.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], panEventsEnabled = panEventsEnabled.asInstanceOf[js.Any], panelSpacing = panelSpacing.asInstanceOf[js.Any], plotAreaBorderAlpha = plotAreaBorderAlpha.asInstanceOf[js.Any], plotAreaBorderColor = plotAreaBorderColor.asInstanceOf[js.Any], plotAreaFillAlphas = plotAreaFillAlphas.asInstanceOf[js.Any], plotAreaFillColors = plotAreaFillColors.asInstanceOf[js.Any], prefixesOfBigNumbers = prefixesOfBigNumbers.asInstanceOf[js.Any], prefixesOfSmallNumbers = prefixesOfSmallNumbers.asInstanceOf[js.Any], sequencedAnimation = sequencedAnimation.asInstanceOf[js.Any], startAlpha = startAlpha.asInstanceOf[js.Any], startDuration = startDuration.asInstanceOf[js.Any], startEffect = startEffect.asInstanceOf[js.Any], usePrefixes = usePrefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelsSettings]
    }
    
    @scala.inline
    implicit class PanelsSettingsMutableBuilder[Self <: PanelsSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSpacing(value: Double): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth3D(value: Double): Self = StObject.set(x, "depth3D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanEventsEnabled(value: Boolean): Self = StObject.set(x, "panEventsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelSpacing(value: Double): Self = StObject.set(x, "panelSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlotAreaBorderAlpha(value: Double): Self = StObject.set(x, "plotAreaBorderAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlotAreaBorderColor(value: String): Self = StObject.set(x, "plotAreaBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlotAreaFillAlphas(value: Double): Self = StObject.set(x, "plotAreaFillAlphas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlotAreaFillColors(value: js.Any): Self = StObject.set(x, "plotAreaFillColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixesOfBigNumbers(value: js.Array[js.Any]): Self = StObject.set(x, "prefixesOfBigNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixesOfBigNumbersVarargs(value: js.Any*): Self = StObject.set(x, "prefixesOfBigNumbers", js.Array(value :_*))
      
      @scala.inline
      def setPrefixesOfSmallNumbers(value: js.Array[js.Any]): Self = StObject.set(x, "prefixesOfSmallNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixesOfSmallNumbersVarargs(value: js.Any*): Self = StObject.set(x, "prefixesOfSmallNumbers", js.Array(value :_*))
      
      @scala.inline
      def setSequencedAnimation(value: Boolean): Self = StObject.set(x, "sequencedAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAlpha(value: Double): Self = StObject.set(x, "startAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDuration(value: Double): Self = StObject.set(x, "startDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEffect(value: String): Self = StObject.set(x, "startEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePrefixes(value: Boolean): Self = StObject.set(x, "usePrefixes", value.asInstanceOf[js.Any])
    }
  }
}

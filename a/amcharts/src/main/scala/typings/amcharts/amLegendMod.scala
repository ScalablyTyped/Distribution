package typings.amcharts

import typings.amcharts.anon.DataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amLegendMod {
  
  @JSImport("amcharts/AmLegend", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with AmLegend {
    
    /**
      * Adds event listener of the type "clickLabel" or "clickMarker" or "hideItem" to the object.
      * @param type Either "clickLabel" or "clickMarker" or "hideItem".
      * @param handler The event handler.
      */
    /* CompleteClass */
    override def addListener(`type`: String, handler: js.Function1[/* e */ DataItem, Unit]): Unit = js.native
    
    /**
      * Alignment of legend entries. Possible values are: "left", "center", "right". left
      */
    /* CompleteClass */
    var align: String = js.native
    
    /**
      * Used if chart is Serial or XY.
      * In case true, margins of the legend are adjusted and made equal to chart's margins.
      * @default true
      */
    /* CompleteClass */
    var autoMargins: Boolean = js.native
    
    /**
      * Opacity of legend's background. Value range is 0 - 1
      */
    /* CompleteClass */
    var backgroundAlpha: Double = js.native
    
    /**
      * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
      * @default "#FFFFFF"
      */
    /* CompleteClass */
    var backgroundColor: String = js.native
    
    /**
      * Opacity of chart's border. Value range is 0 - 1.
      */
    /* CompleteClass */
    var borderAlpha: Double = js.native
    
    /**
      * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
      * @default "#000000"
      */
    /* CompleteClass */
    var borderColor: String = js.native
    
    /**
      * In case legend position is set to "absolute", you can set distance from bottom of the chart, in pixels.
      */
    /* CompleteClass */
    var bottom: Double = js.native
    
    /**
      * Text color. Will use chart's color if not set.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * This can be used by AmMap only.
      * You can pass array of objects with title, color, markerType values, for example:
      * [{title: "One", color: "#3366CC"},{title: "Two", color: "#FFCC33"}]
      */
    /* CompleteClass */
    var data: js.Array[js.Any] = js.native
    
    /**
      * Specifies if each of legend entry should be equal to the most wide entry.
      * Won't look good if legend has more than one line.
      * @default true
      */
    /* CompleteClass */
    var equalWidths: Boolean = js.native
    
    /**
      * Font size. Will use chart's font size if not set.
      */
    /* CompleteClass */
    var fontSize: String = js.native
    
    /**
      * Horizontal space between legend item and left/right border.
      */
    /* CompleteClass */
    var horizontalGap: Double = js.native
    
    /**
      * The text which will be displayed in the legend.
      * Tag [[title]] will be replaced with the title of the graph. [[title]]
      */
    /* CompleteClass */
    var labelText: String = js.native
    
    /**
      * In case legend position is set to "absolute", you can set distance from left side of the chart, in pixels.
      */
    /* CompleteClass */
    var left: Double = js.native
    
    /**
      * Bottom margin.
      */
    /* CompleteClass */
    var marginBottom: Double = js.native
    
    /**
      * Left margin.
      * This property will be ignored if chart is Serial or XY
      * and autoMargins property of the legend is true (default).
      * @default 20
      */
    /* CompleteClass */
    var marginLeft: Double = js.native
    
    /**
      * Right margin.
      * This property will be ignored if chart is Serial or XY
      * and autoMargins property of the legend is true (default).
      * @default 20
      */
    /* CompleteClass */
    var marginRight: Double = js.native
    
    /**
      * Top margin.
      */
    /* CompleteClass */
    var marginTop: Double = js.native
    
    /**
      * Marker border opacity 1.
      */
    /* CompleteClass */
    var markerBorderAlpha: Double = js.native
    
    /**
      * Marker border color. If not set, will use the same color as marker.
      */
    /* CompleteClass */
    var markerBorderColor: String = js.native
    
    /**
      * Thickness of the legend border.
      * The default value (0) means the line will be a "hairline" (1 px).
      * In case marker type is line, this style will be used for line thickness.
      * @default 1
      */
    /* CompleteClass */
    var markerBorderThickness: Double = js.native
    
    /**
      * The color of the disabled marker (when the graph is hidden). #AAB3B3
      */
    /* CompleteClass */
    var markerDisabledColor: String = js.native
    
    /**
      * Space between legend marker and legend text, in pixels.
      * @default 5
      */
    /* CompleteClass */
    var markerLabelGap: Double = js.native
    
    /**
      * Size of the legend marker (key).
      * @default 16
      */
    /* CompleteClass */
    var markerSize: Double = js.native
    
    /**
      * Shape of the legend marker (key).
      * Possible values are:
      * "square", "circle", "line", "dashedLine", "triangleUp", "triangleDown", "bubble", "none". square
      */
    /* CompleteClass */
    var markerType: String = js.native
    
    /**
      * Maximum number of columns in the legend.
      * If Legend's position is set to "right" or "left", maxColumns is automatically set to 1.
      */
    /* CompleteClass */
    var maxColumns: Double = js.native
    
    /**
      * Position of a legend. Possible values are: "bottom", "top", "left", "right" and "absolute".
      * In case "absolute", you should set left and top properties too. (this setting is ignored in Stock charts).
      * In case legend is used with AmMap, position is set to "absolute" automatically.  bottom
      */
    /* CompleteClass */
    var position: String = js.native
    
    /**
      * Removes event listener from chart object.
      */
    /* CompleteClass */
    override def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit = js.native
    
    /**
      * Specifies whether legend entries should be placed in reversed order.
      */
    /* CompleteClass */
    var reversedOrder: Boolean = js.native
    
    /**
      * In case legend position is set to "absolute", you can set distance from right side of the chart, in pixels.
      */
    /* CompleteClass */
    var right: Double = js.native
    
    /**
      * Legend item text color on roll-over.  #CC0000
      */
    /* CompleteClass */
    var rollOverColor: String = js.native
    
    /**
      * When you roll-over the legend entry, all other graphs can reduce their opacity,
      * so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs.
      * @default 1
      */
    /* CompleteClass */
    var rollOverGraphAlpha: Double = js.native
    
    /**
      * You can use this property to turn all the legend entries off.
      * @default true
      */
    /* CompleteClass */
    var showEntries: Boolean = js.native
    
    /**
      * Horizontal space between legend items, in pixels.
      * @default 10
      */
    /* CompleteClass */
    var spacing: Double = js.native
    
    /**
      * Legend switch color. #FFFFFF
      */
    /* CompleteClass */
    var switchColor: String = js.native
    
    /**
      * Legend switch type (in case the legend is switchable). Possible values are "x" and "v". x
      */
    /* CompleteClass */
    var switchType: String = js.native
    
    /**
      * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
      * In case legend is used with AmMap, this is set to false automatically.
      * @default true
      */
    /* CompleteClass */
    var switchable: Boolean = js.native
    
    /**
      * If true, clicking on the text will show/hide balloon of the graph.
      * Otherwise it will show/hide graph/slice, if switchable is set to true.
      */
    /* CompleteClass */
    var textClickEnabled: Boolean = js.native
    
    /**
      * In case legend position is set to "absolute", you can set distance from top of the chart, in pixels.
      */
    /* CompleteClass */
    var top: Double = js.native
    
    /**
      * Legend markers can mirror graph’s settings, displaying a line and a real bullet as in the graph itself.
      * Set this property to true if you want to enable this feature.
      * Note, if you set graph colors in dataProvider, they will not be reflected in the marker.
      * @default false
      */
    /* CompleteClass */
    var useGraphSettings: Boolean = js.native
    
    /**
      * Specifies if legend labels should be use same color as corresponding markers.
      */
    /* CompleteClass */
    var useMarkerColorForLabels: Boolean = js.native
    
    /**
      * Alignment of the value text. Possible values are "left" and "right". right
      */
    /* CompleteClass */
    var valueAlign: String = js.native
    
    /**
      * The text which will be displayed in the value portion of the legend.
      * You can use tags like
      * [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]. [[value]]
      */
    /* CompleteClass */
    var valueText: String = js.native
    
    /**
      * Width of the value text.
      * @default 80
      */
    /* CompleteClass */
    var valueWidth: Double = js.native
    
    /**
      * Vertical space between legend items also between legend border and first and last legend row.
      * @default: 10
      */
    /* CompleteClass */
    var verticalGap: Double = js.native
  }
  
  trait AmLegend extends StObject {
    
    /**
      * Adds event listener of the type "clickLabel" or "clickMarker" or "hideItem" to the object.
      * @param type Either "clickLabel" or "clickMarker" or "hideItem".
      * @param handler The event handler.
      */
    def addListener(`type`: String, handler: js.Function1[/* e */ DataItem, Unit]): Unit
    
    /**
      * Alignment of legend entries. Possible values are: "left", "center", "right". left
      */
    var align: String
    
    /**
      * Used if chart is Serial or XY.
      * In case true, margins of the legend are adjusted and made equal to chart's margins.
      * @default true
      */
    var autoMargins: Boolean
    
    /**
      * Opacity of legend's background. Value range is 0 - 1
      */
    var backgroundAlpha: Double
    
    /**
      * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
      * @default "#FFFFFF"
      */
    var backgroundColor: String
    
    /**
      * Opacity of chart's border. Value range is 0 - 1.
      */
    var borderAlpha: Double
    
    /**
      * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
      * @default "#000000"
      */
    var borderColor: String
    
    /**
      * In case legend position is set to "absolute", you can set distance from bottom of the chart, in pixels.
      */
    var bottom: Double
    
    /**
      * Text color. Will use chart's color if not set.
      */
    var color: String
    
    /**
      * This can be used by AmMap only.
      * You can pass array of objects with title, color, markerType values, for example:
      * [{title: "One", color: "#3366CC"},{title: "Two", color: "#FFCC33"}]
      */
    var data: js.Array[js.Any]
    
    /**
      * Specifies if each of legend entry should be equal to the most wide entry.
      * Won't look good if legend has more than one line.
      * @default true
      */
    var equalWidths: Boolean
    
    /**
      * Font size. Will use chart's font size if not set.
      */
    var fontSize: String
    
    /**
      * Horizontal space between legend item and left/right border.
      */
    var horizontalGap: Double
    
    /**
      * The text which will be displayed in the legend.
      * Tag [[title]] will be replaced with the title of the graph. [[title]]
      */
    var labelText: String
    
    /**
      * In case legend position is set to "absolute", you can set distance from left side of the chart, in pixels.
      */
    var left: Double
    
    /**
      * Bottom margin.
      */
    var marginBottom: Double
    
    /**
      * Left margin.
      * This property will be ignored if chart is Serial or XY
      * and autoMargins property of the legend is true (default).
      * @default 20
      */
    var marginLeft: Double
    
    /**
      * Right margin.
      * This property will be ignored if chart is Serial or XY
      * and autoMargins property of the legend is true (default).
      * @default 20
      */
    var marginRight: Double
    
    /**
      * Top margin.
      */
    var marginTop: Double
    
    /**
      * Marker border opacity 1.
      */
    var markerBorderAlpha: Double
    
    /**
      * Marker border color. If not set, will use the same color as marker.
      */
    var markerBorderColor: String
    
    /**
      * Thickness of the legend border.
      * The default value (0) means the line will be a "hairline" (1 px).
      * In case marker type is line, this style will be used for line thickness.
      * @default 1
      */
    var markerBorderThickness: Double
    
    /**
      * The color of the disabled marker (when the graph is hidden). #AAB3B3
      */
    var markerDisabledColor: String
    
    /**
      * Space between legend marker and legend text, in pixels.
      * @default 5
      */
    var markerLabelGap: Double
    
    /**
      * Size of the legend marker (key).
      * @default 16
      */
    var markerSize: Double
    
    /**
      * Shape of the legend marker (key).
      * Possible values are:
      * "square", "circle", "line", "dashedLine", "triangleUp", "triangleDown", "bubble", "none". square
      */
    var markerType: String
    
    /**
      * Maximum number of columns in the legend.
      * If Legend's position is set to "right" or "left", maxColumns is automatically set to 1.
      */
    var maxColumns: Double
    
    /**
      * Position of a legend. Possible values are: "bottom", "top", "left", "right" and "absolute".
      * In case "absolute", you should set left and top properties too. (this setting is ignored in Stock charts).
      * In case legend is used with AmMap, position is set to "absolute" automatically.  bottom
      */
    var position: String
    
    /**
      * Removes event listener from chart object.
      */
    def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit
    
    /**
      * Specifies whether legend entries should be placed in reversed order.
      */
    var reversedOrder: Boolean
    
    /**
      * In case legend position is set to "absolute", you can set distance from right side of the chart, in pixels.
      */
    var right: Double
    
    /**
      * Legend item text color on roll-over.  #CC0000
      */
    var rollOverColor: String
    
    /**
      * When you roll-over the legend entry, all other graphs can reduce their opacity,
      * so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs.
      * @default 1
      */
    var rollOverGraphAlpha: Double
    
    /**
      * You can use this property to turn all the legend entries off.
      * @default true
      */
    var showEntries: Boolean
    
    /**
      * Horizontal space between legend items, in pixels.
      * @default 10
      */
    var spacing: Double
    
    /**
      * Legend switch color. #FFFFFF
      */
    var switchColor: String
    
    /**
      * Legend switch type (in case the legend is switchable). Possible values are "x" and "v". x
      */
    var switchType: String
    
    /**
      * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
      * In case legend is used with AmMap, this is set to false automatically.
      * @default true
      */
    var switchable: Boolean
    
    /**
      * If true, clicking on the text will show/hide balloon of the graph.
      * Otherwise it will show/hide graph/slice, if switchable is set to true.
      */
    var textClickEnabled: Boolean
    
    /**
      * In case legend position is set to "absolute", you can set distance from top of the chart, in pixels.
      */
    var top: Double
    
    /**
      * Legend markers can mirror graph’s settings, displaying a line and a real bullet as in the graph itself.
      * Set this property to true if you want to enable this feature.
      * Note, if you set graph colors in dataProvider, they will not be reflected in the marker.
      * @default false
      */
    var useGraphSettings: Boolean
    
    /**
      * Specifies if legend labels should be use same color as corresponding markers.
      */
    var useMarkerColorForLabels: Boolean
    
    /**
      * Alignment of the value text. Possible values are "left" and "right". right
      */
    var valueAlign: String
    
    /**
      * The text which will be displayed in the value portion of the legend.
      * You can use tags like
      * [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]. [[value]]
      */
    var valueText: String
    
    /**
      * Width of the value text.
      * @default 80
      */
    var valueWidth: Double
    
    /**
      * Vertical space between legend items also between legend border and first and last legend row.
      * @default: 10
      */
    var verticalGap: Double
  }
  object AmLegend {
    
    inline def apply(
      addListener: (String, js.Function1[/* e */ DataItem, Unit]) => Unit,
      align: String,
      autoMargins: Boolean,
      backgroundAlpha: Double,
      backgroundColor: String,
      borderAlpha: Double,
      borderColor: String,
      bottom: Double,
      color: String,
      data: js.Array[js.Any],
      equalWidths: Boolean,
      fontSize: String,
      horizontalGap: Double,
      labelText: String,
      left: Double,
      marginBottom: Double,
      marginLeft: Double,
      marginRight: Double,
      marginTop: Double,
      markerBorderAlpha: Double,
      markerBorderColor: String,
      markerBorderThickness: Double,
      markerDisabledColor: String,
      markerLabelGap: Double,
      markerSize: Double,
      markerType: String,
      maxColumns: Double,
      position: String,
      removeListener: (typings.amcharts.amChartMod.default, String, js.Any) => Unit,
      reversedOrder: Boolean,
      right: Double,
      rollOverColor: String,
      rollOverGraphAlpha: Double,
      showEntries: Boolean,
      spacing: Double,
      switchColor: String,
      switchType: String,
      switchable: Boolean,
      textClickEnabled: Boolean,
      top: Double,
      useGraphSettings: Boolean,
      useMarkerColorForLabels: Boolean,
      valueAlign: String,
      valueText: String,
      valueWidth: Double,
      verticalGap: Double
    ): AmLegend = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), align = align.asInstanceOf[js.Any], autoMargins = autoMargins.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], equalWidths = equalWidths.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], horizontalGap = horizontalGap.asInstanceOf[js.Any], labelText = labelText.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], markerBorderAlpha = markerBorderAlpha.asInstanceOf[js.Any], markerBorderColor = markerBorderColor.asInstanceOf[js.Any], markerBorderThickness = markerBorderThickness.asInstanceOf[js.Any], markerDisabledColor = markerDisabledColor.asInstanceOf[js.Any], markerLabelGap = markerLabelGap.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], markerType = markerType.asInstanceOf[js.Any], maxColumns = maxColumns.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), reversedOrder = reversedOrder.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], rollOverGraphAlpha = rollOverGraphAlpha.asInstanceOf[js.Any], showEntries = showEntries.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], switchColor = switchColor.asInstanceOf[js.Any], switchType = switchType.asInstanceOf[js.Any], switchable = switchable.asInstanceOf[js.Any], textClickEnabled = textClickEnabled.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], useGraphSettings = useGraphSettings.asInstanceOf[js.Any], useMarkerColorForLabels = useMarkerColorForLabels.asInstanceOf[js.Any], valueAlign = valueAlign.asInstanceOf[js.Any], valueText = valueText.asInstanceOf[js.Any], valueWidth = valueWidth.asInstanceOf[js.Any], verticalGap = verticalGap.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmLegend]
    }
    
    extension [Self <: AmLegend](x: Self) {
      
      inline def setAddListener(value: (String, js.Function1[/* e */ DataItem, Unit]) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAutoMargins(value: Boolean): Self = StObject.set(x, "autoMargins", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBorderAlpha(value: Double): Self = StObject.set(x, "borderAlpha", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setEqualWidths(value: Boolean): Self = StObject.set(x, "equalWidths", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setHorizontalGap(value: Double): Self = StObject.set(x, "horizontalGap", value.asInstanceOf[js.Any])
      
      inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarkerBorderAlpha(value: Double): Self = StObject.set(x, "markerBorderAlpha", value.asInstanceOf[js.Any])
      
      inline def setMarkerBorderColor(value: String): Self = StObject.set(x, "markerBorderColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerBorderThickness(value: Double): Self = StObject.set(x, "markerBorderThickness", value.asInstanceOf[js.Any])
      
      inline def setMarkerDisabledColor(value: String): Self = StObject.set(x, "markerDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerLabelGap(value: Double): Self = StObject.set(x, "markerLabelGap", value.asInstanceOf[js.Any])
      
      inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
      
      inline def setMarkerType(value: String): Self = StObject.set(x, "markerType", value.asInstanceOf[js.Any])
      
      inline def setMaxColumns(value: Double): Self = StObject.set(x, "maxColumns", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(value: (typings.amcharts.amChartMod.default, String, js.Any) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
      
      inline def setReversedOrder(value: Boolean): Self = StObject.set(x, "reversedOrder", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRollOverColor(value: String): Self = StObject.set(x, "rollOverColor", value.asInstanceOf[js.Any])
      
      inline def setRollOverGraphAlpha(value: Double): Self = StObject.set(x, "rollOverGraphAlpha", value.asInstanceOf[js.Any])
      
      inline def setShowEntries(value: Boolean): Self = StObject.set(x, "showEntries", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSwitchColor(value: String): Self = StObject.set(x, "switchColor", value.asInstanceOf[js.Any])
      
      inline def setSwitchType(value: String): Self = StObject.set(x, "switchType", value.asInstanceOf[js.Any])
      
      inline def setSwitchable(value: Boolean): Self = StObject.set(x, "switchable", value.asInstanceOf[js.Any])
      
      inline def setTextClickEnabled(value: Boolean): Self = StObject.set(x, "textClickEnabled", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setUseGraphSettings(value: Boolean): Self = StObject.set(x, "useGraphSettings", value.asInstanceOf[js.Any])
      
      inline def setUseMarkerColorForLabels(value: Boolean): Self = StObject.set(x, "useMarkerColorForLabels", value.asInstanceOf[js.Any])
      
      inline def setValueAlign(value: String): Self = StObject.set(x, "valueAlign", value.asInstanceOf[js.Any])
      
      inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
      
      inline def setValueWidth(value: Double): Self = StObject.set(x, "valueWidth", value.asInstanceOf[js.Any])
      
      inline def setVerticalGap(value: Double): Self = StObject.set(x, "verticalGap", value.asInstanceOf[js.Any])
    }
  }
}

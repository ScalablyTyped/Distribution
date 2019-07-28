package typings.amcharts.legendSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendSettings extends js.Object {
  /**
    * Alignment of legend entries. Possible values are: "left", "right" and "center".
    */
  var align: String
  /**
    * Specifies if each legend entry should take the same space as the longest legend entry.
    */
  var equalWidths: Boolean
  /**
    * Horizontal space between legend item and left/right border.
    */
  var horizontalGap: Double
  /**
    * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
    */
  var labelText: String
  /**
    * Space below the last row of the legend, in pixels.
    */
  var marginBottom: Double
  /**
    * Space above the first row of the legend, in pixels.
    */
  var marginTop: Double
  /**
    * Opacity of marker border.
    */
  var markerBorderAlpha: Double
  /**
    * Marker border color.
    */
  var markerBorderColor: String
  /**
    * Thickness of the legend border.
    */
  var markerBorderThickness: Double
  /**
    * The color of the disabled marker (when the graph is hidden).
    */
  var markerDisabledColor: String
  /**
    * Space between legend marker and legend text, in pixels.
    */
  var markerLabelGap: Double
  /**
    * Size of the legend marker (key).
    */
  var markerSize: Double
  /**
    * Shape of the legend marker (key).
    * Possible values are:
    * "square", "circle", "line", "dashedLine", "triangleUp", "triangleDown", "bubble", "none".
    */
  var markerType: String
  /**
    * Specifies whether legend entries should be placed in reversed order.
    */
  var reversedOrder: Boolean
  /**
    * Legend item text color on roll-over.
    */
  var rollOverColor: String
  /**
    * When you roll-over the legend entry, all other graphs can reduce their opacity,
    * so that the graph you rolled-over would be distinguished. This property specifies the opacity of the graphs.
    */
  var rollOverGraphAlpha: Double
  /**
    * Legend switch color.
    */
  var switchColor: String
  /**
    * Legend switch type (in case the legend is switchable). Possible values are: "x" and "v".
    */
  var switchType: String
  /**
    * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
    */
  var switchable: Boolean
  /**
    * Specifies whether the legend text is clickable or not.
    * Clicking on legend text can show/hide value balloons if they are enabled.
    */
  var textClickEnabled: Boolean
  /**
    * Specifies if legend labels should be use same color as corresponding markers.
    */
  var useMarkerColorForLabels: Boolean
  /**
    * The text which will be displayed in the value portion of the legend when graph is comparable and
    * at least one dataSet is selected for comparing.
    * You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
    */
  var valueTextComparing: String
  /**
    * The text which will be displayed in the value portion of the legend.
    * You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
    */
  var valueTextRegular: String
  /**
    * Width of the value text. Increase this value if your values do not fit in the allocated space.
    */
  var valueWidth: Double
  /**
    * Vertical space between legend items, in pixels.
    */
  var verticalGap: Double
}

object LegendSettings {
  @scala.inline
  def apply(
    align: String,
    equalWidths: Boolean,
    horizontalGap: Double,
    labelText: String,
    marginBottom: Double,
    marginTop: Double,
    markerBorderAlpha: Double,
    markerBorderColor: String,
    markerBorderThickness: Double,
    markerDisabledColor: String,
    markerLabelGap: Double,
    markerSize: Double,
    markerType: String,
    reversedOrder: Boolean,
    rollOverColor: String,
    rollOverGraphAlpha: Double,
    switchColor: String,
    switchType: String,
    switchable: Boolean,
    textClickEnabled: Boolean,
    useMarkerColorForLabels: Boolean,
    valueTextComparing: String,
    valueTextRegular: String,
    valueWidth: Double,
    verticalGap: Double
  ): LegendSettings = {
    val __obj = js.Dynamic.literal(align = align, equalWidths = equalWidths, horizontalGap = horizontalGap, labelText = labelText, marginBottom = marginBottom, marginTop = marginTop, markerBorderAlpha = markerBorderAlpha, markerBorderColor = markerBorderColor, markerBorderThickness = markerBorderThickness, markerDisabledColor = markerDisabledColor, markerLabelGap = markerLabelGap, markerSize = markerSize, markerType = markerType, reversedOrder = reversedOrder, rollOverColor = rollOverColor, rollOverGraphAlpha = rollOverGraphAlpha, switchColor = switchColor, switchType = switchType, switchable = switchable, textClickEnabled = textClickEnabled, useMarkerColorForLabels = useMarkerColorForLabels, valueTextComparing = valueTextComparing, valueTextRegular = valueTextRegular, valueWidth = valueWidth, verticalGap = verticalGap)
  
    __obj.asInstanceOf[LegendSettings]
  }
}


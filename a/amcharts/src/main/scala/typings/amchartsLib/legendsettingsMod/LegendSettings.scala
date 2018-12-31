package typings
package amchartsLib.legendsettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendSettings extends js.Object {
  /**
    * Alignment of legend entries. Possible values are: "left", "right" and "center".
    */
  var align: java.lang.String
  /**
    * Specifies if each legend entry should take the same space as the longest legend entry.
    */
  var equalWidths: scala.Boolean
  /**
    * Horizontal space between legend item and left/right border.
    */
  var horizontalGap: scala.Double
  /**
    * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
    */
  var labelText: java.lang.String
  /**
    * Space below the last row of the legend, in pixels.
    */
  var marginBottom: scala.Double
  /**
    * Space above the first row of the legend, in pixels.
    */
  var marginTop: scala.Double
  /**
    * Opacity of marker border.
    */
  var markerBorderAlpha: scala.Double
  /**
    * Marker border color.
    */
  var markerBorderColor: java.lang.String
  /**
    * Thickness of the legend border.
    */
  var markerBorderThickness: scala.Double
  /**
    * The color of the disabled marker (when the graph is hidden).
    */
  var markerDisabledColor: java.lang.String
  /**
    * Space between legend marker and legend text, in pixels.
    */
  var markerLabelGap: scala.Double
  /**
    * Size of the legend marker (key).
    */
  var markerSize: scala.Double
  /**
    * Shape of the legend marker (key).
    * Possible values are:
    * "square", "circle", "line", "dashedLine", "triangleUp", "triangleDown", "bubble", "none".
    */
  var markerType: java.lang.String
  /**
    * Specifies whether legend entries should be placed in reversed order.
    */
  var reversedOrder: scala.Boolean
  /**
    * Legend item text color on roll-over.
    */
  var rollOverColor: java.lang.String
  /**
    * When you roll-over the legend entry, all other graphs can reduce their opacity,
    * so that the graph you rolled-over would be distinguished. This property specifies the opacity of the graphs.
    */
  var rollOverGraphAlpha: scala.Double
  /**
    * Legend switch color.
    */
  var switchColor: java.lang.String
  /**
    * Legend switch type (in case the legend is switchable). Possible values are: "x" and "v".
    */
  var switchType: java.lang.String
  /**
    * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
    */
  var switchable: scala.Boolean
  /**
    * Specifies whether the legend text is clickable or not.
    * Clicking on legend text can show/hide value balloons if they are enabled.
    */
  var textClickEnabled: scala.Boolean
  /**
    * Specifies if legend labels should be use same color as corresponding markers.
    */
  var useMarkerColorForLabels: scala.Boolean
  /**
    * The text which will be displayed in the value portion of the legend when graph is comparable and
    * at least one dataSet is selected for comparing.
    * You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
    */
  var valueTextComparing: java.lang.String
  /**
    * The text which will be displayed in the value portion of the legend.
    * You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
    */
  var valueTextRegular: java.lang.String
  /**
    * Width of the value text. Increase this value if your values do not fit in the allocated space.
    */
  var valueWidth: scala.Double
  /**
    * Vertical space between legend items, in pixels.
    */
  var verticalGap: scala.Double
}


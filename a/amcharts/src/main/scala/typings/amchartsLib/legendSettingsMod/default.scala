package typings
package amchartsLib.legendSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/LegendSettings", JSImport.Default)
@js.native
class default () extends LegendSettings {
  /**
    * Alignment of legend entries. Possible values are: "left", "right" and "center".
    */
  /* CompleteClass */
  override var align: java.lang.String = js.native
  /**
    * Specifies if each legend entry should take the same space as the longest legend entry.
    */
  /* CompleteClass */
  override var equalWidths: scala.Boolean = js.native
  /**
    * Horizontal space between legend item and left/right border.
    */
  /* CompleteClass */
  override var horizontalGap: scala.Double = js.native
  /**
    * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
    */
  /* CompleteClass */
  override var labelText: java.lang.String = js.native
  /**
    * Space below the last row of the legend, in pixels.
    */
  /* CompleteClass */
  override var marginBottom: scala.Double = js.native
  /**
    * Space above the first row of the legend, in pixels.
    */
  /* CompleteClass */
  override var marginTop: scala.Double = js.native
  /**
    * Opacity of marker border.
    */
  /* CompleteClass */
  override var markerBorderAlpha: scala.Double = js.native
  /**
    * Marker border color.
    */
  /* CompleteClass */
  override var markerBorderColor: java.lang.String = js.native
  /**
    * Thickness of the legend border.
    */
  /* CompleteClass */
  override var markerBorderThickness: scala.Double = js.native
  /**
    * The color of the disabled marker (when the graph is hidden).
    */
  /* CompleteClass */
  override var markerDisabledColor: java.lang.String = js.native
  /**
    * Space between legend marker and legend text, in pixels.
    */
  /* CompleteClass */
  override var markerLabelGap: scala.Double = js.native
  /**
    * Size of the legend marker (key).
    */
  /* CompleteClass */
  override var markerSize: scala.Double = js.native
  /**
    * Shape of the legend marker (key).
    * Possible values are:
    * "square", "circle", "line", "dashedLine", "triangleUp", "triangleDown", "bubble", "none".
    */
  /* CompleteClass */
  override var markerType: java.lang.String = js.native
  /**
    * Specifies whether legend entries should be placed in reversed order.
    */
  /* CompleteClass */
  override var reversedOrder: scala.Boolean = js.native
  /**
    * Legend item text color on roll-over.
    */
  /* CompleteClass */
  override var rollOverColor: java.lang.String = js.native
  /**
    * When you roll-over the legend entry, all other graphs can reduce their opacity,
    * so that the graph you rolled-over would be distinguished. This property specifies the opacity of the graphs.
    */
  /* CompleteClass */
  override var rollOverGraphAlpha: scala.Double = js.native
  /**
    * Legend switch color.
    */
  /* CompleteClass */
  override var switchColor: java.lang.String = js.native
  /**
    * Legend switch type (in case the legend is switchable). Possible values are: "x" and "v".
    */
  /* CompleteClass */
  override var switchType: java.lang.String = js.native
  /**
    * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
    */
  /* CompleteClass */
  override var switchable: scala.Boolean = js.native
  /**
    * Specifies whether the legend text is clickable or not.
    * Clicking on legend text can show/hide value balloons if they are enabled.
    */
  /* CompleteClass */
  override var textClickEnabled: scala.Boolean = js.native
  /**
    * Specifies if legend labels should be use same color as corresponding markers.
    */
  /* CompleteClass */
  override var useMarkerColorForLabels: scala.Boolean = js.native
  /**
    * The text which will be displayed in the value portion of the legend when graph is comparable and
    * at least one dataSet is selected for comparing.
    * You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
    */
  /* CompleteClass */
  override var valueTextComparing: java.lang.String = js.native
  /**
    * The text which will be displayed in the value portion of the legend.
    * You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
    */
  /* CompleteClass */
  override var valueTextRegular: java.lang.String = js.native
  /**
    * Width of the value text. Increase this value if your values do not fit in the allocated space.
    */
  /* CompleteClass */
  override var valueWidth: scala.Double = js.native
  /**
    * Vertical space between legend items, in pixels.
    */
  /* CompleteClass */
  override var verticalGap: scala.Double = js.native
}


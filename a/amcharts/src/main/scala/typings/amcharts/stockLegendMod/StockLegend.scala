package typings.amcharts.stockLegendMod

import typings.amcharts.Anon_ChartDataItem
import typings.amcharts.amLegendMod.AmLegend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockLegend extends AmLegend {
  /**
    * The text which will be displayed in the value portion of the legend when graph is comparable and
    * at least one dataSet is selected for comparing.
    * You can use tags like
    * [[value]], [[open]], [[high]], [[low]], [[close]], [[percents.value/open/close/low/high]],
    * [[description]]
    * @default [[percents.value]]%
    */
  var valueTextComparing: String
  /**
    * The text which will be displayed in the value portion of the legend.
    * You can use tags like
    * [[value]], [[open]], [[high]], [[low]], [[close]],[[percents]], [[description]]
    * @default [[value]]
    */
  var valueTextRegular: String
}

object StockLegend {
  @scala.inline
  def apply(
    addListener: (String, js.Function1[/* e */ Anon_ChartDataItem, Unit]) => Unit,
    align: String,
    autoMargins: Boolean,
    backgroundAlpha: Double,
    backgroundColor: String,
    borderAlpha: Double,
    borderColor: String,
    bottom: Double,
    color: String,
    data: js.Array[_],
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
    valueTextComparing: String,
    valueTextRegular: String,
    valueWidth: Double,
    verticalGap: Double
  ): StockLegend = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), align = align, autoMargins = autoMargins, backgroundAlpha = backgroundAlpha, backgroundColor = backgroundColor, borderAlpha = borderAlpha, borderColor = borderColor, bottom = bottom, color = color, data = data, equalWidths = equalWidths, fontSize = fontSize, horizontalGap = horizontalGap, labelText = labelText, left = left, marginBottom = marginBottom, marginLeft = marginLeft, marginRight = marginRight, marginTop = marginTop, markerBorderAlpha = markerBorderAlpha, markerBorderColor = markerBorderColor, markerBorderThickness = markerBorderThickness, markerDisabledColor = markerDisabledColor, markerLabelGap = markerLabelGap, markerSize = markerSize, markerType = markerType, maxColumns = maxColumns, position = position, removeListener = js.Any.fromFunction3(removeListener), reversedOrder = reversedOrder, right = right, rollOverColor = rollOverColor, rollOverGraphAlpha = rollOverGraphAlpha, showEntries = showEntries, spacing = spacing, switchColor = switchColor, switchType = switchType, switchable = switchable, textClickEnabled = textClickEnabled, top = top, useGraphSettings = useGraphSettings, useMarkerColorForLabels = useMarkerColorForLabels, valueAlign = valueAlign, valueText = valueText, valueTextComparing = valueTextComparing, valueTextRegular = valueTextRegular, valueWidth = valueWidth, verticalGap = verticalGap)
  
    __obj.asInstanceOf[StockLegend]
  }
}


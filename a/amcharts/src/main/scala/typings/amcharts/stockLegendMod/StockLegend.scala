package typings.amcharts.stockLegendMod

import typings.amcharts.amLegendMod.AmLegend
import typings.amcharts.anon.DataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockLegend extends AmLegend {
  /**
    * The text which will be displayed in the value portion of the legend when graph is comparable and
    * at least one dataSet is selected for comparing.
    * You can use tags like
    * [[value]], [[open]], [[high]], [[low]], [[close]], [[percents.value/open/close/low/high]],
    * [[description]]
    * @default [[percents.value]]%
    */
  var valueTextComparing: String = js.native
  /**
    * The text which will be displayed in the value portion of the legend.
    * You can use tags like
    * [[value]], [[open]], [[high]], [[low]], [[close]],[[percents]], [[description]]
    * @default [[value]]
    */
  var valueTextRegular: String = js.native
}

object StockLegend {
  @scala.inline
  def apply(
    addListener: (String, js.Function1[/* e */ DataItem, Unit]) => Unit,
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
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), align = align.asInstanceOf[js.Any], autoMargins = autoMargins.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], equalWidths = equalWidths.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], horizontalGap = horizontalGap.asInstanceOf[js.Any], labelText = labelText.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], markerBorderAlpha = markerBorderAlpha.asInstanceOf[js.Any], markerBorderColor = markerBorderColor.asInstanceOf[js.Any], markerBorderThickness = markerBorderThickness.asInstanceOf[js.Any], markerDisabledColor = markerDisabledColor.asInstanceOf[js.Any], markerLabelGap = markerLabelGap.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], markerType = markerType.asInstanceOf[js.Any], maxColumns = maxColumns.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), reversedOrder = reversedOrder.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], rollOverGraphAlpha = rollOverGraphAlpha.asInstanceOf[js.Any], showEntries = showEntries.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], switchColor = switchColor.asInstanceOf[js.Any], switchType = switchType.asInstanceOf[js.Any], switchable = switchable.asInstanceOf[js.Any], textClickEnabled = textClickEnabled.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], useGraphSettings = useGraphSettings.asInstanceOf[js.Any], useMarkerColorForLabels = useMarkerColorForLabels.asInstanceOf[js.Any], valueAlign = valueAlign.asInstanceOf[js.Any], valueText = valueText.asInstanceOf[js.Any], valueTextComparing = valueTextComparing.asInstanceOf[js.Any], valueTextRegular = valueTextRegular.asInstanceOf[js.Any], valueWidth = valueWidth.asInstanceOf[js.Any], verticalGap = verticalGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockLegend]
  }
  @scala.inline
  implicit class StockLegendOps[Self <: StockLegend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValueTextComparing(value: String): Self = this.set("valueTextComparing", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueTextRegular(value: String): Self = this.set("valueTextRegular", value.asInstanceOf[js.Any])
  }
  
}


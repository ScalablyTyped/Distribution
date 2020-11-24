package typings.amcharts.legendSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendSettings extends js.Object {
  
  /**
    * Alignment of legend entries. Possible values are: "left", "right" and "center".
    */
  var align: String = js.native
  
  /**
    * Specifies if each legend entry should take the same space as the longest legend entry.
    */
  var equalWidths: Boolean = js.native
  
  /**
    * Horizontal space between legend item and left/right border.
    */
  var horizontalGap: Double = js.native
  
  /**
    * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
    */
  var labelText: String = js.native
  
  /**
    * Space below the last row of the legend, in pixels.
    */
  var marginBottom: Double = js.native
  
  /**
    * Space above the first row of the legend, in pixels.
    */
  var marginTop: Double = js.native
  
  /**
    * Opacity of marker border.
    */
  var markerBorderAlpha: Double = js.native
  
  /**
    * Marker border color.
    */
  var markerBorderColor: String = js.native
  
  /**
    * Thickness of the legend border.
    */
  var markerBorderThickness: Double = js.native
  
  /**
    * The color of the disabled marker (when the graph is hidden).
    */
  var markerDisabledColor: String = js.native
  
  /**
    * Space between legend marker and legend text, in pixels.
    */
  var markerLabelGap: Double = js.native
  
  /**
    * Size of the legend marker (key).
    */
  var markerSize: Double = js.native
  
  /**
    * Shape of the legend marker (key).
    * Possible values are:
    * "square", "circle", "line", "dashedLine", "triangleUp", "triangleDown", "bubble", "none".
    */
  var markerType: String = js.native
  
  /**
    * Specifies whether legend entries should be placed in reversed order.
    */
  var reversedOrder: Boolean = js.native
  
  /**
    * Legend item text color on roll-over.
    */
  var rollOverColor: String = js.native
  
  /**
    * When you roll-over the legend entry, all other graphs can reduce their opacity,
    * so that the graph you rolled-over would be distinguished. This property specifies the opacity of the graphs.
    */
  var rollOverGraphAlpha: Double = js.native
  
  /**
    * Legend switch color.
    */
  var switchColor: String = js.native
  
  /**
    * Legend switch type (in case the legend is switchable). Possible values are: "x" and "v".
    */
  var switchType: String = js.native
  
  /**
    * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
    */
  var switchable: Boolean = js.native
  
  /**
    * Specifies whether the legend text is clickable or not.
    * Clicking on legend text can show/hide value balloons if they are enabled.
    */
  var textClickEnabled: Boolean = js.native
  
  /**
    * Specifies if legend labels should be use same color as corresponding markers.
    */
  var useMarkerColorForLabels: Boolean = js.native
  
  /**
    * The text which will be displayed in the value portion of the legend when graph is comparable and
    * at least one dataSet is selected for comparing.
    * You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
    */
  var valueTextComparing: String = js.native
  
  /**
    * The text which will be displayed in the value portion of the legend.
    * You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]].
    */
  var valueTextRegular: String = js.native
  
  /**
    * Width of the value text. Increase this value if your values do not fit in the allocated space.
    */
  var valueWidth: Double = js.native
  
  /**
    * Vertical space between legend items, in pixels.
    */
  var verticalGap: Double = js.native
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
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], equalWidths = equalWidths.asInstanceOf[js.Any], horizontalGap = horizontalGap.asInstanceOf[js.Any], labelText = labelText.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], markerBorderAlpha = markerBorderAlpha.asInstanceOf[js.Any], markerBorderColor = markerBorderColor.asInstanceOf[js.Any], markerBorderThickness = markerBorderThickness.asInstanceOf[js.Any], markerDisabledColor = markerDisabledColor.asInstanceOf[js.Any], markerLabelGap = markerLabelGap.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], markerType = markerType.asInstanceOf[js.Any], reversedOrder = reversedOrder.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], rollOverGraphAlpha = rollOverGraphAlpha.asInstanceOf[js.Any], switchColor = switchColor.asInstanceOf[js.Any], switchType = switchType.asInstanceOf[js.Any], switchable = switchable.asInstanceOf[js.Any], textClickEnabled = textClickEnabled.asInstanceOf[js.Any], useMarkerColorForLabels = useMarkerColorForLabels.asInstanceOf[js.Any], valueTextComparing = valueTextComparing.asInstanceOf[js.Any], valueTextRegular = valueTextRegular.asInstanceOf[js.Any], valueWidth = valueWidth.asInstanceOf[js.Any], verticalGap = verticalGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendSettings]
  }
  
  @scala.inline
  implicit class LegendSettingsOps[Self <: LegendSettings] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualWidths(value: Boolean): Self = this.set("equalWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalGap(value: Double): Self = this.set("horizontalGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelText(value: String): Self = this.set("labelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerBorderAlpha(value: Double): Self = this.set("markerBorderAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerBorderColor(value: String): Self = this.set("markerBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerBorderThickness(value: Double): Self = this.set("markerBorderThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDisabledColor(value: String): Self = this.set("markerDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerLabelGap(value: Double): Self = this.set("markerLabelGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerType(value: String): Self = this.set("markerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedOrder(value: Boolean): Self = this.set("reversedOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollOverColor(value: String): Self = this.set("rollOverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollOverGraphAlpha(value: Double): Self = this.set("rollOverGraphAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchColor(value: String): Self = this.set("switchColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchType(value: String): Self = this.set("switchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchable(value: Boolean): Self = this.set("switchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextClickEnabled(value: Boolean): Self = this.set("textClickEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMarkerColorForLabels(value: Boolean): Self = this.set("useMarkerColorForLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTextComparing(value: String): Self = this.set("valueTextComparing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTextRegular(value: String): Self = this.set("valueTextRegular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueWidth(value: Double): Self = this.set("valueWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalGap(value: Double): Self = this.set("verticalGap", value.asInstanceOf[js.Any])
  }
}

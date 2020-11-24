package typings.amcharts.categoryAxesSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryAxesSettings extends js.Object {
  
  /**
    * Specifies whether number of gridCount is specified automatically, according to the axis size.
    * @default true
    */
  var autoGridCount: Boolean = js.native
  
  /**
    * Axis opacity.
    */
  var axisAlpha: Double = js.native
  
  /**
    * Axis color.
    */
  var axisColor: String = js.native
  
  /**
    * Height of category axes. Set it to 0 if you set inside property to true.
    * @default 28
    */
  var axisHeight: Double = js.native
  
  /**
    * Thickness of the axis.
    */
  var axisThickness: Double = js.native
  
  /**
    * Text color.
    */
  var color: String = js.native
  
  /**
    * Length of a dash.
    */
  var dashLength: Double = js.native
  
  /**
    * Date formats of different periods.
    * Possible period values:
    * fff - milliseconds,
    * ss - seconds,
    * mm - minutes,
    * hh - hours,
    * DD - days,
    * MM - months,
    * WW - weeks,
    * YYYY - years
    * Check this page for date formatting strings.
    */
  var dateFormats: js.Array[_] = js.native
  
  /**
    * If you want data points to be placed at equal intervals (omiting dates with no data),
    * set equalSpacing to true.
    */
  var equalSpacing: Boolean = js.native
  
  /**
    * Fill opacity. Every second space between grid lines can be filled with fillColor.
    */
  var fillAlpha: Double = js.native
  
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  var fillColor: String = js.native
  
  /**
    * Text size.
    */
  var fontSize: String = js.native
  
  /**
    * Opacity of grid lines.
    */
  var gridAlpha: Double = js.native
  
  /**
    * Color of grid lines.
    */
  var gridColor: String = js.native
  
  /**
    * Approximate number of grid lines.
    * You should set autoGridCount to false in order this property not to be ignored.
    * @default 10
    */
  var gridCount: Double = js.native
  
  /**
    * Thickness of grid lines.
    */
  var gridThickness: Double = js.native
  
  /**
    * Periods to which data will be gruoped in case there are more data items in
    * the selected period than specified in maxSeries property.
    * ["ss", "10ss", "30ss", "mm", "10mm", "30mm", "hh", "DD", "WW", "MM", "YYYY"]
    */
  var groupToPeriods: js.Array[_] = js.native
  
  /**
    * Specifies whether values should be placed inside or outside of plot area.
    */
  var inside: Boolean = js.native
  
  /**
    * Rotation angle of a label.
    */
  var labelRotation: Double = js.native
  
  /**
    * Maximum series shown at a time.
    * In case there are more data points in the selection than maxSeries,
    * the chart will group data to longer periods, for example - you have 250 days in the selection,
    * and maxSeries is 150 - the chart will group data to weeks.
    * @default 150
    */
  var maxSeries: Double = js.native
  
  /**
    * Specifies the shortest period of your data.
    * fff - millisecond,
    * ss - second,
    * mm - minute,
    * hh - hour,
    * DD - day,
    * MM - month,
    * YYYY - year
    * @default "DD"
    */
  var minPeriod: String = js.native
  
  /**
    * top or "bottom".
    */
  var position: String = js.native
  
  /**
    * Specifies whether the graph should start on axis or not.
    * In case you display columns, it is recommended to set this to false.
    * startOnAxis can be set to true only if equalSpacing is set to true.
    */
  var startOnAxis: Boolean = js.native
  
  /**
    * Tick length.
    */
  var tickLength: Double = js.native
}
object CategoryAxesSettings {
  
  @scala.inline
  def apply(
    autoGridCount: Boolean,
    axisAlpha: Double,
    axisColor: String,
    axisHeight: Double,
    axisThickness: Double,
    color: String,
    dashLength: Double,
    dateFormats: js.Array[_],
    equalSpacing: Boolean,
    fillAlpha: Double,
    fillColor: String,
    fontSize: String,
    gridAlpha: Double,
    gridColor: String,
    gridCount: Double,
    gridThickness: Double,
    groupToPeriods: js.Array[_],
    inside: Boolean,
    labelRotation: Double,
    maxSeries: Double,
    minPeriod: String,
    position: String,
    startOnAxis: Boolean,
    tickLength: Double
  ): CategoryAxesSettings = {
    val __obj = js.Dynamic.literal(autoGridCount = autoGridCount.asInstanceOf[js.Any], axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisHeight = axisHeight.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], dateFormats = dateFormats.asInstanceOf[js.Any], equalSpacing = equalSpacing.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridThickness = gridThickness.asInstanceOf[js.Any], groupToPeriods = groupToPeriods.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], maxSeries = maxSeries.asInstanceOf[js.Any], minPeriod = minPeriod.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], startOnAxis = startOnAxis.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryAxesSettings]
  }
  
  @scala.inline
  implicit class CategoryAxesSettingsOps[Self <: CategoryAxesSettings] (val x: Self) extends AnyVal {
    
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
    def setAutoGridCount(value: Boolean): Self = this.set("autoGridCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisAlpha(value: Double): Self = this.set("axisAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisColor(value: String): Self = this.set("axisColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisHeight(value: Double): Self = this.set("axisHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisThickness(value: Double): Self = this.set("axisThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashLength(value: Double): Self = this.set("dashLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatsVarargs(value: js.Any*): Self = this.set("dateFormats", js.Array(value :_*))
    
    @scala.inline
    def setDateFormats(value: js.Array[_]): Self = this.set("dateFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualSpacing(value: Boolean): Self = this.set("equalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillAlpha(value: Double): Self = this.set("fillAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAlpha(value: Double): Self = this.set("gridAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColor(value: String): Self = this.set("gridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridCount(value: Double): Self = this.set("gridCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridThickness(value: Double): Self = this.set("gridThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupToPeriodsVarargs(value: js.Any*): Self = this.set("groupToPeriods", js.Array(value :_*))
    
    @scala.inline
    def setGroupToPeriods(value: js.Array[_]): Self = this.set("groupToPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInside(value: Boolean): Self = this.set("inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelRotation(value: Double): Self = this.set("labelRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSeries(value: Double): Self = this.set("maxSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPeriod(value: String): Self = this.set("minPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOnAxis(value: Boolean): Self = this.set("startOnAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLength(value: Double): Self = this.set("tickLength", value.asInstanceOf[js.Any])
  }
}

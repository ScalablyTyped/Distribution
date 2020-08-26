package typings.amcharts.panelSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelsSettings extends js.Object {
  /**
    * The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D" is > 0).
    */
  var angle: Double = js.native
  /**
    * Opacity of panel background. Possible values are 1 and 0. Values like 0.5 will not make it half-transparent.
    */
  var backgroundAlpha: Double = js.native
  /**
    * Background color of panels. Set backgroundAlpha to > 0 value in order to make background visible.
    * @default "#FFFFFF"
    */
  var backgroundColor: String = js.native
  /**
    * The gap in pixels between two columns of the same category.
    */
  var columnSpacing: Double = js.native
  /**
    * Relative width of columns. Valid values 0 - 1.
    */
  var columnWidth: Double = js.native
  /**
    * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is > 0).
    */
  var depth3D: Double = js.native
  /**
    * Font family.
    */
  var fontFamily: String = js.native
  /**
    * Font size.
    */
  var fontSize: String = js.native
  /**
    * Number of pixels between the container's bottom border and plot area.
    * @default 1
    */
  var marginBottom: Double = js.native
  /**
    * Number of pixels between the container's left border and plot area.
    * If your left valueAxis values ar not placed inside the plot area,
    * you should set marginLeft to 80 or some close value.
    */
  var marginLeft: Double = js.native
  /**
    * Number of pixels between the container's left border and plot area.
    * If your right valueAxis values ar not placed inside the plot area,
    * you should set marginRight to 80 or some close value.
    */
  var marginRight: Double = js.native
  /**
    * Number of pixels between the container's top border and plot area.
    */
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
  var panEventsEnabled: Boolean = js.native
  /**
    * Gap between panels.
    * @default 8
    */
  var panelSpacing: Double = js.native
  /**
    * The opacity of plot area's border.
    */
  var plotAreaBorderAlpha: Double = js.native
  /**
    * The color of the plot area's border.
    */
  var plotAreaBorderColor: String = js.native
  /**
    * Opacity of plot area fill.
    */
  var plotAreaFillAlphas: Double = js.native
  /**
    * Specifies the colors used to tint the background gradient fill of the plot area. String or Array of Strings
    */
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
  var prefixesOfBigNumbers: js.Array[_] = js.native
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
  var prefixesOfSmallNumbers: js.Array[_] = js.native
  /**
    * Specifies whether the animation should be sequenced or all objects should appear at once.
    */
  var sequencedAnimation: Boolean = js.native
  /**
    * The initial opacity of the column/line.
    * If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha.
    */
  var startAlpha: Double = js.native
  /**
    * Duration of the animation, in seconds.
    */
  var startDuration: Double = js.native
  /**
    * Possible values are: "linear", "<", ">" "<>", "elastic", "bounce".
    */
  var startEffect: String = js.native
  /**
    * If true, prefixes will be used for big and small numbers.
    */
  var usePrefixes: Boolean = js.native
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
    prefixesOfBigNumbers: js.Array[_],
    prefixesOfSmallNumbers: js.Array[_],
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
  implicit class PanelsSettingsOps[Self <: PanelsSettings] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundAlpha(value: Double): Self = this.set("backgroundAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnSpacing(value: Double): Self = this.set("columnSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth3D(value: Double): Self = this.set("depth3D", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanEventsEnabled(value: Boolean): Self = this.set("panEventsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanelSpacing(value: Double): Self = this.set("panelSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlotAreaBorderAlpha(value: Double): Self = this.set("plotAreaBorderAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlotAreaBorderColor(value: String): Self = this.set("plotAreaBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlotAreaFillAlphas(value: Double): Self = this.set("plotAreaFillAlphas", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlotAreaFillColors(value: js.Any): Self = this.set("plotAreaFillColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixesOfBigNumbersVarargs(value: js.Any*): Self = this.set("prefixesOfBigNumbers", js.Array(value :_*))
    @scala.inline
    def setPrefixesOfBigNumbers(value: js.Array[_]): Self = this.set("prefixesOfBigNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixesOfSmallNumbersVarargs(value: js.Any*): Self = this.set("prefixesOfSmallNumbers", js.Array(value :_*))
    @scala.inline
    def setPrefixesOfSmallNumbers(value: js.Array[_]): Self = this.set("prefixesOfSmallNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequencedAnimation(value: Boolean): Self = this.set("sequencedAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAlpha(value: Double): Self = this.set("startAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDuration(value: Double): Self = this.set("startDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartEffect(value: String): Self = this.set("startEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsePrefixes(value: Boolean): Self = this.set("usePrefixes", value.asInstanceOf[js.Any])
  }
  
}


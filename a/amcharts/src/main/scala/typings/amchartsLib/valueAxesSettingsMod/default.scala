package typings
package amchartsLib.valueAxesSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/ValueAxesSettings", JSImport.Default)
@js.native
class default () extends ValueAxesSettings {
  /**
    * Specifies whether number for gridCount is specified automatically, according to the axis size.
    * @default true
    */
  /* CompleteClass */
  override var autoGridCount: scala.Boolean = js.native
  /**
    * Axis opacity.
    */
  /* CompleteClass */
  override var axisAlpha: scala.Double = js.native
  /**
    * Axis color.
    */
  /* CompleteClass */
  override var axisColor: java.lang.String = js.native
  /**
    * Thickness of the axis.
    */
  /* CompleteClass */
  override var axisThickness: scala.Double = js.native
  /**
    * Label color.
    */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
    * Length of a dash. By default, the grid line is not dashed.
    */
  /* CompleteClass */
  override var dashLength: scala.Double = js.native
  /**
    * Fill opacity. Every second space between grid lines can be filled with color.
    */
  /* CompleteClass */
  override var fillAlpha: scala.Double = js.native
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  /* CompleteClass */
  override var fillColor: java.lang.String = js.native
  /**
    * Opacity of grid lines.
    */
  /* CompleteClass */
  override var gridAlpha: scala.Double = js.native
  /**
    * Color of grid lines.
    */
  /* CompleteClass */
  override var gridColor: java.lang.String = js.native
  /**
    * Approximate number of grid lines. autoGridCount should be set to false,
    * otherwise this property will be ignored.
    */
  /* CompleteClass */
  override var gridCount: scala.Double = js.native
  /**
    * Thickness of grid lines.
    */
  /* CompleteClass */
  override var gridThickness: scala.Double = js.native
  /**
    * Specifies whether guide values should be included when calculating min and max of the axis.
    */
  /* CompleteClass */
  override var includeGuidesInMinMax: scala.Boolean = js.native
  /**
    * If true, the axis will include hidden graphs when calculating min and max values.
    */
  /* CompleteClass */
  override var includeHidden: scala.Boolean = js.native
  /**
    * Specifies whether values should be placed inside or outside plot area.
    * In case you set this to false, you'll have to adjust marginLeft or marginRight in
    * [[PanelsSettings]] in order labels to be visible.
    * @default true
    */
  /* CompleteClass */
  override var inside: scala.Boolean = js.native
  /**
    * Specifies whether values on axis can only be integers or both integers and doubles.
    */
  /* CompleteClass */
  override var integersOnly: scala.Boolean = js.native
  /**
    * Frequency at which labels should be placed.
    */
  /* CompleteClass */
  override var labelFrequency: scala.Double = js.native
  /**
    * Specifies whether value labels are displayed.
    */
  /* CompleteClass */
  override var labelsEnabled: scala.Boolean = js.native
  /**
    * Set to true if value axis is logarithmic, false otherwise.
    */
  /* CompleteClass */
  override var logarithmic: scala.Boolean = js.native
  /**
    * The distance of the axis to the plot area, in pixels. Useful if you have more then one axis on the same side.
    */
  /* CompleteClass */
  override var offset: scala.Double = js.native
  /**
    * Position of the value axis. Possible values are "left" and "right".
    */
  /* CompleteClass */
  override var position: java.lang.String = js.native
  /**
    * Set to true if value axis is reversed (smaller values on top), false otherwise.
    */
  /* CompleteClass */
  override var reversed: scala.Boolean = js.native
  /**
    * Specifies if first label of value axis should be displayed.
    */
  /* CompleteClass */
  override var showFirstLabel: scala.Boolean = js.native
  /**
    * Specifies if last label of value axis should be displayed.
    */
  /* CompleteClass */
  override var showLastLabel: scala.Boolean = js.native
  /**
    * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
    */
  /* CompleteClass */
  override var stackType: java.lang.String = js.native
  /**
    * Tick length.
    */
  /* CompleteClass */
  override var tickLength: scala.Double = js.native
  /**
    * Unit which will be added to the value label.
    */
  /* CompleteClass */
  override var unit: java.lang.String = js.native
  /**
    * Position of the unit. Possible values are "left" or "right".
    */
  /* CompleteClass */
  override var unitPosition: java.lang.String = js.native
}


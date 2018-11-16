package typings
package amchartsLib.panelsettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/PanelSettings", JSImport.Default)
@js.native
class default () extends PanelsSettings {
  /**
       * The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D" is > 0).
       */
  /* CompleteClass */
  override var angle: scala.Double = js.native
  /**
       * Opacity of panel background. Possible values are 1 and 0. Values like 0.5 will not make it half-transparent.
       */
  /* CompleteClass */
  override var backgroundAlpha: scala.Double = js.native
  /**
       * Background color of panels. Set backgroundAlpha to > 0 value in order to make background visible.
       * @default "#FFFFFF"
       */
  /* CompleteClass */
  override var backgroundColor: java.lang.String = js.native
  /**
       * The gap in pixels between two columns of the same category.
       */
  /* CompleteClass */
  override var columnSpacing: scala.Double = js.native
  /**
       * Relative width of columns. Valid values 0 - 1.
       */
  /* CompleteClass */
  override var columnWidth: scala.Double = js.native
  /**
       * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is > 0).
       */
  /* CompleteClass */
  override var depth3D: scala.Double = js.native
  /**
       * Font family.
       */
  /* CompleteClass */
  override var fontFamily: java.lang.String = js.native
  /**
       * Font size.
       */
  /* CompleteClass */
  override var fontSize: java.lang.String = js.native
  /**
       * Number of pixels between the container's bottom border and plot area.
       * @default 1
       */
  /* CompleteClass */
  override var marginBottom: scala.Double = js.native
  /**
       * Number of pixels between the container's left border and plot area.
       * If your left valueAxis values ar not placed inside the plot area,
       * you should set marginLeft to 80 or some close value.
       */
  /* CompleteClass */
  override var marginLeft: scala.Double = js.native
  /**
       * Number of pixels between the container's left border and plot area.
       * If your right valueAxis values ar not placed inside the plot area,
       * you should set marginRight to 80 or some close value.
       */
  /* CompleteClass */
  override var marginRight: scala.Double = js.native
  /**
       * Number of pixels between the container's top border and plot area.
       */
  /* CompleteClass */
  override var marginTop: scala.Double = js.native
  /**
       * This setting affects touch-screen devices only.
       * If a chart is on a page, and panEventsEnabled are set to true,
       * the page won't move if the user touches the chart first.
       * If a chart is big enough and occupies all the screen of your touch device,
       * the user won’t be able to move the page at all. That's why the default value is "false".
       * If you think that selecting or or panning the chart is a primary purpose of your chart users,
       * you should set panEventsEnabled to true.
       */
  /* CompleteClass */
  override var panEventsEnabled: scala.Boolean = js.native
  /**
       * Gap between panels.
       * @default 8
       */
  /* CompleteClass */
  override var panelSpacing: scala.Double = js.native
  /**
       * The opacity of plot area's border.
       */
  /* CompleteClass */
  override var plotAreaBorderAlpha: scala.Double = js.native
  /**
       * The color of the plot area's border.
       */
  /* CompleteClass */
  override var plotAreaBorderColor: java.lang.String = js.native
  /**
       * Opacity of plot area fill.
       */
  /* CompleteClass */
  override var plotAreaFillAlphas: scala.Double = js.native
  /**
       * Specifies the colors used to tint the background gradient fill of the plot area. String or Array of Strings
       */
  /* CompleteClass */
  override var plotAreaFillColors: js.Any = js.native
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
  /* CompleteClass */
  override var prefixesOfBigNumbers: js.Array[_] = js.native
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
  /* CompleteClass */
  override var prefixesOfSmallNumbers: js.Array[_] = js.native
  /**
       * Specifies whether the animation should be sequenced or all objects should appear at once.
       */
  /* CompleteClass */
  override var sequencedAnimation: scala.Boolean = js.native
  /**
       * The initial opacity of the column/line.
       * If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha.
       */
  /* CompleteClass */
  override var startAlpha: scala.Double = js.native
  /**
       * Duration of the animation, in seconds.
       */
  /* CompleteClass */
  override var startDuration: scala.Double = js.native
  /**
       * Possible values are: "linear", "<", ">" "<>", "elastic", "bounce".
       */
  /* CompleteClass */
  override var startEffect: java.lang.String = js.native
  /**
       * If true, prefixes will be used for big and small numbers.
       */
  /* CompleteClass */
  override var usePrefixes: scala.Boolean = js.native
}


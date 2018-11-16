package typings
package amchartsLib.panelsettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PanelsSettings extends js.Object {
  /**
       * The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D" is > 0).
       */
  var angle: scala.Double
  /**
       * Opacity of panel background. Possible values are 1 and 0. Values like 0.5 will not make it half-transparent.
       */
  var backgroundAlpha: scala.Double
  /**
       * Background color of panels. Set backgroundAlpha to > 0 value in order to make background visible.
       * @default "#FFFFFF"
       */
  var backgroundColor: java.lang.String
  /**
       * The gap in pixels between two columns of the same category.
       */
  var columnSpacing: scala.Double
  /**
       * Relative width of columns. Valid values 0 - 1.
       */
  var columnWidth: scala.Double
  /**
       * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is > 0).
       */
  var depth3D: scala.Double
  /**
       * Font family.
       */
  var fontFamily: java.lang.String
  /**
       * Font size.
       */
  var fontSize: java.lang.String
  /**
       * Number of pixels between the container's bottom border and plot area.
       * @default 1
       */
  var marginBottom: scala.Double
  /**
       * Number of pixels between the container's left border and plot area.
       * If your left valueAxis values ar not placed inside the plot area,
       * you should set marginLeft to 80 or some close value.
       */
  var marginLeft: scala.Double
  /**
       * Number of pixels between the container's left border and plot area.
       * If your right valueAxis values ar not placed inside the plot area,
       * you should set marginRight to 80 or some close value.
       */
  var marginRight: scala.Double
  /**
       * Number of pixels between the container's top border and plot area.
       */
  var marginTop: scala.Double
  /**
       * This setting affects touch-screen devices only.
       * If a chart is on a page, and panEventsEnabled are set to true,
       * the page won't move if the user touches the chart first.
       * If a chart is big enough and occupies all the screen of your touch device,
       * the user won’t be able to move the page at all. That's why the default value is "false".
       * If you think that selecting or or panning the chart is a primary purpose of your chart users,
       * you should set panEventsEnabled to true.
       */
  var panEventsEnabled: scala.Boolean
  /**
       * Gap between panels.
       * @default 8
       */
  var panelSpacing: scala.Double
  /**
       * The opacity of plot area's border.
       */
  var plotAreaBorderAlpha: scala.Double
  /**
       * The color of the plot area's border.
       */
  var plotAreaBorderColor: java.lang.String
  /**
       * Opacity of plot area fill.
       */
  var plotAreaFillAlphas: scala.Double
  /**
       * Specifies the colors used to tint the background gradient fill of the plot area. String or Array of Strings
       */
  var plotAreaFillColors: js.Any
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
  var prefixesOfBigNumbers: js.Array[_]
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
  var prefixesOfSmallNumbers: js.Array[_]
  /**
       * Specifies whether the animation should be sequenced or all objects should appear at once.
       */
  var sequencedAnimation: scala.Boolean
  /**
       * The initial opacity of the column/line.
       * If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha.
       */
  var startAlpha: scala.Double
  /**
       * Duration of the animation, in seconds.
       */
  var startDuration: scala.Double
  /**
       * Possible values are: "linear", "<", ">" "<>", "elastic", "bounce".
       */
  var startEffect: java.lang.String
  /**
       * If true, prefixes will be used for big and small numbers.
       */
  var usePrefixes: scala.Boolean
}


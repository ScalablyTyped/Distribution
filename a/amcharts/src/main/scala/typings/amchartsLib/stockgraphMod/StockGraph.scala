package typings
package amchartsLib.stockgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockGraph
  extends amchartsLib.amgraphMod.default {
  /**
       * Specifies whether this graph will be compared if some data set is selected for comparing.
       */
  var comparable: scala.Boolean = js.native
  /**
       * Specifies a field to be used to generate comparing graph.
       * Note, this field is not the one used in your dataProvider, but toField from FieldMapping object.
       */
  var compareField: java.lang.String = js.native
  /**
       * Balloon color of comparing graph.
       */
  var compareGraphBalloonColor: java.lang.String = js.native
  /**
       * Balloon text of comparing graph.
       */
  var compareGraphBalloonText: java.lang.String = js.native
  /**
       * Bullet of comparing graph.
       * Possible values are: "square", "round", "line", "triangleUp", "triangleDown", "dashedLine", "bubble".
       */
  var compareGraphBullet: java.lang.String = js.native
  /**
       * Bullet size of comparing graph.
       */
  var compareGraphBulletSize: scala.Double = js.native
  /**
       * Corner radius of comparing graph (if type is "column").
       */
  var compareGraphCornerRadiusTop: scala.Double = js.native
  /**
       * Dash length of compare graph.
       */
  var compareGraphDashLength: scala.Double = js.native
  /**
       * Fill alpha of comparing graph.
       */
  var compareGraphFillAlphas: scala.Double = js.native
  /**
       * Fill color of comparing graph.
       */
  var compareGraphFillColors: java.lang.String = js.native
  /**
       * Opacity of comparing graph line.
       */
  var compareGraphLineAlpha: scala.Double = js.native
  /**
       * Thickness of compare graph.
       */
  var compareGraphLineThickness: scala.Double = js.native
  /**
       * Type of comparing graph. Possible values are: "line", "column", "step", "smoothedLine." line
       */
  var compareGraphType: java.lang.String = js.native
  /**
       * Specifies if compare graph is visible in legend.
       * @default true
       */
  var compareGraphVisibleInLegend: scala.Boolean = js.native
  /**
       * When data is grouped to periods, the graph must know which period value should be used.
       * Possible values are: "Open", "Low", "High", "Close", "Average" and "Sum".
       * @default "Close"
       */
  var periodValue: java.lang.String = js.native
  /**
       * Specifies whether data set color should be used as this graph's lineColor.
       * @default true
       */
  var useDataSetColors: scala.Boolean = js.native
}


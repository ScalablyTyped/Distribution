package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies titles in a chart.
  *
  * In a chart there may be the following titles: the main title, the sub title, and axis titles of the x- and y-axis.
  */
trait ChartTitle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shape
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier {
  /**
    * If this property is `TRUE` the position is calculated by the application automatically. Setting this property to false will have no effect. Instead
    * use the interface {@link com.sun.star.drawing.XShape} to set a concrete position.
    */
  var AutomaticPosition: scala.Boolean
  /**
    * contains the text of the title.
    *
    * Note that you cannot change attributes of parts of a title, e.g., put one word in bold characters. All formatting affects the entire string.
    */
  var String: java.lang.String
  /**
    * specifies the rotation of the shape in 100th of degrees.
    *
    * Especially in three-dimensional charts, this property comes in handy if you want to align the axis titles with the axis, which are usually not
    * vertical or horizontal in the two-dimensional projection.
    */
  var TextRotation: scala.Double
}


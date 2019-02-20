package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the service of shapes in a spreadsheet document */
trait Shape
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Shape {
  /**
    * contains the object where this shape is anchored on.
    *
    * Possible objects are {@link XSpreadsheet} and XCell.
    */
  var Anchor: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * contains the horizontal position of the object (1/100 mm).
    *
    * The position is relative to the anchor object.
    *
    * If the underlying table layout direction is left to right the position is the difference of the left top edge of the anchor object and the left top
    * edge of the drawing object.
    *
    * If the underlying table layout direction is right to left the position is the difference of the right top edge of the anchor object and the right top
    * edge of the drawing object.
    */
  var HoriOrientPosition: scala.Double
  /**
    * contains the vertical position of the object (1/100 mm).
    *
    * The position is relative to the anchor object.
    *
    * If the underlying table layout direction is left to right the position is the difference of the left top edge of the anchor object and the left top
    * edge of the drawing object.
    *
    * If the underlying table layout direction is right to left the position is the difference of the right top edge of the anchor object and the right top
    * edge of the drawing object.
    */
  var VertOrientPosition: scala.Double
}


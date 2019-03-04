package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a homogeneous matrix by three homogeneous lines */
trait HomogenMatrix extends js.Object {
  var Line1: HomogenMatrixLine
  var Line2: HomogenMatrixLine
  var Line3: HomogenMatrixLine
  var Line4: HomogenMatrixLine
}

object HomogenMatrix {
  @scala.inline
  def apply(
    Line1: HomogenMatrixLine,
    Line2: HomogenMatrixLine,
    Line3: HomogenMatrixLine,
    Line4: HomogenMatrixLine
  ): HomogenMatrix = {
    val __obj = js.Dynamic.literal(Line1 = Line1, Line2 = Line2, Line3 = Line3, Line4 = Line4)
  
    __obj.asInstanceOf[HomogenMatrix]
  }
}


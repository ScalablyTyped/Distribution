package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Selection")
@js.native
class Selection protected () extends js.Object {
  val Application: Application = js.native
  val ChildShapeRange: ShapeRange = js.native
  val HasChildShapeRange: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Selection_typekey`: Selection = js.native
  val ShapeRange: ShapeRange = js.native
  val SlideRange: SlideRange = js.native
  val TextRange: TextRange = js.native
  val TextRange2: activexDashOfficeLib.OfficeNs.TextRange2 = js.native
  val Type: PpSelectionType = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Unselect(): scala.Unit = js.native
}


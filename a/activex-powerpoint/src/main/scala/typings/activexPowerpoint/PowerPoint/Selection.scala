package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.TextRange2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val ChildShapeRange: typings.activexPowerpoint.PowerPoint.ShapeRange
  val HasChildShapeRange: Boolean
  val Parent: js.Any
  @JSName("PowerPoint.Selection_typekey")
  var PowerPointDotSelection_typekey: Selection
  val ShapeRange: typings.activexPowerpoint.PowerPoint.ShapeRange
  val SlideRange: typings.activexPowerpoint.PowerPoint.SlideRange
  val TextRange: typings.activexPowerpoint.PowerPoint.TextRange
  val TextRange2: typings.activexOffice.Office.TextRange2
  val Type: PpSelectionType
  def Copy(): Unit
  def Cut(): Unit
  def Delete(): Unit
  def Unselect(): Unit
}

object Selection {
  @scala.inline
  def apply(
    Application: Application,
    ChildShapeRange: ShapeRange,
    Copy: () => Unit,
    Cut: () => Unit,
    Delete: () => Unit,
    HasChildShapeRange: Boolean,
    Parent: js.Any,
    PowerPointDotSelection_typekey: Selection,
    ShapeRange: ShapeRange,
    SlideRange: SlideRange,
    TextRange: TextRange,
    TextRange2: TextRange2,
    Type: PpSelectionType,
    Unselect: () => Unit
  ): Selection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ChildShapeRange = ChildShapeRange.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), HasChildShapeRange = HasChildShapeRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ShapeRange = ShapeRange.asInstanceOf[js.Any], SlideRange = SlideRange.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], TextRange2 = TextRange2.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Unselect = js.Any.fromFunction0(Unselect))
    __obj.updateDynamic("PowerPoint.Selection_typekey")(PowerPointDotSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
}


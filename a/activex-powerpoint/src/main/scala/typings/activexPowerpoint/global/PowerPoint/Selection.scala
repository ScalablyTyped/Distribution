package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpSelectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Selection")
@js.native
class Selection protected ()
  extends typings.activexPowerpoint.PowerPoint.Selection {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val ChildShapeRange: typings.activexPowerpoint.PowerPoint.ShapeRange = js.native
  /* CompleteClass */
  override val HasChildShapeRange: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Selection_typekey")
  override var PowerPointDotSelection_typekey: typings.activexPowerpoint.PowerPoint.Selection = js.native
  /* CompleteClass */
  override val ShapeRange: typings.activexPowerpoint.PowerPoint.ShapeRange = js.native
  /* CompleteClass */
  override val SlideRange: typings.activexPowerpoint.PowerPoint.SlideRange = js.native
  /* CompleteClass */
  override val TextRange: typings.activexPowerpoint.PowerPoint.TextRange = js.native
  /* CompleteClass */
  override val TextRange2: typings.activexOffice.Office.TextRange2 = js.native
  /* CompleteClass */
  override val Type: PpSelectionType = js.native
  /* CompleteClass */
  override def Copy(): Unit = js.native
  /* CompleteClass */
  override def Cut(): Unit = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Unselect(): Unit = js.native
}


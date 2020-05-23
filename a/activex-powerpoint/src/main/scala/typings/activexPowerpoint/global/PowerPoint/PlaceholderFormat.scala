package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoShapeType
import typings.activexPowerpoint.PowerPoint.PpPlaceholderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PlaceholderFormat")
@js.native
class PlaceholderFormat protected ()
  extends typings.activexPowerpoint.PowerPoint.PlaceholderFormat {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val ContainedType: MsoShapeType = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.PlaceholderFormat_typekey")
  override var PowerPointDotPlaceholderFormat_typekey: typings.activexPowerpoint.PowerPoint.PlaceholderFormat = js.native
  /* CompleteClass */
  override val Type: PpPlaceholderType = js.native
}


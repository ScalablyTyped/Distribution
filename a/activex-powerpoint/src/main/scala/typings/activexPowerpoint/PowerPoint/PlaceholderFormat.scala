package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoShapeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderFormat extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val ContainedType: MsoShapeType
  var Name: String
  val Parent: js.Any
  @JSName("PowerPoint.PlaceholderFormat_typekey")
  var PowerPointDotPlaceholderFormat_typekey: PlaceholderFormat
  val Type: PpPlaceholderType
}

object PlaceholderFormat {
  @scala.inline
  def apply(
    Application: Application,
    ContainedType: MsoShapeType,
    Name: String,
    Parent: js.Any,
    PowerPointDotPlaceholderFormat_typekey: PlaceholderFormat,
    Type: PpPlaceholderType
  ): PlaceholderFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ContainedType = ContainedType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlaceholderFormat_typekey")(PowerPointDotPlaceholderFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderFormat]
  }
}


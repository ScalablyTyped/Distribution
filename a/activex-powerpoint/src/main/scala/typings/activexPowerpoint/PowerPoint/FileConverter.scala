package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConverter extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val CanOpen: Boolean
  val CanSave: Boolean
  val ClassName: String
  val Creator: FileConverters
  val Extensions: String
  val FormatName: String
  val Name: String
  val OpenFormat: Double
  val Parent: FileConverters
  val Path: String
  @JSName("PowerPoint.FileConverter_typekey")
  var PowerPointDotFileConverter_typekey: FileConverter
  val SaveFormat: Double
}

object FileConverter {
  @scala.inline
  def apply(
    Application: Application,
    CanOpen: Boolean,
    CanSave: Boolean,
    ClassName: String,
    Creator: FileConverters,
    Extensions: String,
    FormatName: String,
    Name: String,
    OpenFormat: Double,
    Parent: FileConverters,
    Path: String,
    PowerPointDotFileConverter_typekey: FileConverter,
    SaveFormat: Double
  ): FileConverter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CanOpen = CanOpen.asInstanceOf[js.Any], CanSave = CanSave.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], FormatName = FormatName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OpenFormat = OpenFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], SaveFormat = SaveFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.FileConverter_typekey")(PowerPointDotFileConverter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverter]
  }
}


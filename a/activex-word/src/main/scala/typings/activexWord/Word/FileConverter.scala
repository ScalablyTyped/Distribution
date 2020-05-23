package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConverter extends js.Object {
  val Application: typings.activexWord.Word.Application
  val CanOpen: Boolean
  val CanSave: Boolean
  val ClassName: String
  val Creator: Double
  val Extensions: String
  val FormatName: String
  val Name: String
  val OpenFormat: Double
  val Parent: js.Any
  val Path: String
  val SaveFormat: Double
  @JSName("Word.FileConverter_typekey")
  var WordDotFileConverter_typekey: FileConverter
}

object FileConverter {
  @scala.inline
  def apply(
    Application: Application,
    CanOpen: Boolean,
    CanSave: Boolean,
    ClassName: String,
    Creator: Double,
    Extensions: String,
    FormatName: String,
    Name: String,
    OpenFormat: Double,
    Parent: js.Any,
    Path: String,
    SaveFormat: Double,
    WordDotFileConverter_typekey: FileConverter
  ): FileConverter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CanOpen = CanOpen.asInstanceOf[js.Any], CanSave = CanSave.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Extensions = Extensions.asInstanceOf[js.Any], FormatName = FormatName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OpenFormat = OpenFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], SaveFormat = SaveFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FileConverter_typekey")(WordDotFileConverter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverter]
  }
}


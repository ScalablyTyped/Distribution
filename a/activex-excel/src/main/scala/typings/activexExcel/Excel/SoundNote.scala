package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundNote extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.SoundNote_typekey")
  var ExcelDotSoundNote_typekey: SoundNote
  val Parent: js.Any
  def Delete(): js.Any
  def Import(Filename: String): js.Any
  def Play(): js.Any
  def Record(): js.Any
}

object SoundNote {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotSoundNote_typekey: SoundNote,
    Import: String => js.Any,
    Parent: js.Any,
    Play: () => js.Any,
    Record: () => js.Any
  ): SoundNote = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Import = js.Any.fromFunction1(Import), Parent = Parent.asInstanceOf[js.Any], Play = js.Any.fromFunction0(Play), Record = js.Any.fromFunction0(Record))
    __obj.updateDynamic("Excel.SoundNote_typekey")(ExcelDotSoundNote_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundNote]
  }
}


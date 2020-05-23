package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundFormat extends js.Object {
  @JSName("PowerPoint.SoundFormat_typekey")
  var PowerPointDotSoundFormat_typekey: SoundFormat
  val SourceFullName: String
  val Type: PpSoundFormatType
  def Export(FileName: String): PpSoundFormatType
  def Import(FileName: String): Unit
  def Play(): Unit
}

object SoundFormat {
  @scala.inline
  def apply(
    Export: String => PpSoundFormatType,
    Import: String => Unit,
    Play: () => Unit,
    PowerPointDotSoundFormat_typekey: SoundFormat,
    SourceFullName: String,
    Type: PpSoundFormatType
  ): SoundFormat = {
    val __obj = js.Dynamic.literal(Export = js.Any.fromFunction1(Export), Import = js.Any.fromFunction1(Import), Play = js.Any.fromFunction0(Play), SourceFullName = SourceFullName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SoundFormat_typekey")(PowerPointDotSoundFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundFormat]
  }
}


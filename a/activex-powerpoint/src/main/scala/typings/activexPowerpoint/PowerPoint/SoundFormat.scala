package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SoundFormat")
@js.native
class SoundFormat protected () extends js.Object {
  @JSName("PowerPoint.SoundFormat_typekey")
  var PowerPointDotSoundFormat_typekey: SoundFormat = js.native
  val SourceFullName: String = js.native
  val Type: PpSoundFormatType = js.native
  def Export(FileName: String): PpSoundFormatType = js.native
  def Import(FileName: String): Unit = js.native
  def Play(): Unit = js.native
}


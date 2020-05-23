package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpSoundFormatType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SoundFormat")
@js.native
class SoundFormat protected ()
  extends typings.activexPowerpoint.PowerPoint.SoundFormat {
  /* CompleteClass */
  @JSName("PowerPoint.SoundFormat_typekey")
  override var PowerPointDotSoundFormat_typekey: typings.activexPowerpoint.PowerPoint.SoundFormat = js.native
  /* CompleteClass */
  override val SourceFullName: String = js.native
  /* CompleteClass */
  override val Type: PpSoundFormatType = js.native
  /* CompleteClass */
  override def Export(FileName: String): PpSoundFormatType = js.native
  /* CompleteClass */
  override def Import(FileName: String): Unit = js.native
  /* CompleteClass */
  override def Play(): Unit = js.native
}


package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SoundEffect")
@js.native
class SoundEffect protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.SoundEffect_typekey")
  var PowerPointDotSoundEffect_typekey: SoundEffect = js.native
  var Type: PpSoundEffectType = js.native
  def ImportFromFile(FileName: String): Unit = js.native
  def Play(): Unit = js.native
}


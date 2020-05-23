package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Name: String
  val Parent: js.Any
  @JSName("PowerPoint.SoundEffect_typekey")
  var PowerPointDotSoundEffect_typekey: SoundEffect
  var Type: PpSoundEffectType
  def ImportFromFile(FileName: String): Unit
  def Play(): Unit
}

object SoundEffect {
  @scala.inline
  def apply(
    Application: Application,
    ImportFromFile: String => Unit,
    Name: String,
    Parent: js.Any,
    Play: () => Unit,
    PowerPointDotSoundEffect_typekey: SoundEffect,
    Type: PpSoundEffectType
  ): SoundEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ImportFromFile = js.Any.fromFunction1(ImportFromFile), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Play = js.Any.fromFunction0(Play), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SoundEffect_typekey")(PowerPointDotSoundEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundEffect]
  }
}


package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundEffect extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.SoundEffect_typekey")
  var PowerPointDotSoundEffect_typekey: SoundEffect = js.native
  var Type: PpSoundEffectType = js.native
  def ImportFromFile(FileName: String): Unit = js.native
  def Play(): Unit = js.native
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
  @scala.inline
  implicit class SoundEffectOps[Self <: SoundEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportFromFile(value: String => Unit): Self = this.set("ImportFromFile", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("Play", js.Any.fromFunction0(value))
    @scala.inline
    def setPowerPointDotSoundEffect_typekey(value: SoundEffect): Self = this.set("PowerPoint.SoundEffect_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PpSoundEffectType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}


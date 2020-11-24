package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoundFormat extends js.Object {
  
  def Export(FileName: String): PpSoundFormatType = js.native
  
  def Import(FileName: String): Unit = js.native
  
  def Play(): Unit = js.native
  
  @JSName("PowerPoint.SoundFormat_typekey")
  var PowerPointDotSoundFormat_typekey: SoundFormat = js.native
  
  val SourceFullName: String = js.native
  
  val Type: PpSoundFormatType = js.native
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
  
  @scala.inline
  implicit class SoundFormatOps[Self <: SoundFormat] (val x: Self) extends AnyVal {
    
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
    def setExport(value: String => PpSoundFormatType): Self = this.set("Export", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImport(value: String => Unit): Self = this.set("Import", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("Play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPowerPointDotSoundFormat_typekey(value: SoundFormat): Self = this.set("PowerPoint.SoundFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFullName(value: String): Self = this.set("SourceFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PpSoundFormatType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}

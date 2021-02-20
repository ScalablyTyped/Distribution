package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoundFormat extends StObject {
  
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
  implicit class SoundFormatMutableBuilder[Self <: SoundFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExport(value: String => PpSoundFormatType): Self = StObject.set(x, "Export", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImport(value: String => Unit): Self = StObject.set(x, "Import", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "Play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPowerPointDotSoundFormat_typekey(value: SoundFormat): Self = StObject.set(x, "PowerPoint.SoundFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFullName(value: String): Self = StObject.set(x, "SourceFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PpSoundFormatType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}

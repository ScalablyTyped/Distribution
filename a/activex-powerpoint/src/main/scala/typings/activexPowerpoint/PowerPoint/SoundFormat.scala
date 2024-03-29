package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundFormat extends StObject {
  
  def Export(FileName: String): PpSoundFormatType
  
  def Import(FileName: String): Unit
  
  def Play(): Unit
  
  /* private */ @JSName("PowerPoint.SoundFormat_typekey")
  var PowerPointDotSoundFormat_typekey: SoundFormat
  
  val SourceFullName: String
  
  val Type: PpSoundFormatType
}
object SoundFormat {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SoundFormat] (val x: Self) extends AnyVal {
    
    inline def setExport(value: String => PpSoundFormatType): Self = StObject.set(x, "Export", js.Any.fromFunction1(value))
    
    inline def setImport(value: String => Unit): Self = StObject.set(x, "Import", js.Any.fromFunction1(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "Play", js.Any.fromFunction0(value))
    
    inline def setPowerPointDotSoundFormat_typekey(value: SoundFormat): Self = StObject.set(x, "PowerPoint.SoundFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setSourceFullName(value: String): Self = StObject.set(x, "SourceFullName", value.asInstanceOf[js.Any])
    
    inline def setType(value: PpSoundFormatType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}

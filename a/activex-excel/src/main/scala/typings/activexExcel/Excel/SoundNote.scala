package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundNote extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def Delete(): Any
  
  /* private */ @JSName("Excel.SoundNote_typekey")
  var ExcelDotSoundNote_typekey: SoundNote
  
  def Import(Filename: String): Any
  
  val Parent: Any
  
  def Play(): Any
  
  def Record(): Any
}
object SoundNote {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Any,
    ExcelDotSoundNote_typekey: SoundNote,
    Import: String => Any,
    Parent: Any,
    Play: () => Any,
    Record: () => Any
  ): SoundNote = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Import = js.Any.fromFunction1(Import), Parent = Parent.asInstanceOf[js.Any], Play = js.Any.fromFunction0(Play), Record = js.Any.fromFunction0(Record))
    __obj.updateDynamic("Excel.SoundNote_typekey")(ExcelDotSoundNote_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundNote]
  }
  
  extension [Self <: SoundNote](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotSoundNote_typekey(value: SoundNote): Self = StObject.set(x, "Excel.SoundNote_typekey", value.asInstanceOf[js.Any])
    
    inline def setImport(value: String => Any): Self = StObject.set(x, "Import", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: () => Any): Self = StObject.set(x, "Play", js.Any.fromFunction0(value))
    
    inline def setRecord(value: () => Any): Self = StObject.set(x, "Record", js.Any.fromFunction0(value))
  }
}

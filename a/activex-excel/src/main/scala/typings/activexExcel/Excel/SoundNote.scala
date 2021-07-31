package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundNote extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def Delete(): js.Any
  
  @JSName("Excel.SoundNote_typekey")
  var ExcelDotSoundNote_typekey: SoundNote
  
  def Import(Filename: String): js.Any
  
  val Parent: js.Any
  
  def Play(): js.Any
  
  def Record(): js.Any
}
object SoundNote {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotSoundNote_typekey: SoundNote,
    Import: String => js.Any,
    Parent: js.Any,
    Play: () => js.Any,
    Record: () => js.Any
  ): SoundNote = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Import = js.Any.fromFunction1(Import), Parent = Parent.asInstanceOf[js.Any], Play = js.Any.fromFunction0(Play), Record = js.Any.fromFunction0(Record))
    __obj.updateDynamic("Excel.SoundNote_typekey")(ExcelDotSoundNote_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundNote]
  }
  
  @scala.inline
  implicit class SoundNoteMutableBuilder[Self <: SoundNote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotSoundNote_typekey(value: SoundNote): Self = StObject.set(x, "Excel.SoundNote_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(value: String => js.Any): Self = StObject.set(x, "Import", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: () => js.Any): Self = StObject.set(x, "Play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecord(value: () => js.Any): Self = StObject.set(x, "Record", js.Any.fromFunction0(value))
  }
}

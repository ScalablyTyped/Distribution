package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editor extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  def DeleteAll(): Unit
  
  val ID: String
  
  val Name: String
  
  val NextRange: typings.activexWord.Word.Range
  
  val Parent: js.Any
  
  val Range: typings.activexWord.Word.Range
  
  def SelectAll(): Unit
  
  /* private */ @JSName("Word.Editor_typekey")
  var WordDotEditor_typekey: Editor
}
object Editor {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    DeleteAll: () => Unit,
    ID: String,
    Name: String,
    NextRange: Range,
    Parent: js.Any,
    Range: Range,
    SelectAll: () => Unit,
    WordDotEditor_typekey: Editor
  ): Editor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DeleteAll = js.Any.fromFunction0(DeleteAll), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NextRange = NextRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("Word.Editor_typekey")(WordDotEditor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  
  extension [Self <: Editor](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setDeleteAll(value: () => Unit): Self = StObject.set(x, "DeleteAll", js.Any.fromFunction0(value))
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNextRange(value: Range): Self = StObject.set(x, "NextRange", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setSelectAll(value: () => Unit): Self = StObject.set(x, "SelectAll", js.Any.fromFunction0(value))
    
    inline def setWordDotEditor_typekey(value: Editor): Self = StObject.set(x, "Word.Editor_typekey", value.asInstanceOf[js.Any])
  }
}

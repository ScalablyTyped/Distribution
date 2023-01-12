package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCorrectEntries extends StObject {
  
  def Add(Name: String, Value: String): AutoCorrectEntry
  
  def AddRichText(Name: String, Range: Range): AutoCorrectEntry
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): AutoCorrectEntry
  
  val Parent: Any
  
  /* private */ @JSName("Word.AutoCorrectEntries_typekey")
  var WordDotAutoCorrectEntries_typekey: AutoCorrectEntries
}
object AutoCorrectEntries {
  
  inline def apply(
    Add: (String, String) => AutoCorrectEntry,
    AddRichText: (String, Range) => AutoCorrectEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => AutoCorrectEntry,
    Parent: Any,
    WordDotAutoCorrectEntries_typekey: AutoCorrectEntries
  ): AutoCorrectEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddRichText = js.Any.fromFunction2(AddRichText), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCorrectEntries_typekey")(WordDotAutoCorrectEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrectEntries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoCorrectEntries] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (String, String) => AutoCorrectEntry): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setAddRichText(value: (String, Range) => AutoCorrectEntry): Self = StObject.set(x, "AddRichText", js.Any.fromFunction2(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => AutoCorrectEntry): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotAutoCorrectEntries_typekey(value: AutoCorrectEntries): Self = StObject.set(x, "Word.AutoCorrectEntries_typekey", value.asInstanceOf[js.Any])
  }
}

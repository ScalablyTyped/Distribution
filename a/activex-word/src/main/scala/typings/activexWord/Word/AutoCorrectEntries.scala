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
  
  def Item(Index: js.Any): AutoCorrectEntry
  
  val Parent: js.Any
  
  @JSName("Word.AutoCorrectEntries_typekey")
  var WordDotAutoCorrectEntries_typekey: AutoCorrectEntries
}
object AutoCorrectEntries {
  
  @scala.inline
  def apply(
    Add: (String, String) => AutoCorrectEntry,
    AddRichText: (String, Range) => AutoCorrectEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoCorrectEntry,
    Parent: js.Any,
    WordDotAutoCorrectEntries_typekey: AutoCorrectEntries
  ): AutoCorrectEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddRichText = js.Any.fromFunction2(AddRichText), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCorrectEntries_typekey")(WordDotAutoCorrectEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrectEntries]
  }
  
  @scala.inline
  implicit class AutoCorrectEntriesMutableBuilder[Self <: AutoCorrectEntries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, String) => AutoCorrectEntry): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddRichText(value: (String, Range) => AutoCorrectEntry): Self = StObject.set(x, "AddRichText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => AutoCorrectEntry): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotAutoCorrectEntries_typekey(value: AutoCorrectEntries): Self = StObject.set(x, "Word.AutoCorrectEntries_typekey", value.asInstanceOf[js.Any])
  }
}

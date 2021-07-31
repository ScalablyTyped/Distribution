package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathAutoCorrectEntries extends StObject {
  
  def Add(Name: String, Value: String): OMathAutoCorrectEntry
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): OMathAutoCorrectEntry
  
  val Parent: js.Any
  
  @JSName("Word.OMathAutoCorrectEntries_typekey")
  var WordDotOMathAutoCorrectEntries_typekey: OMathAutoCorrectEntries
}
object OMathAutoCorrectEntries {
  
  @scala.inline
  def apply(
    Add: (String, String) => OMathAutoCorrectEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => OMathAutoCorrectEntry,
    Parent: js.Any,
    WordDotOMathAutoCorrectEntries_typekey: OMathAutoCorrectEntries
  ): OMathAutoCorrectEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathAutoCorrectEntries_typekey")(WordDotOMathAutoCorrectEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathAutoCorrectEntries]
  }
  
  @scala.inline
  implicit class OMathAutoCorrectEntriesMutableBuilder[Self <: OMathAutoCorrectEntries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, String) => OMathAutoCorrectEntry): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => OMathAutoCorrectEntry): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathAutoCorrectEntries_typekey(value: OMathAutoCorrectEntries): Self = StObject.set(x, "Word.OMathAutoCorrectEntries_typekey", value.asInstanceOf[js.Any])
  }
}

package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictionaries extends StObject {
  
  var ActiveCustomDictionary: Dictionary = js.native
  
  def Add(FileName: String): Dictionary = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def ClearAll(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): Dictionary = js.native
  
  val Maximum: Double = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.Dictionaries_typekey")
  var WordDotDictionaries_typekey: Dictionaries = js.native
}
object Dictionaries {
  
  @scala.inline
  def apply(
    ActiveCustomDictionary: Dictionary,
    Add: String => Dictionary,
    Application: Application,
    ClearAll: () => Unit,
    Count: Double,
    Creator: Double,
    Item: js.Any => Dictionary,
    Maximum: Double,
    Parent: js.Any,
    WordDotDictionaries_typekey: Dictionaries
  ): Dictionaries = {
    val __obj = js.Dynamic.literal(ActiveCustomDictionary = ActiveCustomDictionary.asInstanceOf[js.Any], Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], ClearAll = js.Any.fromFunction0(ClearAll), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Maximum = Maximum.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Dictionaries_typekey")(WordDotDictionaries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictionaries]
  }
  
  @scala.inline
  implicit class DictionariesMutableBuilder[Self <: Dictionaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveCustomDictionary(value: Dictionary): Self = StObject.set(x, "ActiveCustomDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd(value: String => Dictionary): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearAll(value: () => Unit): Self = StObject.set(x, "ClearAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Dictionary): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotDictionaries_typekey(value: Dictionaries): Self = StObject.set(x, "Word.Dictionaries_typekey", value.asInstanceOf[js.Any])
  }
}

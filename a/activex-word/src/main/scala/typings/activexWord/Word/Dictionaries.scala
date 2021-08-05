package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictionaries extends StObject {
  
  var ActiveCustomDictionary: Dictionary
  
  def Add(FileName: String): Dictionary
  
  val Application: typings.activexWord.Word.Application
  
  def ClearAll(): Unit
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: js.Any): Dictionary
  
  val Maximum: Double
  
  val Parent: js.Any
  
  /* private */ @JSName("Word.Dictionaries_typekey")
  var WordDotDictionaries_typekey: Dictionaries
}
object Dictionaries {
  
  inline def apply(
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
  
  extension [Self <: Dictionaries](x: Self) {
    
    inline def setActiveCustomDictionary(value: Dictionary): Self = StObject.set(x, "ActiveCustomDictionary", value.asInstanceOf[js.Any])
    
    inline def setAdd(value: String => Dictionary): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClearAll(value: () => Unit): Self = StObject.set(x, "ClearAll", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any => Dictionary): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotDictionaries_typekey(value: Dictionaries): Self = StObject.set(x, "Word.Dictionaries_typekey", value.asInstanceOf[js.Any])
  }
}

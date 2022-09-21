package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HangulHanjaConversionDictionaries extends StObject {
  
  var ActiveCustomDictionary: Dictionary
  
  def Add(FileName: String): Dictionary
  
  val Application: typings.activexWord.Word.Application
  
  val BuiltinDictionary: Dictionary
  
  def ClearAll(): Unit
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): Dictionary
  
  val Maximum: Double
  
  val Parent: Any
  
  /* private */ @JSName("Word.HangulHanjaConversionDictionaries_typekey")
  var WordDotHangulHanjaConversionDictionaries_typekey: HangulHanjaConversionDictionaries
}
object HangulHanjaConversionDictionaries {
  
  inline def apply(
    ActiveCustomDictionary: Dictionary,
    Add: String => Dictionary,
    Application: Application,
    BuiltinDictionary: Dictionary,
    ClearAll: () => Unit,
    Count: Double,
    Creator: Double,
    Item: Any => Dictionary,
    Maximum: Double,
    Parent: Any,
    WordDotHangulHanjaConversionDictionaries_typekey: HangulHanjaConversionDictionaries
  ): HangulHanjaConversionDictionaries = {
    val __obj = js.Dynamic.literal(ActiveCustomDictionary = ActiveCustomDictionary.asInstanceOf[js.Any], Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], BuiltinDictionary = BuiltinDictionary.asInstanceOf[js.Any], ClearAll = js.Any.fromFunction0(ClearAll), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Maximum = Maximum.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HangulHanjaConversionDictionaries_typekey")(WordDotHangulHanjaConversionDictionaries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HangulHanjaConversionDictionaries]
  }
  
  extension [Self <: HangulHanjaConversionDictionaries](x: Self) {
    
    inline def setActiveCustomDictionary(value: Dictionary): Self = StObject.set(x, "ActiveCustomDictionary", value.asInstanceOf[js.Any])
    
    inline def setAdd(value: String => Dictionary): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuiltinDictionary(value: Dictionary): Self = StObject.set(x, "BuiltinDictionary", value.asInstanceOf[js.Any])
    
    inline def setClearAll(value: () => Unit): Self = StObject.set(x, "ClearAll", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Dictionary): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotHangulHanjaConversionDictionaries_typekey(value: HangulHanjaConversionDictionaries): Self = StObject.set(x, "Word.HangulHanjaConversionDictionaries_typekey", value.asInstanceOf[js.Any])
  }
}

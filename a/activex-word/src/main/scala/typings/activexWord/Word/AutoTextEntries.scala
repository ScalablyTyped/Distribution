package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTextEntries extends StObject {
  
  def Add(Name: String, Range: Range): AutoTextEntry
  
  def AppendToSpike(Range: Range): AutoTextEntry
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): AutoTextEntry
  
  val Parent: Any
  
  /* private */ @JSName("Word.AutoTextEntries_typekey")
  var WordDotAutoTextEntries_typekey: AutoTextEntries
}
object AutoTextEntries {
  
  inline def apply(
    Add: (String, Range) => AutoTextEntry,
    AppendToSpike: Range => AutoTextEntry,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => AutoTextEntry,
    Parent: Any,
    WordDotAutoTextEntries_typekey: AutoTextEntries
  ): AutoTextEntries = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AppendToSpike = js.Any.fromFunction1(AppendToSpike), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoTextEntries_typekey")(WordDotAutoTextEntries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTextEntries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoTextEntries] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (String, Range) => AutoTextEntry): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setAppendToSpike(value: Range => AutoTextEntry): Self = StObject.set(x, "AppendToSpike", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => AutoTextEntry): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotAutoTextEntries_typekey(value: AutoTextEntries): Self = StObject.set(x, "Word.AutoTextEntries_typekey", value.asInstanceOf[js.Any])
  }
}

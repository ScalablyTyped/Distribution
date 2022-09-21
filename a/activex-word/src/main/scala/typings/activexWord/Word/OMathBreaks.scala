package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathBreaks extends StObject {
  
  def Add(Range: Range): OMathBreak
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): OMathBreak
  
  val Parent: Any
  
  /* private */ @JSName("Word.OMathBreaks_typekey")
  var WordDotOMathBreaks_typekey: OMathBreaks
}
object OMathBreaks {
  
  inline def apply(
    Add: Range => OMathBreak,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => OMathBreak,
    Parent: Any,
    WordDotOMathBreaks_typekey: OMathBreaks
  ): OMathBreaks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBreaks_typekey")(WordDotOMathBreaks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBreaks]
  }
  
  extension [Self <: OMathBreaks](x: Self) {
    
    inline def setAdd(value: Range => OMathBreak): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => OMathBreak): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathBreaks_typekey(value: OMathBreaks): Self = StObject.set(x, "Word.OMathBreaks_typekey", value.asInstanceOf[js.Any])
  }
}

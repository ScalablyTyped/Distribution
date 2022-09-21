package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Languages extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): Language
  
  val Parent: Any
  
  /* private */ @JSName("Word.Languages_typekey")
  var WordDotLanguages_typekey: Languages
}
object Languages {
  
  inline def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => Language,
    Parent: Any,
    WordDotLanguages_typekey: Languages
  ): Languages = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Languages_typekey")(WordDotLanguages_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Languages]
  }
  
  extension [Self <: Languages](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Language): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotLanguages_typekey(value: Languages): Self = StObject.set(x, "Word.Languages_typekey", value.asInstanceOf[js.Any])
  }
}

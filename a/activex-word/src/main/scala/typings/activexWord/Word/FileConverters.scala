package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileConverters extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var ConvertMacWordChevrons: WdChevronConvertRule
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): FileConverter
  
  val Parent: Any
  
  /* private */ @JSName("Word.FileConverters_typekey")
  var WordDotFileConverters_typekey: FileConverters
}
object FileConverters {
  
  inline def apply(
    Application: Application,
    ConvertMacWordChevrons: WdChevronConvertRule,
    Count: Double,
    Creator: Double,
    Item: Any => FileConverter,
    Parent: Any,
    WordDotFileConverters_typekey: FileConverters
  ): FileConverters = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ConvertMacWordChevrons = ConvertMacWordChevrons.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FileConverters_typekey")(WordDotFileConverters_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConverters]
  }
  
  extension [Self <: FileConverters](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setConvertMacWordChevrons(value: WdChevronConvertRule): Self = StObject.set(x, "ConvertMacWordChevrons", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => FileConverter): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotFileConverters_typekey(value: FileConverters): Self = StObject.set(x, "Word.FileConverters_typekey", value.asInstanceOf[js.Any])
  }
}

package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Break extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val PageIndex: Double
  
  val Parent: Any
  
  val Range: typings.activexWord.Word.Range
  
  /* private */ @JSName("Word.Break_typekey")
  var WordDotBreak_typekey: Break
}
object Break {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    PageIndex: Double,
    Parent: Any,
    Range: Range,
    WordDotBreak_typekey: Break
  ): Break = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], PageIndex = PageIndex.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Break_typekey")(WordDotBreak_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Break]
  }
  
  extension [Self <: Break](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "PageIndex", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setWordDotBreak_typekey(value: Break): Self = StObject.set(x, "Word.Break_typekey", value.asInstanceOf[js.Any])
  }
}

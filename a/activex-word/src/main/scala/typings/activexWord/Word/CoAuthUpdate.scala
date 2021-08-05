package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoAuthUpdate extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Parent: js.Any
  
  val Range: typings.activexWord.Word.Range
  
  /* private */ @JSName("Word.CoAuthUpdate_typekey")
  var WordDotCoAuthUpdate_typekey: CoAuthUpdate
}
object CoAuthUpdate {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Range: Range,
    WordDotCoAuthUpdate_typekey: CoAuthUpdate
  ): CoAuthUpdate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthUpdate_typekey")(WordDotCoAuthUpdate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthUpdate]
  }
  
  extension [Self <: CoAuthUpdate](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setWordDotCoAuthUpdate_typekey(value: CoAuthUpdate): Self = StObject.set(x, "Word.CoAuthUpdate_typekey", value.asInstanceOf[js.Any])
  }
}

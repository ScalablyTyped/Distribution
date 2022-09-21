package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCaption extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var AutoInsert: Boolean
  
  var CaptionLabel: Any
  
  val Creator: Double
  
  val Index: Double
  
  val Name: String
  
  val Parent: Any
  
  /* private */ @JSName("Word.AutoCaption_typekey")
  var WordDotAutoCaption_typekey: AutoCaption
}
object AutoCaption {
  
  inline def apply(
    Application: Application,
    AutoInsert: Boolean,
    CaptionLabel: Any,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: Any,
    WordDotAutoCaption_typekey: AutoCaption
  ): AutoCaption = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoInsert = AutoInsert.asInstanceOf[js.Any], CaptionLabel = CaptionLabel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCaption_typekey")(WordDotAutoCaption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCaption]
  }
  
  extension [Self <: AutoCaption](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoInsert(value: Boolean): Self = StObject.set(x, "AutoInsert", value.asInstanceOf[js.Any])
    
    inline def setCaptionLabel(value: Any): Self = StObject.set(x, "CaptionLabel", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotAutoCaption_typekey(value: AutoCaption): Self = StObject.set(x, "Word.AutoCaption_typekey", value.asInstanceOf[js.Any])
  }
}

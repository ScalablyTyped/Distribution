package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextRetrievalMode extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val Duplicate: TextRetrievalMode
  
  var IncludeFieldCodes: Boolean
  
  var IncludeHiddenText: Boolean
  
  val Parent: js.Any
  
  var ViewType: WdViewType
  
  /* private */ @JSName("Word.TextRetrievalMode_typekey")
  var WordDotTextRetrievalMode_typekey: TextRetrievalMode
}
object TextRetrievalMode {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Duplicate: TextRetrievalMode,
    IncludeFieldCodes: Boolean,
    IncludeHiddenText: Boolean,
    Parent: js.Any,
    ViewType: WdViewType,
    WordDotTextRetrievalMode_typekey: TextRetrievalMode
  ): TextRetrievalMode = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], IncludeFieldCodes = IncludeFieldCodes.asInstanceOf[js.Any], IncludeHiddenText = IncludeHiddenText.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextRetrievalMode_typekey")(WordDotTextRetrievalMode_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRetrievalMode]
  }
  
  extension [Self <: TextRetrievalMode](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDuplicate(value: TextRetrievalMode): Self = StObject.set(x, "Duplicate", value.asInstanceOf[js.Any])
    
    inline def setIncludeFieldCodes(value: Boolean): Self = StObject.set(x, "IncludeFieldCodes", value.asInstanceOf[js.Any])
    
    inline def setIncludeHiddenText(value: Boolean): Self = StObject.set(x, "IncludeHiddenText", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: WdViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    inline def setWordDotTextRetrievalMode_typekey(value: TextRetrievalMode): Self = StObject.set(x, "Word.TextRetrievalMode_typekey", value.asInstanceOf[js.Any])
  }
}

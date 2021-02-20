package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextRetrievalMode extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Duplicate: TextRetrievalMode = js.native
  
  var IncludeFieldCodes: Boolean = js.native
  
  var IncludeHiddenText: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var ViewType: WdViewType = js.native
  
  @JSName("Word.TextRetrievalMode_typekey")
  var WordDotTextRetrievalMode_typekey: TextRetrievalMode = js.native
}
object TextRetrievalMode {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TextRetrievalModeMutableBuilder[Self <: TextRetrievalMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicate(value: TextRetrievalMode): Self = StObject.set(x, "Duplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFieldCodes(value: Boolean): Self = StObject.set(x, "IncludeFieldCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHiddenText(value: Boolean): Self = StObject.set(x, "IncludeHiddenText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: WdViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotTextRetrievalMode_typekey(value: TextRetrievalMode): Self = StObject.set(x, "Word.TextRetrievalMode_typekey", value.asInstanceOf[js.Any])
  }
}

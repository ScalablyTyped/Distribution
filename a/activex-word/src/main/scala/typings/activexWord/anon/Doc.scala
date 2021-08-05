package typings.activexWord.anon

import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Doc extends StObject {
  
  var Cancel: Boolean
  
  val Doc: Document
  
  val SaveAsUI: Boolean
}
object Doc {
  
  inline def apply(Cancel: Boolean, Doc: Document, SaveAsUI: Boolean): Doc = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc]
  }
  
  extension [Self <: Doc](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    inline def setSaveAsUI(value: Boolean): Self = StObject.set(x, "SaveAsUI", value.asInstanceOf[js.Any])
  }
}

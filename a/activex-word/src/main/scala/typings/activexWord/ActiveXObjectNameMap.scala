package typings.activexWord

import typings.activexWord.Word.Application
import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("Word.Application")
  var WordDotApplication: Application
  
  @JSName("Word.Document")
  var WordDotDocument: Document
}
object ActiveXObjectNameMap {
  
  inline def apply(WordDotApplication: Application, WordDotDocument: Document): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Word.Application")(WordDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Document")(WordDotDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    inline def setWordDotApplication(value: Application): Self = StObject.set(x, "Word.Application", value.asInstanceOf[js.Any])
    
    inline def setWordDotDocument(value: Document): Self = StObject.set(x, "Word.Document", value.asInstanceOf[js.Any])
  }
}

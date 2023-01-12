package typings.activexWord.anon

import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocHandled extends StObject {
  
  val Doc: Document
  
  var Handled: Boolean
}
object DocHandled {
  
  inline def apply(Doc: Document, Handled: Boolean): DocHandled = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocHandled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocHandled] (val x: Self) extends AnyVal {
    
    inline def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "Handled", value.asInstanceOf[js.Any])
  }
}

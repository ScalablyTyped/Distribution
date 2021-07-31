package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDocument extends StObject {
  
  val ActiveDocument: Boolean
  
  var Cancel: Boolean
}
object ActiveDocument {
  
  @scala.inline
  def apply(ActiveDocument: Boolean, Cancel: Boolean): ActiveDocument = {
    val __obj = js.Dynamic.literal(ActiveDocument = ActiveDocument.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDocument]
  }
  
  @scala.inline
  implicit class ActiveDocumentMutableBuilder[Self <: ActiveDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveDocument(value: Boolean): Self = StObject.set(x, "ActiveDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}

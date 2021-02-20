package typings.activexWord.anon

import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocDocument extends StObject {
  
  val Doc: Document = js.native
}
object DocDocument {
  
  @scala.inline
  def apply(Doc: Document): DocDocument = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocDocument]
  }
  
  @scala.inline
  implicit class DocDocumentMutableBuilder[Self <: DocDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
  }
}

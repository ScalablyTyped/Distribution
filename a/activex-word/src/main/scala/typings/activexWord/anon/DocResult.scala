package typings.activexWord.anon

import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocResult extends StObject {
  
  val Doc: Document
  
  val DocResult: Document
}
object DocResult {
  
  inline def apply(Doc: Document, DocResult: Document): DocResult = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], DocResult = DocResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocResult] (val x: Self) extends AnyVal {
    
    inline def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    inline def setDocResult(value: Document): Self = StObject.set(x, "DocResult", value.asInstanceOf[js.Any])
  }
}

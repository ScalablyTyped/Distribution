package typings.activexWord.anon

import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocDocument extends StObject {
  
  val Doc: Document
}
object DocDocument {
  
  inline def apply(Doc: Document): DocDocument = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocDocument]
  }
  
  extension [Self <: DocDocument](x: Self) {
    
    inline def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
  }
}

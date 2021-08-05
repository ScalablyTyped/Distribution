package typings.activexWord.anon

import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handled extends StObject {
  
  val Doc: Document
  
  val Handled: Boolean
}
object Handled {
  
  inline def apply(Doc: Document, Handled: Boolean): Handled = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handled]
  }
  
  extension [Self <: Handled](x: Self) {
    
    inline def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "Handled", value.asInstanceOf[js.Any])
  }
}

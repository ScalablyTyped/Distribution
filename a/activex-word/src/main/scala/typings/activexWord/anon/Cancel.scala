package typings.activexWord.anon

import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var Cancel: Boolean
  
  val Doc: Document
}
object Cancel {
  
  inline def apply(Cancel: Boolean, Doc: Document): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
  }
}

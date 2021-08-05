package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath._XDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDocument extends StObject {
  
  val pDocument: _XDocument
}
object PDocument {
  
  inline def apply(pDocument: _XDocument): PDocument = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDocument]
  }
  
  extension [Self <: PDocument](x: Self) {
    
    inline def setPDocument(value: _XDocument): Self = StObject.set(x, "pDocument", value.asInstanceOf[js.Any])
  }
}

package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath._XDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PfCancel extends StObject {
  
  val pDocument: _XDocument
  
  var pfCancel: Boolean
}
object PfCancel {
  
  inline def apply(pDocument: _XDocument, pfCancel: Boolean): PfCancel = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any], pfCancel = pfCancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PfCancel]
  }
  
  extension [Self <: PfCancel](x: Self) {
    
    inline def setPDocument(value: _XDocument): Self = StObject.set(x, "pDocument", value.asInstanceOf[js.Any])
    
    inline def setPfCancel(value: Boolean): Self = StObject.set(x, "pfCancel", value.asInstanceOf[js.Any])
  }
}

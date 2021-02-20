package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath._XDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDocument extends StObject {
  
  val pDocument: _XDocument = js.native
}
object PDocument {
  
  @scala.inline
  def apply(pDocument: _XDocument): PDocument = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDocument]
  }
  
  @scala.inline
  implicit class PDocumentMutableBuilder[Self <: PDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPDocument(value: _XDocument): Self = StObject.set(x, "pDocument", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturedDocumentMissing extends StObject {
  
  /**
    * The identifier of the document that doesn't exist but you have specified as a featured document.
    */
  var Id: js.UndefOr[DocumentId] = js.undefined
}
object FeaturedDocumentMissing {
  
  inline def apply(): FeaturedDocumentMissing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturedDocumentMissing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturedDocumentMissing] (val x: Self) extends AnyVal {
    
    inline def setId(value: DocumentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}

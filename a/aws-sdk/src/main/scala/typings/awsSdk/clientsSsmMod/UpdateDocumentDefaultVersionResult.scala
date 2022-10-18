package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDocumentDefaultVersionResult extends StObject {
  
  /**
    * The description of a custom document that you want to set as the default version.
    */
  var Description: js.UndefOr[DocumentDefaultVersionDescription] = js.undefined
}
object UpdateDocumentDefaultVersionResult {
  
  inline def apply(): UpdateDocumentDefaultVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDocumentDefaultVersionResult]
  }
  
  extension [Self <: UpdateDocumentDefaultVersionResult](x: Self) {
    
    inline def setDescription(value: DocumentDefaultVersionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}

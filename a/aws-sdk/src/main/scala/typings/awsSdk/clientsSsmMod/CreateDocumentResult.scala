package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDocumentResult extends StObject {
  
  /**
    * Information about the SSM document.
    */
  var DocumentDescription: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentDescription] = js.undefined
}
object CreateDocumentResult {
  
  inline def apply(): CreateDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDocumentResult]
  }
  
  extension [Self <: CreateDocumentResult](x: Self) {
    
    inline def setDocumentDescription(value: DocumentDescription): Self = StObject.set(x, "DocumentDescription", value.asInstanceOf[js.Any])
    
    inline def setDocumentDescriptionUndefined: Self = StObject.set(x, "DocumentDescription", js.undefined)
  }
}

package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDocumentsResult extends StObject {
  
  /**
    * The names of the SSM documents.
    */
  var DocumentIdentifiers: js.UndefOr[DocumentIdentifierList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
}
object ListDocumentsResult {
  
  inline def apply(): ListDocumentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentsResult]
  }
  
  extension [Self <: ListDocumentsResult](x: Self) {
    
    inline def setDocumentIdentifiers(value: DocumentIdentifierList): Self = StObject.set(x, "DocumentIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdentifiersUndefined: Self = StObject.set(x, "DocumentIdentifiers", js.undefined)
    
    inline def setDocumentIdentifiersVarargs(value: DocumentIdentifier*): Self = StObject.set(x, "DocumentIdentifiers", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

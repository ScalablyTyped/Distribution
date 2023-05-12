package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReferencesResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of references.
    */
  var references: ReferenceList
}
object ListReferencesResponse {
  
  inline def apply(references: ReferenceList): ListReferencesResponse = {
    val __obj = js.Dynamic.literal(references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReferencesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReferencesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReferences(value: ReferenceList): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: ReferenceListItem*): Self = StObject.set(x, "references", js.Array(value*))
  }
}

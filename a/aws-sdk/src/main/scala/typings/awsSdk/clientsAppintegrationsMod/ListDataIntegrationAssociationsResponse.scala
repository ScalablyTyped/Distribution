package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataIntegrationAssociationsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) and unique ID of the DataIntegration association.
    */
  var DataIntegrationAssociations: js.UndefOr[DataIntegrationAssociationsList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.NextToken] = js.undefined
}
object ListDataIntegrationAssociationsResponse {
  
  inline def apply(): ListDataIntegrationAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataIntegrationAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataIntegrationAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setDataIntegrationAssociations(value: DataIntegrationAssociationsList): Self = StObject.set(x, "DataIntegrationAssociations", value.asInstanceOf[js.Any])
    
    inline def setDataIntegrationAssociationsUndefined: Self = StObject.set(x, "DataIntegrationAssociations", js.undefined)
    
    inline def setDataIntegrationAssociationsVarargs(value: DataIntegrationAssociationSummary*): Self = StObject.set(x, "DataIntegrationAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

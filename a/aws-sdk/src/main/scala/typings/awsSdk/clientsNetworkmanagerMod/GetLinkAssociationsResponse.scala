package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLinkAssociationsResponse extends StObject {
  
  /**
    * The link associations.
    */
  var LinkAssociations: js.UndefOr[LinkAssociationList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetLinkAssociationsResponse {
  
  inline def apply(): GetLinkAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLinkAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLinkAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setLinkAssociations(value: LinkAssociationList): Self = StObject.set(x, "LinkAssociations", value.asInstanceOf[js.Any])
    
    inline def setLinkAssociationsUndefined: Self = StObject.set(x, "LinkAssociations", js.undefined)
    
    inline def setLinkAssociationsVarargs(value: LinkAssociation*): Self = StObject.set(x, "LinkAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

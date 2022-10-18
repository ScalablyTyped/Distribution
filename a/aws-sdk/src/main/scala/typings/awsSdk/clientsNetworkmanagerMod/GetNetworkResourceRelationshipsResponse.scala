package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkResourceRelationshipsResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * The resource relationships.
    */
  var Relationships: js.UndefOr[RelationshipList] = js.undefined
}
object GetNetworkResourceRelationshipsResponse {
  
  inline def apply(): GetNetworkResourceRelationshipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkResourceRelationshipsResponse]
  }
  
  extension [Self <: GetNetworkResourceRelationshipsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRelationships(value: RelationshipList): Self = StObject.set(x, "Relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "Relationships", js.undefined)
    
    inline def setRelationshipsVarargs(value: Relationship*): Self = StObject.set(x, "Relationships", js.Array(value*))
  }
}

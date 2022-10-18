package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceShareAssociationsResponse extends StObject {
  
  /**
    * If present, this value indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null. This indicates that this is the last page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that contain the details about the associations.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
}
object GetResourceShareAssociationsResponse {
  
  inline def apply(): GetResourceShareAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceShareAssociationsResponse]
  }
  
  extension [Self <: GetResourceShareAssociationsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceShareAssociations(value: ResourceShareAssociationList): Self = StObject.set(x, "resourceShareAssociations", value.asInstanceOf[js.Any])
    
    inline def setResourceShareAssociationsUndefined: Self = StObject.set(x, "resourceShareAssociations", js.undefined)
    
    inline def setResourceShareAssociationsVarargs(value: ResourceShareAssociation*): Self = StObject.set(x, "resourceShareAssociations", js.Array(value*))
  }
}

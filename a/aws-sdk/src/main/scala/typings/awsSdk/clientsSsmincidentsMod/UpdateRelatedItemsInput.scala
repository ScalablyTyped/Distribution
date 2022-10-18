package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRelatedItemsInput extends StObject {
  
  /**
    * A token ensuring that the operation is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the incident record containing the related items you are updating.
    */
  var incidentRecordArn: Arn
  
  /**
    * Details about the item you are adding or deleting.
    */
  var relatedItemsUpdate: RelatedItemsUpdate
}
object UpdateRelatedItemsInput {
  
  inline def apply(incidentRecordArn: Arn, relatedItemsUpdate: RelatedItemsUpdate): UpdateRelatedItemsInput = {
    val __obj = js.Dynamic.literal(incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any], relatedItemsUpdate = relatedItemsUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelatedItemsInput]
  }
  
  extension [Self <: UpdateRelatedItemsInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
    
    inline def setRelatedItemsUpdate(value: RelatedItemsUpdate): Self = StObject.set(x, "relatedItemsUpdate", value.asInstanceOf[js.Any])
  }
}

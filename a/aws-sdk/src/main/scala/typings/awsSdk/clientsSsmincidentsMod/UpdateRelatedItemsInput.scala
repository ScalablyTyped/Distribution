package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRelatedItemsInput extends StObject {
  
  /**
    * A token that ensures that a client calls the operation only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the incident record that contains the related items that you update.
    */
  var incidentRecordArn: Arn
  
  /**
    * Details about the item that you are add to, or delete from, an incident.
    */
  var relatedItemsUpdate: RelatedItemsUpdate
}
object UpdateRelatedItemsInput {
  
  inline def apply(incidentRecordArn: Arn, relatedItemsUpdate: RelatedItemsUpdate): UpdateRelatedItemsInput = {
    val __obj = js.Dynamic.literal(incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any], relatedItemsUpdate = relatedItemsUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelatedItemsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRelatedItemsInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
    
    inline def setRelatedItemsUpdate(value: RelatedItemsUpdate): Self = StObject.set(x, "relatedItemsUpdate", value.asInstanceOf[js.Any])
  }
}

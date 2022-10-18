package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAuditSuppressionRequest extends StObject {
  
  var checkName: AuditCheckName
  
  /**
    *  The description of the audit suppression. 
    */
  var description: js.UndefOr[AuditDescription] = js.undefined
  
  /**
    *  The expiration date (epoch timestamp in seconds) that you want the suppression to adhere to. 
    */
  var expirationDate: js.UndefOr[js.Date] = js.undefined
  
  var resourceIdentifier: ResourceIdentifier
  
  /**
    *  Indicates whether a suppression should exist indefinitely or not. 
    */
  var suppressIndefinitely: js.UndefOr[SuppressIndefinitely] = js.undefined
}
object UpdateAuditSuppressionRequest {
  
  inline def apply(checkName: AuditCheckName, resourceIdentifier: ResourceIdentifier): UpdateAuditSuppressionRequest = {
    val __obj = js.Dynamic.literal(checkName = checkName.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuditSuppressionRequest]
  }
  
  extension [Self <: UpdateAuditSuppressionRequest](x: Self) {
    
    inline def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: AuditDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSuppressIndefinitely(value: SuppressIndefinitely): Self = StObject.set(x, "suppressIndefinitely", value.asInstanceOf[js.Any])
    
    inline def setSuppressIndefinitelyUndefined: Self = StObject.set(x, "suppressIndefinitely", js.undefined)
  }
}

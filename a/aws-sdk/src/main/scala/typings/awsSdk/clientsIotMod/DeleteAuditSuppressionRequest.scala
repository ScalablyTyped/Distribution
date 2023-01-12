package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAuditSuppressionRequest extends StObject {
  
  var checkName: AuditCheckName
  
  var resourceIdentifier: ResourceIdentifier
}
object DeleteAuditSuppressionRequest {
  
  inline def apply(checkName: AuditCheckName, resourceIdentifier: ResourceIdentifier): DeleteAuditSuppressionRequest = {
    val __obj = js.Dynamic.literal(checkName = checkName.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuditSuppressionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAuditSuppressionRequest] (val x: Self) extends AnyVal {
    
    inline def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
  }
}

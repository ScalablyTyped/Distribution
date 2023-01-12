package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuditSuppressionRequest extends StObject {
  
  var checkName: AuditCheckName
  
  var resourceIdentifier: ResourceIdentifier
}
object DescribeAuditSuppressionRequest {
  
  inline def apply(checkName: AuditCheckName, resourceIdentifier: ResourceIdentifier): DescribeAuditSuppressionRequest = {
    val __obj = js.Dynamic.literal(checkName = checkName.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditSuppressionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAuditSuppressionRequest] (val x: Self) extends AnyVal {
    
    inline def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
  }
}

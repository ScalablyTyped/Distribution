package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the resource. 
    */
  var resourceArn: AuditManagerArn
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: AuditManagerArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: AuditManagerArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the given GuardDuty resource. 
    */
  var ResourceArn: GuardDutyArn
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceArn: GuardDutyArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  extension [Self <: ListTagsForResourceRequest](x: Self) {
    
    inline def setResourceArn(value: GuardDutyArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}

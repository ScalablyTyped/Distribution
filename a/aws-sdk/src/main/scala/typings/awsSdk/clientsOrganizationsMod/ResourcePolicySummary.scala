package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicySummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource policy.
    */
  var Arn: js.UndefOr[ResourcePolicyArn] = js.undefined
  
  /**
    * The unique identifier (ID) of the resource policy.
    */
  var Id: js.UndefOr[ResourcePolicyId] = js.undefined
}
object ResourcePolicySummary {
  
  inline def apply(): ResourcePolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcePolicySummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ResourcePolicyArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: ResourcePolicyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}

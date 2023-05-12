package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicy extends StObject {
  
  /**
    * The policy text of the resource policy.
    */
  var Content: js.UndefOr[ResourcePolicyContent] = js.undefined
  
  /**
    * A structure that contains resource policy ID and Amazon Resource Name (ARN).
    */
  var ResourcePolicySummary: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.ResourcePolicySummary] = js.undefined
}
object ResourcePolicy {
  
  inline def apply(): ResourcePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcePolicy] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ResourcePolicyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setResourcePolicySummary(value: ResourcePolicySummary): Self = StObject.set(x, "ResourcePolicySummary", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicySummaryUndefined: Self = StObject.set(x, "ResourcePolicySummary", js.undefined)
  }
}

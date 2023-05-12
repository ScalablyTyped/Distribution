package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyResponse extends StObject {
  
  /**
    * A structure that contains details about the resource policy.
    */
  var ResourcePolicy: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.ResourcePolicy] = js.undefined
}
object PutResourcePolicyResponse {
  
  inline def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setResourcePolicy(value: ResourcePolicy): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "ResourcePolicy", js.undefined)
  }
}

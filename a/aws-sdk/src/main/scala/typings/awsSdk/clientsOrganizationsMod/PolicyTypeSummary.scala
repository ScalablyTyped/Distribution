package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyTypeSummary extends StObject {
  
  /**
    * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a root or to an OU or account in that root, it must be available in the organization and enabled for that root.
    */
  var Status: js.UndefOr[PolicyTypeStatus] = js.undefined
  
  /**
    * The name of the policy type.
    */
  var Type: js.UndefOr[PolicyType] = js.undefined
}
object PolicyTypeSummary {
  
  inline def apply(): PolicyTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTypeSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyTypeSummary] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: PolicyTypeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: PolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

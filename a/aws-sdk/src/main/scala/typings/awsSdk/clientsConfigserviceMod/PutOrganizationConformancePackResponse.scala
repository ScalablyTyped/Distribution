package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutOrganizationConformancePackResponse extends StObject {
  
  /**
    * ARN of the organization conformance pack.
    */
  var OrganizationConformancePackArn: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object PutOrganizationConformancePackResponse {
  
  inline def apply(): PutOrganizationConformancePackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOrganizationConformancePackResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutOrganizationConformancePackResponse] (val x: Self) extends AnyVal {
    
    inline def setOrganizationConformancePackArn(value: StringWithCharLimit256): Self = StObject.set(x, "OrganizationConformancePackArn", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConformancePackArnUndefined: Self = StObject.set(x, "OrganizationConformancePackArn", js.undefined)
  }
}

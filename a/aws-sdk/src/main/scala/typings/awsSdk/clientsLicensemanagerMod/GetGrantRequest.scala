package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGrantRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the grant.
    */
  var GrantArn: Arn
  
  /**
    * Grant version.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object GetGrantRequest {
  
  inline def apply(GrantArn: Arn): GetGrantRequest = {
    val __obj = js.Dynamic.literal(GrantArn = GrantArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGrantRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGrantRequest] (val x: Self) extends AnyVal {
    
    inline def setGrantArn(value: Arn): Self = StObject.set(x, "GrantArn", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}

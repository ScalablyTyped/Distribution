package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectGrantRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the grant.
    */
  var GrantArn: Arn
}
object RejectGrantRequest {
  
  inline def apply(GrantArn: Arn): RejectGrantRequest = {
    val __obj = js.Dynamic.literal(GrantArn = GrantArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectGrantRequest]
  }
  
  extension [Self <: RejectGrantRequest](x: Self) {
    
    inline def setGrantArn(value: Arn): Self = StObject.set(x, "GrantArn", value.asInstanceOf[js.Any])
  }
}

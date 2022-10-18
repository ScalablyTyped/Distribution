package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectGrantResponse extends StObject {
  
  /**
    * Grant ARN.
    */
  var GrantArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Grant status.
    */
  var Status: js.UndefOr[GrantStatus] = js.undefined
  
  /**
    * Grant version.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object RejectGrantResponse {
  
  inline def apply(): RejectGrantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectGrantResponse]
  }
  
  extension [Self <: RejectGrantResponse](x: Self) {
    
    inline def setGrantArn(value: Arn): Self = StObject.set(x, "GrantArn", value.asInstanceOf[js.Any])
    
    inline def setGrantArnUndefined: Self = StObject.set(x, "GrantArn", js.undefined)
    
    inline def setStatus(value: GrantStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}

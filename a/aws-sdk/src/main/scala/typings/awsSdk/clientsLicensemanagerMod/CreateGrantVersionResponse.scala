package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGrantVersionResponse extends StObject {
  
  /**
    * Grant ARN.
    */
  var GrantArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Grant status.
    */
  var Status: js.UndefOr[GrantStatus] = js.undefined
  
  /**
    * New version of the grant.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object CreateGrantVersionResponse {
  
  inline def apply(): CreateGrantVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGrantVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGrantVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setGrantArn(value: Arn): Self = StObject.set(x, "GrantArn", value.asInstanceOf[js.Any])
    
    inline def setGrantArnUndefined: Self = StObject.set(x, "GrantArn", js.undefined)
    
    inline def setStatus(value: GrantStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}

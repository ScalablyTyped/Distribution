package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceRoleForAccountResponse extends StObject {
  
  /**
    * The time when the service role was associated with IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region.
    */
  var associatedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the service role that is associated with IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region.
    */
  var roleArn: js.UndefOr[String] = js.undefined
}
object GetServiceRoleForAccountResponse {
  
  inline def apply(): GetServiceRoleForAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceRoleForAccountResponse]
  }
  
  extension [Self <: GetServiceRoleForAccountResponse](x: Self) {
    
    inline def setAssociatedAt(value: String): Self = StObject.set(x, "associatedAt", value.asInstanceOf[js.Any])
    
    inline def setAssociatedAtUndefined: Self = StObject.set(x, "associatedAt", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}

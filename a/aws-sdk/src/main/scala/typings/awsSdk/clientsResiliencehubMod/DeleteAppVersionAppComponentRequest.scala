package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppVersionAppComponentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters. You should not reuse the same client token for other API requests.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The identifier of the Application Component.
    */
  var id: String255
}
object DeleteAppVersionAppComponentRequest {
  
  inline def apply(appArn: Arn, id: String255): DeleteAppVersionAppComponentRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppVersionAppComponentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppVersionAppComponentRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setId(value: String255): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

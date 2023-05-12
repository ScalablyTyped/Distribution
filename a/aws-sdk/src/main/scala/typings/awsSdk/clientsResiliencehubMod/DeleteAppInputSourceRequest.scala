package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppInputSourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters. You should not reuse the same client token for other API requests.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The namespace on your Amazon Elastic Kubernetes Service cluster that you want to delete from the Resilience Hub application.
    */
  var eksSourceClusterNamespace: js.UndefOr[EksSourceClusterNamespace] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the imported resource you want to remove from the Resilience Hub application. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var sourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The imported Terraform s3 state ﬁle you want to remove from the Resilience Hub application.
    */
  var terraformSource: js.UndefOr[TerraformSource] = js.undefined
}
object DeleteAppInputSourceRequest {
  
  inline def apply(appArn: Arn): DeleteAppInputSourceRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppInputSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppInputSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEksSourceClusterNamespace(value: EksSourceClusterNamespace): Self = StObject.set(x, "eksSourceClusterNamespace", value.asInstanceOf[js.Any])
    
    inline def setEksSourceClusterNamespaceUndefined: Self = StObject.set(x, "eksSourceClusterNamespace", js.undefined)
    
    inline def setSourceArn(value: Arn): Self = StObject.set(x, "sourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "sourceArn", js.undefined)
    
    inline def setTerraformSource(value: TerraformSource): Self = StObject.set(x, "terraformSource", value.asInstanceOf[js.Any])
    
    inline def setTerraformSourceUndefined: Self = StObject.set(x, "terraformSource", js.undefined)
  }
}

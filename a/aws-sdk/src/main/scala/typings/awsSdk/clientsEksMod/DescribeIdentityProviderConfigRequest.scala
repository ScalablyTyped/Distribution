package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityProviderConfigRequest extends StObject {
  
  /**
    * The cluster name that the identity provider configuration is associated to.
    */
  var clusterName: String
  
  /**
    * An object representing an identity provider configuration.
    */
  var identityProviderConfig: IdentityProviderConfig
}
object DescribeIdentityProviderConfigRequest {
  
  inline def apply(clusterName: String, identityProviderConfig: IdentityProviderConfig): DescribeIdentityProviderConfigRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], identityProviderConfig = identityProviderConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityProviderConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIdentityProviderConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderConfig(value: IdentityProviderConfig): Self = StObject.set(x, "identityProviderConfig", value.asInstanceOf[js.Any])
  }
}

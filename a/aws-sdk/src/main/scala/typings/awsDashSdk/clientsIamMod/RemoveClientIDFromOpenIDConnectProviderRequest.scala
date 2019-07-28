package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveClientIDFromOpenIDConnectProviderRequest extends js.Object {
  /**
    * The client ID (also known as audience) to remove from the IAM OIDC provider resource. For more information about client IDs, see CreateOpenIDConnectProvider.
    */
  var ClientID: clientIDType
  /**
    * The Amazon Resource Name (ARN) of the IAM OIDC provider resource to remove the client ID from. You can get a list of OIDC provider ARNs by using the ListOpenIDConnectProviders operation. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var OpenIDConnectProviderArn: arnType
}

object RemoveClientIDFromOpenIDConnectProviderRequest {
  @scala.inline
  def apply(ClientID: clientIDType, OpenIDConnectProviderArn: arnType): RemoveClientIDFromOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(ClientID = ClientID, OpenIDConnectProviderArn = OpenIDConnectProviderArn)
  
    __obj.asInstanceOf[RemoveClientIDFromOpenIDConnectProviderRequest]
  }
}


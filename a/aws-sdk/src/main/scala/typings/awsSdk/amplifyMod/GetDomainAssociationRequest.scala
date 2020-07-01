package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainAssociationRequest extends js.Object {
  /**
    *  The unique id for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name of the domain. 
    */
  var domainName: DomainName = js.native
}

object GetDomainAssociationRequest {
  @scala.inline
  def apply(appId: AppId, domainName: DomainName): GetDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainAssociationRequest]
  }
}


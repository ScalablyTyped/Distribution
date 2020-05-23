package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainAssociationRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Domain name for the Domain Association. 
    */
  var domainName: DomainName = js.native
  /**
    *  Enables automated creation of Subdomains for branches. (Currently not supported) 
    */
  var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.native
  /**
    *  Setting structure for the Subdomain. 
    */
  var subDomainSettings: SubDomainSettings = js.native
}

object CreateDomainAssociationRequest {
  @scala.inline
  def apply(
    appId: AppId,
    domainName: DomainName,
    subDomainSettings: SubDomainSettings,
    enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
  ): CreateDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], subDomainSettings = subDomainSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoSubDomain)) __obj.updateDynamic("enableAutoSubDomain")(enableAutoSubDomain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainAssociationRequest]
  }
}


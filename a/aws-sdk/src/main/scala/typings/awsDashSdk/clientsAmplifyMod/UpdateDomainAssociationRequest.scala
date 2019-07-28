package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainAssociationRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name of the domain. 
    */
  var domainName: DomainName
  /**
    *  Enables automated creation of Subdomains for branches. 
    */
  var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
  /**
    *  Setting structure for the Subdomain. 
    */
  var subDomainSettings: SubDomainSettings
}

object UpdateDomainAssociationRequest {
  @scala.inline
  def apply(
    appId: AppId,
    domainName: DomainName,
    subDomainSettings: SubDomainSettings,
    enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
  ): UpdateDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId, domainName = domainName, subDomainSettings = subDomainSettings)
    if (!js.isUndefined(enableAutoSubDomain)) __obj.updateDynamic("enableAutoSubDomain")(enableAutoSubDomain)
    __obj.asInstanceOf[UpdateDomainAssociationRequest]
  }
}


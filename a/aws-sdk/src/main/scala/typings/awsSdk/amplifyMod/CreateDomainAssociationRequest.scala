package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainAssociationRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  Sets the branch patterns for automatic subdomain creation. 
    */
  var autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns] = js.native
  /**
    *  The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for automatically creating subdomains. 
    */
  var autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole] = js.native
  /**
    *  The domain name for the domain association. 
    */
  var domainName: DomainName = js.native
  /**
    *  Enables the automated creation of subdomains for branches. 
    */
  var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.native
  /**
    *  The setting for the subdomain. 
    */
  var subDomainSettings: SubDomainSettings = js.native
}

object CreateDomainAssociationRequest {
  @scala.inline
  def apply(
    appId: AppId,
    domainName: DomainName,
    subDomainSettings: SubDomainSettings,
    autoSubDomainCreationPatterns: AutoSubDomainCreationPatterns = null,
    autoSubDomainIAMRole: AutoSubDomainIAMRole = null,
    enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
  ): CreateDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], subDomainSettings = subDomainSettings.asInstanceOf[js.Any])
    if (autoSubDomainCreationPatterns != null) __obj.updateDynamic("autoSubDomainCreationPatterns")(autoSubDomainCreationPatterns.asInstanceOf[js.Any])
    if (autoSubDomainIAMRole != null) __obj.updateDynamic("autoSubDomainIAMRole")(autoSubDomainIAMRole.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoSubDomain)) __obj.updateDynamic("enableAutoSubDomain")(enableAutoSubDomain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainAssociationRequest]
  }
}


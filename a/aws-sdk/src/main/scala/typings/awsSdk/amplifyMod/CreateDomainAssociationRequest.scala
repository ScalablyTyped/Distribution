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
  def apply(appId: AppId, domainName: DomainName, subDomainSettings: SubDomainSettings): CreateDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], subDomainSettings = subDomainSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainAssociationRequest]
  }
  @scala.inline
  implicit class CreateDomainAssociationRequestOps[Self <: CreateDomainAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubDomainSettingsVarargs(value: SubDomainSetting*): Self = this.set("subDomainSettings", js.Array(value :_*))
    @scala.inline
    def setSubDomainSettings(value: SubDomainSettings): Self = this.set("subDomainSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoSubDomainCreationPatternsVarargs(value: AutoSubDomainCreationPattern*): Self = this.set("autoSubDomainCreationPatterns", js.Array(value :_*))
    @scala.inline
    def setAutoSubDomainCreationPatterns(value: AutoSubDomainCreationPatterns): Self = this.set("autoSubDomainCreationPatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSubDomainCreationPatterns: Self = this.set("autoSubDomainCreationPatterns", js.undefined)
    @scala.inline
    def setAutoSubDomainIAMRole(value: AutoSubDomainIAMRole): Self = this.set("autoSubDomainIAMRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSubDomainIAMRole: Self = this.set("autoSubDomainIAMRole", js.undefined)
    @scala.inline
    def setEnableAutoSubDomain(value: EnableAutoSubDomain): Self = this.set("enableAutoSubDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAutoSubDomain: Self = this.set("enableAutoSubDomain", js.undefined)
  }
  
}


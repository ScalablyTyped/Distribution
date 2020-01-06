package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDomainSetting extends js.Object {
  /**
    *  Branch name setting for the Subdomain. 
    */
  var branchName: BranchName = js.native
  /**
    *  Prefix setting for the Subdomain. 
    */
  var prefix: DomainPrefix = js.native
}

object SubDomainSetting {
  @scala.inline
  def apply(branchName: BranchName, prefix: DomainPrefix): SubDomainSetting = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubDomainSetting]
  }
}


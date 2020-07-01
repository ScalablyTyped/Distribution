package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDomainSetting extends js.Object {
  /**
    *  The branch name setting for the subdomain. 
    */
  var branchName: BranchName = js.native
  /**
    *  The prefix setting for the subdomain. 
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


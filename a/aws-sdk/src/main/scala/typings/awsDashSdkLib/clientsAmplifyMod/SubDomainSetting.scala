package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubDomainSetting extends js.Object {
  /**
    *  Branch name setting for the Subdomain. 
    */
  var branchName: BranchName
  /**
    *  Prefix setting for the Subdomain. 
    */
  var prefix: DomainPrefix
}

object SubDomainSetting {
  @scala.inline
  def apply(branchName: BranchName, prefix: DomainPrefix): SubDomainSetting = {
    val __obj = js.Dynamic.literal(branchName = branchName, prefix = prefix)
  
    __obj.asInstanceOf[SubDomainSetting]
  }
}


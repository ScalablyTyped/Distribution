package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class SubDomainSettingOps[Self <: SubDomainSetting] (val x: Self) extends AnyVal {
    
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
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: DomainPrefix): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
}

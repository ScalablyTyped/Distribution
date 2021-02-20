package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubDomainSetting extends StObject {
  
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
  implicit class SubDomainSettingMutableBuilder[Self <: SubDomainSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: DomainPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}

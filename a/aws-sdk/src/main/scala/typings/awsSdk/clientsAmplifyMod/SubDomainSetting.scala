package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubDomainSetting extends StObject {
  
  /**
    *  The branch name setting for the subdomain. 
    */
  var branchName: BranchName
  
  /**
    *  The prefix setting for the subdomain. 
    */
  var prefix: DomainPrefix
}
object SubDomainSetting {
  
  inline def apply(branchName: BranchName, prefix: DomainPrefix): SubDomainSetting = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDomainSetting]
  }
  
  extension [Self <: SubDomainSetting](x: Self) {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: DomainPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}

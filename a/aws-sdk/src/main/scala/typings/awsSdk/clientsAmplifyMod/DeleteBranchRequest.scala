package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBranchRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The name for the branch. 
    */
  var branchName: BranchName
}
object DeleteBranchRequest {
  
  inline def apply(appId: AppId, branchName: BranchName): DeleteBranchRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchRequest]
  }
  
  extension [Self <: DeleteBranchRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
  }
}

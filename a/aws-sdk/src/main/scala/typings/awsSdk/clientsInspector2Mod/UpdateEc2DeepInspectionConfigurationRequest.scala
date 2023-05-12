package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEc2DeepInspectionConfigurationRequest extends StObject {
  
  /**
    * Specify TRUE to activate Amazon Inspector deep inspection in your account, or FALSE to deactivate. Member accounts in an organization cannot deactivate deep inspection, instead the delegated administrator for the organization can deactivate a member account using BatchUpdateMemberEc2DeepInspectionStatus.
    */
  var activateDeepInspection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Inspector deep inspection custom paths you are adding for your account.
    */
  var packagePaths: js.UndefOr[PathList] = js.undefined
}
object UpdateEc2DeepInspectionConfigurationRequest {
  
  inline def apply(): UpdateEc2DeepInspectionConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEc2DeepInspectionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEc2DeepInspectionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setActivateDeepInspection(value: Boolean): Self = StObject.set(x, "activateDeepInspection", value.asInstanceOf[js.Any])
    
    inline def setActivateDeepInspectionUndefined: Self = StObject.set(x, "activateDeepInspection", js.undefined)
    
    inline def setPackagePaths(value: PathList): Self = StObject.set(x, "packagePaths", value.asInstanceOf[js.Any])
    
    inline def setPackagePathsUndefined: Self = StObject.set(x, "packagePaths", js.undefined)
    
    inline def setPackagePathsVarargs(value: Path*): Self = StObject.set(x, "packagePaths", js.Array(value*))
  }
}

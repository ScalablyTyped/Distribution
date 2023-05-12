package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrgEc2DeepInspectionConfigurationRequest extends StObject {
  
  /**
    * The Amazon Inspector deep inspection custom paths you are adding for your organization.
    */
  var orgPackagePaths: PathList
}
object UpdateOrgEc2DeepInspectionConfigurationRequest {
  
  inline def apply(orgPackagePaths: PathList): UpdateOrgEc2DeepInspectionConfigurationRequest = {
    val __obj = js.Dynamic.literal(orgPackagePaths = orgPackagePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrgEc2DeepInspectionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOrgEc2DeepInspectionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setOrgPackagePaths(value: PathList): Self = StObject.set(x, "orgPackagePaths", value.asInstanceOf[js.Any])
    
    inline def setOrgPackagePathsVarargs(value: Path*): Self = StObject.set(x, "orgPackagePaths", js.Array(value*))
  }
}

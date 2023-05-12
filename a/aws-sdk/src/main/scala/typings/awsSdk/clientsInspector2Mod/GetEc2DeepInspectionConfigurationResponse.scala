package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEc2DeepInspectionConfigurationResponse extends StObject {
  
  /**
    * An error message explaining why Amazon Inspector deep inspection configurations could not be retrieved for your account.
    */
  var errorMessage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Inspector deep inspection custom paths for your organization.
    */
  var orgPackagePaths: js.UndefOr[PathList] = js.undefined
  
  /**
    * The Amazon Inspector deep inspection custom paths for your account.
    */
  var packagePaths: js.UndefOr[PathList] = js.undefined
  
  /**
    * The activation status of Amazon Inspector deep inspection in your account.
    */
  var status: js.UndefOr[Ec2DeepInspectionStatus] = js.undefined
}
object GetEc2DeepInspectionConfigurationResponse {
  
  inline def apply(): GetEc2DeepInspectionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEc2DeepInspectionConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEc2DeepInspectionConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: NonEmptyString): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setOrgPackagePaths(value: PathList): Self = StObject.set(x, "orgPackagePaths", value.asInstanceOf[js.Any])
    
    inline def setOrgPackagePathsUndefined: Self = StObject.set(x, "orgPackagePaths", js.undefined)
    
    inline def setOrgPackagePathsVarargs(value: Path*): Self = StObject.set(x, "orgPackagePaths", js.Array(value*))
    
    inline def setPackagePaths(value: PathList): Self = StObject.set(x, "packagePaths", value.asInstanceOf[js.Any])
    
    inline def setPackagePathsUndefined: Self = StObject.set(x, "packagePaths", js.undefined)
    
    inline def setPackagePathsVarargs(value: Path*): Self = StObject.set(x, "packagePaths", js.Array(value*))
    
    inline def setStatus(value: Ec2DeepInspectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

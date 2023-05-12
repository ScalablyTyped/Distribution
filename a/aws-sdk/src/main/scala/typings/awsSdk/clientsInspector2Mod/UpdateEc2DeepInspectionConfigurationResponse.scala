package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEc2DeepInspectionConfigurationResponse extends StObject {
  
  /**
    * An error message explaining why new Amazon Inspector deep inspection custom paths could not be added.
    */
  var errorMessage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current Amazon Inspector deep inspection custom paths for the organization.
    */
  var orgPackagePaths: js.UndefOr[PathList] = js.undefined
  
  /**
    * The current Amazon Inspector deep inspection custom paths for your account.
    */
  var packagePaths: js.UndefOr[PathList] = js.undefined
  
  /**
    * The status of Amazon Inspector deep inspection in your account.
    */
  var status: js.UndefOr[Ec2DeepInspectionStatus] = js.undefined
}
object UpdateEc2DeepInspectionConfigurationResponse {
  
  inline def apply(): UpdateEc2DeepInspectionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEc2DeepInspectionConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEc2DeepInspectionConfigurationResponse] (val x: Self) extends AnyVal {
    
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

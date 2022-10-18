package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDependencyRequirement extends StObject {
  
  /**
    * The type of this dependency. Choose from the following options:    SOFT – The component doesn't restart if the dependency changes state.    HARD – The component restarts if the dependency changes state.   Default: HARD 
    */
  var dependencyType: js.UndefOr[ComponentDependencyType] = js.undefined
  
  /**
    * The component version requirement for the component dependency. IoT Greengrass V2 uses semantic version constraints. For more information, see Semantic Versioning.
    */
  var versionRequirement: js.UndefOr[NonEmptyString] = js.undefined
}
object ComponentDependencyRequirement {
  
  inline def apply(): ComponentDependencyRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDependencyRequirement]
  }
  
  extension [Self <: ComponentDependencyRequirement](x: Self) {
    
    inline def setDependencyType(value: ComponentDependencyType): Self = StObject.set(x, "dependencyType", value.asInstanceOf[js.Any])
    
    inline def setDependencyTypeUndefined: Self = StObject.set(x, "dependencyType", js.undefined)
    
    inline def setVersionRequirement(value: NonEmptyString): Self = StObject.set(x, "versionRequirement", value.asInstanceOf[js.Any])
    
    inline def setVersionRequirementUndefined: Self = StObject.set(x, "versionRequirement", js.undefined)
  }
}

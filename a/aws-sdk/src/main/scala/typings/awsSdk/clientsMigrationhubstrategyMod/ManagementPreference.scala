package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagementPreference extends StObject {
  
  /**
    *  Indicates interest in solutions that are managed by AWS. 
    */
  var awsManagedResources: js.UndefOr[AwsManagedResources] = js.undefined
  
  /**
    *  No specific preference. 
    */
  var noPreference: js.UndefOr[NoManagementPreference] = js.undefined
  
  /**
    *  Indicates interest in managing your own resources on AWS. 
    */
  var selfManageResources: js.UndefOr[SelfManageResources] = js.undefined
}
object ManagementPreference {
  
  inline def apply(): ManagementPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementPreference]
  }
  
  extension [Self <: ManagementPreference](x: Self) {
    
    inline def setAwsManagedResources(value: AwsManagedResources): Self = StObject.set(x, "awsManagedResources", value.asInstanceOf[js.Any])
    
    inline def setAwsManagedResourcesUndefined: Self = StObject.set(x, "awsManagedResources", js.undefined)
    
    inline def setNoPreference(value: NoManagementPreference): Self = StObject.set(x, "noPreference", value.asInstanceOf[js.Any])
    
    inline def setNoPreferenceUndefined: Self = StObject.set(x, "noPreference", js.undefined)
    
    inline def setSelfManageResources(value: SelfManageResources): Self = StObject.set(x, "selfManageResources", value.asInstanceOf[js.Any])
    
    inline def setSelfManageResourcesUndefined: Self = StObject.set(x, "selfManageResources", js.undefined)
  }
}

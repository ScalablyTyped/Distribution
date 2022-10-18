package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeSetHook extends StObject {
  
  /**
    * Specify the hook failure mode for non-compliant resources in the followings ways.    FAIL Stops provisioning resources.    WARN Allows provisioning to continue with a warning message.  
    */
  var FailureMode: js.UndefOr[HookFailureMode] = js.undefined
  
  /**
    * Specifies the points in provisioning logic where a hook is invoked.
    */
  var InvocationPoint: js.UndefOr[HookInvocationPoint] = js.undefined
  
  /**
    * Specifies details about the target that the hook will run against.
    */
  var TargetDetails: js.UndefOr[ChangeSetHookTargetDetails] = js.undefined
  
  /**
    * The version ID of the type configuration.
    */
  var TypeConfigurationVersionId: js.UndefOr[HookTypeConfigurationVersionId] = js.undefined
  
  /**
    * The unique name for your hook. Specifies a three-part namespace for your hook, with a recommended pattern of Organization::Service::Hook.  The following organization namespaces are reserved and can't be used in your hook type names:    Alexa     AMZN     Amazon     ASK     AWS     Custom     Dev    
    */
  var TypeName: js.UndefOr[HookTypeName] = js.undefined
  
  /**
    * The version ID of the type specified.
    */
  var TypeVersionId: js.UndefOr[HookTypeVersionId] = js.undefined
}
object ChangeSetHook {
  
  inline def apply(): ChangeSetHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSetHook]
  }
  
  extension [Self <: ChangeSetHook](x: Self) {
    
    inline def setFailureMode(value: HookFailureMode): Self = StObject.set(x, "FailureMode", value.asInstanceOf[js.Any])
    
    inline def setFailureModeUndefined: Self = StObject.set(x, "FailureMode", js.undefined)
    
    inline def setInvocationPoint(value: HookInvocationPoint): Self = StObject.set(x, "InvocationPoint", value.asInstanceOf[js.Any])
    
    inline def setInvocationPointUndefined: Self = StObject.set(x, "InvocationPoint", js.undefined)
    
    inline def setTargetDetails(value: ChangeSetHookTargetDetails): Self = StObject.set(x, "TargetDetails", value.asInstanceOf[js.Any])
    
    inline def setTargetDetailsUndefined: Self = StObject.set(x, "TargetDetails", js.undefined)
    
    inline def setTypeConfigurationVersionId(value: HookTypeConfigurationVersionId): Self = StObject.set(x, "TypeConfigurationVersionId", value.asInstanceOf[js.Any])
    
    inline def setTypeConfigurationVersionIdUndefined: Self = StObject.set(x, "TypeConfigurationVersionId", js.undefined)
    
    inline def setTypeName(value: HookTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeVersionId(value: HookTypeVersionId): Self = StObject.set(x, "TypeVersionId", value.asInstanceOf[js.Any])
    
    inline def setTypeVersionIdUndefined: Self = StObject.set(x, "TypeVersionId", js.undefined)
  }
}

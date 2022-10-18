package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchConfigurationRequest extends StObject {
  
  /**
    * Whether we should copy the Private IP of the Source Server to the Recovery Instance.
    */
  var copyPrivateIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
    */
  var copyTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The state of the Recovery Instance in EC2 after the recovery operation.
    */
  var launchDisposition: js.UndefOr[LaunchDisposition] = js.undefined
  
  /**
    * The licensing configuration to be used for this launch configuration.
    */
  var licensing: js.UndefOr[Licensing] = js.undefined
  
  /**
    * The name of the launch configuration.
    */
  var name: js.UndefOr[SmallBoundedString] = js.undefined
  
  /**
    * The ID of the Source Server that we want to retrieve a Launch Configuration for.
    */
  var sourceServerID: SourceServerID
  
  /**
    * Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches the OS, CPU, and RAM of your Source Server.
    */
  var targetInstanceTypeRightSizingMethod: js.UndefOr[TargetInstanceTypeRightSizingMethod] = js.undefined
}
object UpdateLaunchConfigurationRequest {
  
  inline def apply(sourceServerID: SourceServerID): UpdateLaunchConfigurationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLaunchConfigurationRequest]
  }
  
  extension [Self <: UpdateLaunchConfigurationRequest](x: Self) {
    
    inline def setCopyPrivateIp(value: Boolean): Self = StObject.set(x, "copyPrivateIp", value.asInstanceOf[js.Any])
    
    inline def setCopyPrivateIpUndefined: Self = StObject.set(x, "copyPrivateIp", js.undefined)
    
    inline def setCopyTags(value: Boolean): Self = StObject.set(x, "copyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "copyTags", js.undefined)
    
    inline def setLaunchDisposition(value: LaunchDisposition): Self = StObject.set(x, "launchDisposition", value.asInstanceOf[js.Any])
    
    inline def setLaunchDispositionUndefined: Self = StObject.set(x, "launchDisposition", js.undefined)
    
    inline def setLicensing(value: Licensing): Self = StObject.set(x, "licensing", value.asInstanceOf[js.Any])
    
    inline def setLicensingUndefined: Self = StObject.set(x, "licensing", js.undefined)
    
    inline def setName(value: SmallBoundedString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceTypeRightSizingMethod(value: TargetInstanceTypeRightSizingMethod): Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceTypeRightSizingMethodUndefined: Self = StObject.set(x, "targetInstanceTypeRightSizingMethod", js.undefined)
  }
}

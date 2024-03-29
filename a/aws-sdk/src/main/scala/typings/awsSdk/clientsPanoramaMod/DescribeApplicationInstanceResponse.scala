package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationInstanceResponse extends StObject {
  
  /**
    * The application instance's ID.
    */
  var ApplicationInstanceId: js.UndefOr[typings.awsSdk.clientsPanoramaMod.ApplicationInstanceId] = js.undefined
  
  /**
    * The ID of the application instance that this instance replaced.
    */
  var ApplicationInstanceIdToReplace: js.UndefOr[ApplicationInstanceId] = js.undefined
  
  /**
    * The application instance's ARN.
    */
  var Arn: js.UndefOr[ApplicationInstanceArn] = js.undefined
  
  /**
    * When the application instance was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The device's ID.
    */
  var DefaultRuntimeContextDevice: js.UndefOr[typings.awsSdk.clientsPanoramaMod.DefaultRuntimeContextDevice] = js.undefined
  
  /**
    * The device's bane.
    */
  var DefaultRuntimeContextDeviceName: js.UndefOr[DeviceName] = js.undefined
  
  /**
    * The application instance's description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Description] = js.undefined
  
  /**
    * The application instance's health status.
    */
  var HealthStatus: js.UndefOr[ApplicationInstanceHealthStatus] = js.undefined
  
  /**
    * The application instance was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The application instance's name.
    */
  var Name: js.UndefOr[ApplicationInstanceName] = js.undefined
  
  /**
    * The application instance's state.
    */
  var RuntimeContextStates: js.UndefOr[ReportedRuntimeContextStates] = js.undefined
  
  /**
    * The application instance's runtime role ARN.
    */
  var RuntimeRoleArn: js.UndefOr[typings.awsSdk.clientsPanoramaMod.RuntimeRoleArn] = js.undefined
  
  /**
    * The application instance's status.
    */
  var Status: js.UndefOr[ApplicationInstanceStatus] = js.undefined
  
  /**
    * The application instance's status description.
    */
  var StatusDescription: js.UndefOr[ApplicationInstanceStatusDescription] = js.undefined
  
  /**
    * The application instance's tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeApplicationInstanceResponse {
  
  inline def apply(): DescribeApplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeApplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
    
    inline def setApplicationInstanceIdToReplace(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceIdToReplace", value.asInstanceOf[js.Any])
    
    inline def setApplicationInstanceIdToReplaceUndefined: Self = StObject.set(x, "ApplicationInstanceIdToReplace", js.undefined)
    
    inline def setApplicationInstanceIdUndefined: Self = StObject.set(x, "ApplicationInstanceId", js.undefined)
    
    inline def setArn(value: ApplicationInstanceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDefaultRuntimeContextDevice(value: DefaultRuntimeContextDevice): Self = StObject.set(x, "DefaultRuntimeContextDevice", value.asInstanceOf[js.Any])
    
    inline def setDefaultRuntimeContextDeviceName(value: DeviceName): Self = StObject.set(x, "DefaultRuntimeContextDeviceName", value.asInstanceOf[js.Any])
    
    inline def setDefaultRuntimeContextDeviceNameUndefined: Self = StObject.set(x, "DefaultRuntimeContextDeviceName", js.undefined)
    
    inline def setDefaultRuntimeContextDeviceUndefined: Self = StObject.set(x, "DefaultRuntimeContextDevice", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHealthStatus(value: ApplicationInstanceHealthStatus): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: ApplicationInstanceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRuntimeContextStates(value: ReportedRuntimeContextStates): Self = StObject.set(x, "RuntimeContextStates", value.asInstanceOf[js.Any])
    
    inline def setRuntimeContextStatesUndefined: Self = StObject.set(x, "RuntimeContextStates", js.undefined)
    
    inline def setRuntimeContextStatesVarargs(value: ReportedRuntimeContextState*): Self = StObject.set(x, "RuntimeContextStates", js.Array(value*))
    
    inline def setRuntimeRoleArn(value: RuntimeRoleArn): Self = StObject.set(x, "RuntimeRoleArn", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRoleArnUndefined: Self = StObject.set(x, "RuntimeRoleArn", js.undefined)
    
    inline def setStatus(value: ApplicationInstanceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDescription(value: ApplicationInstanceStatusDescription): Self = StObject.set(x, "StatusDescription", value.asInstanceOf[js.Any])
    
    inline def setStatusDescriptionUndefined: Self = StObject.set(x, "StatusDescription", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the app.
    */
  var AppArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppArn] = js.undefined
  
  /**
    * The name of the app.
    */
  var AppName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppName] = js.undefined
  
  /**
    * The type of app.
    */
  var AppType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppType] = js.undefined
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DomainId] = js.undefined
  
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The timestamp of the last health check.
    */
  var LastHealthCheckTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp of the last user's activity. LastUserActivityTimestamp is also updated when SageMaker performs health checks without user activity. As a result, this value is set to the same value as LastHealthCheckTimestamp.
    */
  var LastUserActivityTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
    */
  var ResourceSpec: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ResourceSpec] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[AppStatus] = js.undefined
  
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.UserProfileName] = js.undefined
}
object DescribeAppResponse {
  
  inline def apply(): DescribeAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: AppArn): Self = StObject.set(x, "AppArn", value.asInstanceOf[js.Any])
    
    inline def setAppArnUndefined: Self = StObject.set(x, "AppArn", js.undefined)
    
    inline def setAppName(value: AppName): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "AppName", js.undefined)
    
    inline def setAppType(value: AppType): Self = StObject.set(x, "AppType", value.asInstanceOf[js.Any])
    
    inline def setAppTypeUndefined: Self = StObject.set(x, "AppType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastHealthCheckTimestamp(value: js.Date): Self = StObject.set(x, "LastHealthCheckTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastHealthCheckTimestampUndefined: Self = StObject.set(x, "LastHealthCheckTimestamp", js.undefined)
    
    inline def setLastUserActivityTimestamp(value: js.Date): Self = StObject.set(x, "LastUserActivityTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUserActivityTimestampUndefined: Self = StObject.set(x, "LastUserActivityTimestamp", js.undefined)
    
    inline def setResourceSpec(value: ResourceSpec): Self = StObject.set(x, "ResourceSpec", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecUndefined: Self = StObject.set(x, "ResourceSpec", js.undefined)
    
    inline def setStatus(value: AppStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
  }
}

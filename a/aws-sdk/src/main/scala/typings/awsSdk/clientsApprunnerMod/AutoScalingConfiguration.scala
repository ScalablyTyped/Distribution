package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of this auto scaling configuration.
    */
  var AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The customer-provided auto scaling configuration name. It can be used in multiple revisions of a configuration.
    */
  var AutoScalingConfigurationName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.AutoScalingConfigurationName] = js.undefined
  
  /**
    * The revision of this auto scaling configuration. It's unique among all the active configurations ("Status": "ACTIVE") that share the same AutoScalingConfigurationName.
    */
  var AutoScalingConfigurationRevision: js.UndefOr[Integer] = js.undefined
  
  /**
    * The time when the auto scaling configuration was created. It's in Unix time stamp format.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the auto scaling configuration was deleted. It's in Unix time stamp format.
    */
  var DeletedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * It's set to true for the configuration with the highest Revision among all configurations that share the same AutoScalingConfigurationName. It's set to false otherwise.
    */
  var Latest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of concurrent requests that an instance processes. If the number of concurrent requests exceeds this limit, App Runner scales the service up.
    */
  var MaxConcurrency: js.UndefOr[Integer] = js.undefined
  
  /**
    * The maximum number of instances that a service scales up to. At most MaxSize instances actively serve traffic for your service.
    */
  var MaxSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum number of instances that App Runner provisions for a service. The service always has at least MinSize provisioned instances. Some of them actively serve traffic. The rest of them (provisioned and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset. App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same capacity for both old and new code.
    */
  var MinSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The current state of the auto scaling configuration. If the status of a configuration revision is INACTIVE, it was deleted and can't be used. Inactive configuration revisions are permanently removed some time after they are deleted.
    */
  var Status: js.UndefOr[AutoScalingConfigurationStatus] = js.undefined
}
object AutoScalingConfiguration {
  
  inline def apply(): AutoScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingConfiguration]
  }
  
  extension [Self <: AutoScalingConfiguration](x: Self) {
    
    inline def setAutoScalingConfigurationArn(value: AppRunnerResourceArn): Self = StObject.set(x, "AutoScalingConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationArnUndefined: Self = StObject.set(x, "AutoScalingConfigurationArn", js.undefined)
    
    inline def setAutoScalingConfigurationName(value: AutoScalingConfigurationName): Self = StObject.set(x, "AutoScalingConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationNameUndefined: Self = StObject.set(x, "AutoScalingConfigurationName", js.undefined)
    
    inline def setAutoScalingConfigurationRevision(value: Integer): Self = StObject.set(x, "AutoScalingConfigurationRevision", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationRevisionUndefined: Self = StObject.set(x, "AutoScalingConfigurationRevision", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDeletedAt(value: js.Date): Self = StObject.set(x, "DeletedAt", value.asInstanceOf[js.Any])
    
    inline def setDeletedAtUndefined: Self = StObject.set(x, "DeletedAt", js.undefined)
    
    inline def setLatest(value: Boolean): Self = StObject.set(x, "Latest", value.asInstanceOf[js.Any])
    
    inline def setLatestUndefined: Self = StObject.set(x, "Latest", js.undefined)
    
    inline def setMaxConcurrency(value: Integer): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxSize(value: Integer): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "MaxSize", js.undefined)
    
    inline def setMinSize(value: Integer): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "MinSize", js.undefined)
    
    inline def setStatus(value: AutoScalingConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

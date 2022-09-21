package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoScalingConfigurationRequest extends StObject {
  
  /**
    * A name for the auto scaling configuration. When you use it for the first time in an Amazon Web Services Region, App Runner creates revision number 1 of this name. When you use the same name in subsequent calls, App Runner creates incremental revisions of the configuration.  The name DefaultConfiguration is reserved (it's the configuration that App Runner uses if you don't provide a custome one). You can't use it to create a new auto scaling configuration, and you can't create a revision of it. When you want to use your own auto scaling configuration for your App Runner service, create a configuration with a different name, and then provide it when you create or update your service. 
    */
  var AutoScalingConfigurationName: typings.awsSdk.apprunnerMod.AutoScalingConfigurationName
  
  /**
    * The maximum number of concurrent requests that you want an instance to process. If the number of concurrent requests exceeds this limit, App Runner scales up your service. Default: 100 
    */
  var MaxConcurrency: js.UndefOr[ASConfigMaxConcurrency] = js.undefined
  
  /**
    * The maximum number of instances that your service scales up to. At most MaxSize instances actively serve traffic for your service. Default: 25 
    */
  var MaxSize: js.UndefOr[ASConfigMaxSize] = js.undefined
  
  /**
    * The minimum number of instances that App Runner provisions for your service. The service always has at least MinSize provisioned instances. Some of them actively serve traffic. The rest of them (provisioned and inactive instances) are a cost-effective compute capacity reserve and are ready to be quickly activated. You pay for memory usage of all the provisioned instances. You pay for CPU usage of only the active subset. App Runner temporarily doubles the number of provisioned instances during deployments, to maintain the same capacity for both old and new code. Default: 1 
    */
  var MinSize: js.UndefOr[ASConfigMinSize] = js.undefined
  
  /**
    * A list of metadata items that you can associate with your auto scaling configuration resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateAutoScalingConfigurationRequest {
  
  inline def apply(AutoScalingConfigurationName: AutoScalingConfigurationName): CreateAutoScalingConfigurationRequest = {
    val __obj = js.Dynamic.literal(AutoScalingConfigurationName = AutoScalingConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoScalingConfigurationRequest]
  }
  
  extension [Self <: CreateAutoScalingConfigurationRequest](x: Self) {
    
    inline def setAutoScalingConfigurationName(value: AutoScalingConfigurationName): Self = StObject.set(x, "AutoScalingConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrency(value: ASConfigMaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxSize(value: ASConfigMaxSize): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "MaxSize", js.undefined)
    
    inline def setMinSize(value: ASConfigMinSize): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "MinSize", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}

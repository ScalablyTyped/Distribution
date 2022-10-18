package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMonitorRequest extends StObject {
  
  /**
    * The name of the monitor resource.
    */
  var MonitorName: Name
  
  /**
    * The Amazon Resource Name (ARN) of the predictor to monitor.
    */
  var ResourceArn: Arn
  
  /**
    * A list of tags to apply to the monitor resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Tags] = js.undefined
}
object CreateMonitorRequest {
  
  inline def apply(MonitorName: Name, ResourceArn: Arn): CreateMonitorRequest = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitorRequest]
  }
  
  extension [Self <: CreateMonitorRequest](x: Self) {
    
    inline def setMonitorName(value: Name): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}

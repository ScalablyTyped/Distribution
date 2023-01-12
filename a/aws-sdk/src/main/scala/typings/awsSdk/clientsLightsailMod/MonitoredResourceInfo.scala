package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoredResourceInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource being monitored.
    */
  var arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The name of the Lightsail resource being monitored.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The Lightsail resource type of the resource being monitored. Instances, load balancers, and relational databases are the only Lightsail resources that can currently be monitored by alarms.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object MonitoredResourceInfo {
  
  inline def apply(): MonitoredResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoredResourceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoredResourceInfo] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}

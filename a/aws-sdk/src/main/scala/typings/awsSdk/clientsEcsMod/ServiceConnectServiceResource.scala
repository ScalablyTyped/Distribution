package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceConnectServiceResource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the namespace in Cloud Map that matches the discovery name for this Service Connect resource. You can use this ARN in other integrations with Cloud Map. However, Service Connect can't ensure connectivity outside of Amazon ECS.
    */
  var discoveryArn: js.UndefOr[String] = js.undefined
  
  /**
    * The discovery name of this Service Connect resource. The discoveryName is the name of the new Cloud Map service that Amazon ECS creates for this Amazon ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a hyphen. If the discoveryName isn't specified, the port mapping name from the task definition is used in portName.namespace.
    */
  var discoveryName: js.UndefOr[String] = js.undefined
}
object ServiceConnectServiceResource {
  
  inline def apply(): ServiceConnectServiceResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceConnectServiceResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceConnectServiceResource] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryArn(value: String): Self = StObject.set(x, "discoveryArn", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryArnUndefined: Self = StObject.set(x, "discoveryArn", js.undefined)
    
    inline def setDiscoveryName(value: String): Self = StObject.set(x, "discoveryName", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryNameUndefined: Self = StObject.set(x, "discoveryName", js.undefined)
  }
}

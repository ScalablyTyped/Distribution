package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudMapServiceDiscovery extends StObject {
  
  /**
    * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
    */
  var attributes: js.UndefOr[AwsCloudMapInstanceAttributes] = js.undefined
  
  /**
    * The preferred IP version that this virtual node uses. Setting the IP preference on the virtual node only overrides the IP preference set for the mesh on this specific node.
    */
  var ipPreference: js.UndefOr[IpPreference] = js.undefined
  
  /**
    * The name of the Cloud Map namespace to use.
    */
  var namespaceName: AwsCloudMapName
  
  /**
    * The name of the Cloud Map service to use.
    */
  var serviceName: AwsCloudMapName
}
object AwsCloudMapServiceDiscovery {
  
  inline def apply(namespaceName: AwsCloudMapName, serviceName: AwsCloudMapName): AwsCloudMapServiceDiscovery = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudMapServiceDiscovery]
  }
  
  extension [Self <: AwsCloudMapServiceDiscovery](x: Self) {
    
    inline def setAttributes(value: AwsCloudMapInstanceAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AwsCloudMapInstanceAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setIpPreference(value: IpPreference): Self = StObject.set(x, "ipPreference", value.asInstanceOf[js.Any])
    
    inline def setIpPreferenceUndefined: Self = StObject.set(x, "ipPreference", js.undefined)
    
    inline def setNamespaceName(value: AwsCloudMapName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: AwsCloudMapName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}

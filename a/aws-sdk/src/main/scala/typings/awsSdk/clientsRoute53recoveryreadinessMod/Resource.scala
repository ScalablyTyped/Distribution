package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The component identifier of the resource, generated when DNS target resource is used.
    */
  var ComponentId: js.UndefOr[string] = js.undefined
  
  /**
    * The DNS target resource.
    */
  var DnsTargetResource: js.UndefOr[DNSTargetResource] = js.undefined
  
  /**
    * A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
    */
  var ReadinessScopes: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services resource.
    */
  var ResourceArn: js.UndefOr[string] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    inline def setComponentId(value: string): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
    
    inline def setDnsTargetResource(value: DNSTargetResource): Self = StObject.set(x, "DnsTargetResource", value.asInstanceOf[js.Any])
    
    inline def setDnsTargetResourceUndefined: Self = StObject.set(x, "DnsTargetResource", js.undefined)
    
    inline def setReadinessScopes(value: listOfString): Self = StObject.set(x, "ReadinessScopes", value.asInstanceOf[js.Any])
    
    inline def setReadinessScopesUndefined: Self = StObject.set(x, "ReadinessScopes", js.undefined)
    
    inline def setReadinessScopesVarargs(value: string*): Self = StObject.set(x, "ReadinessScopes", js.Array(value*))
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}

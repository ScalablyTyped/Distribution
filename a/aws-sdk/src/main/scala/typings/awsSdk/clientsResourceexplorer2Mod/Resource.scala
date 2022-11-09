package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the resource.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that Resource Explorer last queried this resource and updated the index with the latest information about the resource.
    */
  var LastReportedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services account that owns the resource.
    */
  var OwningAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * A structure with additional type-specific details about the resource. These properties can be added by turning on integration between Resource Explorer and other Amazon Web Services services.
    */
  var Properties: js.UndefOr[ResourcePropertyList] = js.undefined
  
  /**
    * The Amazon Web Services Region in which the resource was created and exists.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the resource.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Service that owns the resource and is responsible for creating and updating it.
    */
  var Service: js.UndefOr[String] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setLastReportedAt(value: js.Date): Self = StObject.set(x, "LastReportedAt", value.asInstanceOf[js.Any])
    
    inline def setLastReportedAtUndefined: Self = StObject.set(x, "LastReportedAt", js.undefined)
    
    inline def setOwningAccountId(value: String): Self = StObject.set(x, "OwningAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwningAccountIdUndefined: Self = StObject.set(x, "OwningAccountId", js.undefined)
    
    inline def setProperties(value: ResourcePropertyList): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setPropertiesVarargs(value: ResourceProperty*): Self = StObject.set(x, "Properties", js.Array(value*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
  }
}

package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceInfo extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the resource across services.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the resource.
    */
  var name: js.UndefOr[ResourceSpecifier] = js.undefined
  
  /**
    *  The details related to the resource. 
    */
  var resourceDetails: js.UndefOr[ResourceDetails] = js.undefined
  
  /**
    *  Provides information about the Service Catalog App Registry resource type. 
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object ResourceInfo {
  
  inline def apply(): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceInfo] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: ResourceSpecifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "resourceDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceDetailsUndefined: Self = StObject.set(x, "resourceDetails", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}

package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that Cloud Map assigns to the namespace when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.Arn] = js.undefined
  
  /**
    * The date and time that the namespace was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The ID of the namespace.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The name of the namespace. When you create a namespace, Cloud Map automatically creates a Route 53 hosted zone that has the same name as the namespace.
    */
  var Name: js.UndefOr[NamespaceName] = js.undefined
  
  /**
    * The properties of the namespace.
    */
  var Properties: js.UndefOr[NamespaceProperties] = js.undefined
  
  /**
    * The number of services that were created using the namespace.
    */
  var ServiceCount: js.UndefOr[ResourceCount] = js.undefined
  
  /**
    * The type of the namespace, either public or private.
    */
  var Type: js.UndefOr[NamespaceType] = js.undefined
}
object NamespaceSummary {
  
  inline def apply(): NamespaceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamespaceSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: NamespaceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProperties(value: NamespaceProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setServiceCount(value: ResourceCount): Self = StObject.set(x, "ServiceCount", value.asInstanceOf[js.Any])
    
    inline def setServiceCountUndefined: Self = StObject.set(x, "ServiceCount", js.undefined)
    
    inline def setType(value: NamespaceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

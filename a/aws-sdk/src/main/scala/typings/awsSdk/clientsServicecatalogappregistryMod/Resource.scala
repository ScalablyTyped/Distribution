package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the resource.
    */
  var arn: js.UndefOr[StackArn] = js.undefined
  
  /**
    * The time the resource was associated with the application.
    */
  var associationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The service integration information about the resource. 
    */
  var integrations: js.UndefOr[ResourceIntegrations] = js.undefined
  
  /**
    * The name of the resource.
    */
  var name: js.UndefOr[ResourceSpecifier] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setArn(value: StackArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAssociationTime(value: js.Date): Self = StObject.set(x, "associationTime", value.asInstanceOf[js.Any])
    
    inline def setAssociationTimeUndefined: Self = StObject.set(x, "associationTime", js.undefined)
    
    inline def setIntegrations(value: ResourceIntegrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    inline def setName(value: ResourceSpecifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntityRequest extends StObject {
  
  /**
    * Required. The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.clientsMarketplacecatalogMod.Catalog
  
  /**
    * Required. The unique ID of the entity to describe.
    */
  var EntityId: ResourceId
}
object DescribeEntityRequest {
  
  inline def apply(Catalog: Catalog, EntityId: ResourceId): DescribeEntityRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntityRequest]
  }
  
  extension [Self <: DescribeEntityRequest](x: Self) {
    
    inline def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setEntityId(value: ResourceId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
  }
}

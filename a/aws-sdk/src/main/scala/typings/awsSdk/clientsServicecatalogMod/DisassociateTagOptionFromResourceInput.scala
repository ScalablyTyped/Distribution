package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTagOptionFromResourceInput extends StObject {
  
  /**
    * The resource identifier.
    */
  var ResourceId: typings.awsSdk.clientsServicecatalogMod.ResourceId
  
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typings.awsSdk.clientsServicecatalogMod.TagOptionId
}
object DisassociateTagOptionFromResourceInput {
  
  inline def apply(ResourceId: ResourceId, TagOptionId: TagOptionId): DisassociateTagOptionFromResourceInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagOptionId = TagOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTagOptionFromResourceInput]
  }
  
  extension [Self <: DisassociateTagOptionFromResourceInput](x: Self) {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setTagOptionId(value: TagOptionId): Self = StObject.set(x, "TagOptionId", value.asInstanceOf[js.Any])
  }
}

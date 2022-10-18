package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFacetRequest extends StObject {
  
  /**
    * List of attributes that need to be updated in a given schema Facet. Each attribute is followed by AttributeAction, which specifies the type of update operation to perform. 
    */
  var AttributeUpdates: js.UndefOr[FacetAttributeUpdateList] = js.undefined
  
  /**
    * The name of the facet.
    */
  var Name: FacetName
  
  /**
    * The object type that is associated with the facet. See CreateFacetRequest$ObjectType for more details.
    */
  var ObjectType: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ObjectType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn
}
object UpdateFacetRequest {
  
  inline def apply(Name: FacetName, SchemaArn: Arn): UpdateFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFacetRequest]
  }
  
  extension [Self <: UpdateFacetRequest](x: Self) {
    
    inline def setAttributeUpdates(value: FacetAttributeUpdateList): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdatesUndefined: Self = StObject.set(x, "AttributeUpdates", js.undefined)
    
    inline def setAttributeUpdatesVarargs(value: FacetAttributeUpdate*): Self = StObject.set(x, "AttributeUpdates", js.Array(value*))
    
    inline def setName(value: FacetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: ObjectType): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "ObjectType", js.undefined)
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}

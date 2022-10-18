package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTypedLinkFacetRequest extends StObject {
  
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}
object DeleteTypedLinkFacetRequest {
  
  inline def apply(Name: TypedLinkName, SchemaArn: Arn): DeleteTypedLinkFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTypedLinkFacetRequest]
  }
  
  extension [Self <: DeleteTypedLinkFacetRequest](x: Self) {
    
    inline def setName(value: TypedLinkName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTypedLinkFacetRequest extends StObject {
  
  /**
    *  Facet structure that is associated with the typed link facet.
    */
  var Facet: TypedLinkFacet
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}
object CreateTypedLinkFacetRequest {
  
  inline def apply(Facet: TypedLinkFacet, SchemaArn: Arn): CreateTypedLinkFacetRequest = {
    val __obj = js.Dynamic.literal(Facet = Facet.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTypedLinkFacetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTypedLinkFacetRequest] (val x: Self) extends AnyVal {
    
    inline def setFacet(value: TypedLinkFacet): Self = StObject.set(x, "Facet", value.asInstanceOf[js.Any])
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}

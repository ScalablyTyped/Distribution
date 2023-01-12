package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTypedLinkFacetInformationRequest extends StObject {
  
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}
object GetTypedLinkFacetInformationRequest {
  
  inline def apply(Name: TypedLinkName, SchemaArn: Arn): GetTypedLinkFacetInformationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTypedLinkFacetInformationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTypedLinkFacetInformationRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: TypedLinkName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedLinkSchemaAndFacetName extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
  
  /**
    * The unique name of the typed link facet.
    */
  var TypedLinkName: typings.awsSdk.clientsClouddirectoryMod.TypedLinkName
}
object TypedLinkSchemaAndFacetName {
  
  inline def apply(SchemaArn: Arn, TypedLinkName: TypedLinkName): TypedLinkSchemaAndFacetName = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any], TypedLinkName = TypedLinkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkSchemaAndFacetName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypedLinkSchemaAndFacetName] (val x: Self) extends AnyVal {
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setTypedLinkName(value: TypedLinkName): Self = StObject.set(x, "TypedLinkName", value.asInstanceOf[js.Any])
  }
}

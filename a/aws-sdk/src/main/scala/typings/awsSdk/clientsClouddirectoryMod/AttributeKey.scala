package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeKey extends StObject {
  
  /**
    * The name of the facet that the attribute exists within.
    */
  var FacetName: typings.awsSdk.clientsClouddirectoryMod.FacetName
  
  /**
    * The name of the attribute.
    */
  var Name: AttributeName
  
  /**
    * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
    */
  var SchemaArn: Arn
}
object AttributeKey {
  
  inline def apply(FacetName: FacetName, Name: AttributeName, SchemaArn: Arn): AttributeKey = {
    val __obj = js.Dynamic.literal(FacetName = FacetName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeKey] (val x: Self) extends AnyVal {
    
    inline def setFacetName(value: FacetName): Self = StObject.set(x, "FacetName", value.asInstanceOf[js.Any])
    
    inline def setName(value: AttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}

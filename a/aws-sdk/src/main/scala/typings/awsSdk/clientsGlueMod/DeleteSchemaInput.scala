package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSchemaInput extends StObject {
  
  /**
    * This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
    */
  var SchemaId: typings.awsSdk.clientsGlueMod.SchemaId
}
object DeleteSchemaInput {
  
  inline def apply(SchemaId: SchemaId): DeleteSchemaInput = {
    val __obj = js.Dynamic.literal(SchemaId = SchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSchemaInput] (val x: Self) extends AnyVal {
    
    inline def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
  }
}

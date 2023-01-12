package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSchemaResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schema being deleted.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The name of the schema being deleted.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined
  
  /**
    * The status of the schema.
    */
  var Status: js.UndefOr[SchemaStatus] = js.undefined
}
object DeleteSchemaResponse {
  
  inline def apply(): DeleteSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSchemaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSchemaResponse] (val x: Self) extends AnyVal {
    
    inline def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    inline def setSchemaName(value: SchemaRegistryNameString): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaId extends StObject {
  
  /**
    * The name of the schema registry that contains the schema.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the schema. One of SchemaArn or SchemaName has to be provided.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The name of the schema. One of SchemaArn or SchemaName has to be provided.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined
}
object SchemaId {
  
  inline def apply(): SchemaId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaId]
  }
  
  extension [Self <: SchemaId](x: Self) {
    
    inline def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    inline def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    inline def setSchemaName(value: SchemaRegistryNameString): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
  }
}

package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaByDefinitionInput extends StObject {
  
  /**
    * The definition of the schema for which schema details are required.
    */
  var SchemaDefinition: SchemaDefinitionString
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of SchemaArn or SchemaName has to be provided.   SchemaId$SchemaName: The name of the schema. One of SchemaArn or SchemaName has to be provided.  
    */
  var SchemaId: typings.awsSdk.clientsGlueMod.SchemaId
}
object GetSchemaByDefinitionInput {
  
  inline def apply(SchemaDefinition: SchemaDefinitionString, SchemaId: SchemaId): GetSchemaByDefinitionInput = {
    val __obj = js.Dynamic.literal(SchemaDefinition = SchemaDefinition.asInstanceOf[js.Any], SchemaId = SchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaByDefinitionInput]
  }
  
  extension [Self <: GetSchemaByDefinitionInput](x: Self) {
    
    inline def setSchemaDefinition(value: SchemaDefinitionString): Self = StObject.set(x, "SchemaDefinition", value.asInstanceOf[js.Any])
    
    inline def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
  }
}

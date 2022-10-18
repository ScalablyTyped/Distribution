package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckSchemaVersionValidityInput extends StObject {
  
  /**
    * The data format of the schema definition. Currently AVRO, JSON and PROTOBUF are supported.
    */
  var DataFormat: typings.awsSdk.clientsGlueMod.DataFormat
  
  /**
    * The definition of the schema that has to be validated.
    */
  var SchemaDefinition: SchemaDefinitionString
}
object CheckSchemaVersionValidityInput {
  
  inline def apply(DataFormat: DataFormat, SchemaDefinition: SchemaDefinitionString): CheckSchemaVersionValidityInput = {
    val __obj = js.Dynamic.literal(DataFormat = DataFormat.asInstanceOf[js.Any], SchemaDefinition = SchemaDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckSchemaVersionValidityInput]
  }
  
  extension [Self <: CheckSchemaVersionValidityInput](x: Self) {
    
    inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setSchemaDefinition(value: SchemaDefinitionString): Self = StObject.set(x, "SchemaDefinition", value.asInstanceOf[js.Any])
  }
}

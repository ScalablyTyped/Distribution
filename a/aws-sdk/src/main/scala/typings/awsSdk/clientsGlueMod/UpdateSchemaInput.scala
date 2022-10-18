package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSchemaInput extends StObject {
  
  /**
    * The new compatibility setting for the schema.
    */
  var Compatibility: js.UndefOr[typings.awsSdk.clientsGlueMod.Compatibility] = js.undefined
  
  /**
    * The new description for the schema.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of SchemaArn or SchemaName has to be provided.   SchemaId$SchemaName: The name of the schema. One of SchemaArn or SchemaName has to be provided.  
    */
  var SchemaId: typings.awsSdk.clientsGlueMod.SchemaId
  
  /**
    * Version number required for check pointing. One of VersionNumber or Compatibility has to be provided.
    */
  var SchemaVersionNumber: js.UndefOr[typings.awsSdk.clientsGlueMod.SchemaVersionNumber] = js.undefined
}
object UpdateSchemaInput {
  
  inline def apply(SchemaId: SchemaId): UpdateSchemaInput = {
    val __obj = js.Dynamic.literal(SchemaId = SchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaInput]
  }
  
  extension [Self <: UpdateSchemaInput](x: Self) {
    
    inline def setCompatibility(value: Compatibility): Self = StObject.set(x, "Compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "Compatibility", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionNumber(value: SchemaVersionNumber): Self = StObject.set(x, "SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionNumberUndefined: Self = StObject.set(x, "SchemaVersionNumber", js.undefined)
  }
}

package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSchemaVersionMetadataInput extends StObject {
  
  /**
    * The metadata key's corresponding value.
    */
  var MetadataKeyValue: MetadataKeyValuePair
  
  /**
    * The unique ID for the schema.
    */
  var SchemaId: js.UndefOr[typings.awsSdk.clientsGlueMod.SchemaId] = js.undefined
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var SchemaVersionNumber: js.UndefOr[typings.awsSdk.clientsGlueMod.SchemaVersionNumber] = js.undefined
}
object PutSchemaVersionMetadataInput {
  
  inline def apply(MetadataKeyValue: MetadataKeyValuePair): PutSchemaVersionMetadataInput = {
    val __obj = js.Dynamic.literal(MetadataKeyValue = MetadataKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSchemaVersionMetadataInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSchemaVersionMetadataInput] (val x: Self) extends AnyVal {
    
    inline def setMetadataKeyValue(value: MetadataKeyValuePair): Self = StObject.set(x, "MetadataKeyValue", value.asInstanceOf[js.Any])
    
    inline def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    inline def setSchemaIdUndefined: Self = StObject.set(x, "SchemaId", js.undefined)
    
    inline def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    inline def setSchemaVersionNumber(value: SchemaVersionNumber): Self = StObject.set(x, "SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionNumberUndefined: Self = StObject.set(x, "SchemaVersionNumber", js.undefined)
  }
}

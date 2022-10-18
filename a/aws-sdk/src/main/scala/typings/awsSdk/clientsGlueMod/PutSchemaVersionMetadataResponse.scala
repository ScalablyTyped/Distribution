package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSchemaVersionMetadataResponse extends StObject {
  
  /**
    * The latest version of the schema.
    */
  var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.undefined
  
  /**
    * The metadata key.
    */
  var MetadataKey: js.UndefOr[MetadataKeyString] = js.undefined
  
  /**
    * The value of the metadata key.
    */
  var MetadataValue: js.UndefOr[MetadataValueString] = js.undefined
  
  /**
    * The name for the registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The name for the schema.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined
  
  /**
    * The unique version ID of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
}
object PutSchemaVersionMetadataResponse {
  
  inline def apply(): PutSchemaVersionMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSchemaVersionMetadataResponse]
  }
  
  extension [Self <: PutSchemaVersionMetadataResponse](x: Self) {
    
    inline def setLatestVersion(value: LatestSchemaVersionBoolean): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionUndefined: Self = StObject.set(x, "LatestVersion", js.undefined)
    
    inline def setMetadataKey(value: MetadataKeyString): Self = StObject.set(x, "MetadataKey", value.asInstanceOf[js.Any])
    
    inline def setMetadataKeyUndefined: Self = StObject.set(x, "MetadataKey", js.undefined)
    
    inline def setMetadataValue(value: MetadataValueString): Self = StObject.set(x, "MetadataValue", value.asInstanceOf[js.Any])
    
    inline def setMetadataValueUndefined: Self = StObject.set(x, "MetadataValue", js.undefined)
    
    inline def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    inline def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    inline def setSchemaName(value: SchemaRegistryNameString): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    inline def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    inline def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}

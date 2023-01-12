package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSchemaResponse extends StObject {
  
  /**
    * The schema compatibility mode.
    */
  var Compatibility: js.UndefOr[typings.awsSdk.clientsGlueMod.Compatibility] = js.undefined
  
  /**
    * The data format of the schema definition. Currently AVRO, JSON and PROTOBUF are supported.
    */
  var DataFormat: js.UndefOr[typings.awsSdk.clientsGlueMod.DataFormat] = js.undefined
  
  /**
    * A description of the schema if specified when created.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The latest version of the schema associated with the returned schema definition.
    */
  var LatestSchemaVersion: js.UndefOr[VersionLongNumber] = js.undefined
  
  /**
    * The next version of the schema associated with the returned schema definition.
    */
  var NextSchemaVersion: js.UndefOr[VersionLongNumber] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the registry.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The version number of the checkpoint (the last time the compatibility mode was changed).
    */
  var SchemaCheckpoint: js.UndefOr[SchemaCheckpointNumber] = js.undefined
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined
  
  /**
    * The status of the schema. 
    */
  var SchemaStatus: js.UndefOr[typings.awsSdk.clientsGlueMod.SchemaStatus] = js.undefined
  
  /**
    * The unique identifier of the first schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The status of the first schema version created.
    */
  var SchemaVersionStatus: js.UndefOr[typings.awsSdk.clientsGlueMod.SchemaVersionStatus] = js.undefined
  
  /**
    * The tags for the schema.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateSchemaResponse {
  
  inline def apply(): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSchemaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSchemaResponse] (val x: Self) extends AnyVal {
    
    inline def setCompatibility(value: Compatibility): Self = StObject.set(x, "Compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "Compatibility", js.undefined)
    
    inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "DataFormat", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLatestSchemaVersion(value: VersionLongNumber): Self = StObject.set(x, "LatestSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestSchemaVersionUndefined: Self = StObject.set(x, "LatestSchemaVersion", js.undefined)
    
    inline def setNextSchemaVersion(value: VersionLongNumber): Self = StObject.set(x, "NextSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setNextSchemaVersionUndefined: Self = StObject.set(x, "NextSchemaVersion", js.undefined)
    
    inline def setRegistryArn(value: GlueResourceArn): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    inline def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    inline def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    inline def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    inline def setSchemaCheckpoint(value: SchemaCheckpointNumber): Self = StObject.set(x, "SchemaCheckpoint", value.asInstanceOf[js.Any])
    
    inline def setSchemaCheckpointUndefined: Self = StObject.set(x, "SchemaCheckpoint", js.undefined)
    
    inline def setSchemaName(value: SchemaRegistryNameString): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    inline def setSchemaStatus(value: SchemaStatus): Self = StObject.set(x, "SchemaStatus", value.asInstanceOf[js.Any])
    
    inline def setSchemaStatusUndefined: Self = StObject.set(x, "SchemaStatus", js.undefined)
    
    inline def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    inline def setSchemaVersionStatus(value: SchemaVersionStatus): Self = StObject.set(x, "SchemaVersionStatus", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionStatusUndefined: Self = StObject.set(x, "SchemaVersionStatus", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}

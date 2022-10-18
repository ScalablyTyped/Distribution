package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSchemaResponse extends StObject {
  
  /**
    * The description of the schema.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time that schema was modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.undefined
  
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[string] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsSchemasMod.Tags] = js.undefined
  
  /**
    * The type of the schema.
    */
  var Type: js.UndefOr[string] = js.undefined
  
  /**
    * The date the schema version was created.
    */
  var VersionCreatedDate: js.UndefOr[js.Date] = js.undefined
}
object CreateSchemaResponse {
  
  inline def apply(): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSchemaResponse]
  }
  
  extension [Self <: CreateSchemaResponse](x: Self) {
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setSchemaArn(value: string): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    inline def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    inline def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVersionCreatedDate(value: js.Date): Self = StObject.set(x, "VersionCreatedDate", value.asInstanceOf[js.Any])
    
    inline def setVersionCreatedDateUndefined: Self = StObject.set(x, "VersionCreatedDate", js.undefined)
  }
}

package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersionListItem extends StObject {
  
  /**
    * The date and time the schema version was created.
    */
  var CreatedTime: js.UndefOr[CreatedTimestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The unique identifier of the schema version.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The status of the schema version.
    */
  var Status: js.UndefOr[SchemaVersionStatus] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
}
object SchemaVersionListItem {
  
  inline def apply(): SchemaVersionListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionListItem]
  }
  
  extension [Self <: SchemaVersionListItem](x: Self) {
    
    inline def setCreatedTime(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    inline def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    inline def setStatus(value: SchemaVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}

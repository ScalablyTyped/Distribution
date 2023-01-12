package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterSchemaVersionResponse extends StObject {
  
  /**
    * The unique ID that represents the version of this schema.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.undefined
  
  /**
    * The status of the schema version.
    */
  var Status: js.UndefOr[SchemaVersionStatus] = js.undefined
  
  /**
    * The version of this schema (for sync flow only, in case this is the first version).
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
}
object RegisterSchemaVersionResponse {
  
  inline def apply(): RegisterSchemaVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterSchemaVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterSchemaVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    inline def setStatus(value: SchemaVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}

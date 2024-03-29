package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSchemaVersionsInput extends StObject {
  
  /**
    * This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
    */
  var SchemaId: typings.awsSdk.clientsGlueMod.SchemaId
  
  /**
    * A version range may be supplied which may be of the format:   a single version number, 5   a range, 5-8 : deletes versions 5, 6, 7, 8  
    */
  var Versions: VersionsString
}
object DeleteSchemaVersionsInput {
  
  inline def apply(SchemaId: SchemaId, Versions: VersionsString): DeleteSchemaVersionsInput = {
    val __obj = js.Dynamic.literal(SchemaId = SchemaId.asInstanceOf[js.Any], Versions = Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaVersionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSchemaVersionsInput] (val x: Self) extends AnyVal {
    
    inline def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: VersionsString): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
  }
}

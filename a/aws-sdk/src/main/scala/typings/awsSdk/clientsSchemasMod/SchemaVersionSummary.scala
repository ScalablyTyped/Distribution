package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersionSummary extends StObject {
  
  /**
    * The ARN of the schema version.
    */
  var SchemaArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var SchemaVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The type of schema.
    */
  var Type: js.UndefOr[typings.awsSdk.clientsSchemasMod.Type] = js.undefined
}
object SchemaVersionSummary {
  
  inline def apply(): SchemaVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionSummary]
  }
  
  extension [Self <: SchemaVersionSummary](x: Self) {
    
    inline def setSchemaArn(value: string): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    inline def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    inline def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

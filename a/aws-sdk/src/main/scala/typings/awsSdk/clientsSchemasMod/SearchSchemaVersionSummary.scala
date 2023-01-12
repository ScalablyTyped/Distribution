package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSchemaVersionSummary extends StObject {
  
  /**
    * The date the schema version was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The type of schema.
    */
  var Type: js.UndefOr[typings.awsSdk.clientsSchemasMod.Type] = js.undefined
}
object SearchSchemaVersionSummary {
  
  inline def apply(): SearchSchemaVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemaVersionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSchemaVersionSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

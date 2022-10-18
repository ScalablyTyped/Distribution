package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetSchema extends StObject {
  
  /**
    *  
    */
  var InlineDataSchema: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.InlineDataSchema] = js.undefined
}
object DatasetSchema {
  
  inline def apply(): DatasetSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSchema]
  }
  
  extension [Self <: DatasetSchema](x: Self) {
    
    inline def setInlineDataSchema(value: InlineDataSchema): Self = StObject.set(x, "InlineDataSchema", value.asInstanceOf[js.Any])
    
    inline def setInlineDataSchemaUndefined: Self = StObject.set(x, "InlineDataSchema", js.undefined)
  }
}

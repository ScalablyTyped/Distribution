package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryData extends StObject {
  
  /**
    * The number of databases in the Fleet Advisor collector inventory.
    */
  var NumberOfDatabases: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The number of schemas in the Fleet Advisor collector inventory.
    */
  var NumberOfSchemas: js.UndefOr[IntegerOptional] = js.undefined
}
object InventoryData {
  
  inline def apply(): InventoryData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryData]
  }
  
  extension [Self <: InventoryData](x: Self) {
    
    inline def setNumberOfDatabases(value: IntegerOptional): Self = StObject.set(x, "NumberOfDatabases", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDatabasesUndefined: Self = StObject.set(x, "NumberOfDatabases", js.undefined)
    
    inline def setNumberOfSchemas(value: IntegerOptional): Self = StObject.set(x, "NumberOfSchemas", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSchemasUndefined: Self = StObject.set(x, "NumberOfSchemas", js.undefined)
  }
}

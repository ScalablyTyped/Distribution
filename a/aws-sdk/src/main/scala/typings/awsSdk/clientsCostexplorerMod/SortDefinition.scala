package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortDefinition extends StObject {
  
  /**
    * The key that's used to sort the data.
    */
  var Key: SortDefinitionKey
  
  /**
    * The order that's used to sort the data.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.SortOrder] = js.undefined
}
object SortDefinition {
  
  inline def apply(Key: SortDefinitionKey): SortDefinition = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortDefinition]
  }
  
  extension [Self <: SortDefinition](x: Self) {
    
    inline def setKey(value: SortDefinitionKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}

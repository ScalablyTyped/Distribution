package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotVersionSortBy extends StObject {
  
  /**
    * The attribute to use to sort the list of versions.
    */
  var attribute: BotVersionSortAttribute
  
  /**
    * The order to sort the list. You can specify ascending or descending order.
    */
  var order: SortOrder
}
object BotVersionSortBy {
  
  inline def apply(attribute: BotVersionSortAttribute, order: SortOrder): BotVersionSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotVersionSortBy]
  }
  
  extension [Self <: BotVersionSortBy](x: Self) {
    
    inline def setAttribute(value: BotVersionSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}

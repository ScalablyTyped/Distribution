package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotLocaleSortBy extends StObject {
  
  /**
    * The bot locale attribute to sort by.
    */
  var attribute: BotLocaleSortAttribute
  
  /**
    * Specifies whether to sort the bot locales in ascending or descending order.
    */
  var order: SortOrder
}
object BotLocaleSortBy {
  
  inline def apply(attribute: BotLocaleSortAttribute, order: SortOrder): BotLocaleSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotLocaleSortBy]
  }
  
  extension [Self <: BotLocaleSortBy](x: Self) {
    
    inline def setAttribute(value: BotLocaleSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}

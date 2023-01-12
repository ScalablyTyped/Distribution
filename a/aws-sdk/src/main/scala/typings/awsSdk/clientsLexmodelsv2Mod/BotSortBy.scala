package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotSortBy extends StObject {
  
  /**
    * The attribute to use to sort the list of bots.
    */
  var attribute: BotSortAttribute
  
  /**
    * The order to sort the list. You can choose ascending or descending.
    */
  var order: SortOrder
}
object BotSortBy {
  
  inline def apply(attribute: BotSortAttribute, order: SortOrder): BotSortBy = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotSortBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BotSortBy] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: BotSortAttribute): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}

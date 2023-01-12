package typings.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Search extends StObject {
  
  /**
    * An array of the blocks that match your search query
    */
  var blocks: js.Array[Block]
  
  /**
    * An array of the channels that match your search query
    */
  var channels: js.Array[Channel]
  
  /**
    * If pagination is used, page requested
    */
  var current_page: Double
  
  /**
    * If pagination is used, items per page requested
    */
  var per: Double
  
  /**
    * A string representation of your search query
    */
  var term: String
  
  /**
    * If pagination is used, how many total pages there are in your request
    */
  var total_pages: Double
  
  /**
    * An array of the users that match your search query
    */
  var users: js.Array[User]
}
object Search {
  
  inline def apply(
    blocks: js.Array[Block],
    channels: js.Array[Channel],
    current_page: Double,
    per: Double,
    term: String,
    total_pages: Double,
    users: js.Array[User]
  ): Search = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], current_page = current_page.asInstanceOf[js.Any], per = per.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
    
    inline def setBlocks(value: js.Array[Block]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksVarargs(value: Block*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setChannels(value: js.Array[Channel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setCurrent_page(value: Double): Self = StObject.set(x, "current_page", value.asInstanceOf[js.Any])
    
    inline def setPer(value: Double): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[User]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value*))
  }
}

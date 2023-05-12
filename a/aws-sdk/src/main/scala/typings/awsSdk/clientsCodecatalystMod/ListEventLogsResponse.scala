package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventLogsResponse extends StObject {
  
  /**
    * Information about each event retrieved in the list.
    */
  var items: EventLogEntries
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListEventLogsResponse {
  
  inline def apply(items: EventLogEntries): ListEventLogsResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventLogsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEventLogsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: EventLogEntries): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: EventLogEntry*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

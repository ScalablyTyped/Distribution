package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogsResponse extends StObject {
  
  /**
    * The list of logs.
    */
  var logs: js.Array[Log]
}
object GetLogsResponse {
  
  inline def apply(logs: js.Array[Log]): GetLogsResponse = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLogsResponse] (val x: Self) extends AnyVal {
    
    inline def setLogs(value: js.Array[Log]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setLogsVarargs(value: Log*): Self = StObject.set(x, "logs", js.Array(value*))
  }
}

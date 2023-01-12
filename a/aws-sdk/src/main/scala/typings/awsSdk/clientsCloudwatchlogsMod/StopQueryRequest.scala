package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopQueryRequest extends StObject {
  
  /**
    * The ID number of the query to stop. To find this ID number, use DescribeQueries.
    */
  var queryId: QueryId
}
object StopQueryRequest {
  
  inline def apply(queryId: QueryId): StopQueryRequest = {
    val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
  }
}

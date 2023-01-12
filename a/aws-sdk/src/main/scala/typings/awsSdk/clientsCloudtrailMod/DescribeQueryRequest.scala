package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQueryRequest extends StObject {
  
  /**
    * The ARN (or the ID suffix of the ARN) of an event data store on which the specified query was run.
    */
  var EventDataStore: js.UndefOr[EventDataStoreArn] = js.undefined
  
  /**
    * The query ID.
    */
  var QueryId: UUID
}
object DescribeQueryRequest {
  
  inline def apply(QueryId: UUID): DescribeQueryRequest = {
    val __obj = js.Dynamic.literal(QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
    
    inline def setEventDataStoreUndefined: Self = StObject.set(x, "EventDataStore", js.undefined)
    
    inline def setQueryId(value: UUID): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetMetricDataRequest extends StObject {
  
  /**
    * A list of queries for metrics to be retrieved.
    */
  var Queries: BatchGetMetricDataQueries
}
object BatchGetMetricDataRequest {
  
  inline def apply(Queries: BatchGetMetricDataQueries): BatchGetMetricDataRequest = {
    val __obj = js.Dynamic.literal(Queries = Queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetMetricDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetMetricDataRequest] (val x: Self) extends AnyVal {
    
    inline def setQueries(value: BatchGetMetricDataQueries): Self = StObject.set(x, "Queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: BatchGetMetricDataQuery*): Self = StObject.set(x, "Queries", js.Array(value*))
  }
}

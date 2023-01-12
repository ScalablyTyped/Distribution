package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryObjectsOutput extends StObject {
  
  /**
    * Indicates whether there are more results that can be obtained by a subsequent call.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifiers that match the query selectors.
    */
  var ids: js.UndefOr[idList] = js.undefined
  
  /**
    * The starting point for the next page of results. To view the next page of results, call QueryObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.undefined
}
object QueryObjectsOutput {
  
  inline def apply(): QueryObjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryObjectsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryObjectsOutput] (val x: Self) extends AnyVal {
    
    inline def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    inline def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    inline def setIds(value: idList): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: id*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
  }
}

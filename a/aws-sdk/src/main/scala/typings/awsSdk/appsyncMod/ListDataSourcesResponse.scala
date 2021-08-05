package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSourcesResponse extends StObject {
  
  /**
    * The DataSource objects.
    */
  var dataSources: js.UndefOr[DataSources] = js.undefined
  
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDataSourcesResponse {
  
  inline def apply(): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
  
  extension [Self <: ListDataSourcesResponse](x: Self) {
    
    inline def setDataSources(value: DataSources): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    inline def setDataSourcesVarargs(value: DataSource*): Self = StObject.set(x, "dataSources", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasourcePackagesResponse extends StObject {
  
  /**
    * Details on the data source packages active in the behavior graph.
    */
  var DatasourcePackages: js.UndefOr[DatasourcePackageIngestDetails] = js.undefined
  
  /**
    * For requests to get the next page of results, the pagination token that was returned with the previous set of results. The initial request does not include a pagination token.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDatasourcePackagesResponse {
  
  inline def apply(): ListDatasourcePackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasourcePackagesResponse]
  }
  
  extension [Self <: ListDatasourcePackagesResponse](x: Self) {
    
    inline def setDatasourcePackages(value: DatasourcePackageIngestDetails): Self = StObject.set(x, "DatasourcePackages", value.asInstanceOf[js.Any])
    
    inline def setDatasourcePackagesUndefined: Self = StObject.set(x, "DatasourcePackages", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

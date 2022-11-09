package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPackageVersionHistoryResponse extends StObject {
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the package.
    */
  var PackageID: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageID] = js.undefined
  
  /**
    * A list of package versions, along with their creation time and commit message.
    */
  var PackageVersionHistoryList: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageVersionHistoryList] = js.undefined
}
object GetPackageVersionHistoryResponse {
  
  inline def apply(): GetPackageVersionHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionHistoryResponse]
  }
  
  extension [Self <: GetPackageVersionHistoryResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    inline def setPackageIDUndefined: Self = StObject.set(x, "PackageID", js.undefined)
    
    inline def setPackageVersionHistoryList(value: PackageVersionHistoryList): Self = StObject.set(x, "PackageVersionHistoryList", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionHistoryListUndefined: Self = StObject.set(x, "PackageVersionHistoryList", js.undefined)
    
    inline def setPackageVersionHistoryListVarargs(value: PackageVersionHistory*): Self = StObject.set(x, "PackageVersionHistoryList", js.Array(value*))
  }
}

package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPackageVersionHistoryResponse extends StObject {
  
  var NextToken: js.UndefOr[String] = js.undefined
  
  var PackageID: js.UndefOr[typings.awsSdk.clientsEsMod.PackageID] = js.undefined
  
  /**
    * List of PackageVersionHistory objects.
    */
  var PackageVersionHistoryList: js.UndefOr[typings.awsSdk.clientsEsMod.PackageVersionHistoryList] = js.undefined
}
object GetPackageVersionHistoryResponse {
  
  inline def apply(): GetPackageVersionHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionHistoryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPackageVersionHistoryResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
    
    inline def setPackageIDUndefined: Self = StObject.set(x, "PackageID", js.undefined)
    
    inline def setPackageVersionHistoryList(value: PackageVersionHistoryList): Self = StObject.set(x, "PackageVersionHistoryList", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionHistoryListUndefined: Self = StObject.set(x, "PackageVersionHistoryList", js.undefined)
    
    inline def setPackageVersionHistoryListVarargs(value: PackageVersionHistory*): Self = StObject.set(x, "PackageVersionHistoryList", js.Array(value*))
  }
}

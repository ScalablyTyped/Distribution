package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagesResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
  
  /**
    * A list of packages.
    */
  var Packages: js.UndefOr[PackageList] = js.undefined
}
object ListPackagesResponse {
  
  inline def apply(): ListPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagesResponse]
  }
  
  extension [Self <: ListPackagesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPackages(value: PackageList): Self = StObject.set(x, "Packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "Packages", js.undefined)
    
    inline def setPackagesVarargs(value: PackageListItem*): Self = StObject.set(x, "Packages", js.Array(value*))
  }
}

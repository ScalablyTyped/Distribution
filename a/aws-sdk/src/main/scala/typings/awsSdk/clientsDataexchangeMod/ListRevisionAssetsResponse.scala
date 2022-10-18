package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRevisionAssetsResponse extends StObject {
  
  /**
    * The asset objects listed by the request.
    */
  var Assets: js.UndefOr[ListOfAssetEntry] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.NextToken] = js.undefined
}
object ListRevisionAssetsResponse {
  
  inline def apply(): ListRevisionAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRevisionAssetsResponse]
  }
  
  extension [Self <: ListRevisionAssetsResponse](x: Self) {
    
    inline def setAssets(value: ListOfAssetEntry): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetEntry*): Self = StObject.set(x, "Assets", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPairsResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the key pairs.
    */
  var keyPairs: js.UndefOr[KeyPairList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetKeyPairs request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetKeyPairsResult {
  
  inline def apply(): GetKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPairsResult]
  }
  
  extension [Self <: GetKeyPairsResult](x: Self) {
    
    inline def setKeyPairs(value: KeyPairList): Self = StObject.set(x, "keyPairs", value.asInstanceOf[js.Any])
    
    inline def setKeyPairsUndefined: Self = StObject.set(x, "keyPairs", js.undefined)
    
    inline def setKeyPairsVarargs(value: KeyPair*): Self = StObject.set(x, "keyPairs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

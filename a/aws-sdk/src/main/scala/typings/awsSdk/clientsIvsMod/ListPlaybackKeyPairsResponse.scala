package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlaybackKeyPairsResponse extends StObject {
  
  /**
    * List of key pairs.
    */
  var keyPairs: PlaybackKeyPairList
  
  /**
    * If there are more key pairs than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListPlaybackKeyPairsResponse {
  
  inline def apply(keyPairs: PlaybackKeyPairList): ListPlaybackKeyPairsResponse = {
    val __obj = js.Dynamic.literal(keyPairs = keyPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlaybackKeyPairsResponse]
  }
  
  extension [Self <: ListPlaybackKeyPairsResponse](x: Self) {
    
    inline def setKeyPairs(value: PlaybackKeyPairList): Self = StObject.set(x, "keyPairs", value.asInstanceOf[js.Any])
    
    inline def setKeyPairsVarargs(value: PlaybackKeyPairSummary*): Self = StObject.set(x, "keyPairs", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

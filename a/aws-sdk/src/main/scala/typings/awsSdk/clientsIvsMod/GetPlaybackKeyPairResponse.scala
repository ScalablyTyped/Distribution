package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlaybackKeyPairResponse extends StObject {
  
  /**
    * 
    */
  var keyPair: js.UndefOr[PlaybackKeyPair] = js.undefined
}
object GetPlaybackKeyPairResponse {
  
  inline def apply(): GetPlaybackKeyPairResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlaybackKeyPairResponse]
  }
  
  extension [Self <: GetPlaybackKeyPairResponse](x: Self) {
    
    inline def setKeyPair(value: PlaybackKeyPair): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    inline def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
  }
}

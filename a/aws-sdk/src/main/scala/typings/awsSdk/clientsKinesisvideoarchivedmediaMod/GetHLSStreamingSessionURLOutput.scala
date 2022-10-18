package typings.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHLSStreamingSessionURLOutput extends StObject {
  
  /**
    * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
    */
  var HLSStreamingSessionURL: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.HLSStreamingSessionURL] = js.undefined
}
object GetHLSStreamingSessionURLOutput {
  
  inline def apply(): GetHLSStreamingSessionURLOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHLSStreamingSessionURLOutput]
  }
  
  extension [Self <: GetHLSStreamingSessionURLOutput](x: Self) {
    
    inline def setHLSStreamingSessionURL(value: HLSStreamingSessionURL): Self = StObject.set(x, "HLSStreamingSessionURL", value.asInstanceOf[js.Any])
    
    inline def setHLSStreamingSessionURLUndefined: Self = StObject.set(x, "HLSStreamingSessionURL", js.undefined)
  }
}

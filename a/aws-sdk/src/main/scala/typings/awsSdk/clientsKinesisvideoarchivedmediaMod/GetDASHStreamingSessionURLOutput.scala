package typings.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDASHStreamingSessionURLOutput extends StObject {
  
  /**
    * The URL (containing the session token) that a media player can use to retrieve the MPEG-DASH manifest.
    */
  var DASHStreamingSessionURL: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.DASHStreamingSessionURL] = js.undefined
}
object GetDASHStreamingSessionURLOutput {
  
  inline def apply(): GetDASHStreamingSessionURLOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDASHStreamingSessionURLOutput]
  }
  
  extension [Self <: GetDASHStreamingSessionURLOutput](x: Self) {
    
    inline def setDASHStreamingSessionURL(value: DASHStreamingSessionURL): Self = StObject.set(x, "DASHStreamingSessionURL", value.asInstanceOf[js.Any])
    
    inline def setDASHStreamingSessionURLUndefined: Self = StObject.set(x, "DASHStreamingSessionURL", js.undefined)
  }
}

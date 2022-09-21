package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageBuilderStreamingURLResult extends StObject {
  
  /**
    * The elapsed time, in seconds after the Unix epoch, when this URL expires.
    */
  var Expires: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The URL to start the AppStream 2.0 streaming session.
    */
  var StreamingURL: js.UndefOr[String] = js.undefined
}
object CreateImageBuilderStreamingURLResult {
  
  inline def apply(): CreateImageBuilderStreamingURLResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageBuilderStreamingURLResult]
  }
  
  extension [Self <: CreateImageBuilderStreamingURLResult](x: Self) {
    
    inline def setExpires(value: js.Date): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    inline def setStreamingURL(value: String): Self = StObject.set(x, "StreamingURL", value.asInstanceOf[js.Any])
    
    inline def setStreamingURLUndefined: Self = StObject.set(x, "StreamingURL", js.undefined)
  }
}

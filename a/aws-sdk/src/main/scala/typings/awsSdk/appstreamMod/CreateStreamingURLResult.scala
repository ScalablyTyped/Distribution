package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingURLResult extends StObject {
  
  /**
    * The elapsed time, in seconds after the Unix epoch, when this URL expires.
    */
  var Expires: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The URL to start the AppStream 2.0 streaming session.
    */
  var StreamingURL: js.UndefOr[String] = js.undefined
}
object CreateStreamingURLResult {
  
  @scala.inline
  def apply(): CreateStreamingURLResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamingURLResult]
  }
  
  @scala.inline
  implicit class CreateStreamingURLResultMutableBuilder[Self <: CreateStreamingURLResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires(value: Timestamp): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    @scala.inline
    def setStreamingURL(value: String): Self = StObject.set(x, "StreamingURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingURLUndefined: Self = StObject.set(x, "StreamingURL", js.undefined)
  }
}

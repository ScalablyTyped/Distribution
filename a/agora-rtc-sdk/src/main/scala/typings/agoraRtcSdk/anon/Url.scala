package typings.agoraRtcSdk.anon

import typings.agoraRtcSdk.agoraRtcSdkStrings.liveStreamingFailed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  /**
    * **Note**: The following reasons only apply to the Web SDK 3.2.0 or later:
    *
    * The reasons:
    * - `LIVE_STREAMING_INVALID_ARGUMENT`: Invalid argument.
    * - `LIVE_STREAMING_INTERNAL_SERVER_ERROR`: An error occurs in Agora's streaming server.
    * - `LIVE_STREAMING_PUBLISH_STREAM_NOT_AUTHORIZED`: The URL is occupied.
    * - `LIVE_STREAMING_TRANSCODING_NOT_SUPPORTED`: Sets the transcoding parameters when the transcoding is not enabled.
    * - `LIVE_STREAMING_CDN_ERROR`: An error occurs in the CDN.
    * - `LIVE_STREAMING_TASK_CONFLICT`: A CDN streaming task with the same URL is running.
    * - `INVALID_OPERATION`: Invalid operation. If, for example, you do not call {@link Client.setLiveTransoding} to configure the live transcoding parameters before calling {@link Client.startLiveStreaming}, the SDK returns this error.
    * - `WS_ABORT`: The CDN live streaming task is aborted due to WebSocket disconnection.
    */
  var reason: String
  
  var `type`: liveStreamingFailed
  
  /**
    * The CDN streaming URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object Url {
  
  inline def apply(reason: String): Url = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("liveStreamingFailed")
    __obj.asInstanceOf[Url]
  }
  
  extension [Self <: Url](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setType(value: liveStreamingFailed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

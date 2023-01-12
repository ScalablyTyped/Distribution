package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheResource extends StObject {
  
  /**
    * Whether or not to store the audio mixing file in the cache.
    *
    * - `true`: (default) store the audio mixing file in the cache to speed up mixing this file the next time.
    * - `false`: do not store the audio mixing file in the cache to save RAM.
    */
  var cacheResource: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of playback loops (only supports Chrome 65+)
    *
    * A positive integer. The value range is [1,10000]. The default value is 1.
    */
  var cycle: js.UndefOr[Double] = js.undefined
  
  /**
    * Path of the online audio file to mix. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Supported audio formats: mp3, aac, and other audio formats depending on the browser.
    */
  var filePath: String
  
  /**
    * Whether the audio mixing file loops infinitely.
    *
    * - `true`: The audio mixing file loops infinitely. Do not use this option if `cycle` is specified.
    * - `false`: (Default) Disables the infinite loops.
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the playback position (ms) of the audio mixing file. An integer, and the value range is [0,100000000].
    *
    * If you need to play the file from the beginning, set this paramter to 0.
    */
  var playTime: Double
  
  /**
    * Whether the online audio file replaces the local audio stream.
    *
    * - `true`: The content of the online audio file replaces the audio stream from the microphone.
    * - `false`: (Default) The online audio file is mixed with the audio stream from the microphone.
    *
    * **Note**
    *
    * Safari does not support this parameter.
    */
  var replace: js.UndefOr[Boolean] = js.undefined
}
object CacheResource {
  
  inline def apply(filePath: String, playTime: Double): CacheResource = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], playTime = playTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheResource] (val x: Self) extends AnyVal {
    
    inline def setCacheResource(value: Boolean): Self = StObject.set(x, "cacheResource", value.asInstanceOf[js.Any])
    
    inline def setCacheResourceUndefined: Self = StObject.set(x, "cacheResource", js.undefined)
    
    inline def setCycle(value: Double): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setPlayTime(value: Double): Self = StObject.set(x, "playTime", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}

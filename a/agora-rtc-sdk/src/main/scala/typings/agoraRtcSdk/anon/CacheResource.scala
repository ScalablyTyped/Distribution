package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheResource extends js.Object {
  
  /**
    * Whether or not to store the audio mixing file in the cache.
    *
    * - `true`: (default) store the audio mixing file in the cache to speed up mixing this file the next time.
    * - `false`: do not store the audio mixing file in the cache to save RAM.
    */
  var cacheResource: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of playback loops (only supports Chrome 65+)
    *
    * A positive integer. The value range is [1,10000]. The default value is 1.
    */
  var cycle: js.UndefOr[Double] = js.native
  
  /**
    * Path of the online audio file to mix. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Supported audio formats: mp3, aac, and other audio formats depending on the browser.
    */
  var filePath: String = js.native
  
  /**
    * Whether the audio mixing file loops infinitely.
    *
    * - `true`: The audio mixing file loops infinitely. Do not use this option if `cycle` is specified.
    * - `false`: (Default) Disables the infinite loops.
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the playback position (ms) of the audio mixing file. An integer, and the value range is [0,100000000].
    *
    * If you need to play the file from the beginning, set this paramter to 0.
    */
  var playTime: Double = js.native
  
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
  var replace: js.UndefOr[Boolean] = js.native
}
object CacheResource {
  
  @scala.inline
  def apply(filePath: String, playTime: Double): CacheResource = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], playTime = playTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheResource]
  }
  
  @scala.inline
  implicit class CacheResourceOps[Self <: CacheResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayTime(value: Double): Self = this.set("playTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheResource(value: Boolean): Self = this.set("cacheResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheResource: Self = this.set("cacheResource", js.undefined)
    
    @scala.inline
    def setCycle(value: Double): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
}

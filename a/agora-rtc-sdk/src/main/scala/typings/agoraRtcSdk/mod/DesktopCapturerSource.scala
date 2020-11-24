package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Screen Source Information
  *
  * This interface contains information on the screen source, see [DesktopCapturerSource](https://electronjs.org/docs/api/structures/desktop-capturer-source).
  *
  */
@js.native
trait DesktopCapturerSource extends js.Object {
  
  /**
    * ID of the screen source.
    */
  val id: String = js.native
  
  /**
    * Name of the screen source.
    */
  val name: String = js.native
  
  /**
    * Thumbnail of the screen source. See [nativeImage](https://electronjs.org/docs/api/native-image#nativeimage) for supported types.
    */
  val thumbnail: js.Any = js.native
}
object DesktopCapturerSource {
  
  @scala.inline
  def apply(id: String, name: String, thumbnail: js.Any): DesktopCapturerSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopCapturerSource]
  }
  
  @scala.inline
  implicit class DesktopCapturerSourceOps[Self <: DesktopCapturerSource] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: js.Any): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
  }
}

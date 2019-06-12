package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Screen Source Information
  *
  * This interface contains information on the screen source, see [DesktopCapturerSource](https://electronjs.org/docs/api/structures/desktop-capturer-source).
  *
  */
trait DesktopCapturerSource extends js.Object {
  /**
    * ID of the screen source.
    */
  val id: java.lang.String
  /**
    * Name of the screen source.
    */
  val name: java.lang.String
  /**
    * Thumbnail of the screen source. See [nativeImage](https://electronjs.org/docs/api/native-image#nativeimage) for supported types.
    */
  val thumbnail: js.Any
}

object DesktopCapturerSource {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, thumbnail: js.Any): DesktopCapturerSource = {
    val __obj = js.Dynamic.literal(id = id, name = name, thumbnail = thumbnail)
  
    __obj.asInstanceOf[DesktopCapturerSource]
  }
}


package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Screen Source Information
  *
  * This interface contains information on the screen source, see [DesktopCapturerSource](https://electronjs.org/docs/api/structures/desktop-capturer-source).
  *
  */
trait DesktopCapturerSource extends StObject {
  
  /**
    * ID of the screen source.
    */
  val id: String
  
  /**
    * Name of the screen source.
    */
  val name: String
  
  /**
    * Thumbnail of the screen source. See [nativeImage](https://electronjs.org/docs/api/native-image#nativeimage) for supported types.
    */
  val thumbnail: Any
}
object DesktopCapturerSource {
  
  inline def apply(id: String, name: String, thumbnail: Any): DesktopCapturerSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopCapturerSource]
  }
  
  extension [Self <: DesktopCapturerSource](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: Any): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}

package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configurations for the watermark image to put on top of the video in {@link setLiveTranscoding}.
  *
  * **Since**
  * <br>&emsp;&emsp;&emsp;*3.0.0*
  */
@js.native
trait TranscodingWatermark extends StObject {
  
  /**
    * The height (pixel) of the watermark image.
    *
    * Integer only. The value range is [0,10000]. The default value is 160.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The HTTP/HTTPS URL address of the image on the broadcasting video.
    *
    * ASCII characters only. The maximum length of this parameter is 1024 bytes. Supports online PNG only.
    */
  var url: String = js.native
  
  /**
    * The width (pixel) of the watermark image.
    *
    * Integer only. The value range is [0,10000]. The default value is 160.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * The horizontal distance (pixel) between the watermark image's top-left corner and the video's top-left corner.
    *
    * Integer only. The value range is [0,10000]. The default value is 0.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * The vertical distance (pixel) between the watermark image's top-left corner and the video's top-left corner.
    *
    * Integer only. The value range is [0,10000]. The default value is 0.
    */
  var y: js.UndefOr[Double] = js.native
}
object TranscodingWatermark {
  
  @scala.inline
  def apply(url: String): TranscodingWatermark = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodingWatermark]
  }
  
  @scala.inline
  implicit class TranscodingWatermarkMutableBuilder[Self <: TranscodingWatermark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

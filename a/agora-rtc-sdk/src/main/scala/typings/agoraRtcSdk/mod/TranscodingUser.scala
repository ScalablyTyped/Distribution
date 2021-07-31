package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages the user layout configuration in {@link setLiveTranscoding}. */
trait TranscodingUser extends StObject {
  
  /**
    * The transparency level of the video frame.
    *
    * The value ranges between 0.0 and 1.0:
    *
    * - 0.0: Completely transparent.
    * - 1.0: Opaque.
    */
  var alpha: Double
  
  /**
    * The height of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 360.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The user ID of the CDN live host. */
  var uid: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The width of the video.
    *
    * Integer only. The value range is [0,10000], and the default value is 640.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * The position of the upper left end of the video on the horizontal axis.
    *
    * Integer only. The value range is [0,10000], and the default value is 0.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * The position of the upper left end of the video on the vertical axis.
    *
    * Integer only. The value range is [0,10000], and the default value is 0.
    */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
    * The layer index of the video frame.
    *
    * Integer only. The value range is [0,100].
    *
    * From v2.3.0, Agora SDK supports setting zOrder as 0.
    *
    * - 0: (Default) Bottom layer.
    * - 100: Top layer.
    *
    */
  var zOrder: js.UndefOr[Double] = js.undefined
}
object TranscodingUser {
  
  @scala.inline
  def apply(alpha: Double): TranscodingUser = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodingUser]
  }
  
  @scala.inline
  implicit class TranscodingUserMutableBuilder[Self <: TranscodingUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setUid(value: Double | String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
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
    
    @scala.inline
    def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
  }
}

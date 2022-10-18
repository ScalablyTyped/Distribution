package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticImageActivateScheduleActionSettings extends StObject {
  
  /**
    * The duration in milliseconds for the image to remain on the video. If omitted or set to 0 the duration is unlimited and the image will remain until it is explicitly deactivated.
    */
  var Duration: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * The time in milliseconds for the image to fade in. The fade-in starts at the start time of the overlay. Default is 0 (no fade-in).
    */
  var FadeIn: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Applies only if a duration is specified. The time in milliseconds for the image to fade out. The fade-out starts when the duration time is hit, so it effectively extends the duration. Default is 0 (no fade-out).
    */
  var FadeOut: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * The height of the image when inserted into the video, in pixels. The overlay will be scaled up or down to the specified height. Leave blank to use the native height of the overlay.
    */
  var Height: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * The location and filename of the image file to overlay on the video. The file must be a 32-bit BMP, PNG, or TGA file, and must not be larger (in pixels) than the input video.
    */
  var Image: InputLocation
  
  /**
    * Placement of the left edge of the overlay relative to the left edge of the video frame, in pixels. 0 (the default) is the left edge of the frame. If the placement causes the overlay to extend beyond the right edge of the underlying video, then the overlay is cropped on the right.
    */
  var ImageX: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Placement of the top edge of the overlay relative to the top edge of the video frame, in pixels. 0 (the default) is the top edge of the frame. If the placement causes the overlay to extend beyond the bottom edge of the underlying video, then the overlay is cropped on the bottom.
    */
  var ImageY: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * The number of the layer, 0 to 7. There are 8 layers that can be overlaid on the video, each layer with a different image. The layers are in Z order, which means that overlays with higher values of layer are inserted on top of overlays with lower values of layer. Default is 0.
    */
  var Layer: js.UndefOr[integerMin0Max7] = js.undefined
  
  /**
    * Opacity of image where 0 is transparent and 100 is fully opaque. Default is 100.
    */
  var Opacity: js.UndefOr[integerMin0Max100] = js.undefined
  
  /**
    * The width of the image when inserted into the video, in pixels. The overlay will be scaled up or down to the specified width. Leave blank to use the native width of the overlay.
    */
  var Width: js.UndefOr[integerMin1] = js.undefined
}
object StaticImageActivateScheduleActionSettings {
  
  inline def apply(Image: InputLocation): StaticImageActivateScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticImageActivateScheduleActionSettings]
  }
  
  extension [Self <: StaticImageActivateScheduleActionSettings](x: Self) {
    
    inline def setDuration(value: integerMin0): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setFadeIn(value: integerMin0): Self = StObject.set(x, "FadeIn", value.asInstanceOf[js.Any])
    
    inline def setFadeInUndefined: Self = StObject.set(x, "FadeIn", js.undefined)
    
    inline def setFadeOut(value: integerMin0): Self = StObject.set(x, "FadeOut", value.asInstanceOf[js.Any])
    
    inline def setFadeOutUndefined: Self = StObject.set(x, "FadeOut", js.undefined)
    
    inline def setHeight(value: integerMin1): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setImage(value: InputLocation): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageX(value: integerMin0): Self = StObject.set(x, "ImageX", value.asInstanceOf[js.Any])
    
    inline def setImageXUndefined: Self = StObject.set(x, "ImageX", js.undefined)
    
    inline def setImageY(value: integerMin0): Self = StObject.set(x, "ImageY", value.asInstanceOf[js.Any])
    
    inline def setImageYUndefined: Self = StObject.set(x, "ImageY", js.undefined)
    
    inline def setLayer(value: integerMin0Max7): Self = StObject.set(x, "Layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "Layer", js.undefined)
    
    inline def setOpacity(value: integerMin0Max100): Self = StObject.set(x, "Opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "Opacity", js.undefined)
    
    inline def setWidth(value: integerMin1): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}

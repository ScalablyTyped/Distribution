package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageGenerationConfiguration extends StObject {
  
  /**
    * The structure that contains the information required to deliver images to a customer.
    */
  var DestinationConfig: ImageGenerationDestinationConfig
  
  /**
    * The accepted image format.
    */
  var Format: typings.awsSdk.clientsKinesisvideoMod.Format
  
  /**
    * The list of a key-value pair structure that contains extra parameters that can be applied when the image is generated. The FormatConfig key is the JPEGQuality, which indicates the JPEG quality key to be used to generate the image. The FormatConfig value accepts ints from 1 to 100. If the value is 1, the image will be generated with less quality and the best compression. If the value is 100, the image will be generated with the best quality and less compression. If no value is provided, the default value of the JPEGQuality key will be set to 80.
    */
  var FormatConfig: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.FormatConfig] = js.undefined
  
  /**
    * The height of the output image that is used in conjunction with the WidthPixels parameter. When both HeightPixels and WidthPixels parameters are provided, the image will be stretched to fit the specified aspect ratio. If only the HeightPixels parameter is provided, its original aspect ratio will be used to calculate the WidthPixels ratio. If neither parameter is provided, the original image size will be returned.
    */
  var HeightPixels: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.HeightPixels] = js.undefined
  
  /**
    * The origin of the Server or Producer timestamps to use to generate the images.
    */
  var ImageSelectorType: typings.awsSdk.clientsKinesisvideoMod.ImageSelectorType
  
  /**
    * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum value that can be provided is 33 ms, because a camera that generates content at 30 FPS would create a frame every 33.3 ms. If the timestamp range is less than the sampling interval, the Image from the StartTimestamp will be returned if available. 
    */
  var SamplingInterval: typings.awsSdk.clientsKinesisvideoMod.SamplingInterval
  
  /**
    * Indicates whether the ContinuousImageGenerationConfigurations API is enabled or disabled.
    */
  var Status: ConfigurationStatus
  
  /**
    * The width of the output image that is used in conjunction with the HeightPixels parameter. When both WidthPixels and HeightPixels parameters are provided, the image will be stretched to fit the specified aspect ratio. If only the WidthPixels parameter is provided, its original aspect ratio will be used to calculate the HeightPixels ratio. If neither parameter is provided, the original image size will be returned.
    */
  var WidthPixels: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.WidthPixels] = js.undefined
}
object ImageGenerationConfiguration {
  
  inline def apply(
    DestinationConfig: ImageGenerationDestinationConfig,
    Format: Format,
    ImageSelectorType: ImageSelectorType,
    SamplingInterval: SamplingInterval,
    Status: ConfigurationStatus
  ): ImageGenerationConfiguration = {
    val __obj = js.Dynamic.literal(DestinationConfig = DestinationConfig.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImageSelectorType = ImageSelectorType.asInstanceOf[js.Any], SamplingInterval = SamplingInterval.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageGenerationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageGenerationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestinationConfig(value: ImageGenerationDestinationConfig): Self = StObject.set(x, "DestinationConfig", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatConfig(value: FormatConfig): Self = StObject.set(x, "FormatConfig", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigUndefined: Self = StObject.set(x, "FormatConfig", js.undefined)
    
    inline def setHeightPixels(value: HeightPixels): Self = StObject.set(x, "HeightPixels", value.asInstanceOf[js.Any])
    
    inline def setHeightPixelsUndefined: Self = StObject.set(x, "HeightPixels", js.undefined)
    
    inline def setImageSelectorType(value: ImageSelectorType): Self = StObject.set(x, "ImageSelectorType", value.asInstanceOf[js.Any])
    
    inline def setSamplingInterval(value: SamplingInterval): Self = StObject.set(x, "SamplingInterval", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setWidthPixels(value: WidthPixels): Self = StObject.set(x, "WidthPixels", value.asInstanceOf[js.Any])
    
    inline def setWidthPixelsUndefined: Self = StObject.set(x, "WidthPixels", js.undefined)
  }
}

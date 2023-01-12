package typings.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImagesInput extends StObject {
  
  /**
    * The end timestamp for the range of images to be generated.
    */
  var EndTimestamp: js.Date
  
  /**
    * The format that will be used to encode the image.
    */
  var Format: typings.awsSdk.clientsKinesisvideoarchivedmediaMod.Format
  
  /**
    * The list of a key-value pair structure that contains extra parameters that can be applied when the image is generated. The FormatConfig key is the JPEGQuality, which indicates the JPEG quality key to be used to generate the image. The FormatConfig value accepts ints from 1 to 100. If the value is 1, the image will be generated with less quality and the best compression. If the value is 100, the image will be generated with the best quality and less compression. If no value is provided, the default value of the JPEGQuality key will be set to 80.
    */
  var FormatConfig: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.FormatConfig] = js.undefined
  
  /**
    * The height of the output image that is used in conjunction with the WidthPixels parameter. When both HeightPixels and WidthPixels parameters are provided, the image will be stretched to fit the specified aspect ratio. If only the HeightPixels parameter is provided, its original aspect ratio will be used to calculate the WidthPixels ratio. If neither parameter is provided, the original image size will be returned.
    */
  var HeightPixels: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.HeightPixels] = js.undefined
  
  /**
    * The origin of the Server or Producer timestamps to use to generate the images.
    */
  var ImageSelectorType: typings.awsSdk.clientsKinesisvideoarchivedmediaMod.ImageSelectorType
  
  /**
    * The maximum number of images to be returned by the API.   The default limit is 100 images per API response. The additional results will be paginated.  
    */
  var MaxResults: js.UndefOr[GetImagesMaxResults] = js.undefined
  
  /**
    * A token that specifies where to start paginating the next set of Images. This is the GetImages:NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.NextToken] = js.undefined
  
  /**
    * The time interval in milliseconds (ms) at which the images need to be generated from the stream. The minimum value that can be provided is 3000 ms. If the timestamp range is less than the sampling interval, the Image from the startTimestamp will be returned if available.   The minimum value of 3000 ms is a soft limit. If needed, a lower sampling frequency can be requested. 
    */
  var SamplingInterval: typings.awsSdk.clientsKinesisvideoarchivedmediaMod.SamplingInterval
  
  /**
    * The starting point from which the images should be generated. This StartTimestamp must be within an inclusive range of timestamps for an image to be returned.
    */
  var StartTimestamp: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the stream from which to retrieve the images. You must specify either the StreamName or the StreamARN.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream from which to retrieve the images. You must specify either the StreamName or the StreamARN.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.StreamName] = js.undefined
  
  /**
    * The width of the output image that is used in conjunction with the HeightPixels parameter. When both WidthPixels and HeightPixels parameters are provided, the image will be stretched to fit the specified aspect ratio. If only the WidthPixels parameter is provided or if only the HeightPixels is provided, a ValidationException will be thrown. If neither parameter is provided, the original image size from the stream will be returned.
    */
  var WidthPixels: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.WidthPixels] = js.undefined
}
object GetImagesInput {
  
  inline def apply(
    EndTimestamp: js.Date,
    Format: Format,
    ImageSelectorType: ImageSelectorType,
    SamplingInterval: SamplingInterval,
    StartTimestamp: js.Date
  ): GetImagesInput = {
    val __obj = js.Dynamic.literal(EndTimestamp = EndTimestamp.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImageSelectorType = ImageSelectorType.asInstanceOf[js.Any], SamplingInterval = SamplingInterval.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImagesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImagesInput] (val x: Self) extends AnyVal {
    
    inline def setEndTimestamp(value: js.Date): Self = StObject.set(x, "EndTimestamp", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatConfig(value: FormatConfig): Self = StObject.set(x, "FormatConfig", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigUndefined: Self = StObject.set(x, "FormatConfig", js.undefined)
    
    inline def setHeightPixels(value: HeightPixels): Self = StObject.set(x, "HeightPixels", value.asInstanceOf[js.Any])
    
    inline def setHeightPixelsUndefined: Self = StObject.set(x, "HeightPixels", js.undefined)
    
    inline def setImageSelectorType(value: ImageSelectorType): Self = StObject.set(x, "ImageSelectorType", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: GetImagesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSamplingInterval(value: SamplingInterval): Self = StObject.set(x, "SamplingInterval", value.asInstanceOf[js.Any])
    
    inline def setStartTimestamp(value: js.Date): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    inline def setWidthPixels(value: WidthPixels): Self = StObject.set(x, "WidthPixels", value.asInstanceOf[js.Any])
    
    inline def setWidthPixelsUndefined: Self = StObject.set(x, "WidthPixels", js.undefined)
  }
}

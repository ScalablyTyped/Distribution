package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Thumbnails extends StObject {
  
  /**
    *  To better control resolution and aspect ratio of thumbnails, we recommend that you use the values MaxWidth, MaxHeight, SizingPolicy, and PaddingPolicy instead of Resolution and AspectRatio. The two groups of settings are mutually exclusive. Do not use them together.  The aspect ratio of thumbnails. Valid values include:  auto, 1:1, 4:3, 3:2, 16:9  If you specify auto, Elastic Transcoder tries to preserve the aspect ratio of the video in the output file.
    */
  var AspectRatio: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.AspectRatio] = js.undefined
  
  /**
    * The format of thumbnails, if any. Valid values are jpg and png.  You specify whether you want Elastic Transcoder to create thumbnails when you create a job.
    */
  var Format: js.UndefOr[JpgOrPng] = js.undefined
  
  /**
    * The approximate number of seconds between thumbnails. Specify an integer value.
    */
  var Interval: js.UndefOr[Digits] = js.undefined
  
  /**
    * The maximum height of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072.
    */
  var MaxHeight: js.UndefOr[DigitsOrAuto] = js.undefined
  
  /**
    * The maximum width of thumbnails in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096.
    */
  var MaxWidth: js.UndefOr[DigitsOrAuto] = js.undefined
  
  /**
    * When you set PaddingPolicy to Pad, Elastic Transcoder may add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
    */
  var PaddingPolicy: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.PaddingPolicy] = js.undefined
  
  /**
    *  To better control resolution and aspect ratio of thumbnails, we recommend that you use the values MaxWidth, MaxHeight, SizingPolicy, and PaddingPolicy instead of Resolution and AspectRatio. The two groups of settings are mutually exclusive. Do not use them together.  The width and height of thumbnail files in pixels. Specify a value in the format  width  x  height  where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object.
    */
  var Resolution: js.UndefOr[ThumbnailResolution] = js.undefined
  
  /**
    * Specify one of the following values to control scaling of thumbnails:    Fit: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail MaxWidth or MaxHeight settings without exceeding the other value.     Fill: Elastic Transcoder scales thumbnails so they match the value that you specified in thumbnail MaxWidth or MaxHeight settings and matches or exceeds the other value. Elastic Transcoder centers the image in thumbnails and then crops in the dimension (if any) that exceeds the maximum value.    Stretch: Elastic Transcoder stretches thumbnails to match the values that you specified for thumbnail MaxWidth and MaxHeight settings. If the relative proportions of the input video and thumbnails are different, the thumbnails will be distorted.    Keep: Elastic Transcoder does not scale thumbnails. If either dimension of the input video exceeds the values that you specified for thumbnail MaxWidth and MaxHeight settings, Elastic Transcoder crops the thumbnails.    ShrinkToFit: Elastic Transcoder scales thumbnails down so that their dimensions match the values that you specified for at least one of thumbnail MaxWidth and MaxHeight without exceeding either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.    ShrinkToFill: Elastic Transcoder scales thumbnails down so that their dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without dropping below either value. If you specify this option, Elastic Transcoder does not scale thumbnails up.  
    */
  var SizingPolicy: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.SizingPolicy] = js.undefined
}
object Thumbnails {
  
  inline def apply(): Thumbnails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnails]
  }
  
  extension [Self <: Thumbnails](x: Self) {
    
    inline def setAspectRatio(value: AspectRatio): Self = StObject.set(x, "AspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "AspectRatio", js.undefined)
    
    inline def setFormat(value: JpgOrPng): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setInterval(value: Digits): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setMaxHeight(value: DigitsOrAuto): Self = StObject.set(x, "MaxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "MaxHeight", js.undefined)
    
    inline def setMaxWidth(value: DigitsOrAuto): Self = StObject.set(x, "MaxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "MaxWidth", js.undefined)
    
    inline def setPaddingPolicy(value: PaddingPolicy): Self = StObject.set(x, "PaddingPolicy", value.asInstanceOf[js.Any])
    
    inline def setPaddingPolicyUndefined: Self = StObject.set(x, "PaddingPolicy", js.undefined)
    
    inline def setResolution(value: ThumbnailResolution): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    
    inline def setSizingPolicy(value: SizingPolicy): Self = StObject.set(x, "SizingPolicy", value.asInstanceOf[js.Any])
    
    inline def setSizingPolicyUndefined: Self = StObject.set(x, "SizingPolicy", js.undefined)
  }
}

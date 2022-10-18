package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashIsoImageBasedTrickPlaySettings extends StObject {
  
  /**
    * The cadence MediaConvert follows for generating thumbnails.  If set to FOLLOW_IFRAME, MediaConvert generates thumbnails for each IDR frame in the output (matching the GOP cadence).  If set to FOLLOW_CUSTOM, MediaConvert generates thumbnails according to the interval you specify in thumbnailInterval.
    */
  var IntervalCadence: js.UndefOr[DashIsoIntervalCadence] = js.undefined
  
  /**
    * Height of each thumbnail within each tile image, in pixels.  Leave blank to maintain aspect ratio with thumbnail width.  If following the aspect ratio would lead to a total tile height greater than 4096, then the job will be rejected.  Must be divisible by 2.
    */
  var ThumbnailHeight: js.UndefOr[integerMin1Max4096] = js.undefined
  
  /**
    * Enter the interval, in seconds, that MediaConvert uses to generate thumbnails.  If the interval you enter doesn't align with the output frame rate, MediaConvert automatically rounds the interval to align with the output frame rate.  For example, if the output frame rate is 29.97 frames per second and you enter 5, MediaConvert uses a 150 frame interval to generate thumbnails.
    */
  var ThumbnailInterval: js.UndefOr[doubleMin0Max2147483647] = js.undefined
  
  /**
    * Width of each thumbnail within each tile image, in pixels.  Default is 312.  Must be divisible by 8.
    */
  var ThumbnailWidth: js.UndefOr[integerMin8Max4096] = js.undefined
  
  /**
    * Number of thumbnails in each column of a tile image. Set a value between 2 and 2048. Must be divisible by 2.
    */
  var TileHeight: js.UndefOr[integerMin1Max2048] = js.undefined
  
  /**
    * Number of thumbnails in each row of a tile image.  Set a value between 1 and 512.
    */
  var TileWidth: js.UndefOr[integerMin1Max512] = js.undefined
}
object DashIsoImageBasedTrickPlaySettings {
  
  inline def apply(): DashIsoImageBasedTrickPlaySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashIsoImageBasedTrickPlaySettings]
  }
  
  extension [Self <: DashIsoImageBasedTrickPlaySettings](x: Self) {
    
    inline def setIntervalCadence(value: DashIsoIntervalCadence): Self = StObject.set(x, "IntervalCadence", value.asInstanceOf[js.Any])
    
    inline def setIntervalCadenceUndefined: Self = StObject.set(x, "IntervalCadence", js.undefined)
    
    inline def setThumbnailHeight(value: integerMin1Max4096): Self = StObject.set(x, "ThumbnailHeight", value.asInstanceOf[js.Any])
    
    inline def setThumbnailHeightUndefined: Self = StObject.set(x, "ThumbnailHeight", js.undefined)
    
    inline def setThumbnailInterval(value: doubleMin0Max2147483647): Self = StObject.set(x, "ThumbnailInterval", value.asInstanceOf[js.Any])
    
    inline def setThumbnailIntervalUndefined: Self = StObject.set(x, "ThumbnailInterval", js.undefined)
    
    inline def setThumbnailWidth(value: integerMin8Max4096): Self = StObject.set(x, "ThumbnailWidth", value.asInstanceOf[js.Any])
    
    inline def setThumbnailWidthUndefined: Self = StObject.set(x, "ThumbnailWidth", js.undefined)
    
    inline def setTileHeight(value: integerMin1Max2048): Self = StObject.set(x, "TileHeight", value.asInstanceOf[js.Any])
    
    inline def setTileHeightUndefined: Self = StObject.set(x, "TileHeight", js.undefined)
    
    inline def setTileWidth(value: integerMin1Max512): Self = StObject.set(x, "TileWidth", value.asInstanceOf[js.Any])
    
    inline def setTileWidthUndefined: Self = StObject.set(x, "TileWidth", js.undefined)
  }
}

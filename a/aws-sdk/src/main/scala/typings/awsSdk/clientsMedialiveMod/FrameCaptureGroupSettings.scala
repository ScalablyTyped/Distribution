package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCaptureGroupSettings extends StObject {
  
  /**
    * The destination for the frame capture files. Either the URI for an Amazon S3 bucket and object, plus a file name prefix (for example, s3ssl://sportsDelivery/highlights/20180820/curling-) or the URI for a MediaStore container, plus a file name prefix (for example, mediastoressl://sportsDelivery/20180820/curling-). The final file names consist of the prefix from the destination field (for example, "curling-") + name modifier + the counter (5 digits, starting from 00001) + extension (which is always .jpg).  For example, curling-low.00001.jpg
    */
  var Destination: OutputLocationRef
  
  /**
    * Parameters that control interactions with the CDN.
    */
  var FrameCaptureCdnSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FrameCaptureCdnSettings] = js.undefined
}
object FrameCaptureGroupSettings {
  
  inline def apply(Destination: OutputLocationRef): FrameCaptureGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCaptureGroupSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameCaptureGroupSettings] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setFrameCaptureCdnSettings(value: FrameCaptureCdnSettings): Self = StObject.set(x, "FrameCaptureCdnSettings", value.asInstanceOf[js.Any])
    
    inline def setFrameCaptureCdnSettingsUndefined: Self = StObject.set(x, "FrameCaptureCdnSettings", js.undefined)
  }
}

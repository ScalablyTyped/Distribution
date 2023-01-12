package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCaptureCdnSettings extends StObject {
  
  var FrameCaptureS3Settings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.FrameCaptureS3Settings] = js.undefined
}
object FrameCaptureCdnSettings {
  
  inline def apply(): FrameCaptureCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameCaptureCdnSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameCaptureCdnSettings] (val x: Self) extends AnyVal {
    
    inline def setFrameCaptureS3Settings(value: FrameCaptureS3Settings): Self = StObject.set(x, "FrameCaptureS3Settings", value.asInstanceOf[js.Any])
    
    inline def setFrameCaptureS3SettingsUndefined: Self = StObject.set(x, "FrameCaptureS3Settings", js.undefined)
  }
}

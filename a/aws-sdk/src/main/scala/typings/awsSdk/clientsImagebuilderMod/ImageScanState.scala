package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanState extends StObject {
  
  /**
    * The reason for the scan status for the image.
    */
  var reason: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current state of vulnerability scans for the image.
    */
  var status: js.UndefOr[ImageScanStatus] = js.undefined
}
object ImageScanState {
  
  inline def apply(): ImageScanState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageScanState] (val x: Self) extends AnyVal {
    
    inline def setReason(value: NonEmptyString): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: ImageScanStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

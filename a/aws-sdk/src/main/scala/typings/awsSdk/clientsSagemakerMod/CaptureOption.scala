package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureOption extends StObject {
  
  /**
    * Specify the boundary of data to capture.
    */
  var CaptureMode: typings.awsSdk.clientsSagemakerMod.CaptureMode
}
object CaptureOption {
  
  inline def apply(CaptureMode: CaptureMode): CaptureOption = {
    val __obj = js.Dynamic.literal(CaptureMode = CaptureMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptureOption] (val x: Self) extends AnyVal {
    
    inline def setCaptureMode(value: CaptureMode): Self = StObject.set(x, "CaptureMode", value.asInstanceOf[js.Any])
  }
}

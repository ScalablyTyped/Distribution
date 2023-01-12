package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerationSettings extends StObject {
  
  /**
    * Specify the conditions when the service will run your job with accelerated transcoding.
    */
  var Mode: AccelerationMode
}
object AccelerationSettings {
  
  inline def apply(Mode: AccelerationMode): AccelerationSettings = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccelerationSettings] (val x: Self) extends AnyVal {
    
    inline def setMode(value: AccelerationMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVolumeResponse extends StObject {
  
  /**
    * A description of the volume just updated. Returned after a successful UpdateVolume API operation.
    */
  var Volume: js.UndefOr[typings.awsSdk.clientsFsxMod.Volume] = js.undefined
}
object UpdateVolumeResponse {
  
  inline def apply(): UpdateVolumeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVolumeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVolumeResponse] (val x: Self) extends AnyVal {
    
    inline def setVolume(value: Volume): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}

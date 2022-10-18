package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVolumeResponse extends StObject {
  
  /**
    * Returned after a successful CreateVolume API operation, describing the volume just created.
    */
  var Volume: js.UndefOr[typings.awsSdk.clientsFsxMod.Volume] = js.undefined
}
object CreateVolumeResponse {
  
  inline def apply(): CreateVolumeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVolumeResponse]
  }
  
  extension [Self <: CreateVolumeResponse](x: Self) {
    
    inline def setVolume(value: Volume): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}

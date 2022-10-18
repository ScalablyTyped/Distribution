package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPresetResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the preset.
    */
  var Preset: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Preset] = js.undefined
}
object ReadPresetResponse {
  
  inline def apply(): ReadPresetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPresetResponse]
  }
  
  extension [Self <: ReadPresetResponse](x: Self) {
    
    inline def setPreset(value: Preset): Self = StObject.set(x, "Preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "Preset", js.undefined)
  }
}

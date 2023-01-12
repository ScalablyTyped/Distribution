package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMultiplexRequest extends StObject {
  
  /**
    * ID of the multiplex to update.
    */
  var MultiplexId: string
  
  /**
    * The new settings for a multiplex.
    */
  var MultiplexSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.MultiplexSettings] = js.undefined
  
  /**
    * Name of the multiplex.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object UpdateMultiplexRequest {
  
  inline def apply(MultiplexId: string): UpdateMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMultiplexRequest] (val x: Self) extends AnyVal {
    
    inline def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
    
    inline def setMultiplexSettings(value: MultiplexSettings): Self = StObject.set(x, "MultiplexSettings", value.asInstanceOf[js.Any])
    
    inline def setMultiplexSettingsUndefined: Self = StObject.set(x, "MultiplexSettings", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}

package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDestination extends StObject {
  
  /**
    * User-specified id. This is used in an output group or an output.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * Destination settings for a MediaPackage output; one destination for both encoders.
    */
  var MediaPackageSettings: js.UndefOr[listOfMediaPackageOutputDestinationSettings] = js.undefined
  
  /**
    * Destination settings for a Multiplex output; one destination for both encoders.
    */
  var MultiplexSettings: js.UndefOr[MultiplexProgramChannelDestinationSettings] = js.undefined
  
  /**
    * Destination settings for a standard output; one destination for each redundant encoder.
    */
  var Settings: js.UndefOr[listOfOutputDestinationSettings] = js.undefined
}
object OutputDestination {
  
  inline def apply(): OutputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputDestination] (val x: Self) extends AnyVal {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMediaPackageSettings(value: listOfMediaPackageOutputDestinationSettings): Self = StObject.set(x, "MediaPackageSettings", value.asInstanceOf[js.Any])
    
    inline def setMediaPackageSettingsUndefined: Self = StObject.set(x, "MediaPackageSettings", js.undefined)
    
    inline def setMediaPackageSettingsVarargs(value: MediaPackageOutputDestinationSettings*): Self = StObject.set(x, "MediaPackageSettings", js.Array(value*))
    
    inline def setMultiplexSettings(value: MultiplexProgramChannelDestinationSettings): Self = StObject.set(x, "MultiplexSettings", value.asInstanceOf[js.Any])
    
    inline def setMultiplexSettingsUndefined: Self = StObject.set(x, "MultiplexSettings", js.undefined)
    
    inline def setSettings(value: listOfOutputDestinationSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setSettingsVarargs(value: OutputDestinationSettings*): Self = StObject.set(x, "Settings", js.Array(value*))
  }
}

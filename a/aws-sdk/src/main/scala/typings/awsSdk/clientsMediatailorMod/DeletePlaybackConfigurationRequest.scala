package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePlaybackConfigurationRequest extends StObject {
  
  /**
    * The name of the playback configuration.
    */
  var Name: _String
}
object DeletePlaybackConfigurationRequest {
  
  inline def apply(Name: _String): DeletePlaybackConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlaybackConfigurationRequest]
  }
  
  extension [Self <: DeletePlaybackConfigurationRequest](x: Self) {
    
    inline def setName(value: _String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

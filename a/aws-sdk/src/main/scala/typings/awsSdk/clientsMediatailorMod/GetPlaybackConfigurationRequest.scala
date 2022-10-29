package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlaybackConfigurationRequest extends StObject {
  
  /**
    * The identifier for the playback configuration.
    */
  var Name: _String
}
object GetPlaybackConfigurationRequest {
  
  inline def apply(Name: _String): GetPlaybackConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaybackConfigurationRequest]
  }
  
  extension [Self <: GetPlaybackConfigurationRequest](x: Self) {
    
    inline def setName(value: _String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

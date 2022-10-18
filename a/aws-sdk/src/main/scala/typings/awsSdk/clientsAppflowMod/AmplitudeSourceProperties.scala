package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmplitudeSourceProperties extends StObject {
  
  /**
    *  The object specified in the Amplitude flow source. 
    */
  var `object`: Object
}
object AmplitudeSourceProperties {
  
  inline def apply(`object`: Object): AmplitudeSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmplitudeSourceProperties]
  }
  
  extension [Self <: AmplitudeSourceProperties](x: Self) {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}

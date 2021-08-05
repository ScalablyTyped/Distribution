package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VeevaSourceProperties extends StObject {
  
  /**
    *  The object specified in the Veeva flow source. 
    */
  var `object`: Object
}
object VeevaSourceProperties {
  
  inline def apply(`object`: Object): VeevaSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VeevaSourceProperties]
  }
  
  extension [Self <: VeevaSourceProperties](x: Self) {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}

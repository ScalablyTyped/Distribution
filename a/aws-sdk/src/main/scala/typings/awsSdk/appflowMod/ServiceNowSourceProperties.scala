package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNowSourceProperties extends StObject {
  
  /**
    *  The object specified in the ServiceNow flow source. 
    */
  var `object`: Object
}
object ServiceNowSourceProperties {
  
  inline def apply(`object`: Object): ServiceNowSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowSourceProperties]
  }
  
  extension [Self <: ServiceNowSourceProperties](x: Self) {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}

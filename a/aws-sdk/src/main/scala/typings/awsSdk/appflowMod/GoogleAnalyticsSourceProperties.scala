package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsSourceProperties extends StObject {
  
  /**
    *  The object specified in the Google Analytics flow source. 
    */
  var `object`: Object
}
object GoogleAnalyticsSourceProperties {
  
  inline def apply(`object`: Object): GoogleAnalyticsSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAnalyticsSourceProperties]
  }
  
  extension [Self <: GoogleAnalyticsSourceProperties](x: Self) {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}

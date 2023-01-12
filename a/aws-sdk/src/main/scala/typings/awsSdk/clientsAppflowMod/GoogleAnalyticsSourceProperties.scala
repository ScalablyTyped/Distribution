package typings.awsSdk.clientsAppflowMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}

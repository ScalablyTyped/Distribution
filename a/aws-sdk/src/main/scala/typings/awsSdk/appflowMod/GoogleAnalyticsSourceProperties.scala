package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsSourceProperties extends StObject {
  
  /**
    *  The object specified in the Google Analytics flow source. 
    */
  var `object`: Object = js.native
}
object GoogleAnalyticsSourceProperties {
  
  @scala.inline
  def apply(`object`: Object): GoogleAnalyticsSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAnalyticsSourceProperties]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsSourcePropertiesMutableBuilder[Self <: GoogleAnalyticsSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}

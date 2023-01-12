package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsSharing extends StObject {
  
  /**
    * Analytics sharing info tracking ID.
    */
  var tracking: js.UndefOr[String] = js.undefined
  
  /**
    * Analytics sharing info universally unique identifier.
    */
  var uuid: js.UndefOr[String] = js.undefined
}
object AnalyticsSharing {
  
  inline def apply(): AnalyticsSharing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsSharing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyticsSharing] (val x: Self) extends AnyVal {
    
    inline def setTracking(value: String): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    
    inline def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}

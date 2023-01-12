package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppMonitorDetails extends StObject {
  
  /**
    * The unique ID of the app monitor.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the app monitor.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the app monitor.
    */
  var version: js.UndefOr[String] = js.undefined
}
object AppMonitorDetails {
  
  inline def apply(): AppMonitorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppMonitorDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppMonitorDetails] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

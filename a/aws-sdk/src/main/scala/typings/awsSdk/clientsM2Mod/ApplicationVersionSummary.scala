package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationVersionSummary extends StObject {
  
  /**
    * The application version.
    */
  var applicationVersion: Version
  
  /**
    * The timestamp when the application version was created.
    */
  var creationTime: js.Date
  
  /**
    * The status of the application.
    */
  var status: ApplicationVersionLifecycle
  
  /**
    * The reason for the reported status.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object ApplicationVersionSummary {
  
  inline def apply(applicationVersion: Version, creationTime: js.Date, status: ApplicationVersionLifecycle): ApplicationVersionSummary = {
    val __obj = js.Dynamic.literal(applicationVersion = applicationVersion.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationVersionSummary] (val x: Self) extends AnyVal {
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ApplicationVersionLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}

package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResponse extends StObject {
  
  /**
    * The new version of the application.
    */
  var applicationVersion: Version
}
object UpdateApplicationResponse {
  
  inline def apply(applicationVersion: Version): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal(applicationVersion = applicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  
  extension [Self <: UpdateApplicationResponse](x: Self) {
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
  }
}

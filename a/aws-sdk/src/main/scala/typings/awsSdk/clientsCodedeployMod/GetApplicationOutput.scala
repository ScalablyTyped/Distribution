package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationOutput extends StObject {
  
  /**
    * Information about the application.
    */
  var application: js.UndefOr[ApplicationInfo] = js.undefined
}
object GetApplicationOutput {
  
  inline def apply(): GetApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationOutput]
  }
  
  extension [Self <: GetApplicationOutput](x: Self) {
    
    inline def setApplication(value: ApplicationInfo): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
  }
}

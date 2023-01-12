package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitledApplication extends StObject {
  
  /**
    * The identifier of the application.
    */
  var ApplicationIdentifier: String
}
object EntitledApplication {
  
  inline def apply(ApplicationIdentifier: String): EntitledApplication = {
    val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitledApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntitledApplication] (val x: Self) extends AnyVal {
    
    inline def setApplicationIdentifier(value: String): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
  }
}

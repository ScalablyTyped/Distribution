package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationName extends StObject {
  
  var applicationName: String
}
object ApplicationName {
  
  inline def apply(applicationName: String): ApplicationName = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationName] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
  }
}

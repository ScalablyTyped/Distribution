package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationName extends StObject {
  
  var applicationName: String = js.native
}
object ApplicationName {
  
  @scala.inline
  def apply(applicationName: String): ApplicationName = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationName]
  }
  
  @scala.inline
  implicit class ApplicationNameMutableBuilder[Self <: ApplicationName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpUrlDestinationConfiguration extends StObject {
  
  /**
    * The URL IoT uses to confirm ownership of or access to the topic rule destination URL.
    */
  var confirmationUrl: Url
}
object HttpUrlDestinationConfiguration {
  
  inline def apply(confirmationUrl: Url): HttpUrlDestinationConfiguration = {
    val __obj = js.Dynamic.literal(confirmationUrl = confirmationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUrlDestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpUrlDestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setConfirmationUrl(value: Url): Self = StObject.set(x, "confirmationUrl", value.asInstanceOf[js.Any])
  }
}

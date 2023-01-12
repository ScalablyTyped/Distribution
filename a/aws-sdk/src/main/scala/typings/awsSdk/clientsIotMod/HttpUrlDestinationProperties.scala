package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpUrlDestinationProperties extends StObject {
  
  /**
    * The URL used to confirm the HTTP topic rule destination URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.undefined
}
object HttpUrlDestinationProperties {
  
  inline def apply(): HttpUrlDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpUrlDestinationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpUrlDestinationProperties] (val x: Self) extends AnyVal {
    
    inline def setConfirmationUrl(value: Url): Self = StObject.set(x, "confirmationUrl", value.asInstanceOf[js.Any])
    
    inline def setConfirmationUrlUndefined: Self = StObject.set(x, "confirmationUrl", js.undefined)
  }
}

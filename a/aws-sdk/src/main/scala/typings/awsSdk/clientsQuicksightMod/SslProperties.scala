package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslProperties extends StObject {
  
  /**
    * A Boolean option to control whether SSL should be disabled.
    */
  var DisableSsl: js.UndefOr[Boolean] = js.undefined
}
object SslProperties {
  
  inline def apply(): SslProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslProperties]
  }
  
  extension [Self <: SslProperties](x: Self) {
    
    inline def setDisableSsl(value: Boolean): Self = StObject.set(x, "DisableSsl", value.asInstanceOf[js.Any])
    
    inline def setDisableSslUndefined: Self = StObject.set(x, "DisableSsl", js.undefined)
  }
}

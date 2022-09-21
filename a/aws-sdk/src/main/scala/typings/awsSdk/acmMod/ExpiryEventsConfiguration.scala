package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiryEventsConfiguration extends StObject {
  
  /**
    * Specifies the number of days prior to certificate expiration when ACM starts generating EventBridge events. ACM sends one event per day per certificate until the certificate expires. By default, accounts receive events starting 45 days before certificate expiration.
    */
  var DaysBeforeExpiry: js.UndefOr[PositiveInteger] = js.undefined
}
object ExpiryEventsConfiguration {
  
  inline def apply(): ExpiryEventsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpiryEventsConfiguration]
  }
  
  extension [Self <: ExpiryEventsConfiguration](x: Self) {
    
    inline def setDaysBeforeExpiry(value: PositiveInteger): Self = StObject.set(x, "DaysBeforeExpiry", value.asInstanceOf[js.Any])
    
    inline def setDaysBeforeExpiryUndefined: Self = StObject.set(x, "DaysBeforeExpiry", js.undefined)
  }
}

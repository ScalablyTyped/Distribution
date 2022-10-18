package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackingOptions extends StObject {
  
  /**
    * The domain to use for tracking open and click events.
    */
  var CustomRedirectDomain: typings.awsSdk.clientsSesv2Mod.CustomRedirectDomain
}
object TrackingOptions {
  
  inline def apply(CustomRedirectDomain: CustomRedirectDomain): TrackingOptions = {
    val __obj = js.Dynamic.literal(CustomRedirectDomain = CustomRedirectDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingOptions]
  }
  
  extension [Self <: TrackingOptions](x: Self) {
    
    inline def setCustomRedirectDomain(value: CustomRedirectDomain): Self = StObject.set(x, "CustomRedirectDomain", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayRouteHostnameMatch extends StObject {
  
  /**
    * The exact host name to match on.
    */
  var exact: js.UndefOr[ExactHostName] = js.undefined
  
  /**
    * The specified ending characters of the host name to match on.
    */
  var suffix: js.UndefOr[SuffixHostname] = js.undefined
}
object GatewayRouteHostnameMatch {
  
  inline def apply(): GatewayRouteHostnameMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayRouteHostnameMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewayRouteHostnameMatch] (val x: Self) extends AnyVal {
    
    inline def setExact(value: ExactHostName): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setSuffix(value: SuffixHostname): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}

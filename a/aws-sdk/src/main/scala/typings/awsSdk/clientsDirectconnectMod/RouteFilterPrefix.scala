package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteFilterPrefix extends StObject {
  
  /**
    * The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64 or shorter.
    */
  var cidr: js.UndefOr[CIDR] = js.undefined
}
object RouteFilterPrefix {
  
  inline def apply(): RouteFilterPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteFilterPrefix]
  }
  
  extension [Self <: RouteFilterPrefix](x: Self) {
    
    inline def setCidr(value: CIDR): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
  }
}

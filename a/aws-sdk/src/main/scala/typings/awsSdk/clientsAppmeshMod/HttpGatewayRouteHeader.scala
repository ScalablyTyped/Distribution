package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpGatewayRouteHeader extends StObject {
  
  /**
    * Specify True to match anything except the match criteria. The default value is False.
    */
  var invert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that represents the method and value to match with the header value sent in a request. Specify one match method.
    */
  var `match`: js.UndefOr[HeaderMatchMethod] = js.undefined
  
  /**
    * A name for the HTTP header in the gateway route that will be matched on.
    */
  var name: HeaderName
}
object HttpGatewayRouteHeader {
  
  inline def apply(name: HeaderName): HttpGatewayRouteHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpGatewayRouteHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpGatewayRouteHeader] (val x: Self) extends AnyVal {
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    inline def setMatch(value: HeaderMatchMethod): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setName(value: HeaderName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

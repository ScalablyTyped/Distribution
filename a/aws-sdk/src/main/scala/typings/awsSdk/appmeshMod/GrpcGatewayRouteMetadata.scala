package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcGatewayRouteMetadata extends StObject {
  
  /**
    * Specify True to match anything except the match criteria. The default value is False.
    */
  var invert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The criteria for determining a metadata match.
    */
  var `match`: js.UndefOr[GrpcMetadataMatchMethod] = js.undefined
  
  /**
    * A name for the gateway route metadata.
    */
  var name: HeaderName
}
object GrpcGatewayRouteMetadata {
  
  inline def apply(name: HeaderName): GrpcGatewayRouteMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcGatewayRouteMetadata]
  }
  
  extension [Self <: GrpcGatewayRouteMetadata](x: Self) {
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    inline def setMatch(value: GrpcMetadataMatchMethod): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setName(value: HeaderName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

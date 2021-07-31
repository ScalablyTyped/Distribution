package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcRouteMetadata extends StObject {
  
  /**
    * Specify True to match anything except the match criteria. The default value is False.
    */
  var invert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that represents the data to match from the request.
    */
  var `match`: js.UndefOr[GrpcRouteMetadataMatchMethod] = js.undefined
  
  /**
    * The name of the route.
    */
  var name: HeaderName
}
object GrpcRouteMetadata {
  
  @scala.inline
  def apply(name: HeaderName): GrpcRouteMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRouteMetadata]
  }
  
  @scala.inline
  implicit class GrpcRouteMetadataMutableBuilder[Self <: GrpcRouteMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setMatch(value: GrpcRouteMetadataMatchMethod): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setName(value: HeaderName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

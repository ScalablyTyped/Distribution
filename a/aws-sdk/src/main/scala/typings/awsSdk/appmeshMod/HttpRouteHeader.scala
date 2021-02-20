package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRouteHeader extends StObject {
  
  /**
    * Specify True to match anything except the match criteria. The default value is False.
    */
  var invert: js.UndefOr[Boolean] = js.native
  
  /**
    * The HeaderMatchMethod object.
    */
  var `match`: js.UndefOr[HeaderMatchMethod] = js.native
  
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  var name: HeaderName = js.native
}
object HttpRouteHeader {
  
  @scala.inline
  def apply(name: HeaderName): HttpRouteHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRouteHeader]
  }
  
  @scala.inline
  implicit class HttpRouteHeaderMutableBuilder[Self <: HttpRouteHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setMatch(value: HeaderMatchMethod): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setName(value: HeaderName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

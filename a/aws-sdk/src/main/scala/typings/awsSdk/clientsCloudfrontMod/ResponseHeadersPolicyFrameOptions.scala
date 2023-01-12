package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyFrameOptions extends StObject {
  
  /**
    * The value of the X-Frame-Options HTTP response header. Valid values are DENY and SAMEORIGIN.  For more information about these values, see X-Frame-Options in the MDN Web Docs.
    */
  var FrameOption: FrameOptionsList
  
  /**
    * A Boolean that determines whether CloudFront overrides the X-Frame-Options HTTP response header received from the origin with the one specified in this response headers policy.
    */
  var Override: Boolean
}
object ResponseHeadersPolicyFrameOptions {
  
  inline def apply(FrameOption: FrameOptionsList, Override: Boolean): ResponseHeadersPolicyFrameOptions = {
    val __obj = js.Dynamic.literal(FrameOption = FrameOption.asInstanceOf[js.Any], Override = Override.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyFrameOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyFrameOptions] (val x: Self) extends AnyVal {
    
    inline def setFrameOption(value: FrameOptionsList): Self = StObject.set(x, "FrameOption", value.asInstanceOf[js.Any])
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "Override", value.asInstanceOf[js.Any])
  }
}

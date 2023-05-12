package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyRemoveHeader extends StObject {
  
  /**
    * The HTTP header name.
    */
  var Header: String
}
object ResponseHeadersPolicyRemoveHeader {
  
  inline def apply(Header: String): ResponseHeadersPolicyRemoveHeader = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyRemoveHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyRemoveHeader] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: String): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
  }
}

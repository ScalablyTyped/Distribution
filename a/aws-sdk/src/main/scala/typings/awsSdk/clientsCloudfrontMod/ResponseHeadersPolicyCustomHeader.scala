package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyCustomHeader extends StObject {
  
  /**
    * The HTTP response header name.
    */
  var Header: String
  
  /**
    * A Boolean that determines whether CloudFront overrides a response header with the same name received from the origin with the header specified here.
    */
  var Override: Boolean
  
  /**
    * The value for the HTTP response header.
    */
  var Value: String
}
object ResponseHeadersPolicyCustomHeader {
  
  inline def apply(Header: String, Override: Boolean, Value: String): ResponseHeadersPolicyCustomHeader = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], Override = Override.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyCustomHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyCustomHeader] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: String): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "Override", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}

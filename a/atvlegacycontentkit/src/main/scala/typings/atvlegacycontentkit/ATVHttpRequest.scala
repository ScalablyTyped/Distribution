package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request recieved in onGenerateRequest.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVHttpRequest extends StObject {
  
  /**
    * Set a request header.
    * @param key The key of the header to set.
    * @param value The value of the header.
    */
  def setRequestHeader(key: String, value: String): Unit
  
  /**
    * The URL of the request.
    */
  var url: String
}
object ATVHttpRequest {
  
  inline def apply(setRequestHeader: (String, String) => Unit, url: String): ATVHttpRequest = {
    val __obj = js.Dynamic.literal(setRequestHeader = js.Any.fromFunction2(setRequestHeader), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVHttpRequest]
  }
  
  extension [Self <: ATVHttpRequest](x: Self) {
    
    inline def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

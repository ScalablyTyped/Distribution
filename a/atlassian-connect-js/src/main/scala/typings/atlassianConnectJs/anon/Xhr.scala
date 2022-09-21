package typings.atlassianConnectJs.anon

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xhr extends StObject {
  
  var body: js.typedarray.ArrayBuffer
  
  var xhr: XMLHttpRequest
}
object Xhr {
  
  inline def apply(body: js.typedarray.ArrayBuffer, xhr: XMLHttpRequest): Xhr = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xhr]
  }
  
  extension [Self <: Xhr](x: Self) {
    
    inline def setBody(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
  }
}

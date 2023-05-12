package typings.auth0.mod

import typings.auth0.anon.HttpAuthorization
import typings.auth0.auth0Strings.active
import typings.auth0.auth0Strings.http
import typings.auth0.auth0Strings.paused
import typings.auth0.auth0Strings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpLogStream
  extends StObject
     with LogStreamBase
     with LogStream {
  
  var sink: HttpAuthorization
  
  var `type`: http
}
object HttpLogStream {
  
  inline def apply(id: String, name: String, sink: HttpAuthorization, status: active | paused | suspended): HttpLogStream = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("http")
    __obj.asInstanceOf[HttpLogStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpLogStream] (val x: Self) extends AnyVal {
    
    inline def setSink(value: HttpAuthorization): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setType(value: http): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

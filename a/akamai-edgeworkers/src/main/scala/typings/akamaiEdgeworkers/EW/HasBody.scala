package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasBody extends StObject {
  
  /**
    * The body associated with the incoming request.
    */
  val body: ReadableStreamEW[Any]
}
object HasBody {
  
  inline def apply(body: ReadableStreamEW[Any]): HasBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasBody] (val x: Self) extends AnyVal {
    
    inline def setBody(value: ReadableStreamEW[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}

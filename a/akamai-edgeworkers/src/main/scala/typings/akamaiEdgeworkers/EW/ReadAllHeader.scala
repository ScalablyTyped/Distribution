package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadAllHeader extends StObject {
  
  def getHeaders(): Headers
}
object ReadAllHeader {
  
  inline def apply(getHeaders: () => Headers): ReadAllHeader = {
    val __obj = js.Dynamic.literal(getHeaders = js.Any.fromFunction0(getHeaders))
    __obj.asInstanceOf[ReadAllHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadAllHeader] (val x: Self) extends AnyVal {
    
    inline def setGetHeaders(value: () => Headers): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
  }
}

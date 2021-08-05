package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** encapsulates the details of an XML parse error or warning. */
trait DOMException
  extends StObject
     with Exception {
  
  var Code: DOMExceptionType
}
object DOMException {
  
  inline def apply(Code: DOMExceptionType, Context: XInterface, Message: String): DOMException = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
  
  extension [Self <: DOMException](x: Self) {
    
    inline def setCode(value: DOMExceptionType): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
  }
}

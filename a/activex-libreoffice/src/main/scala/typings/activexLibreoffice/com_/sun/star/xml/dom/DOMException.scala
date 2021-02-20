package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** encapsulates the details of an XML parse error or warning. */
@js.native
trait DOMException extends Exception {
  
  var Code: DOMExceptionType = js.native
}
object DOMException {
  
  @scala.inline
  def apply(Code: DOMExceptionType, Context: XInterface, Message: String): DOMException = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
  
  @scala.inline
  implicit class DOMExceptionMutableBuilder[Self <: DOMException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: DOMExceptionType): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
  }
}

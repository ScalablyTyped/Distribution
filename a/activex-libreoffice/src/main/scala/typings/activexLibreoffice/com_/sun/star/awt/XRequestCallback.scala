package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an interface which can be used to call back an implementation */
@js.native
trait XRequestCallback extends StObject {
  
  /**
    * adds a callback request to the implementation
    * @param aData any private data which will be provided to the callback implementation.
    * @param xCallback a reference to the callback which should be called by the implementation of this interface.
    */
  def addCallback(xCallback: XCallback, aData: js.Any): Unit = js.native
}
object XRequestCallback {
  
  @scala.inline
  def apply(addCallback: (XCallback, js.Any) => Unit): XRequestCallback = {
    val __obj = js.Dynamic.literal(addCallback = js.Any.fromFunction2(addCallback))
    __obj.asInstanceOf[XRequestCallback]
  }
  
  @scala.inline
  implicit class XRequestCallbackMutableBuilder[Self <: XRequestCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCallback(value: (XCallback, js.Any) => Unit): Self = StObject.set(x, "addCallback", js.Any.fromFunction2(value))
  }
}

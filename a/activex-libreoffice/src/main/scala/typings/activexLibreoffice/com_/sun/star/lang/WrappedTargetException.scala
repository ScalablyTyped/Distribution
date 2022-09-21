package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a checked exception that wraps an exception thrown by the original target.
  *
  * Normally this exception is declared for generic methods.
  * @see com.sun.star.container.XIndexAccess
  * @see com.sun.star.container.XNameAccess
  * @see com.sun.star.beans.XPropertySet
  */
trait WrappedTargetException
  extends StObject
     with Exception {
  
  /** The exception is thrown by the target. */
  var TargetException: Any
}
object WrappedTargetException {
  
  inline def apply(Context: XInterface, Message: String, TargetException: Any): WrappedTargetException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], TargetException = TargetException.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedTargetException]
  }
  
  extension [Self <: WrappedTargetException](x: Self) {
    
    inline def setTargetException(value: Any): Self = StObject.set(x, "TargetException", value.asInstanceOf[js.Any])
  }
}

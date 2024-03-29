package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception is thrown in case a configuration does not exists or contains corrupt data.
  *
  * This exception must be used as base exception to derive specialized exceptions from it which identify a concrete error case.
  * @since OOo 2.3
  */
trait CorruptedConfigurationException
  extends StObject
     with Exception {
  
  /** Instead of the message part of an exception, this value describe the type of corruption more in detail. */
  var Details: String
}
object CorruptedConfigurationException {
  
  inline def apply(Context: XInterface, Details: String, Message: String): CorruptedConfigurationException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorruptedConfigurationException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CorruptedConfigurationException] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: String): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
  }
}

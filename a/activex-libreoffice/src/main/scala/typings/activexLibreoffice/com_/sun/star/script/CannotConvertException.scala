package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This exception is thrown to indicate that a type conversion can not be performed. */
@js.native
trait CannotConvertException extends Exception {
  
  /** If the conversion of a method argument fails, this is the index of the value in the "IN" argument list. [optional] */
  var ArgumentIndex: Double = js.native
  
  /** This member contains the class of the type to which the value should be converted. */
  var DestinationTypeClass: TypeClass = js.native
  
  /** This member contains the reason that the conversion failed. Have a look at {@link FailReason} . */
  var Reason: Double = js.native
}
object CannotConvertException {
  
  @scala.inline
  def apply(
    ArgumentIndex: Double,
    Context: XInterface,
    DestinationTypeClass: TypeClass,
    Message: String,
    Reason: Double
  ): CannotConvertException = {
    val __obj = js.Dynamic.literal(ArgumentIndex = ArgumentIndex.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], DestinationTypeClass = DestinationTypeClass.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CannotConvertException]
  }
  
  @scala.inline
  implicit class CannotConvertExceptionMutableBuilder[Self <: CannotConvertException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentIndex(value: Double): Self = StObject.set(x, "ArgumentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationTypeClass(value: TypeClass): Self = StObject.set(x, "DestinationTypeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: Double): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}

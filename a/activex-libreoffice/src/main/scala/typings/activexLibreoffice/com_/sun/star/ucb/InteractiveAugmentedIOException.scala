package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An input/output error with arguments. */
@js.native
trait InteractiveAugmentedIOException extends InteractiveIOException {
  
  /**
    * Additional arguments.
    *
    * See {@link com.sun.star.task.InteractionHandler} for a description of well-known arguments.
    */
  var Arguments: SafeArray[_] = js.native
}
object InteractiveAugmentedIOException {
  
  @scala.inline
  def apply(
    Arguments: SafeArray[_],
    Classification: InteractionClassification,
    Code: IOErrorCode,
    Context: XInterface,
    Message: String
  ): InteractiveAugmentedIOException = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveAugmentedIOException]
  }
  
  @scala.inline
  implicit class InteractiveAugmentedIOExceptionMutableBuilder[Self <: InteractiveAugmentedIOException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: SafeArray[_]): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
  }
}

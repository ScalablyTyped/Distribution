package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception is thrown to indicate that a type conversion can not be performed. */
trait CannotConvertException extends Exception {
  /** If the conversion of a method argument fails, this is the index of the value in the "IN" argument list. [optional] */
  var ArgumentIndex: Double
  /** This member contains the class of the type to which the value should be converted. */
  var DestinationTypeClass: TypeClass
  /** This member contains the reason that the conversion failed. Have a look at {@link FailReason} . */
  var Reason: Double
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
    val __obj = js.Dynamic.literal(ArgumentIndex = ArgumentIndex, Context = Context, DestinationTypeClass = DestinationTypeClass, Message = Message, Reason = Reason)
  
    __obj.asInstanceOf[CannotConvertException]
  }
}


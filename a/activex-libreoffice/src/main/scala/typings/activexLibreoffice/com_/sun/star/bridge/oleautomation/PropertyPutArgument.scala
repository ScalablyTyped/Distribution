package typings.activexLibreoffice.com_.sun.star.bridge.oleautomation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a value that is used as argument in a "property put&quot operation on a Automation object.
  *
  * If a Automation object is converted into a UNO object by a scripting bridge, such as {@link com.sun.star.bridge.oleautomation.BridgeSupplier} , then
  * it is accessed through the {@link com.sun.star.script.XInvocation} interface. The methods {@link com.sun.star.script.XInvocation.setValue()} and
  * {@link com.sun.star.script.XInvocation.getValue()} are used to access properties which do not have additional arguments. To access a property with
  * additional arguments, the method {@link com.sun.star.script.XInvocation.invoke()} has to be used. The method implementation must decide, if the
  * property is to be written or read so it can perform the proper operation on the Automation object. To make this decision, the caller has to provide
  * the information if the current call is intended to be a write or read operation. This is done by providing either instances of {@link
  * PropertyPutArgument} or PropertyGetArgument as arguments to com::sun::star::script::XInvocation::Invoke.
  * @since OOo 1.1.2
  */
trait PropertyPutArgument extends js.Object {
  /** contains the actual argument. */
  var Value: js.Any
}

object PropertyPutArgument {
  @scala.inline
  def apply(Value: js.Any): PropertyPutArgument = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPutArgument]
  }
}


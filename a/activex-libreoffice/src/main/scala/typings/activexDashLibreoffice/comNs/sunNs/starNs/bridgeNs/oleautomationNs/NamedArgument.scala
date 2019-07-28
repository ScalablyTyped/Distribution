package typings.activexDashLibreoffice.comNs.sunNs.starNs.bridgeNs.oleautomationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a named argument in a call to a method of an Automation object.
  *
  * The Automation bridge accepts values of {@link NamedArgument} when a call to an Automation object is made. The call is done through the {@link
  * com.sun.star.script.XInvocation.invoke()} method, which takes all arguments in a sequence of anys. Usually the order of the arguments must correspond
  * to the order of arguments in the Automation method. By using instances of {@link NamedArgument} the arguments in the sequence can be unordered. The
  * Automation object being called must support named arguments, otherwise the call fails.
  * @since OOo 1.1.2
  */
trait NamedArgument extends js.Object {
  /** The name of the argument, for which {@link NamedArgument.Value} is intended. */
  var Name: String
  /** The value of the argument whoose name is the one as contained in the member {@link Name} . */
  var Value: js.Any
}

object NamedArgument {
  @scala.inline
  def apply(Name: String, Value: js.Any): NamedArgument = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[NamedArgument]
  }
}


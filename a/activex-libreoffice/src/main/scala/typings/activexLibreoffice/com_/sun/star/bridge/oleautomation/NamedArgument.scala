package typings.activexLibreoffice.com_.sun.star.bridge.oleautomation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a named argument in a call to a method of an Automation object.
  *
  * The Automation bridge accepts values of {@link NamedArgument} when a call to an Automation object is made. The call is done through the {@link
  * com.sun.star.script.XInvocation.invoke()} method, which takes all arguments in a sequence of anys. Usually the order of the arguments must correspond
  * to the order of arguments in the Automation method. By using instances of {@link NamedArgument} the arguments in the sequence can be unordered. The
  * Automation object being called must support named arguments, otherwise the call fails.
  * @since OOo 1.1.2
  */
@js.native
trait NamedArgument extends js.Object {
  
  /** The name of the argument, for which {@link NamedArgument.Value} is intended. */
  var Name: String = js.native
  
  /** The value of the argument whoose name is the one as contained in the member {@link Name} . */
  var Value: js.Any = js.native
}
object NamedArgument {
  
  @scala.inline
  def apply(Name: String, Value: js.Any): NamedArgument = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedArgument]
  }
  
  @scala.inline
  implicit class NamedArgumentOps[Self <: NamedArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}

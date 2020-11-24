package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is thrown when the wrong medium is inserted into a removable drive during an operation. */
@js.native
trait InteractiveWrongMediumException extends ClassifiedInteractionRequest {
  
  /** identifies the medium thats needed to continue with the pending operation. */
  var Medium: js.Any = js.native
}
object InteractiveWrongMediumException {
  
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Medium: js.Any, Message: String): InteractiveWrongMediumException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveWrongMediumException]
  }
  
  @scala.inline
  implicit class InteractiveWrongMediumExceptionOps[Self <: InteractiveWrongMediumException] (val x: Self) extends AnyVal {
    
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
    def setMedium(value: js.Any): Self = this.set("Medium", value.asInstanceOf[js.Any])
  }
}

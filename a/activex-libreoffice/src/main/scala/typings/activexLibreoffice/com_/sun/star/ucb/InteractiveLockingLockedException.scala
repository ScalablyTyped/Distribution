package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error indicating that the resource is locked.
  * @since OOo 3.3
  */
@js.native
trait InteractiveLockingLockedException extends InteractiveLockingException {
  
  /**
    * The owner of the lock.
    *
    * `TRUE` , the lock has been obtained by this OOo session. `FALSE` the lock has been obtained by another principal.
    */
  var SelfOwned: Boolean = js.native
}
object InteractiveLockingLockedException {
  
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: XInterface,
    Message: String,
    SelfOwned: Boolean,
    Url: String
  ): InteractiveLockingLockedException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], SelfOwned = SelfOwned.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveLockingLockedException]
  }
  
  @scala.inline
  implicit class InteractiveLockingLockedExceptionMutableBuilder[Self <: InteractiveLockingLockedException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelfOwned(value: Boolean): Self = StObject.set(x, "SelfOwned", value.asInstanceOf[js.Any])
  }
}

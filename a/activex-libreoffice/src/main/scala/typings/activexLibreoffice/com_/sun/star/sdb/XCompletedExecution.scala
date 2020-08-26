package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for execution where information for execution may be required from the user. */
@js.native
trait XCompletedExecution extends XInterface {
  /**
    * completes necessary information before execution, for example parameter values.
    * @param handler will be asked when more information is needed
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def executeWithCompletion(handler: XInteractionHandler): Unit = js.native
}

object XCompletedExecution {
  @scala.inline
  def apply(
    acquire: () => Unit,
    executeWithCompletion: XInteractionHandler => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCompletedExecution = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), executeWithCompletion = js.Any.fromFunction1(executeWithCompletion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCompletedExecution]
  }
  @scala.inline
  implicit class XCompletedExecutionOps[Self <: XCompletedExecution] (val x: Self) extends AnyVal {
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
    def setExecuteWithCompletion(value: XInteractionHandler => Unit): Self = this.set("executeWithCompletion", js.Any.fromFunction1(value))
  }
  
}


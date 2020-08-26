package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to try to restart the office.
  * @since OOo 3.3
  */
@js.native
trait XRestartManager extends XInterface {
  /**
    * allows to get info whether the restart has been requested and provide the initialization status.
    *
    * The office has to call this method just before the main loop has been started, with the `TRUE` as argument, so that the implementation knows that the
    * office is initialized. If the method returns `TRUE` , the office should restart without starting the main loop.
    * @param bInitialized specifies whether the office process is initialized already, if the caller does not have this information, they should provide `FALSE` .
    * @returns `TRUE` if the office restart has been requested, `FALSE` otherwise
    * @throws com::sun::star::uno::Exception to notify the caller about possible failures
    */
  def isRestartRequested(bInitialized: Boolean): Boolean = js.native
  /**
    * let the office restart asynchronously
    * @param xInteractionHandler the {@link com.sun.star.task.InteractionHandler} service implementation, that is used in case a problem is detected during re
    * @throws com::sun::star::uno::Exception to notify the caller about possible failures
    */
  def requestRestart(xInteractionHandler: XInteractionHandler): Unit = js.native
}

object XRestartManager {
  @scala.inline
  def apply(
    acquire: () => Unit,
    isRestartRequested: Boolean => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    requestRestart: XInteractionHandler => Unit
  ): XRestartManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isRestartRequested = js.Any.fromFunction1(isRestartRequested), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestRestart = js.Any.fromFunction1(requestRestart))
    __obj.asInstanceOf[XRestartManager]
  }
  @scala.inline
  implicit class XRestartManagerOps[Self <: XRestartManager] (val x: Self) extends AnyVal {
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
    def setIsRestartRequested(value: Boolean => Boolean): Self = this.set("isRestartRequested", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestRestart(value: XInteractionHandler => Unit): Self = this.set("requestRestart", js.Any.fromFunction1(value))
  }
  
}


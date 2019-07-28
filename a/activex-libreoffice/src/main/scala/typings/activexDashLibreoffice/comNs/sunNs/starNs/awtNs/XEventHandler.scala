package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface can be implemented by clients that need access to the toolkits window message loop. */
trait XEventHandler extends XInterface {
  /**
    * requests the implementor of this interface to handle a platform dependent event.
    * @param event the platform dependent event.
    * @returns `TRUE` if the event was handled properly and no further handling should take place, `FALSE` otherwise.
    */
  def handleEvent(event: js.Any): Boolean
}

object XEventHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    handleEvent: js.Any => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEventHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handleEvent = js.Any.fromFunction1(handleEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEventHandler]
  }
}


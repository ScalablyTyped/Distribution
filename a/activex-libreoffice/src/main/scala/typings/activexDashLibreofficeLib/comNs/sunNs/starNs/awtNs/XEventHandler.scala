package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface can be implemented by clients that need access to the toolkits window message loop. */
trait XEventHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * requests the implementor of this interface to handle a platform dependent event.
    * @param event the platform dependent event.
    * @returns `TRUE` if the event was handled properly and no further handling should take place, `FALSE` otherwise.
    */
  def handleEvent(event: js.Any): scala.Boolean
}


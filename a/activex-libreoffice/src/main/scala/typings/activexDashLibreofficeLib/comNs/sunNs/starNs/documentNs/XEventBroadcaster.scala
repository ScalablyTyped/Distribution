package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register listeners which are called whenever a document event (see {@link EventObject} ) occurs
  * @deprecated Deprecated
  * @see XDocumentEventBroadcaster
  */
trait XEventBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers the given listener
    * @param Listener listener which is interested on such events
    */
  def addEventListener(Listener: XEventListener): scala.Unit
  /**
    * unregisters the given listener
    * @param Listener listener which isn't interested on such events any longer
    */
  def removeEventListener(Listener: XEventListener): scala.Unit
}


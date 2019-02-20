package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events when a model object changes. */
trait XModifyListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when something changes in the object.
    *
    * Due to such an event, it may be necessary to update views or controllers.
    *
    * The source of the event may be the content of the object to which the listener is registered.
    */
  def modified(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}


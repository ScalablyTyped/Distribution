package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events from a component when the state of an item changes. */
trait XItemListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when an item changes its state. */
  def itemStateChanged(rEvent: ItemEvent): scala.Unit
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link XGridColumnModel} to get notifications about column model changes.
  * @since OOo 3.3
  */
trait XGridColumnListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** Invoked after a column was modified. */
  def columnChanged(event: GridColumnEvent): scala.Unit
}


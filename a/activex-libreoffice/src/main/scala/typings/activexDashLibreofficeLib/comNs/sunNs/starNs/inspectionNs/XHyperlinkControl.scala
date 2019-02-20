package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for an {@link XPropertyControl} which displays its value in a hyperlink-like way
  *
  * Hyperlink controls exchange their value ( {@link XPropertyControl.Value} ) as strings.
  * @since OOo 2.0.3
  */
trait XHyperlinkControl extends XPropertyControl {
  /**
    * adds a listener which will be notified when the user clicked the hyperlink text in the control
    * @param listener the listener to notify of hyperlink clicks
    */
  def addActionListener(listener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XActionListener): scala.Unit
  /**
    * removes a listener which was previously added via {@link addActionListener()}
    * @param listener the listener to revoke
    */
  def removeActionListener(listener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XActionListener): scala.Unit
}


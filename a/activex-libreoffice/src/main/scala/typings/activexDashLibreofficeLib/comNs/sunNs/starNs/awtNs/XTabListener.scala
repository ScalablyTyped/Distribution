package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** such listener will be informed if tab's was inserted/removed from an {@link XSimpleTabController} instance or if the properties of a tab was changed. */
trait XTabListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** a tab was activated (e.g. by using mouse/keyboard or method {@link XSimpleTabController.activateTab()} */
  def activated(ID: scala.Double): scala.Unit
  /**
    * a tab was changed within it's properties.
    * @param ID the unique ID of the changed tab.
    * @param Properties the current set of properties for this tab.
    */
  def changed(
    ID: scala.Double,
    Properties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): scala.Unit
  /** a tab was deactivated, because another tab became the new active state. */
  def deactivated(ID: scala.Double): scala.Unit
  /**
    * a new tab was inserted.
    * @param ID this is the unique ID of this new tab.
    */
  def inserted(ID: scala.Double): scala.Unit
  /**
    * a tab was removed.
    * @param ID this was the unique ID of this tab.
    */
  def removed(ID: scala.Double): scala.Unit
}


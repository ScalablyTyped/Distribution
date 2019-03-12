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

object XTabListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    activated: scala.Double => scala.Unit,
    changed: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]) => scala.Unit,
    deactivated: scala.Double => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    inserted: scala.Double => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removed: scala.Double => scala.Unit
  ): XTabListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activated = js.Any.fromFunction1(activated), changed = js.Any.fromFunction2(changed), deactivated = js.Any.fromFunction1(deactivated), disposing = js.Any.fromFunction1(disposing), inserted = js.Any.fromFunction1(inserted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removed = js.Any.fromFunction1(removed))
  
    __obj.asInstanceOf[XTabListener]
  }
}


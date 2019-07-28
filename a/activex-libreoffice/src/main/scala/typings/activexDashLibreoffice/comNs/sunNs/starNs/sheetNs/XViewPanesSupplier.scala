package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enables access to the panes in a view.
  * @deprecated Deprecated
  */
trait XViewPanesSupplier extends XInterface {
  /** returns the collection of panes in the view. */
  val ViewPanes: XIndexAccess
  /** returns the collection of panes in the view. */
  def getViewPanes(): XIndexAccess
}

object XViewPanesSupplier {
  @scala.inline
  def apply(
    ViewPanes: XIndexAccess,
    acquire: () => Unit,
    getViewPanes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewPanesSupplier = {
    val __obj = js.Dynamic.literal(ViewPanes = ViewPanes, acquire = js.Any.fromFunction0(acquire), getViewPanes = js.Any.fromFunction0(getViewPanes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XViewPanesSupplier]
  }
}


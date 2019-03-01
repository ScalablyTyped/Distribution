package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the basic interface to be implemented by a tool panel */
trait XToolPanel extends js.Object {
  /**
    * provides access to the tool panel's main window.
    *
    * It is allowed for an implementation to return `NULL` here, but in this case some functionality, for instance automatic positioning of the tool panel,
    * might not be available, and must be implemented by the tool panel itself.
    */
  var Window: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * creates the root of the Accessibility object tree for the tool panel
    * @param ParentAccessible the parent object in the Accessibility object tree
    */
  def createAccessible(ParentAccessible: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible): activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
}

object XToolPanel {
  @scala.inline
  def apply(
    Window: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    createAccessible: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ]
  ): XToolPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Window")(Window)
    __obj.updateDynamic("createAccessible")(createAccessible)
    __obj.asInstanceOf[XToolPanel]
  }
}


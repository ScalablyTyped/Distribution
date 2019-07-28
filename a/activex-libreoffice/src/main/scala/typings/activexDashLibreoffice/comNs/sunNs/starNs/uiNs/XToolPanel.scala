package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessible
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
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
  var Window: XWindow
  /**
    * creates the root of the Accessibility object tree for the tool panel
    * @param ParentAccessible the parent object in the Accessibility object tree
    */
  def createAccessible(ParentAccessible: XAccessible): XAccessible
}

object XToolPanel {
  @scala.inline
  def apply(Window: XWindow, createAccessible: XAccessible => XAccessible): XToolPanel = {
    val __obj = js.Dynamic.literal(Window = Window, createAccessible = js.Any.fromFunction1(createAccessible))
  
    __obj.asInstanceOf[XToolPanel]
  }
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An extension of the {@link XPane} interface that adds support for a) showing and hiding the windows that internally belong to the pane and b) setting
  * the accessibility object. This is typically an optional interface.
  */
trait XPane2 extends js.Object {
  /** Return the accessibility object that is currently associated with the windows that implement the pane. */
  var Accessible: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
  /** Return the accessibility object that is currently associated with the windows that implement the pane. */
  def getAccessible(): activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
  /**
    * Return whether all windows that are used to implement the pane are visible.
    * @returns `TRUE` when all windows of the pane are visible.
    */
  def isVisible(): scala.Boolean
  /**
    * Set the accessibility object for the pane. When there is more than one window used to implement the pane then the given accessibility object is
    * usually set at the topmost window. However, the details are implementation dependent.
    * @param xAccessible May be an empty reference.
    */
  def setAccessible(xAccessible: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible): scala.Unit
  /**
    * Hide or show the pane. If there is more than one window used to implement the pane then it is left to the implementation if one, some, or all windows
    * are hidden or shown as long as the pane becomes hidden or visible.
    * @param bIsVisible When `TRUE` then show the pane. Hide it otherwise.
    */
  def setVisible(bIsVisible: scala.Boolean): scala.Unit
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to Panel
  * @since LibreOffice 5.1
  */
trait XPanel extends js.Object {
  /** Get the panel dialog element */
  val Dialog: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /** The panel identifier */
  val Id: java.lang.String
  /** Get the ordering index of the panel in the deck */
  var OrderIndex: scala.Double
  /** Get the panel title string */
  var Title: java.lang.String
  /** Collapse the panel to only show its title bar */
  def collapse(): scala.Unit
  /**
    * Expand and display the panel
    * @param bCollapseOther TRUE collapse all other panels of the deckFALSE do not change other panels state
    */
  def expand(bCollapseOther: scala.Boolean): scala.Unit
  /** Get the panel dialog element */
  def getDialog(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /** The panel identifier */
  def getId(): java.lang.String
  /** Get the ordering index of the panel in the deck */
  def getOrderIndex(): scala.Double
  /** Get the panel title string */
  def getTitle(): java.lang.String
  /** Is the panel expanded */
  def isExpanded(): scala.Boolean
  /** Move the panel one step down in the deck */
  def moveDown(): scala.Unit
  /** Move panel as first item of the deck */
  def moveFirst(): scala.Unit
  /** Move panel as last item of the deck */
  def moveLast(): scala.Unit
  /** Move panel one step up in the deck */
  def moveUp(): scala.Unit
  /** Set the ordering index of the panel in the deck */
  def setOrderIndex(newOrderIndex: scala.Double): scala.Unit
  /**
    * Set the panel title string
    * @param newTitle The new title string
    */
  def setTitle(newTitle: java.lang.String): scala.Unit
}

object XPanel {
  @scala.inline
  def apply(
    Dialog: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    Id: java.lang.String,
    OrderIndex: scala.Double,
    Title: java.lang.String,
    collapse: js.Function0[scala.Unit],
    expand: js.Function1[scala.Boolean, scala.Unit],
    getDialog: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getId: js.Function0[java.lang.String],
    getOrderIndex: js.Function0[scala.Double],
    getTitle: js.Function0[java.lang.String],
    isExpanded: js.Function0[scala.Boolean],
    moveDown: js.Function0[scala.Unit],
    moveFirst: js.Function0[scala.Unit],
    moveLast: js.Function0[scala.Unit],
    moveUp: js.Function0[scala.Unit],
    setOrderIndex: js.Function1[scala.Double, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): XPanel = {
    val __obj = js.Dynamic.literal(Dialog = Dialog, Id = Id, OrderIndex = OrderIndex, Title = Title, collapse = collapse, expand = expand, getDialog = getDialog, getId = getId, getOrderIndex = getOrderIndex, getTitle = getTitle, isExpanded = isExpanded, moveDown = moveDown, moveFirst = moveFirst, moveLast = moveLast, moveUp = moveUp, setOrderIndex = setOrderIndex, setTitle = setTitle)
  
    __obj.asInstanceOf[XPanel]
  }
}


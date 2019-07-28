package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to Panel
  * @since LibreOffice 5.1
  */
trait XPanel extends js.Object {
  /** Get the panel dialog element */
  val Dialog: XWindow
  /** The panel identifier */
  val Id: String
  /** Get the ordering index of the panel in the deck */
  var OrderIndex: Double
  /** Get the panel title string */
  var Title: String
  /** Collapse the panel to only show its title bar */
  def collapse(): Unit
  /**
    * Expand and display the panel
    * @param bCollapseOther TRUE collapse all other panels of the deckFALSE do not change other panels state
    */
  def expand(bCollapseOther: Boolean): Unit
  /** Get the panel dialog element */
  def getDialog(): XWindow
  /** The panel identifier */
  def getId(): String
  /** Get the ordering index of the panel in the deck */
  def getOrderIndex(): Double
  /** Get the panel title string */
  def getTitle(): String
  /** Is the panel expanded */
  def isExpanded(): Boolean
  /** Move the panel one step down in the deck */
  def moveDown(): Unit
  /** Move panel as first item of the deck */
  def moveFirst(): Unit
  /** Move panel as last item of the deck */
  def moveLast(): Unit
  /** Move panel one step up in the deck */
  def moveUp(): Unit
  /** Set the ordering index of the panel in the deck */
  def setOrderIndex(newOrderIndex: Double): Unit
  /**
    * Set the panel title string
    * @param newTitle The new title string
    */
  def setTitle(newTitle: String): Unit
}

object XPanel {
  @scala.inline
  def apply(
    Dialog: XWindow,
    Id: String,
    OrderIndex: Double,
    Title: String,
    collapse: () => Unit,
    expand: Boolean => Unit,
    getDialog: () => XWindow,
    getId: () => String,
    getOrderIndex: () => Double,
    getTitle: () => String,
    isExpanded: () => Boolean,
    moveDown: () => Unit,
    moveFirst: () => Unit,
    moveLast: () => Unit,
    moveUp: () => Unit,
    setOrderIndex: Double => Unit,
    setTitle: String => Unit
  ): XPanel = {
    val __obj = js.Dynamic.literal(Dialog = Dialog, Id = Id, OrderIndex = OrderIndex, Title = Title, collapse = js.Any.fromFunction0(collapse), expand = js.Any.fromFunction1(expand), getDialog = js.Any.fromFunction0(getDialog), getId = js.Any.fromFunction0(getId), getOrderIndex = js.Any.fromFunction0(getOrderIndex), getTitle = js.Any.fromFunction0(getTitle), isExpanded = js.Any.fromFunction0(isExpanded), moveDown = js.Any.fromFunction0(moveDown), moveFirst = js.Any.fromFunction0(moveFirst), moveLast = js.Any.fromFunction0(moveLast), moveUp = js.Any.fromFunction0(moveUp), setOrderIndex = js.Any.fromFunction1(setOrderIndex), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XPanel]
  }
}


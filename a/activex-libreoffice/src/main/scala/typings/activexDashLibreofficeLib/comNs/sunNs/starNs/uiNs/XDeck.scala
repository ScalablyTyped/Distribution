package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to Deck
  * @since LibreOffice 5.1
  */
trait XDeck extends js.Object {
  /** The deck identifier */
  val Id: java.lang.String
  /** Get the ordering index of the deck button in sidebar */
  var OrderIndex: scala.Double
  /** Panels collection attached to the deck */
  val Panels: XPanels
  /** Get the deck title string */
  var Title: java.lang.String
  /**
    * Activate the deck and display its content
    * @param bActivate The requested state for the deck TRUE sets the deck as the active oneFALSE hide the deck and defaults to the first deck of the sidebar
    */
  def activate(bActivate: scala.Boolean): scala.Unit
  /** The deck identifier */
  def getId(): java.lang.String
  /** Get the ordering index of the deck button in sidebar */
  def getOrderIndex(): scala.Double
  /** Panels collection attached to the deck */
  def getPanels(): XPanels
  /** Get the deck title string */
  def getTitle(): java.lang.String
  /** Is the deck the active one */
  def isActive(): scala.Boolean
  /** Move deck one step down in the sidebar */
  def moveDown(): scala.Unit
  /** Move deck button at first position in sidebar */
  def moveFirst(): scala.Unit
  /** Move deck button at last position in sidebar */
  def moveLast(): scala.Unit
  /** Move deck one step up in the sidebar */
  def moveUp(): scala.Unit
  /**
    * Set the ordering index of the deck button in sidebar
    * @param newOrderIndex The new position
    */
  def setOrderIndex(newOrderIndex: scala.Double): scala.Unit
  /**
    * Set the deck title string
    * @param newTitle The new title string
    */
  def setTitle(newTitle: java.lang.String): scala.Unit
}

object XDeck {
  @scala.inline
  def apply(
    Id: java.lang.String,
    OrderIndex: scala.Double,
    Panels: XPanels,
    Title: java.lang.String,
    activate: scala.Boolean => scala.Unit,
    getId: () => java.lang.String,
    getOrderIndex: () => scala.Double,
    getPanels: () => XPanels,
    getTitle: () => java.lang.String,
    isActive: () => scala.Boolean,
    moveDown: () => scala.Unit,
    moveFirst: () => scala.Unit,
    moveLast: () => scala.Unit,
    moveUp: () => scala.Unit,
    setOrderIndex: scala.Double => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): XDeck = {
    val __obj = js.Dynamic.literal(Id = Id, OrderIndex = OrderIndex, Panels = Panels, Title = Title, activate = js.Any.fromFunction1(activate), getId = js.Any.fromFunction0(getId), getOrderIndex = js.Any.fromFunction0(getOrderIndex), getPanels = js.Any.fromFunction0(getPanels), getTitle = js.Any.fromFunction0(getTitle), isActive = js.Any.fromFunction0(isActive), moveDown = js.Any.fromFunction0(moveDown), moveFirst = js.Any.fromFunction0(moveFirst), moveLast = js.Any.fromFunction0(moveLast), moveUp = js.Any.fromFunction0(moveUp), setOrderIndex = js.Any.fromFunction1(setOrderIndex), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[XDeck]
  }
}


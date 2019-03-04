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
    activate: js.Function1[scala.Boolean, scala.Unit],
    getId: js.Function0[java.lang.String],
    getOrderIndex: js.Function0[scala.Double],
    getPanels: js.Function0[XPanels],
    getTitle: js.Function0[java.lang.String],
    isActive: js.Function0[scala.Boolean],
    moveDown: js.Function0[scala.Unit],
    moveFirst: js.Function0[scala.Unit],
    moveLast: js.Function0[scala.Unit],
    moveUp: js.Function0[scala.Unit],
    setOrderIndex: js.Function1[scala.Double, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): XDeck = {
    val __obj = js.Dynamic.literal(Id = Id, OrderIndex = OrderIndex, Panels = Panels, Title = Title, activate = activate, getId = getId, getOrderIndex = getOrderIndex, getPanels = getPanels, getTitle = getTitle, isActive = isActive, moveDown = moveDown, moveFirst = moveFirst, moveLast = moveLast, moveUp = moveUp, setOrderIndex = setOrderIndex, setTitle = setTitle)
  
    __obj.asInstanceOf[XDeck]
  }
}


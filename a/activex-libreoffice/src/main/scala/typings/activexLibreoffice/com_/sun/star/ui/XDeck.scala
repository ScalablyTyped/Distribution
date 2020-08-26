package typings.activexLibreoffice.com_.sun.star.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to Deck
  * @since LibreOffice 5.1
  */
@js.native
trait XDeck extends js.Object {
  /** The deck identifier */
  val Id: String = js.native
  /** Get the ordering index of the deck button in sidebar */
  var OrderIndex: Double = js.native
  /** Panels collection attached to the deck */
  val Panels: XPanels = js.native
  /** Get the deck title string */
  var Title: String = js.native
  /**
    * Activate the deck and display its content
    * @param bActivate The requested state for the deck TRUE sets the deck as the active oneFALSE hide the deck and defaults to the first deck of the sidebar
    */
  def activate(bActivate: Boolean): Unit = js.native
  /** The deck identifier */
  def getId(): String = js.native
  /** Get the ordering index of the deck button in sidebar */
  def getOrderIndex(): Double = js.native
  /** Panels collection attached to the deck */
  def getPanels(): XPanels = js.native
  /** Get the deck title string */
  def getTitle(): String = js.native
  /** Is the deck the active one */
  def isActive(): Boolean = js.native
  /** Move deck one step down in the sidebar */
  def moveDown(): Unit = js.native
  /** Move deck button at first position in sidebar */
  def moveFirst(): Unit = js.native
  /** Move deck button at last position in sidebar */
  def moveLast(): Unit = js.native
  /** Move deck one step up in the sidebar */
  def moveUp(): Unit = js.native
  /**
    * Set the ordering index of the deck button in sidebar
    * @param newOrderIndex The new position
    */
  def setOrderIndex(newOrderIndex: Double): Unit = js.native
  /**
    * Set the deck title string
    * @param newTitle The new title string
    */
  def setTitle(newTitle: String): Unit = js.native
}

object XDeck {
  @scala.inline
  def apply(
    Id: String,
    OrderIndex: Double,
    Panels: XPanels,
    Title: String,
    activate: Boolean => Unit,
    getId: () => String,
    getOrderIndex: () => Double,
    getPanels: () => XPanels,
    getTitle: () => String,
    isActive: () => Boolean,
    moveDown: () => Unit,
    moveFirst: () => Unit,
    moveLast: () => Unit,
    moveUp: () => Unit,
    setOrderIndex: Double => Unit,
    setTitle: String => Unit
  ): XDeck = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OrderIndex = OrderIndex.asInstanceOf[js.Any], Panels = Panels.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], activate = js.Any.fromFunction1(activate), getId = js.Any.fromFunction0(getId), getOrderIndex = js.Any.fromFunction0(getOrderIndex), getPanels = js.Any.fromFunction0(getPanels), getTitle = js.Any.fromFunction0(getTitle), isActive = js.Any.fromFunction0(isActive), moveDown = js.Any.fromFunction0(moveDown), moveFirst = js.Any.fromFunction0(moveFirst), moveLast = js.Any.fromFunction0(moveLast), moveUp = js.Any.fromFunction0(moveUp), setOrderIndex = js.Any.fromFunction1(setOrderIndex), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XDeck]
  }
  @scala.inline
  implicit class XDeckOps[Self <: XDeck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrderIndex(value: Double): Self = this.set("OrderIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanels(value: XPanels): Self = this.set("Panels", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivate(value: Boolean => Unit): Self = this.set("activate", js.Any.fromFunction1(value))
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOrderIndex(value: () => Double): Self = this.set("getOrderIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPanels(value: () => XPanels): Self = this.set("getPanels", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveDown(value: () => Unit): Self = this.set("moveDown", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveFirst(value: () => Unit): Self = this.set("moveFirst", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveLast(value: () => Unit): Self = this.set("moveLast", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveUp(value: () => Unit): Self = this.set("moveUp", js.Any.fromFunction0(value))
    @scala.inline
    def setSetOrderIndex(value: Double => Unit): Self = this.set("setOrderIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
  
}


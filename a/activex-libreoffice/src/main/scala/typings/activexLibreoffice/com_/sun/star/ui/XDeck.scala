package typings.activexLibreoffice.com_.sun.star.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to Deck
  * @since LibreOffice 5.1
  */
trait XDeck extends StObject {
  
  /** The deck identifier */
  val Id: String
  
  /** Get the ordering index of the deck button in sidebar */
  var OrderIndex: Double
  
  /** Panels collection attached to the deck */
  val Panels: XPanels
  
  /** Get the deck title string */
  var Title: String
  
  /**
    * Activate the deck and display its content
    * @param bActivate The requested state for the deck TRUE sets the deck as the active oneFALSE hide the deck and defaults to the first deck of the sidebar
    */
  def activate(bActivate: Boolean): Unit
  
  /** The deck identifier */
  def getId(): String
  
  /** Get the ordering index of the deck button in sidebar */
  def getOrderIndex(): Double
  
  /** Panels collection attached to the deck */
  def getPanels(): XPanels
  
  /** Get the deck title string */
  def getTitle(): String
  
  /** Is the deck the active one */
  def isActive(): Boolean
  
  /** Move deck one step down in the sidebar */
  def moveDown(): Unit
  
  /** Move deck button at first position in sidebar */
  def moveFirst(): Unit
  
  /** Move deck button at last position in sidebar */
  def moveLast(): Unit
  
  /** Move deck one step up in the sidebar */
  def moveUp(): Unit
  
  /**
    * Set the ordering index of the deck button in sidebar
    * @param newOrderIndex The new position
    */
  def setOrderIndex(newOrderIndex: Double): Unit
  
  /**
    * Set the deck title string
    * @param newTitle The new title string
    */
  def setTitle(newTitle: String): Unit
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
  implicit class XDeckMutableBuilder[Self <: XDeck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: Boolean => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOrderIndex(value: () => Double): Self = StObject.set(x, "getOrderIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPanels(value: () => XPanels): Self = StObject.set(x, "getPanels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveDown(value: () => Unit): Self = StObject.set(x, "moveDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveFirst(value: () => Unit): Self = StObject.set(x, "moveFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveLast(value: () => Unit): Self = StObject.set(x, "moveLast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveUp(value: () => Unit): Self = StObject.set(x, "moveUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOrderIndex(value: Double): Self = StObject.set(x, "OrderIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanels(value: XPanels): Self = StObject.set(x, "Panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetOrderIndex(value: Double => Unit): Self = StObject.set(x, "setOrderIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}

package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to Panel
  * @since LibreOffice 5.1
  */
trait XPanel extends StObject {
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(Dialog = Dialog.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OrderIndex = OrderIndex.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], collapse = js.Any.fromFunction0(collapse), expand = js.Any.fromFunction1(expand), getDialog = js.Any.fromFunction0(getDialog), getId = js.Any.fromFunction0(getId), getOrderIndex = js.Any.fromFunction0(getOrderIndex), getTitle = js.Any.fromFunction0(getTitle), isExpanded = js.Any.fromFunction0(isExpanded), moveDown = js.Any.fromFunction0(moveDown), moveFirst = js.Any.fromFunction0(moveFirst), moveLast = js.Any.fromFunction0(moveLast), moveUp = js.Any.fromFunction0(moveUp), setOrderIndex = js.Any.fromFunction1(setOrderIndex), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPanel] (val x: Self) extends AnyVal {
    
    inline def setCollapse(value: () => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction0(value))
    
    inline def setDialog(value: XWindow): Self = StObject.set(x, "Dialog", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: Boolean => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setGetDialog(value: () => XWindow): Self = StObject.set(x, "getDialog", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetOrderIndex(value: () => Double): Self = StObject.set(x, "getOrderIndex", js.Any.fromFunction0(value))
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIsExpanded(value: () => Boolean): Self = StObject.set(x, "isExpanded", js.Any.fromFunction0(value))
    
    inline def setMoveDown(value: () => Unit): Self = StObject.set(x, "moveDown", js.Any.fromFunction0(value))
    
    inline def setMoveFirst(value: () => Unit): Self = StObject.set(x, "moveFirst", js.Any.fromFunction0(value))
    
    inline def setMoveLast(value: () => Unit): Self = StObject.set(x, "moveLast", js.Any.fromFunction0(value))
    
    inline def setMoveUp(value: () => Unit): Self = StObject.set(x, "moveUp", js.Any.fromFunction0(value))
    
    inline def setOrderIndex(value: Double): Self = StObject.set(x, "OrderIndex", value.asInstanceOf[js.Any])
    
    inline def setSetOrderIndex(value: Double => Unit): Self = StObject.set(x, "setOrderIndex", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}

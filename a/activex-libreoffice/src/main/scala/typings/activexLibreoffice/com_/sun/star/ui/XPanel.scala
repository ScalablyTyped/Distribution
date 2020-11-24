package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to Panel
  * @since LibreOffice 5.1
  */
@js.native
trait XPanel extends js.Object {
  
  /** Get the panel dialog element */
  val Dialog: XWindow = js.native
  
  /** The panel identifier */
  val Id: String = js.native
  
  /** Get the ordering index of the panel in the deck */
  var OrderIndex: Double = js.native
  
  /** Get the panel title string */
  var Title: String = js.native
  
  /** Collapse the panel to only show its title bar */
  def collapse(): Unit = js.native
  
  /**
    * Expand and display the panel
    * @param bCollapseOther TRUE collapse all other panels of the deckFALSE do not change other panels state
    */
  def expand(bCollapseOther: Boolean): Unit = js.native
  
  /** Get the panel dialog element */
  def getDialog(): XWindow = js.native
  
  /** The panel identifier */
  def getId(): String = js.native
  
  /** Get the ordering index of the panel in the deck */
  def getOrderIndex(): Double = js.native
  
  /** Get the panel title string */
  def getTitle(): String = js.native
  
  /** Is the panel expanded */
  def isExpanded(): Boolean = js.native
  
  /** Move the panel one step down in the deck */
  def moveDown(): Unit = js.native
  
  /** Move panel as first item of the deck */
  def moveFirst(): Unit = js.native
  
  /** Move panel as last item of the deck */
  def moveLast(): Unit = js.native
  
  /** Move panel one step up in the deck */
  def moveUp(): Unit = js.native
  
  /** Set the ordering index of the panel in the deck */
  def setOrderIndex(newOrderIndex: Double): Unit = js.native
  
  /**
    * Set the panel title string
    * @param newTitle The new title string
    */
  def setTitle(newTitle: String): Unit = js.native
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
    val __obj = js.Dynamic.literal(Dialog = Dialog.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OrderIndex = OrderIndex.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], collapse = js.Any.fromFunction0(collapse), expand = js.Any.fromFunction1(expand), getDialog = js.Any.fromFunction0(getDialog), getId = js.Any.fromFunction0(getId), getOrderIndex = js.Any.fromFunction0(getOrderIndex), getTitle = js.Any.fromFunction0(getTitle), isExpanded = js.Any.fromFunction0(isExpanded), moveDown = js.Any.fromFunction0(moveDown), moveFirst = js.Any.fromFunction0(moveFirst), moveLast = js.Any.fromFunction0(moveLast), moveUp = js.Any.fromFunction0(moveUp), setOrderIndex = js.Any.fromFunction1(setOrderIndex), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XPanel]
  }
  
  @scala.inline
  implicit class XPanelOps[Self <: XPanel] (val x: Self) extends AnyVal {
    
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
    def setDialog(value: XWindow): Self = this.set("Dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIndex(value: Double): Self = this.set("OrderIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapse(value: () => Unit): Self = this.set("collapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpand(value: Boolean => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDialog(value: () => XWindow): Self = this.set("getDialog", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOrderIndex(value: () => Double): Self = this.set("getOrderIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsExpanded(value: () => Boolean): Self = this.set("isExpanded", js.Any.fromFunction0(value))
    
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

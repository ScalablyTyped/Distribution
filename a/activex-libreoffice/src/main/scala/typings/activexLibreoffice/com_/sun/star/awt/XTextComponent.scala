package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the text of a component and makes it possible to register event listeners. */
trait XTextComponent
  extends StObject
     with XInterface {
  
  /** returns the currently set maximum text length. */
  var MaxTextLen: Double
  
  /** returns the currently selected text. */
  val SelectedText: String
  
  /** returns the current user selection. */
  var Selection: typings.activexLibreoffice.com_.sun.star.awt.Selection
  
  /** returns the text of the component. */
  var Text: String
  
  /** registers a text event listener. */
  def addTextListener(l: XTextListener): Unit
  
  /** returns the currently set maximum text length. */
  def getMaxTextLen(): Double
  
  /** returns the currently selected text. */
  def getSelectedText(): String
  
  /** returns the current user selection. */
  def getSelection(): Selection
  
  /** returns the text of the component. */
  def getText(): String
  
  /** inserts text at the specified position. */
  def insertText(Sel: Selection, Text: String): Unit
  
  /** returns if the text is editable by the user. */
  def isEditable(): Boolean
  
  /** unregisters a text event listener. */
  def removeTextListener(l: XTextListener): Unit
  
  /** makes the text editable for the user or read-only. */
  def setEditable(bEditable: Boolean): Unit
  
  /** sets the maximum text length. */
  def setMaxTextLen(nLen: Double): Unit
  
  /** sets the user selection. */
  def setSelection(aSelection: Selection): Unit
  
  /** sets the text of the component. */
  def setText(aText: String): Unit
}
object XTextComponent {
  
  @scala.inline
  def apply(
    MaxTextLen: Double,
    SelectedText: String,
    Selection: Selection,
    Text: String,
    acquire: () => Unit,
    addTextListener: XTextListener => Unit,
    getMaxTextLen: () => Double,
    getSelectedText: () => String,
    getSelection: () => Selection,
    getText: () => String,
    insertText: (Selection, String) => Unit,
    isEditable: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTextListener: XTextListener => Unit,
    setEditable: Boolean => Unit,
    setMaxTextLen: Double => Unit,
    setSelection: Selection => Unit,
    setText: String => Unit
  ): XTextComponent = {
    val __obj = js.Dynamic.literal(MaxTextLen = MaxTextLen.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addTextListener = js.Any.fromFunction1(addTextListener), getMaxTextLen = js.Any.fromFunction0(getMaxTextLen), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelection = js.Any.fromFunction0(getSelection), getText = js.Any.fromFunction0(getText), insertText = js.Any.fromFunction2(insertText), isEditable = js.Any.fromFunction0(isEditable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextListener = js.Any.fromFunction1(removeTextListener), setEditable = js.Any.fromFunction1(setEditable), setMaxTextLen = js.Any.fromFunction1(setMaxTextLen), setSelection = js.Any.fromFunction1(setSelection), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[XTextComponent]
  }
  
  @scala.inline
  implicit class XTextComponentMutableBuilder[Self <: XTextComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTextListener(value: XTextListener => Unit): Self = StObject.set(x, "addTextListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMaxTextLen(value: () => Double): Self = StObject.set(x, "getMaxTextLen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedText(value: () => String): Self = StObject.set(x, "getSelectedText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelection(value: () => Selection): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertText(value: (Selection, String) => Unit): Self = StObject.set(x, "insertText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsEditable(value: () => Boolean): Self = StObject.set(x, "isEditable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxTextLen(value: Double): Self = StObject.set(x, "MaxTextLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveTextListener(value: XTextListener => Unit): Self = StObject.set(x, "removeTextListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedText(value: String): Self = StObject.set(x, "SelectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetEditable(value: Boolean => Unit): Self = StObject.set(x, "setEditable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxTextLen(value: Double => Unit): Self = StObject.set(x, "setMaxTextLen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelection(value: Selection => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}

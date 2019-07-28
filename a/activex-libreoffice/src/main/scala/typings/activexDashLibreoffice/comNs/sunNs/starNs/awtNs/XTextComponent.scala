package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text of a component and makes it possible to register event listeners. */
trait XTextComponent extends XInterface {
  /** returns the currently set maximum text length. */
  var MaxTextLen: Double
  /** returns the currently selected text. */
  val SelectedText: String
  /** returns the current user selection. */
  var Selection: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Selection
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
    val __obj = js.Dynamic.literal(MaxTextLen = MaxTextLen, SelectedText = SelectedText, Selection = Selection, Text = Text, acquire = js.Any.fromFunction0(acquire), addTextListener = js.Any.fromFunction1(addTextListener), getMaxTextLen = js.Any.fromFunction0(getMaxTextLen), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelection = js.Any.fromFunction0(getSelection), getText = js.Any.fromFunction0(getText), insertText = js.Any.fromFunction2(insertText), isEditable = js.Any.fromFunction0(isEditable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextListener = js.Any.fromFunction1(removeTextListener), setEditable = js.Any.fromFunction1(setEditable), setMaxTextLen = js.Any.fromFunction1(setMaxTextLen), setSelection = js.Any.fromFunction1(setSelection), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[XTextComponent]
  }
}


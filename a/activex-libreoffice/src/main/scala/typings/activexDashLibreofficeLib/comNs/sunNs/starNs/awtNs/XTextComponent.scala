package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text of a component and makes it possible to register event listeners. */
trait XTextComponent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the currently set maximum text length. */
  var MaxTextLen: scala.Double
  /** returns the currently selected text. */
  val SelectedText: java.lang.String
  /** returns the current user selection. */
  var Selection: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Selection
  /** returns the text of the component. */
  var Text: java.lang.String
  /** registers a text event listener. */
  def addTextListener(l: XTextListener): scala.Unit
  /** returns the currently set maximum text length. */
  def getMaxTextLen(): scala.Double
  /** returns the currently selected text. */
  def getSelectedText(): java.lang.String
  /** returns the current user selection. */
  def getSelection(): Selection
  /** returns the text of the component. */
  def getText(): java.lang.String
  /** inserts text at the specified position. */
  def insertText(Sel: Selection, Text: java.lang.String): scala.Unit
  /** returns if the text is editable by the user. */
  def isEditable(): scala.Boolean
  /** unregisters a text event listener. */
  def removeTextListener(l: XTextListener): scala.Unit
  /** makes the text editable for the user or read-only. */
  def setEditable(bEditable: scala.Boolean): scala.Unit
  /** sets the maximum text length. */
  def setMaxTextLen(nLen: scala.Double): scala.Unit
  /** sets the user selection. */
  def setSelection(aSelection: Selection): scala.Unit
  /** sets the text of the component. */
  def setText(aText: java.lang.String): scala.Unit
}

object XTextComponent {
  @scala.inline
  def apply(
    MaxTextLen: scala.Double,
    SelectedText: java.lang.String,
    Selection: Selection,
    Text: java.lang.String,
    acquire: () => scala.Unit,
    addTextListener: XTextListener => scala.Unit,
    getMaxTextLen: () => scala.Double,
    getSelectedText: () => java.lang.String,
    getSelection: () => Selection,
    getText: () => java.lang.String,
    insertText: (Selection, java.lang.String) => scala.Unit,
    isEditable: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeTextListener: XTextListener => scala.Unit,
    setEditable: scala.Boolean => scala.Unit,
    setMaxTextLen: scala.Double => scala.Unit,
    setSelection: Selection => scala.Unit,
    setText: java.lang.String => scala.Unit
  ): XTextComponent = {
    val __obj = js.Dynamic.literal(MaxTextLen = MaxTextLen, SelectedText = SelectedText, Selection = Selection, Text = Text, acquire = js.Any.fromFunction0(acquire), addTextListener = js.Any.fromFunction1(addTextListener), getMaxTextLen = js.Any.fromFunction0(getMaxTextLen), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelection = js.Any.fromFunction0(getSelection), getText = js.Any.fromFunction0(getText), insertText = js.Any.fromFunction2(insertText), isEditable = js.Any.fromFunction0(isEditable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextListener = js.Any.fromFunction1(removeTextListener), setEditable = js.Any.fromFunction1(setEditable), setMaxTextLen = js.Any.fromFunction1(setMaxTextLen), setSelection = js.Any.fromFunction1(setSelection), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[XTextComponent]
  }
}


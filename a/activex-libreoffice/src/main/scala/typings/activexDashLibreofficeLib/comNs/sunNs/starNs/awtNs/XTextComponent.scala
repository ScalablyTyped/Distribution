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
  var Selection: Selection
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
    acquire: js.Function0[scala.Unit],
    addTextListener: js.Function1[XTextListener, scala.Unit],
    getMaxTextLen: js.Function0[scala.Double],
    getSelectedText: js.Function0[java.lang.String],
    getSelection: js.Function0[Selection],
    getText: js.Function0[java.lang.String],
    insertText: js.Function2[Selection, java.lang.String, scala.Unit],
    isEditable: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTextListener: js.Function1[XTextListener, scala.Unit],
    setEditable: js.Function1[scala.Boolean, scala.Unit],
    setMaxTextLen: js.Function1[scala.Double, scala.Unit],
    setSelection: js.Function1[Selection, scala.Unit],
    setText: js.Function1[java.lang.String, scala.Unit]
  ): XTextComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MaxTextLen")(MaxTextLen)
    __obj.updateDynamic("SelectedText")(SelectedText)
    __obj.updateDynamic("Selection")(Selection)
    __obj.updateDynamic("Text")(Text)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addTextListener")(addTextListener)
    __obj.updateDynamic("getMaxTextLen")(getMaxTextLen)
    __obj.updateDynamic("getSelectedText")(getSelectedText)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("insertText")(insertText)
    __obj.updateDynamic("isEditable")(isEditable)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeTextListener")(removeTextListener)
    __obj.updateDynamic("setEditable")(setEditable)
    __obj.updateDynamic("setMaxTextLen")(setMaxTextLen)
    __obj.updateDynamic("setSelection")(setSelection)
    __obj.updateDynamic("setText")(setText)
    __obj.asInstanceOf[XTextComponent]
  }
}


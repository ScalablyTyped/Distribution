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


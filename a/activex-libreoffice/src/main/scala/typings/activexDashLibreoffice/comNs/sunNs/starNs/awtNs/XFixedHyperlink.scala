package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text and formatting of a fixed hyperlink field. */
trait XFixedHyperlink extends XInterface {
  /** returns the alignment of the text in the control. */
  var Alignment: Double
  /** returns the text of the control. */
  var Text: String
  /** returns the url of the control. */
  var URL: String
  /** registers an event handler for click action event. */
  def addActionListener(l: XActionListener): Unit
  /** returns the alignment of the text in the control. */
  def getAlignment(): Double
  /** returns the text of the control. */
  def getText(): String
  /** returns the url of the control. */
  def getURL(): String
  /** unregisters an event handler for click action event. */
  def removeActionListener(l: XActionListener): Unit
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: Double): Unit
  /** sets the text of the control. */
  def setText(Text: String): Unit
  /** sets the url of the control. */
  def setURL(URL: String): Unit
}

object XFixedHyperlink {
  @scala.inline
  def apply(
    Alignment: Double,
    Text: String,
    URL: String,
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    getAlignment: () => Double,
    getText: () => String,
    getURL: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    setAlignment: Double => Unit,
    setText: String => Unit,
    setURL: String => Unit
  ): XFixedHyperlink = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, Text = Text, URL = URL, acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), getAlignment = js.Any.fromFunction0(getAlignment), getText = js.Any.fromFunction0(getText), getURL = js.Any.fromFunction0(getURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setAlignment = js.Any.fromFunction1(setAlignment), setText = js.Any.fromFunction1(setText), setURL = js.Any.fromFunction1(setURL))
  
    __obj.asInstanceOf[XFixedHyperlink]
  }
}


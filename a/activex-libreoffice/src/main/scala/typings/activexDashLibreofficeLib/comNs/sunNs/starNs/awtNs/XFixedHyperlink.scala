package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text and formatting of a fixed hyperlink field. */
trait XFixedHyperlink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the alignment of the text in the control. */
  var Alignment: scala.Double
  /** returns the text of the control. */
  var Text: java.lang.String
  /** returns the url of the control. */
  var URL: java.lang.String
  /** registers an event handler for click action event. */
  def addActionListener(l: XActionListener): scala.Unit
  /** returns the alignment of the text in the control. */
  def getAlignment(): scala.Double
  /** returns the text of the control. */
  def getText(): java.lang.String
  /** returns the url of the control. */
  def getURL(): java.lang.String
  /** unregisters an event handler for click action event. */
  def removeActionListener(l: XActionListener): scala.Unit
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: scala.Double): scala.Unit
  /** sets the text of the control. */
  def setText(Text: java.lang.String): scala.Unit
  /** sets the url of the control. */
  def setURL(URL: java.lang.String): scala.Unit
}

object XFixedHyperlink {
  @scala.inline
  def apply(
    Alignment: scala.Double,
    Text: java.lang.String,
    URL: java.lang.String,
    acquire: () => scala.Unit,
    addActionListener: XActionListener => scala.Unit,
    getAlignment: () => scala.Double,
    getText: () => java.lang.String,
    getURL: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeActionListener: XActionListener => scala.Unit,
    setAlignment: scala.Double => scala.Unit,
    setText: java.lang.String => scala.Unit,
    setURL: java.lang.String => scala.Unit
  ): XFixedHyperlink = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, Text = Text, URL = URL, acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), getAlignment = js.Any.fromFunction0(getAlignment), getText = js.Any.fromFunction0(getText), getURL = js.Any.fromFunction0(getURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setAlignment = js.Any.fromFunction1(setAlignment), setText = js.Any.fromFunction1(setText), setURL = js.Any.fromFunction1(setURL))
  
    __obj.asInstanceOf[XFixedHyperlink]
  }
}


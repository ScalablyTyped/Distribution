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


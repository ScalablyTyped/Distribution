package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text and formatting of a fixed text field. */
trait XFixedText
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the alignment of the text in the control. */
  var Alignment: scala.Double
  /** returns the text of the control. */
  var Text: java.lang.String
  /** returns the alignment of the text in the control. */
  def getAlignment(): scala.Double
  /** returns the text of the control. */
  def getText(): java.lang.String
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: scala.Double): scala.Unit
  /** sets the text of the control. */
  def setText(Text: java.lang.String): scala.Unit
}


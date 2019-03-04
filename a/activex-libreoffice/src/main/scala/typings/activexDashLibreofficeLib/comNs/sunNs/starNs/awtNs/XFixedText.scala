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

object XFixedText {
  @scala.inline
  def apply(
    Alignment: scala.Double,
    Text: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getAlignment: js.Function0[scala.Double],
    getText: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setAlignment: js.Function1[scala.Double, scala.Unit],
    setText: js.Function1[java.lang.String, scala.Unit]
  ): XFixedText = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, Text = Text, acquire = acquire, getAlignment = getAlignment, getText = getText, queryInterface = queryInterface, release = release, setAlignment = setAlignment, setText = setText)
  
    __obj.asInstanceOf[XFixedText]
  }
}


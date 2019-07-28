package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text and formatting of a fixed text field. */
trait XFixedText extends XInterface {
  /** returns the alignment of the text in the control. */
  var Alignment: Double
  /** returns the text of the control. */
  var Text: String
  /** returns the alignment of the text in the control. */
  def getAlignment(): Double
  /** returns the text of the control. */
  def getText(): String
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: Double): Unit
  /** sets the text of the control. */
  def setText(Text: String): Unit
}

object XFixedText {
  @scala.inline
  def apply(
    Alignment: Double,
    Text: String,
    acquire: () => Unit,
    getAlignment: () => Double,
    getText: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAlignment: Double => Unit,
    setText: String => Unit
  ): XFixedText = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, Text = Text, acquire = js.Any.fromFunction0(acquire), getAlignment = js.Any.fromFunction0(getAlignment), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAlignment = js.Any.fromFunction1(setAlignment), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[XFixedText]
  }
}


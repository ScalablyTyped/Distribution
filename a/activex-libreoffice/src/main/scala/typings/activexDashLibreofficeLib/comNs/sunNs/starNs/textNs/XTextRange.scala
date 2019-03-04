package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the object's position in a text.
  *
  * It represents a text range. The beginning and end of the range may be identical.
  */
trait XTextRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a text range which contains only the end of this text range. */
  val End: XTextRange
  /** @returns a text range which contains only the start of this text range. */
  val Start: XTextRange
  /** @returns the string that is included in this text range. */
  var String: java.lang.String
  /** @returns a text range which contains only the end of this text range. */
  def getEnd(): XTextRange
  /** @returns a text range which contains only the start of this text range. */
  def getStart(): XTextRange
  /** @returns the string that is included in this text range. */
  def getString(): java.lang.String
  /** @returns the text interface in which the text position is contained. */
  def getText(): XText
  /**
    * the whole string of characters of this piece of text is replaced.
    *
    * All styles are removed when applying this method.
    */
  def setString(aString: java.lang.String): scala.Unit
}

object XTextRange {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getEnd: js.Function0[XTextRange],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XTextRange = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = acquire, getEnd = getEnd, getStart = getStart, getString = getString, getText = getText, queryInterface = queryInterface, release = release, setString = setString)
  
    __obj.asInstanceOf[XTextRange]
  }
}


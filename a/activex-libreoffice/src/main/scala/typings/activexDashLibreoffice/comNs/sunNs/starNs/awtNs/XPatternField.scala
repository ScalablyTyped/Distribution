package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and formatting of a pattern field. */
trait XPatternField extends XInterface {
  /** returns the currently set string value of the pattern field. */
  var String: java.lang.String
  /** returns the currently set pattern mask. */
  def getMasks(EditMask: js.Array[String], LiteralMask: js.Array[String]): Unit
  /** returns the currently set string value of the pattern field. */
  def getString(): String
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  /** sets the pattern mask. */
  def setMasks(EditMask: String, LiteralMask: String): Unit
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  /** sets the string value of the pattern field. */
  def setString(Str: String): Unit
}

object XPatternField {
  @scala.inline
  def apply(
    String: String,
    acquire: () => Unit,
    getMasks: (js.Array[String], js.Array[String]) => Unit,
    getString: () => String,
    isStrictFormat: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMasks: (String, String) => Unit,
    setStrictFormat: Boolean => Unit,
    setString: String => Unit
  ): XPatternField = {
    val __obj = js.Dynamic.literal(String = String, acquire = js.Any.fromFunction0(acquire), getMasks = js.Any.fromFunction2(getMasks), getString = js.Any.fromFunction0(getString), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMasks = js.Any.fromFunction2(setMasks), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XPatternField]
  }
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value and formatting of a pattern field. */
trait XPatternField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the currently set string value of the pattern field. */
  var String: java.lang.String
  /** returns the currently set pattern mask. */
  def getMasks(EditMask: js.Array[java.lang.String], LiteralMask: js.Array[java.lang.String]): scala.Unit
  /** returns the currently set string value of the pattern field. */
  def getString(): java.lang.String
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): scala.Boolean
  /** sets the pattern mask. */
  def setMasks(EditMask: java.lang.String, LiteralMask: java.lang.String): scala.Unit
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: scala.Boolean): scala.Unit
  /** sets the string value of the pattern field. */
  def setString(Str: java.lang.String): scala.Unit
}

object XPatternField {
  @scala.inline
  def apply(
    String: java.lang.String,
    acquire: () => scala.Unit,
    getMasks: (js.Array[java.lang.String], js.Array[java.lang.String]) => scala.Unit,
    getString: () => java.lang.String,
    isStrictFormat: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setMasks: (java.lang.String, java.lang.String) => scala.Unit,
    setStrictFormat: scala.Boolean => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): XPatternField = {
    val __obj = js.Dynamic.literal(String = String, acquire = js.Any.fromFunction0(acquire), getMasks = js.Any.fromFunction2(getMasks), getString = js.Any.fromFunction0(getString), isStrictFormat = js.Any.fromFunction0(isStrictFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMasks = js.Any.fromFunction2(setMasks), setStrictFormat = js.Any.fromFunction1(setStrictFormat), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XPatternField]
  }
}


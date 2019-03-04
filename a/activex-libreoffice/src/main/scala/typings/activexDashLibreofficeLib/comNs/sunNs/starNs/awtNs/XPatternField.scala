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
    acquire: js.Function0[scala.Unit],
    getMasks: js.Function2[js.Array[java.lang.String], js.Array[java.lang.String], scala.Unit],
    getString: js.Function0[java.lang.String],
    isStrictFormat: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setMasks: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setStrictFormat: js.Function1[scala.Boolean, scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XPatternField = {
    val __obj = js.Dynamic.literal(String = String, acquire = acquire, getMasks = getMasks, getString = getString, isStrictFormat = isStrictFormat, queryInterface = queryInterface, release = release, setMasks = setMasks, setStrictFormat = setStrictFormat, setString = setString)
  
    __obj.asInstanceOf[XPatternField]
  }
}


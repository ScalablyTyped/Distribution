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


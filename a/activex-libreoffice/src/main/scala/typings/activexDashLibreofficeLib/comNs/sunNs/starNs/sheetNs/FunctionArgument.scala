package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the description of a single argument within a spreadsheet function.
  * @see com.sun.star.sheet.FunctionDescription
  */
trait FunctionArgument extends js.Object {
  /** a description of the argument. */
  var Description: java.lang.String
  /** determines whether the argument is optional. */
  var IsOptional: scala.Boolean
  /** the name of the argument. */
  var Name: java.lang.String
}


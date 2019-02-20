package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a mapping from a formula name (function name, operator, ...) to the OpCode used by the formula compiler. */
trait FormulaOpCodeMapEntry extends js.Object {
  /** The function name, or operator. */
  var Name: java.lang.String
  /** The corresponding mapping. */
  var Token: FormulaToken
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a single token within a formula. */
trait FormulaToken extends js.Object {
  /**
    * is additional data in the token, depending on the OpCode.
    * @see com.sun.star.sheet.NamedRange.TokenIndex
    * @see com.sun.star.sheet.DatabaseRange.TokenIndex
    */
  var Data: js.Any
  /**
    * is the OpCode of the token.
    * @see com.sun.star.sheet.XFormulaOpCodeMapper
    */
  var OpCode: scala.Double
}


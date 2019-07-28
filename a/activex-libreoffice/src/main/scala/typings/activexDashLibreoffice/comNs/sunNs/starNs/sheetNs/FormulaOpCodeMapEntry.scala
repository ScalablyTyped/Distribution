package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a mapping from a formula name (function name, operator, ...) to the OpCode used by the formula compiler. */
trait FormulaOpCodeMapEntry extends js.Object {
  /** The function name, or operator. */
  var Name: String
  /** The corresponding mapping. */
  var Token: FormulaToken
}

object FormulaOpCodeMapEntry {
  @scala.inline
  def apply(Name: String, Token: FormulaToken): FormulaOpCodeMapEntry = {
    val __obj = js.Dynamic.literal(Name = Name, Token = Token)
  
    __obj.asInstanceOf[FormulaOpCodeMapEntry]
  }
}


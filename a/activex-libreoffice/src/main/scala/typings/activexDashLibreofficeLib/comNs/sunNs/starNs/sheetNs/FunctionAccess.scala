package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows generic access to all spreadsheet functions. */
trait FunctionAccess
  extends SpreadsheetDocumentSettings
     with XFunctionAccess {
  /**
    * specifies whether the function call is performed as array function call.
    *
    * If set to `TRUE` , the result of the function call will be calculated similar to array formulas in a spreadsheet document. The return value of the
    * function call will usually be a sequence of sequences containing the values of the resulting array. Example: If the function ABS is called for a 3x2
    * cell range, the result will be a 3x2 array containing the absolute values of the numbers contained in the specified cell range.
    *
    * If set to `FALSE` , the result of the function call will be calculated similar to simple cell formulas in a spreadsheet document. The return value of
    * the function call will usually be a single value. Of course, some functions always return an array, for example the MUNIT function.
    *
    * For compatibility with older versions, the default value of this property is `TRUE` .
    * @since OOo 3.3
    */
  var IsArrayFunction: scala.Boolean
}


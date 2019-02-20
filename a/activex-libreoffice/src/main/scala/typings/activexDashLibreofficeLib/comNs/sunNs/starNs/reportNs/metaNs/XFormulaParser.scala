package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.metaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFormulaParser} which allows to retrieve the meta data of all supported functions. */
trait XFormulaParser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XFormulaParser
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** return the mapper for op codes. */
  var FormulaOpCodeMapper: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XFormulaOpCodeMapper
  /**
    * The complete mapping of Names to OpCodes.
    *
    * Names and symbols not defined here lead to a parser/print error.
    */
  var OpCodeMap: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaOpCodeMapEntry]
}


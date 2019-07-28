package typings.activexDashLibreoffice.comNs.sunNs.starNs.reportNs.metaNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.FormulaOpCodeMapEntry
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.FormulaToken
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.XFormulaOpCodeMapper
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFormulaParser} which allows to retrieve the meta data of all supported functions. */
trait XFormulaParser
  extends XComponent
     with typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.XFormulaParser
     with XPropertySet {
  /** return the mapper for op codes. */
  var FormulaOpCodeMapper: XFormulaOpCodeMapper
  /**
    * The complete mapping of Names to OpCodes.
    *
    * Names and symbols not defined here lead to a parser/print error.
    */
  var OpCodeMap: SafeArray[FormulaOpCodeMapEntry]
}

object XFormulaParser {
  @scala.inline
  def apply(
    FormulaOpCodeMapper: XFormulaOpCodeMapper,
    OpCodeMap: SafeArray[FormulaOpCodeMapEntry],
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    dispose: () => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    parseFormula: (String, CellAddress) => SafeArray[FormulaToken],
    printFormula: (SeqEquiv[FormulaToken], CellAddress) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XFormulaParser = {
    val __obj = js.Dynamic.literal(FormulaOpCodeMapper = FormulaOpCodeMapper, OpCodeMap = OpCodeMap, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), parseFormula = js.Any.fromFunction2(parseFormula), printFormula = js.Any.fromFunction2(printFormula), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XFormulaParser]
  }
}


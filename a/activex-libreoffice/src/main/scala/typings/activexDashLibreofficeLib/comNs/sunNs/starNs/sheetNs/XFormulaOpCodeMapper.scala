package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to spreadsheet compiler token interns. */
trait XFormulaOpCodeMapper extends js.Object {
  /**
    * OpCode value used for external Add-In functions.
    *
    * Needed to be able to identify which of the function names map to an Add-In implementation where this OpCode is used in the returned mapping and the
    * programmatic name is available as additional information.
    */
  var OpCodeExternal: scala.Double
  /**
    * OpCode value used for unknown functions.
    *
    * Used to identify which of the function names queried with {@link getMappings()} are unknown to the implementation.
    */
  var OpCodeUnknown: scala.Double
  /**
    * returns a sequence of map entries for all available elements of a given formula language.
    * @param Language Formula language to be used, one of {@link FormulaLanguage} constants. If a constant unknown to the implementation is passed, {@link com
    * @param Groups Group of mappings to be returned, a bit mask of {@link FormulaMapGroup} constants.
    * @returns Sequence of {@link FormulaOpCodeMapEntry} .  Each element of the formula language in parameter Language is mapped to a {@link FormulaToken} conta
    */
  def getAvailableMappings(Language: scala.Double, Groups: scala.Double): activexDashInteropLib.SafeArray[FormulaOpCodeMapEntry]
  /**
    * returns a sequence of tokens matching the input sequence of strings in order.
    * @param Names Sequence of names to be mapped. These can be function names, operators, separators and other symbols the formula compiler knows.
    * @param Language Formula language to be used, one of {@link FormulaLanguage} constants. If a constant unknown to the implementation is passed, {@link com
    * @returns a sequence of {@link FormulaToken} matching the input sequence in order.  Each string element in parameter Names according to the formula languag
    */
  def getMappings(Names: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], Language: scala.Double): activexDashInteropLib.SafeArray[FormulaToken]
}

object XFormulaOpCodeMapper {
  @scala.inline
  def apply(
    OpCodeExternal: scala.Double,
    OpCodeUnknown: scala.Double,
    getAvailableMappings: js.Function2[scala.Double, scala.Double, activexDashInteropLib.SafeArray[FormulaOpCodeMapEntry]],
    getMappings: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      scala.Double, 
      activexDashInteropLib.SafeArray[FormulaToken]
    ]
  ): XFormulaOpCodeMapper = {
    val __obj = js.Dynamic.literal(OpCodeExternal = OpCodeExternal, OpCodeUnknown = OpCodeUnknown, getAvailableMappings = getAvailableMappings, getMappings = getMappings)
  
    __obj.asInstanceOf[XFormulaOpCodeMapper]
  }
}


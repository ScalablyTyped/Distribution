package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to spreadsheet compiler token interns. */
@js.native
trait XFormulaOpCodeMapper extends js.Object {
  /**
    * OpCode value used for external Add-In functions.
    *
    * Needed to be able to identify which of the function names map to an Add-In implementation where this OpCode is used in the returned mapping and the
    * programmatic name is available as additional information.
    */
  var OpCodeExternal: Double = js.native
  /**
    * OpCode value used for unknown functions.
    *
    * Used to identify which of the function names queried with {@link getMappings()} are unknown to the implementation.
    */
  var OpCodeUnknown: Double = js.native
  /**
    * returns a sequence of map entries for all available elements of a given formula language.
    * @param Language Formula language to be used, one of {@link FormulaLanguage} constants. If a constant unknown to the implementation is passed, {@link com
    * @param Groups Group of mappings to be returned, a bit mask of {@link FormulaMapGroup} constants.
    * @returns Sequence of {@link FormulaOpCodeMapEntry} .  Each element of the formula language in parameter Language is mapped to a {@link FormulaToken} conta
    */
  def getAvailableMappings(Language: Double, Groups: Double): SafeArray[FormulaOpCodeMapEntry] = js.native
  /**
    * returns a sequence of tokens matching the input sequence of strings in order.
    * @param Names Sequence of names to be mapped. These can be function names, operators, separators and other symbols the formula compiler knows.
    * @param Language Formula language to be used, one of {@link FormulaLanguage} constants. If a constant unknown to the implementation is passed, {@link com
    * @returns a sequence of {@link FormulaToken} matching the input sequence in order.  Each string element in parameter Names according to the formula languag
    */
  def getMappings(Names: SeqEquiv[String], Language: Double): SafeArray[FormulaToken] = js.native
}

object XFormulaOpCodeMapper {
  @scala.inline
  def apply(
    OpCodeExternal: Double,
    OpCodeUnknown: Double,
    getAvailableMappings: (Double, Double) => SafeArray[FormulaOpCodeMapEntry],
    getMappings: (SeqEquiv[String], Double) => SafeArray[FormulaToken]
  ): XFormulaOpCodeMapper = {
    val __obj = js.Dynamic.literal(OpCodeExternal = OpCodeExternal.asInstanceOf[js.Any], OpCodeUnknown = OpCodeUnknown.asInstanceOf[js.Any], getAvailableMappings = js.Any.fromFunction2(getAvailableMappings), getMappings = js.Any.fromFunction2(getMappings))
    __obj.asInstanceOf[XFormulaOpCodeMapper]
  }
  @scala.inline
  implicit class XFormulaOpCodeMapperOps[Self <: XFormulaOpCodeMapper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOpCodeExternal(value: Double): Self = this.set("OpCodeExternal", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpCodeUnknown(value: Double): Self = this.set("OpCodeUnknown", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAvailableMappings(value: (Double, Double) => SafeArray[FormulaOpCodeMapEntry]): Self = this.set("getAvailableMappings", js.Any.fromFunction2(value))
    @scala.inline
    def setGetMappings(value: (SeqEquiv[String], Double) => SafeArray[FormulaToken]): Self = this.set("getMappings", js.Any.fromFunction2(value))
  }
  
}


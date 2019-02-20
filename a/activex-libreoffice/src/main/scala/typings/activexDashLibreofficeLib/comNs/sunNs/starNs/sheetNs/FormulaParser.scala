package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormulaParser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySet
     with XFormulaParser {
  /**
    * specifies whether to use English parser and formatter.
    *
    * Note: When changing this, an already existing {@link OpCodeMap} needs to be recreated internally, so for performance reasons set this **before**
    * setting the {@link OpCodeMap} .
    */
  var CompileEnglish: scala.Boolean = js.native
  /**
    * contains a list of external links referenced in formulas.
    *
    * Use of this property depends on the FormulaConvention in use. It is relevant only for {@link AddressConvention.XL_OOX} to map indices to external
    * documents. The sequence must be in the order of indices used. Note that indices are 1-based, the sequence must start with an empty element.
    * @since OOo 3.1
    */
  var ExternalLinks: activexDashInteropLib.SafeArray[ExternalLinkInfo] = js.native
  /**
    * specifies which address reference style convention to use when parsing a formula string.
    * @see AddressConvention
    */
  var FormulaConvention: scala.Double = js.native
  var IgnoreLeadingSpaces: scala.Boolean = js.native
  /**
    * contains the complete mapping of names to op-codes.
    *
    * Names and symbols not defined here lead to a parser/print error.
    */
  var OpCodeMap: activexDashInteropLib.SafeArray[FormulaOpCodeMapEntry] = js.native
  var ParameterSeparator: java.lang.String = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo = js.native
}


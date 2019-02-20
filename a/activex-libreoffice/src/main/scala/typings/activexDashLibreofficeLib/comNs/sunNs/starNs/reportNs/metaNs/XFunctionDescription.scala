package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.metaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFunctionDescription} which allows to retrieve the meta data of all supported functions. */
trait XFunctionDescription
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** returns a sequence of localized descriptions of the function's arguments (in the order specified by the function). */
  var Arguments: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FunctionArgument]
  /** specifies the category number. */
  var Category: XFunctionCategory
  /** returns a localized description of the function. */
  var Description: java.lang.String
  /** returns the localized function's name. */
  var Name: java.lang.String
  /** returns the signature of the function. */
  var Signature: java.lang.String
  def createFormula(arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): java.lang.String
}


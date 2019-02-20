package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 3.5 */
trait TableFilterField3 extends js.Object {
  /** specifies how the condition is connected to the previous condition. */
  var Connection: FilterConnection
  /** specifies which field (column) is used for the condition. */
  var Field: scala.Double
  /** specifies the type of the condition as defined in {@link FilterOperator2} . */
  var Operator: scala.Double
  /** specifies values to match against. Each filter field may have one or more values. */
  var Values: activexDashInteropLib.SafeArray[FilterFieldValue]
}


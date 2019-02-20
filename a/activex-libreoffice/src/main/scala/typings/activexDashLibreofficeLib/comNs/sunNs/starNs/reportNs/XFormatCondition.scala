package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a format condition for a control. */
trait XFormatCondition
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XReportControlFormat {
  /** specifies if the condition is enabled or not. */
  var Enabled: scala.Boolean
  /** defines the formula of the format condition. If the formula evaluates to `TRUE` then the format will be applied. */
  var Formula: java.lang.String
}


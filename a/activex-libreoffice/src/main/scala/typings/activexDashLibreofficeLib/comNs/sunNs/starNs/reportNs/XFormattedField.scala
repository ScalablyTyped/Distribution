package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a control which can be used for displaying values with a arbitrary formatting.
  * @see com.sun.star.report.XReportControlModel
  * @see com.sun.star.util.XNumberFormatsSupplier
  */
trait XFormattedField extends XReportControlModel {
  /**
    * specifies the format to be used when formatting the field input and output.
    *
    * This value is meaningful relative to the FormatsSupplier attribute only.
    */
  var FormatKey: scala.Double
  /** supplies the formats the field should work with. */
  var FormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
}


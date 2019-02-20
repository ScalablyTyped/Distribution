package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the {@link com.sun.star.sdbcx.Table} with additional display information, sorting and filtering criteria. */
trait DataSettings extends js.Object {
  /** indicates whether the filter should be applied or not, default is `FALSE` . */
  var ApplyFilter: scala.Boolean
  /** additional filter for the data object. */
  var Filter: java.lang.String
  /** specifies the font attributes for data displaying. */
  var FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor
  /** additional group by for the data object. */
  var GroupBy: java.lang.String
  /** additional having clause for the data object. */
  var HavingClause: java.lang.String
  /** is an additional sort order definition. */
  var Order: java.lang.String
  /** specifies the height of a data row. */
  var RowHeight: scala.Double
  /** specifies the text color (RGB) for displaying text. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
}


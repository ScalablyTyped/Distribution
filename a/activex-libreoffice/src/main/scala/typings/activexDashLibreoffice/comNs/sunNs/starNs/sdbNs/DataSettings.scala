package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the {@link com.sun.star.sdbcx.Table} with additional display information, sorting and filtering criteria. */
trait DataSettings extends js.Object {
  /** indicates whether the filter should be applied or not, default is `FALSE` . */
  var ApplyFilter: Boolean
  /** additional filter for the data object. */
  var Filter: String
  /** specifies the font attributes for data displaying. */
  var FontDescriptor: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor
  /** additional group by for the data object. */
  var GroupBy: String
  /** additional having clause for the data object. */
  var HavingClause: String
  /** is an additional sort order definition. */
  var Order: String
  /** specifies the height of a data row. */
  var RowHeight: Double
  /** specifies the text color (RGB) for displaying text. */
  var TextColor: Color
}

object DataSettings {
  @scala.inline
  def apply(
    ApplyFilter: Boolean,
    Filter: String,
    FontDescriptor: FontDescriptor,
    GroupBy: String,
    HavingClause: String,
    Order: String,
    RowHeight: Double,
    TextColor: Color
  ): DataSettings = {
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter, Filter = Filter, FontDescriptor = FontDescriptor, GroupBy = GroupBy, HavingClause = HavingClause, Order = Order, RowHeight = RowHeight, TextColor = TextColor)
  
    __obj.asInstanceOf[DataSettings]
  }
}


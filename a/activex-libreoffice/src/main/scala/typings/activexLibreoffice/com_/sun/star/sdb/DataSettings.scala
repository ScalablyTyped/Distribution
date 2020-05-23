package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typings.activexLibreoffice.com_.sun.star.util.Color
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
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor
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
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSettings]
  }
}


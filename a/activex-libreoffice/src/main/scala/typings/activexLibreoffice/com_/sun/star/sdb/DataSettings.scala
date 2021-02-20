package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends the {@link com.sun.star.sdbcx.Table} with additional display information, sorting and filtering criteria. */
@js.native
trait DataSettings extends StObject {
  
  /** indicates whether the filter should be applied or not, default is `FALSE` . */
  var ApplyFilter: Boolean = js.native
  
  /** additional filter for the data object. */
  var Filter: String = js.native
  
  /** specifies the font attributes for data displaying. */
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  
  /** additional group by for the data object. */
  var GroupBy: String = js.native
  
  /** additional having clause for the data object. */
  var HavingClause: String = js.native
  
  /** is an additional sort order definition. */
  var Order: String = js.native
  
  /** specifies the height of a data row. */
  var RowHeight: Double = js.native
  
  /** specifies the text color (RGB) for displaying text. */
  var TextColor: Color = js.native
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
  
  @scala.inline
  implicit class DataSettingsMutableBuilder[Self <: DataSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyFilter(value: Boolean): Self = StObject.set(x, "ApplyFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDescriptor(value: FontDescriptor): Self = StObject.set(x, "FontDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBy(value: String): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHavingClause(value: String): Self = StObject.set(x, "HavingClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "RowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: Color): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
  }
}

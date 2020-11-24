package typings.activexLibreoffice.com_.sun.star.chart

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a single data row, specified by its name and a sequence of data points.
  *
  * This struct is currently used nowhere.
  * @deprecated Deprecated
  */
@js.native
trait ChartDataRow extends js.Object {
  
  /** The name of the data row. */
  var Name: String = js.native
  
  /** The points contained in this data row. */
  var Points: SafeArray[SafeArray[ChartDataValue]] = js.native
}
object ChartDataRow {
  
  @scala.inline
  def apply(Name: String, Points: SafeArray[SafeArray[ChartDataValue]]): ChartDataRow = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataRow]
  }
  
  @scala.inline
  implicit class ChartDataRowOps[Self <: ChartDataRow] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: SafeArray[SafeArray[ChartDataValue]]): Self = this.set("Points", value.asInstanceOf[js.Any])
  }
}

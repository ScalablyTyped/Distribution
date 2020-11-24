package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataBar extends XConditionEntry {
  
  var AxisColor: Color = js.native
  
  /** See {@link com.sun.star.sheet.DataBarAxis} for possible values */
  var AxisPosition: Double = js.native
  
  var Color: typings.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  var DataBarEntries: SafeArray[XDataBarEntry] = js.native
  
  /**
    * Maximum databar length in percent of cell width.
    *
    * Allowed values are (0, 1000) but larger than MinimumLength.
    */
  var MaximumLength: Double = js.native
  
  /**
    * Minimum databar length in percent of cell width.
    *
    * Allowed values are [0, 100) but smaller than MaximumLength.
    */
  var MinimumLength: Double = js.native
  
  var NegativeColor: Color = js.native
  
  var ShowValue: Boolean = js.native
  
  var UseGradient: Boolean = js.native
  
  var UseNegativeColor: Boolean = js.native
}
object DataBar {
  
  @scala.inline
  def apply(
    AxisColor: Color,
    AxisPosition: Double,
    Color: Color,
    DataBarEntries: SafeArray[XDataBarEntry],
    MaximumLength: Double,
    MinimumLength: Double,
    NegativeColor: Color,
    ShowValue: Boolean,
    Type: Double,
    UseGradient: Boolean,
    UseNegativeColor: Boolean,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DataBar = {
    val __obj = js.Dynamic.literal(AxisColor = AxisColor.asInstanceOf[js.Any], AxisPosition = AxisPosition.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], DataBarEntries = DataBarEntries.asInstanceOf[js.Any], MaximumLength = MaximumLength.asInstanceOf[js.Any], MinimumLength = MinimumLength.asInstanceOf[js.Any], NegativeColor = NegativeColor.asInstanceOf[js.Any], ShowValue = ShowValue.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseGradient = UseGradient.asInstanceOf[js.Any], UseNegativeColor = UseNegativeColor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DataBar]
  }
  
  @scala.inline
  implicit class DataBarOps[Self <: DataBar] (val x: Self) extends AnyVal {
    
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
    def setAxisColor(value: Color): Self = this.set("AxisColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisPosition(value: Double): Self = this.set("AxisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBarEntries(value: SafeArray[XDataBarEntry]): Self = this.set("DataBarEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLength(value: Double): Self = this.set("MaximumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLength(value: Double): Self = this.set("MinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeColor(value: Color): Self = this.set("NegativeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("ShowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGradient(value: Boolean): Self = this.set("UseGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNegativeColor(value: Boolean): Self = this.set("UseNegativeColor", value.asInstanceOf[js.Any])
  }
}

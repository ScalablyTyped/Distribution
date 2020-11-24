package typings.amcharts.graphDataItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphDataItem extends js.Object {
  
  /**
    * Opacity of the data item.
    */
  var alpha: Double = js.native
  
  /**
    * Bullet type.
    */
  var bullet: String = js.native
  
  /**
    * Bullet size.
    */
  var bulletSize: Double = js.native
  
  /**
    * Category value.
    */
  var category: String = js.native
  
  /**
    * Color of the data item.
    */
  var color: String = js.native
  
  /**
    * Custom bullet (path to file name).
    */
  var customBullet: String = js.native
  
  /**
    * Original object from data provider.
    */
  var dataContext: js.Object = js.native
  
  /**
    * Description.
    */
  var description: String = js.native
  
  /**
    * Array of colors of the data item, used by column and candlestick chart only.
    */
  var fillColors: js.Array[_] = js.native
  
  /**
    * Object which holds percents when recalculateToPercents is set to true.
    */
  var percents: js.Object = js.native
  
  /**
    * SerialDataItem of this graphDataItem
    */
  var serialDataItem: typings.amcharts.serialDataItemMod.default = js.native
  
  /**
    * url
    */
  var url: String = js.native
  
  /**
    * Object which holds values of the data item (value, open, close, low, high).
    */
  var values: js.Object = js.native
  
  /**
    * x coordinate of the data item.
    */
  var x: Double = js.native
  
  /**
    * y coordinate of the data item.
    */
  var y: Double = js.native
}
object GraphDataItem {
  
  @scala.inline
  def apply(
    alpha: Double,
    bullet: String,
    bulletSize: Double,
    category: String,
    color: String,
    customBullet: String,
    dataContext: js.Object,
    description: String,
    fillColors: js.Array[_],
    percents: js.Object,
    serialDataItem: typings.amcharts.serialDataItemMod.default,
    url: String,
    values: js.Object,
    x: Double,
    y: Double
  ): GraphDataItem = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bullet = bullet.asInstanceOf[js.Any], bulletSize = bulletSize.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], customBullet = customBullet.asInstanceOf[js.Any], dataContext = dataContext.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fillColors = fillColors.asInstanceOf[js.Any], percents = percents.asInstanceOf[js.Any], serialDataItem = serialDataItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDataItem]
  }
  
  @scala.inline
  implicit class GraphDataItemOps[Self <: GraphDataItem] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBullet(value: String): Self = this.set("bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletSize(value: Double): Self = this.set("bulletSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBullet(value: String): Self = this.set("customBullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataContext(value: js.Object): Self = this.set("dataContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorsVarargs(value: js.Any*): Self = this.set("fillColors", js.Array(value :_*))
    
    @scala.inline
    def setFillColors(value: js.Array[_]): Self = this.set("fillColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercents(value: js.Object): Self = this.set("percents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialDataItem(value: typings.amcharts.serialDataItemMod.default): Self = this.set("serialDataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Object): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}

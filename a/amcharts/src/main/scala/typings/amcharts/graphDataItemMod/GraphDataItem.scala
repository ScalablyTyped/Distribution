package typings.amcharts.graphDataItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphDataItem extends js.Object {
  /**
    * Opacity of the data item.
    */
  var alpha: Double
  /**
    * Bullet type.
    */
  var bullet: String
  /**
    * Bullet size.
    */
  var bulletSize: Double
  /**
    * Category value.
    */
  var category: String
  /**
    * Color of the data item.
    */
  var color: String
  /**
    * Custom bullet (path to file name).
    */
  var customBullet: String
  /**
    * Original object from data provider.
    */
  var dataContext: js.Object
  /**
    * Description.
    */
  var description: String
  /**
    * Array of colors of the data item, used by column and candlestick chart only.
    */
  var fillColors: js.Array[_]
  /**
    * Object which holds percents when recalculateToPercents is set to true.
    */
  var percents: js.Object
  /**
    * SerialDataItem of this graphDataItem
    */
  var serialDataItem: typings.amcharts.serialDataItemMod.default
  /**
    * url
    */
  var url: String
  /**
    * Object which holds values of the data item (value, open, close, low, high).
    */
  var values: js.Object
  /**
    * x coordinate of the data item.
    */
  var x: Double
  /**
    * y coordinate of the data item.
    */
  var y: Double
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
    val __obj = js.Dynamic.literal(alpha = alpha, bullet = bullet, bulletSize = bulletSize, category = category, color = color, customBullet = customBullet, dataContext = dataContext, description = description, fillColors = fillColors, percents = percents, serialDataItem = serialDataItem, url = url, values = values, x = x, y = y)
  
    __obj.asInstanceOf[GraphDataItem]
  }
}


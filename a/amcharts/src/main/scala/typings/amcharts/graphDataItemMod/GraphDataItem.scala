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
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bullet = bullet.asInstanceOf[js.Any], bulletSize = bulletSize.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], customBullet = customBullet.asInstanceOf[js.Any], dataContext = dataContext.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fillColors = fillColors.asInstanceOf[js.Any], percents = percents.asInstanceOf[js.Any], serialDataItem = serialDataItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDataItem]
  }
}


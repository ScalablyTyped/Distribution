package typings
package amchartsLib.graphdataitemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphDataItem extends js.Object {
  /**
    * Opacity of the data item.
    */
  var alpha: scala.Double
  /**
    * Bullet type.
    */
  var bullet: java.lang.String
  /**
    * Bullet size.
    */
  var bulletSize: scala.Double
  /**
    * Category value.
    */
  var category: java.lang.String
  /**
    * Color of the data item.
    */
  var color: java.lang.String
  /**
    * Custom bullet (path to file name).
    */
  var customBullet: java.lang.String
  /**
    * Original object from data provider.
    */
  var dataContext: js.Object
  /**
    * Description.
    */
  var description: java.lang.String
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
  var serialDataItem: amchartsLib.serialdataitemMod.default
  /**
    * url
    */
  var url: java.lang.String
  /**
    * Object which holds values of the data item (value, open, close, low, high).
    */
  var values: js.Object
  /**
    * x coordinate of the data item.
    */
  var x: scala.Double
  /**
    * y coordinate of the data item.
    */
  var y: scala.Double
}

object GraphDataItem {
  @scala.inline
  def apply(
    alpha: scala.Double,
    bullet: java.lang.String,
    bulletSize: scala.Double,
    category: java.lang.String,
    color: java.lang.String,
    customBullet: java.lang.String,
    dataContext: js.Object,
    description: java.lang.String,
    fillColors: js.Array[_],
    percents: js.Object,
    serialDataItem: amchartsLib.serialdataitemMod.default,
    url: java.lang.String,
    values: js.Object,
    x: scala.Double,
    y: scala.Double
  ): GraphDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("bullet")(bullet)
    __obj.updateDynamic("bulletSize")(bulletSize)
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("customBullet")(customBullet)
    __obj.updateDynamic("dataContext")(dataContext)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("fillColors")(fillColors)
    __obj.updateDynamic("percents")(percents)
    __obj.updateDynamic("serialDataItem")(serialDataItem)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("values")(values)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[GraphDataItem]
  }
}


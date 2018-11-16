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


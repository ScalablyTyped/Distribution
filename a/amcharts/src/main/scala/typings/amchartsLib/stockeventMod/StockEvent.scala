package typings
package amchartsLib.stockeventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockEvent extends js.Object {
  /**
    * Opacity of bullet background.
    * @default 1
    */
  var backgroundAlpha: scala.Double
  /**
    * Color of bullet background. #DADADA
    */
  var backgroundColor: java.lang.String
  /**
    * Opacity of bullet border.
    * @default 1
    */
  var borderAlpha: scala.Double
  /**
    * Bullet border color. #888888
    */
  var borderColor: java.lang.String
  /**
    * The color of the event text. #000000
    */
  var color: java.lang.String
  /**
    * Date of an event. Must be Date object, not a string.
    */
  var date: stdLib.Date
  /**
    * graph on which event will be displayed.
    */
  var graph: amchartsLib.stockgraphMod.default
  /**
    * Roll-over background color. #CC0000
    */
  var rollOverColor: java.lang.String
  /**
    * Specifies if the event should be displayed on category axis
    */
  var showOnAxis: scala.Boolean
  /**
    * Letter which will be displayed on the event. Not all types can display letters.
    * "text" type can display longer texts.
    */
  var text: java.lang.String
  /**
    * Type of bullet.
    * Possible values are:
    * "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft", "triangleRight", "text",
    * "arrowUp", "arrowDown"
    * @default "sign"
    */
  var `type`: java.lang.String
  /**
    * A URL to go to when user clicks the event.
    */
  var url: java.lang.String
  /**
    * target of url, "_blank" for example.
    */
  var urlTarget: java.lang.String
}

object StockEvent {
  @scala.inline
  def apply(
    backgroundAlpha: scala.Double,
    backgroundColor: java.lang.String,
    borderAlpha: scala.Double,
    borderColor: java.lang.String,
    color: java.lang.String,
    date: stdLib.Date,
    graph: amchartsLib.stockgraphMod.default,
    rollOverColor: java.lang.String,
    showOnAxis: scala.Boolean,
    text: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String,
    urlTarget: java.lang.String
  ): StockEvent = {
    val __obj = js.Dynamic.literal(backgroundAlpha = backgroundAlpha, backgroundColor = backgroundColor, borderAlpha = borderAlpha, borderColor = borderColor, color = color, date = date, graph = graph, rollOverColor = rollOverColor, showOnAxis = showOnAxis, text = text, url = url, urlTarget = urlTarget)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StockEvent]
  }
}


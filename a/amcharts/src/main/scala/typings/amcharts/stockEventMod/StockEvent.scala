package typings.amcharts.stockEventMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockEvent extends js.Object {
  /**
    * Opacity of bullet background.
    * @default 1
    */
  var backgroundAlpha: Double
  /**
    * Color of bullet background. #DADADA
    */
  var backgroundColor: String
  /**
    * Opacity of bullet border.
    * @default 1
    */
  var borderAlpha: Double
  /**
    * Bullet border color. #888888
    */
  var borderColor: String
  /**
    * The color of the event text. #000000
    */
  var color: String
  /**
    * Date of an event. Must be Date object, not a string.
    */
  var date: Date
  /**
    * graph on which event will be displayed.
    */
  var graph: typings.amcharts.stockGraphMod.default
  /**
    * Roll-over background color. #CC0000
    */
  var rollOverColor: String
  /**
    * Specifies if the event should be displayed on category axis
    */
  var showOnAxis: Boolean
  /**
    * Letter which will be displayed on the event. Not all types can display letters.
    * "text" type can display longer texts.
    */
  var text: String
  /**
    * Type of bullet.
    * Possible values are:
    * "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft", "triangleRight", "text",
    * "arrowUp", "arrowDown"
    * @default "sign"
    */
  var `type`: String
  /**
    * A URL to go to when user clicks the event.
    */
  var url: String
  /**
    * target of url, "_blank" for example.
    */
  var urlTarget: String
}

object StockEvent {
  @scala.inline
  def apply(
    backgroundAlpha: Double,
    backgroundColor: String,
    borderAlpha: Double,
    borderColor: String,
    color: String,
    date: Date,
    graph: typings.amcharts.stockGraphMod.default,
    rollOverColor: String,
    showOnAxis: Boolean,
    text: String,
    `type`: String,
    url: String,
    urlTarget: String
  ): StockEvent = {
    val __obj = js.Dynamic.literal(backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], showOnAxis = showOnAxis.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlTarget = urlTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockEvent]
  }
}


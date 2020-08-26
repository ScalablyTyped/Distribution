package typings.amcharts.stockEventMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockEvent extends js.Object {
  /**
    * Opacity of bullet background.
    * @default 1
    */
  var backgroundAlpha: Double = js.native
  /**
    * Color of bullet background. #DADADA
    */
  var backgroundColor: String = js.native
  /**
    * Opacity of bullet border.
    * @default 1
    */
  var borderAlpha: Double = js.native
  /**
    * Bullet border color. #888888
    */
  var borderColor: String = js.native
  /**
    * The color of the event text. #000000
    */
  var color: String = js.native
  /**
    * Date of an event. Must be Date object, not a string.
    */
  var date: Date = js.native
  /**
    * graph on which event will be displayed.
    */
  var graph: typings.amcharts.stockGraphMod.default = js.native
  /**
    * Roll-over background color. #CC0000
    */
  var rollOverColor: String = js.native
  /**
    * Specifies if the event should be displayed on category axis
    */
  var showOnAxis: Boolean = js.native
  /**
    * Letter which will be displayed on the event. Not all types can display letters.
    * "text" type can display longer texts.
    */
  var text: String = js.native
  /**
    * Type of bullet.
    * Possible values are:
    * "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft", "triangleRight", "text",
    * "arrowUp", "arrowDown"
    * @default "sign"
    */
  var `type`: String = js.native
  /**
    * A URL to go to when user clicks the event.
    */
  var url: String = js.native
  /**
    * target of url, "_blank" for example.
    */
  var urlTarget: String = js.native
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
  @scala.inline
  implicit class StockEventOps[Self <: StockEvent] (val x: Self) extends AnyVal {
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
    def setBackgroundAlpha(value: Double): Self = this.set("backgroundAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderAlpha(value: Double): Self = this.set("borderAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraph(value: typings.amcharts.stockGraphMod.default): Self = this.set("graph", value.asInstanceOf[js.Any])
    @scala.inline
    def setRollOverColor(value: String): Self = this.set("rollOverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowOnAxis(value: Boolean): Self = this.set("showOnAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlTarget(value: String): Self = this.set("urlTarget", value.asInstanceOf[js.Any])
  }
  
}


package typings.amcharts.stockEventMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/StockEvent", JSImport.Default)
@js.native
class default () extends StockEvent {
  /**
    * Opacity of bullet background.
    * @default 1
    */
  /* CompleteClass */
  override var backgroundAlpha: Double = js.native
  /**
    * Color of bullet background. #DADADA
    */
  /* CompleteClass */
  override var backgroundColor: String = js.native
  /**
    * Opacity of bullet border.
    * @default 1
    */
  /* CompleteClass */
  override var borderAlpha: Double = js.native
  /**
    * Bullet border color. #888888
    */
  /* CompleteClass */
  override var borderColor: String = js.native
  /**
    * The color of the event text. #000000
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Date of an event. Must be Date object, not a string.
    */
  /* CompleteClass */
  override var date: Date = js.native
  /**
    * graph on which event will be displayed.
    */
  /* CompleteClass */
  override var graph: typings.amcharts.stockGraphMod.default = js.native
  /**
    * Roll-over background color. #CC0000
    */
  /* CompleteClass */
  override var rollOverColor: String = js.native
  /**
    * Specifies if the event should be displayed on category axis
    */
  /* CompleteClass */
  override var showOnAxis: Boolean = js.native
  /**
    * Letter which will be displayed on the event. Not all types can display letters.
    * "text" type can display longer texts.
    */
  /* CompleteClass */
  override var text: String = js.native
  /**
    * Type of bullet.
    * Possible values are:
    * "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft", "triangleRight", "text",
    * "arrowUp", "arrowDown"
    * @default "sign"
    */
  /* CompleteClass */
  override var `type`: String = js.native
  /**
    * A URL to go to when user clicks the event.
    */
  /* CompleteClass */
  override var url: String = js.native
  /**
    * target of url, "_blank" for example.
    */
  /* CompleteClass */
  override var urlTarget: String = js.native
}


package typings
package amchartsLib.stockeventMod

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
  override var backgroundAlpha: scala.Double = js.native
  /**
    * Color of bullet background. #DADADA
    */
  /* CompleteClass */
  override var backgroundColor: java.lang.String = js.native
  /**
    * Opacity of bullet border.
    * @default 1
    */
  /* CompleteClass */
  override var borderAlpha: scala.Double = js.native
  /**
    * Bullet border color. #888888
    */
  /* CompleteClass */
  override var borderColor: java.lang.String = js.native
  /**
    * The color of the event text. #000000
    */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
    * Date of an event. Must be Date object, not a string.
    */
  /* CompleteClass */
  override var date: stdLib.Date = js.native
  /**
    * graph on which event will be displayed.
    */
  /* CompleteClass */
  override var graph: amchartsLib.stockgraphMod.default = js.native
  /**
    * Roll-over background color. #CC0000
    */
  /* CompleteClass */
  override var rollOverColor: java.lang.String = js.native
  /**
    * Specifies if the event should be displayed on category axis
    */
  /* CompleteClass */
  override var showOnAxis: scala.Boolean = js.native
  /**
    * Letter which will be displayed on the event. Not all types can display letters.
    * "text" type can display longer texts.
    */
  /* CompleteClass */
  override var text: java.lang.String = js.native
  /**
    * Type of bullet.
    * Possible values are:
    * "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft", "triangleRight", "text",
    * "arrowUp", "arrowDown"
    * @default "sign"
    */
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /**
    * A URL to go to when user clicks the event.
    */
  /* CompleteClass */
  override var url: java.lang.String = js.native
  /**
    * target of url, "_blank" for example.
    */
  /* CompleteClass */
  override var urlTarget: java.lang.String = js.native
}


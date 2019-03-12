package typings
package amchartsLib.amBalloonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/AmBalloon", JSImport.Default)
@js.native
class default () extends AmBalloon {
  /**
    * If this is set to true, border color instead of background color will be changed
    * when user rolls-over the slice, graph, etc.
    */
  /* CompleteClass */
  override var adjustBorderColor: scala.Boolean = js.native
  /**
    * Balloon border opacity. Value range is 0 - 1.
    * @default 1
    */
  /* CompleteClass */
  override var borderAlpha: scala.Double = js.native
  /**
    * Balloon border color. #FFFFFF
    */
  /* CompleteClass */
  override var borderColor: java.lang.String = js.native
  /**
    * Balloon border thickness.
    * @default 2
    */
  /* CompleteClass */
  override var borderThickness: scala.Double = js.native
  /**
    * Color of text in the balloon. #FFFFFF
    */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
    * Balloon corner radius.
    * @default 6
    */
  /* CompleteClass */
  override var cornerRadius: scala.Double = js.native
  /**
    * Balloon background opacity.
    * @default 1
    */
  /* CompleteClass */
  override var fillAlpha: scala.Double = js.native
  /**
    * Balloon background color. Usually balloon background color is set by the chart.
    * Only if "adjustBorderColor" is "true" this color will be used.
    * @default "#CC0000"
    */
  /* CompleteClass */
  override var fillColor: java.lang.String = js.native
  /**
    * Size of text in the balloon. Chart's fontSize is used by default.
    */
  /* CompleteClass */
  override var fontSize: java.lang.String = js.native
  /**
    * Horizontal padding of the balloon.
    * @default 8
    */
  /* CompleteClass */
  override var horizontalPadding: scala.Double = js.native
  /**
    * The width of the pointer (arrow) "root". Only used if cornerRadius is 0.
    * @default 10
    */
  /* CompleteClass */
  override var pointerWidth: scala.Double = js.native
  /**
    * If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used.
    * If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false
    */
  /* CompleteClass */
  override var showBullet: scala.Boolean = js.native
  /**
    * Text alignment, possible values "left", "middle" and "right" middle
    */
  /* CompleteClass */
  override var textAlign: java.lang.String = js.native
  /**
    * Color of the text shadow. #000000
    */
  /* CompleteClass */
  override var textShadowColor: java.lang.String = js.native
  /**
    * Vertical padding of the balloon.
    * @default 5
    */
  /* CompleteClass */
  override var verticalPadding: scala.Double = js.native
  /**
    * Hides balloon.
    */
  /* CompleteClass */
  override def hide(): scala.Unit = js.native
  /**
    * Defines a square within which the balloon should appear.
    * Bounds are set by chart class, you don't need to call this method yourself.
    */
  /* CompleteClass */
  override def setBounds(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
  /**
    * Sets coordinates the balloon should point to.
    */
  /* CompleteClass */
  override def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Specifies the text which should be displayed.
    */
  /* CompleteClass */
  override def show(value: java.lang.String): scala.Unit = js.native
}


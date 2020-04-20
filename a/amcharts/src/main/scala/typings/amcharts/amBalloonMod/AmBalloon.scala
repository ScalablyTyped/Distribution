package typings.amcharts.amBalloonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmBalloon extends js.Object {
  /**
    * If this is set to true, border color instead of background color will be changed
    * when user rolls-over the slice, graph, etc.
    */
  var adjustBorderColor: Boolean
  /**
    * Balloon border opacity. Value range is 0 - 1.
    * @default 1
    */
  var borderAlpha: Double
  /**
    * Balloon border color. #FFFFFF
    */
  var borderColor: String
  /**
    * Balloon border thickness.
    * @default 2
    */
  var borderThickness: Double
  /**
    * Color of text in the balloon. #FFFFFF
    */
  var color: String
  /**
    * Balloon corner radius.
    * @default 6
    */
  var cornerRadius: Double
  /**
    * Balloon background opacity.
    * @default 1
    */
  var fillAlpha: Double
  /**
    * Balloon background color. Usually balloon background color is set by the chart.
    * Only if "adjustBorderColor" is "true" this color will be used.
    * @default "#CC0000"
    */
  var fillColor: String
  /**
    * Size of text in the balloon. Chart's fontSize is used by default.
    */
  var fontSize: String
  /**
    * Horizontal padding of the balloon.
    * @default 8
    */
  var horizontalPadding: Double
  /**
    * The width of the pointer (arrow) "root". Only used if cornerRadius is 0.
    * @default 10
    */
  var pointerWidth: Double
  /**
    * If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used.
    * If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false
    */
  var showBullet: Boolean
  /**
    * Text alignment, possible values "left", "middle" and "right" middle
    */
  var textAlign: String
  /**
    * Color of the text shadow. #000000
    */
  var textShadowColor: String
  /**
    * Vertical padding of the balloon.
    * @default 5
    */
  var verticalPadding: Double
  /**
    * Hides balloon.
    */
  def hide(): Unit
  /**
    * Defines a square within which the balloon should appear.
    * Bounds are set by chart class, you don't need to call this method yourself.
    */
  def setBounds(left: Double, top: Double, right: Double, bottom: Double): Unit
  /**
    * Sets coordinates the balloon should point to.
    */
  def setPosition(x: Double, y: Double): Unit
  /**
    * Specifies the text which should be displayed.
    */
  def show(value: String): Unit
}

object AmBalloon {
  @scala.inline
  def apply(
    adjustBorderColor: Boolean,
    borderAlpha: Double,
    borderColor: String,
    borderThickness: Double,
    color: String,
    cornerRadius: Double,
    fillAlpha: Double,
    fillColor: String,
    fontSize: String,
    hide: () => Unit,
    horizontalPadding: Double,
    pointerWidth: Double,
    setBounds: (Double, Double, Double, Double) => Unit,
    setPosition: (Double, Double) => Unit,
    show: String => Unit,
    showBullet: Boolean,
    textAlign: String,
    textShadowColor: String,
    verticalPadding: Double
  ): AmBalloon = {
    val __obj = js.Dynamic.literal(adjustBorderColor = adjustBorderColor.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderThickness = borderThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), horizontalPadding = horizontalPadding.asInstanceOf[js.Any], pointerWidth = pointerWidth.asInstanceOf[js.Any], setBounds = js.Any.fromFunction4(setBounds), setPosition = js.Any.fromFunction2(setPosition), show = js.Any.fromFunction1(show), showBullet = showBullet.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textShadowColor = textShadowColor.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmBalloon]
  }
}


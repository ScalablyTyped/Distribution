package typings
package amchartsLib.amballoonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmBalloon extends js.Object {
  /**
    * If this is set to true, border color instead of background color will be changed
    * when user rolls-over the slice, graph, etc.
    */
  var adjustBorderColor: scala.Boolean
  /**
    * Balloon border opacity. Value range is 0 - 1.
    * @default 1
    */
  var borderAlpha: scala.Double
  /**
    * Balloon border color. #FFFFFF
    */
  var borderColor: java.lang.String
  /**
    * Balloon border thickness.
    * @default 2
    */
  var borderThickness: scala.Double
  /**
    * Color of text in the balloon. #FFFFFF
    */
  var color: java.lang.String
  /**
    * Balloon corner radius.
    * @default 6
    */
  var cornerRadius: scala.Double
  /**
    * Balloon background opacity.
    * @default 1
    */
  var fillAlpha: scala.Double
  /**
    * Balloon background color. Usually balloon background color is set by the chart.
    * Only if "adjustBorderColor" is "true" this color will be used.
    * @default "#CC0000"
    */
  var fillColor: java.lang.String
  /**
    * Size of text in the balloon. Chart's fontSize is used by default.
    */
  var fontSize: java.lang.String
  /**
    * Horizontal padding of the balloon.
    * @default 8
    */
  var horizontalPadding: scala.Double
  /**
    * The width of the pointer (arrow) "root". Only used if cornerRadius is 0.
    * @default 10
    */
  var pointerWidth: scala.Double
  /**
    * If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used.
    * If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false
    */
  var showBullet: scala.Boolean
  /**
    * Text alignment, possible values "left", "middle" and "right" middle
    */
  var textAlign: java.lang.String
  /**
    * Color of the text shadow. #000000
    */
  var textShadowColor: java.lang.String
  /**
    * Vertical padding of the balloon.
    * @default 5
    */
  var verticalPadding: scala.Double
  /**
    * Hides balloon.
    */
  def hide(): scala.Unit
  /**
    * Defines a square within which the balloon should appear.
    * Bounds are set by chart class, you don't need to call this method yourself.
    */
  def setBounds(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit
  /**
    * Sets coordinates the balloon should point to.
    */
  def setPosition(x: scala.Double, y: scala.Double): scala.Unit
  /**
    * Specifies the text which should be displayed.
    */
  def show(value: java.lang.String): scala.Unit
}

object AmBalloon {
  @scala.inline
  def apply(
    adjustBorderColor: scala.Boolean,
    borderAlpha: scala.Double,
    borderColor: java.lang.String,
    borderThickness: scala.Double,
    color: java.lang.String,
    cornerRadius: scala.Double,
    fillAlpha: scala.Double,
    fillColor: java.lang.String,
    fontSize: java.lang.String,
    hide: js.Function0[scala.Unit],
    horizontalPadding: scala.Double,
    pointerWidth: scala.Double,
    setBounds: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setPosition: js.Function2[scala.Double, scala.Double, scala.Unit],
    show: js.Function1[java.lang.String, scala.Unit],
    showBullet: scala.Boolean,
    textAlign: java.lang.String,
    textShadowColor: java.lang.String,
    verticalPadding: scala.Double
  ): AmBalloon = {
    val __obj = js.Dynamic.literal(adjustBorderColor = adjustBorderColor, borderAlpha = borderAlpha, borderColor = borderColor, borderThickness = borderThickness, color = color, cornerRadius = cornerRadius, fillAlpha = fillAlpha, fillColor = fillColor, fontSize = fontSize, hide = hide, horizontalPadding = horizontalPadding, pointerWidth = pointerWidth, setBounds = setBounds, setPosition = setPosition, show = show, showBullet = showBullet, textAlign = textAlign, textShadowColor = textShadowColor, verticalPadding = verticalPadding)
  
    __obj.asInstanceOf[AmBalloon]
  }
}


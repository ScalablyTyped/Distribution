package typings.amcharts.amchartsMod.AmCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts", "AmCharts.AmBalloon")
@js.native
class AmBalloon ()
  extends typings.amcharts.amBalloonMod.AmBalloon {
  /**
    * If this is set to true, border color instead of background color will be changed
    * when user rolls-over the slice, graph, etc.
    */
  /* CompleteClass */
  override var adjustBorderColor: Boolean = js.native
  /**
    * Balloon border opacity. Value range is 0 - 1.
    * @default 1
    */
  /* CompleteClass */
  override var borderAlpha: Double = js.native
  /**
    * Balloon border color. #FFFFFF
    */
  /* CompleteClass */
  override var borderColor: String = js.native
  /**
    * Balloon border thickness.
    * @default 2
    */
  /* CompleteClass */
  override var borderThickness: Double = js.native
  /**
    * Color of text in the balloon. #FFFFFF
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Balloon corner radius.
    * @default 6
    */
  /* CompleteClass */
  override var cornerRadius: Double = js.native
  /**
    * Balloon background opacity.
    * @default 1
    */
  /* CompleteClass */
  override var fillAlpha: Double = js.native
  /**
    * Balloon background color. Usually balloon background color is set by the chart.
    * Only if "adjustBorderColor" is "true" this color will be used.
    * @default "#CC0000"
    */
  /* CompleteClass */
  override var fillColor: String = js.native
  /**
    * Size of text in the balloon. Chart's fontSize is used by default.
    */
  /* CompleteClass */
  override var fontSize: String = js.native
  /**
    * Horizontal padding of the balloon.
    * @default 8
    */
  /* CompleteClass */
  override var horizontalPadding: Double = js.native
  /**
    * The width of the pointer (arrow) "root". Only used if cornerRadius is 0.
    * @default 10
    */
  /* CompleteClass */
  override var pointerWidth: Double = js.native
  /**
    * If cornerRadius of a balloon is >0, showBullet is set to true for value balloons when ChartCursor is used.
    * If you don't want the bullet near the balloon, set it to false: chart.balloon.showBullet = false
    */
  /* CompleteClass */
  override var showBullet: Boolean = js.native
  /**
    * Text alignment, possible values "left", "middle" and "right" middle
    */
  /* CompleteClass */
  override var textAlign: String = js.native
  /**
    * Color of the text shadow. #000000
    */
  /* CompleteClass */
  override var textShadowColor: String = js.native
  /**
    * Vertical padding of the balloon.
    * @default 5
    */
  /* CompleteClass */
  override var verticalPadding: Double = js.native
  /**
    * Hides balloon.
    */
  /* CompleteClass */
  override def hide(): Unit = js.native
  /**
    * Defines a square within which the balloon should appear.
    * Bounds are set by chart class, you don't need to call this method yourself.
    */
  /* CompleteClass */
  override def setBounds(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  /**
    * Sets coordinates the balloon should point to.
    */
  /* CompleteClass */
  override def setPosition(x: Double, y: Double): Unit = js.native
  /**
    * Specifies the text which should be displayed.
    */
  /* CompleteClass */
  override def show(value: String): Unit = js.native
}


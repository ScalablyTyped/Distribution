package typings.amcharts.guideMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/Guide", JSImport.Default)
@js.native
class default () extends Guide {
  /**
    * If you set it to true, the guide will be displayed above the graphs.
    */
  /* CompleteClass */
  override var above: Boolean = js.native
  /**
    * Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines.
    */
  /* CompleteClass */
  override var angle: Double = js.native
  /**
    * Baloon fill color.
    */
  /* CompleteClass */
  override var balloonColor: String = js.native
  /**
    * The text which will be displayed if the user rolls-over the guide.
    */
  /* CompleteClass */
  override var balloonText: String = js.native
  /**
    * Specifies if label should be bold or not.
    */
  /* CompleteClass */
  override var boldLabel: Boolean = js.native
  /**
    * Category of the guide (in case the guide is for category axis).
    */
  /* CompleteClass */
  override var category: String = js.native
  /**
    * Dash length.
    */
  /* CompleteClass */
  override var dashLength: Double = js.native
  /**
    * Date of the guide (in case the guide is for category axis and parseDates is set to true).
    */
  /* CompleteClass */
  override var date: Date = js.native
  /**
    * Works if a guide is added to CategoryAxis and this axis is non-date-based.
    * If you set it to true, the guide will start (or be placed, if it's not a fill) on the
    * beginning of the category cell and will end at the end of toCategory cell.
    */
  /* CompleteClass */
  override var expand: Boolean = js.native
  /**
    * Fill opacity. Value range is 0 - 1.
    */
  /* CompleteClass */
  override var fillAlpha: Double = js.native
  /**
    * Fill color.
    */
  /* CompleteClass */
  override var fillColor: String = js.native
  /**
    * Font size of guide label.
    */
  /* CompleteClass */
  override var fontSize: String = js.native
  /**
    * Unique id of a Guide. You don't need to set it, unless you want to.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * Specifies whether label should be placed inside or outside plot area.
    */
  /* CompleteClass */
  override var inside: Boolean = js.native
  /**
    * The label which will be displayed near the guide.
    */
  /* CompleteClass */
  override var label: String = js.native
  /**
    * Rotation angle of a guide label.
    */
  /* CompleteClass */
  override var labelRotation: Double = js.native
  /**
    * Line opacity.
    */
  /* CompleteClass */
  override var lineAlpha: Double = js.native
  /**
    * Line color.
    */
  /* CompleteClass */
  override var lineColor: String = js.native
  /**
    * Line thickness.
    */
  /* CompleteClass */
  override var lineThickness: Double = js.native
  /**
    * Position of guide label. Possible values are "left" or "right" for horizontal axis
    * and "top" or "bottom" for vertical axis.
    */
  /* CompleteClass */
  override var position: String = js.native
  /**
    * Tick length.
    */
  /* CompleteClass */
  override var tickLength: Double = js.native
  /**
    * Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines.
    */
  /* CompleteClass */
  override var toAngle: Double = js.native
  /**
    * To category of the guide (in case the guide is for category axis).
    */
  /* CompleteClass */
  override var toCategory: String = js.native
  /**
    * To date of the guide (in case the guide is for category axis and parseDates is set to true).
    * If you have both date and toDate, the space between these two dates can be filled with color.
    */
  /* CompleteClass */
  override var toDate: Date = js.native
  /**
    * To value of the guide (in case the guide is for value axis).
    */
  /* CompleteClass */
  override var toValue: Double = js.native
  /**
    * Value of the guide (in case the guide is for value axis).
    */
  /* CompleteClass */
  override var value: Double = js.native
  /**
    * Value axis of a guide. As you can add guides directly to the chart,
    * you might need to specify which which value axis should be used.
    */
  /* CompleteClass */
  override var valueAxis: typings.amcharts.valueAxisMod.default = js.native
}


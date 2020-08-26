package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of the line numbering. */
@js.native
trait LineNumberingProperties extends js.Object {
  /** The name of the character style that is used for the line number. */
  var CharStyleName: String = js.native
  /** If `TRUE` , empty lines are counted. */
  var CountEmptyLines: Boolean = js.native
  /** If `TRUE` , lines in frames are included in counting. */
  var CountLinesInFrames: Boolean = js.native
  /** specifies the distance between the line number and the start or end of the text area. */
  var Distance: Double = js.native
  /** Line numbers are shown on every **Interval** th line. */
  var Interval: Double = js.native
  /** If `TRUE` , line numbering is used. */
  var IsOn: Boolean = js.native
  /** specifies the position of the line number (constant LineNumberPositions left/right/inside/outside). */
  var NumberPosition: Double = js.native
  /** specifies the type of the numbering. */
  var NumberingType: Double = js.native
  /**
    * specifies if the line numbering should start from the beginning at each page.
    *
    * If set to `FALSE` the line numbering will be continuous.
    * @since OOo 2.0
    */
  var RestartAtEachPage: Boolean = js.native
  /** The line separator is shown every **SeparatorInterval** th line. */
  var SeparatorInterval: Double = js.native
  /** specifies the string that is used for the line separator. */
  var SeparatorText: String = js.native
}

object LineNumberingProperties {
  @scala.inline
  def apply(
    CharStyleName: String,
    CountEmptyLines: Boolean,
    CountLinesInFrames: Boolean,
    Distance: Double,
    Interval: Double,
    IsOn: Boolean,
    NumberPosition: Double,
    NumberingType: Double,
    RestartAtEachPage: Boolean,
    SeparatorInterval: Double,
    SeparatorText: String
  ): LineNumberingProperties = {
    val __obj = js.Dynamic.literal(CharStyleName = CharStyleName.asInstanceOf[js.Any], CountEmptyLines = CountEmptyLines.asInstanceOf[js.Any], CountLinesInFrames = CountLinesInFrames.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], Interval = Interval.asInstanceOf[js.Any], IsOn = IsOn.asInstanceOf[js.Any], NumberPosition = NumberPosition.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], RestartAtEachPage = RestartAtEachPage.asInstanceOf[js.Any], SeparatorInterval = SeparatorInterval.asInstanceOf[js.Any], SeparatorText = SeparatorText.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNumberingProperties]
  }
  @scala.inline
  implicit class LineNumberingPropertiesOps[Self <: LineNumberingProperties] (val x: Self) extends AnyVal {
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
    def setCharStyleName(value: String): Self = this.set("CharStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountEmptyLines(value: Boolean): Self = this.set("CountEmptyLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountLinesInFrames(value: Boolean): Self = this.set("CountLinesInFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("Distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Double): Self = this.set("Interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOn(value: Boolean): Self = this.set("IsOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberPosition(value: Double): Self = this.set("NumberPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberingType(value: Double): Self = this.set("NumberingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestartAtEachPage(value: Boolean): Self = this.set("RestartAtEachPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparatorInterval(value: Double): Self = this.set("SeparatorInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparatorText(value: String): Self = this.set("SeparatorText", value.asInstanceOf[js.Any])
  }
  
}


package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of the line numbering. */
trait LineNumberingProperties extends js.Object {
  /** The name of the character style that is used for the line number. */
  var CharStyleName: String
  /** If `TRUE` , empty lines are counted. */
  var CountEmptyLines: Boolean
  /** If `TRUE` , lines in frames are included in counting. */
  var CountLinesInFrames: Boolean
  /** specifies the distance between the line number and the start or end of the text area. */
  var Distance: Double
  /** Line numbers are shown on every **Interval** th line. */
  var Interval: Double
  /** If `TRUE` , line numbering is used. */
  var IsOn: Boolean
  /** specifies the position of the line number (constant LineNumberPositions left/right/inside/outside). */
  var NumberPosition: Double
  /** specifies the type of the numbering. */
  var NumberingType: Double
  /**
    * specifies if the line numbering should start from the beginning at each page.
    *
    * If set to `FALSE` the line numbering will be continuous.
    * @since OOo 2.0
    */
  var RestartAtEachPage: Boolean
  /** The line separator is shown every **SeparatorInterval** th line. */
  var SeparatorInterval: Double
  /** specifies the string that is used for the line separator. */
  var SeparatorText: String
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
    val __obj = js.Dynamic.literal(CharStyleName = CharStyleName, CountEmptyLines = CountEmptyLines, CountLinesInFrames = CountLinesInFrames, Distance = Distance, Interval = Interval, IsOn = IsOn, NumberPosition = NumberPosition, NumberingType = NumberingType, RestartAtEachPage = RestartAtEachPage, SeparatorInterval = SeparatorInterval, SeparatorText = SeparatorText)
  
    __obj.asInstanceOf[LineNumberingProperties]
  }
}


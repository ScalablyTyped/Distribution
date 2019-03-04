package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of the line numbering. */
trait LineNumberingProperties extends js.Object {
  /** The name of the character style that is used for the line number. */
  var CharStyleName: java.lang.String
  /** If `TRUE` , empty lines are counted. */
  var CountEmptyLines: scala.Boolean
  /** If `TRUE` , lines in frames are included in counting. */
  var CountLinesInFrames: scala.Boolean
  /** specifies the distance between the line number and the start or end of the text area. */
  var Distance: scala.Double
  /** Line numbers are shown on every **Interval** th line. */
  var Interval: scala.Double
  /** If `TRUE` , line numbering is used. */
  var IsOn: scala.Boolean
  /** specifies the position of the line number (constant LineNumberPositions left/right/inside/outside). */
  var NumberPosition: scala.Double
  /** specifies the type of the numbering. */
  var NumberingType: scala.Double
  /**
    * specifies if the line numbering should start from the beginning at each page.
    *
    * If set to `FALSE` the line numbering will be continuous.
    * @since OOo 2.0
    */
  var RestartAtEachPage: scala.Boolean
  /** The line separator is shown every **SeparatorInterval** th line. */
  var SeparatorInterval: scala.Double
  /** specifies the string that is used for the line separator. */
  var SeparatorText: java.lang.String
}

object LineNumberingProperties {
  @scala.inline
  def apply(
    CharStyleName: java.lang.String,
    CountEmptyLines: scala.Boolean,
    CountLinesInFrames: scala.Boolean,
    Distance: scala.Double,
    Interval: scala.Double,
    IsOn: scala.Boolean,
    NumberPosition: scala.Double,
    NumberingType: scala.Double,
    RestartAtEachPage: scala.Boolean,
    SeparatorInterval: scala.Double,
    SeparatorText: java.lang.String
  ): LineNumberingProperties = {
    val __obj = js.Dynamic.literal(CharStyleName = CharStyleName, CountEmptyLines = CountEmptyLines, CountLinesInFrames = CountLinesInFrames, Distance = Distance, Interval = Interval, IsOn = IsOn, NumberPosition = NumberPosition, NumberingType = NumberingType, RestartAtEachPage = RestartAtEachPage, SeparatorInterval = SeparatorInterval, SeparatorText = SeparatorText)
  
    __obj.asInstanceOf[LineNumberingProperties]
  }
}


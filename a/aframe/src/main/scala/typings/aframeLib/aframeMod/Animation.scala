package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var attribute: java.lang.String
  var begin: java.lang.String | scala.Double
  var delay: scala.Double
  var direction: aframeLib.aframeLibStrings.alternate | aframeLib.aframeLibStrings.alternateReverse | aframeLib.aframeLibStrings.normal | aframeLib.aframeLibStrings.reverse
  var dur: scala.Double
  var end: java.lang.String
  var fill: aframeLib.aframeLibStrings.backwards | aframeLib.aframeLibStrings.both | aframeLib.aframeLibStrings.forwards | aframeLib.aframeLibStrings.none
  var from: js.Any
   // TODO type
  var repeat: scala.Double | aframeLib.aframeLibStrings.indefinite
  var to: scala.Double
  def easing(): scala.Unit
}

object Animation {
  @scala.inline
  def apply(
    attribute: java.lang.String,
    begin: java.lang.String | scala.Double,
    delay: scala.Double,
    direction: aframeLib.aframeLibStrings.alternate | aframeLib.aframeLibStrings.alternateReverse | aframeLib.aframeLibStrings.normal | aframeLib.aframeLibStrings.reverse,
    dur: scala.Double,
    easing: () => scala.Unit,
    end: java.lang.String,
    fill: aframeLib.aframeLibStrings.backwards | aframeLib.aframeLibStrings.both | aframeLib.aframeLibStrings.forwards | aframeLib.aframeLibStrings.none,
    from: js.Any,
    repeat: scala.Double | aframeLib.aframeLibStrings.indefinite,
    to: scala.Double
  ): Animation = {
    val __obj = js.Dynamic.literal(attribute = attribute, begin = begin.asInstanceOf[js.Any], delay = delay, direction = direction.asInstanceOf[js.Any], dur = dur, easing = js.Any.fromFunction0(easing), end = end, fill = fill.asInstanceOf[js.Any], from = from, repeat = repeat.asInstanceOf[js.Any], to = to)
  
    __obj.asInstanceOf[Animation]
  }
}


package typings.aframe.mod

import typings.aframe.aframeStrings.alternate
import typings.aframe.aframeStrings.alternateReverse
import typings.aframe.aframeStrings.backwards
import typings.aframe.aframeStrings.both
import typings.aframe.aframeStrings.forwards
import typings.aframe.aframeStrings.indefinite
import typings.aframe.aframeStrings.none
import typings.aframe.aframeStrings.normal
import typings.aframe.aframeStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var attribute: String
  var begin: String | Double
  var delay: Double
  var direction: alternate | alternateReverse | normal | reverse
  var dur: Double
  var end: String
  var fill: backwards | both | forwards | none
  var from: js.Any
   // TODO type
  var repeat: Double | indefinite
  var to: Double
  def easing(): Unit
}

object Animation {
  @scala.inline
  def apply(
    attribute: String,
    begin: String | Double,
    delay: Double,
    direction: alternate | alternateReverse | normal | reverse,
    dur: Double,
    easing: () => Unit,
    end: String,
    fill: backwards | both | forwards | none,
    from: js.Any,
    repeat: Double | indefinite,
    to: Double
  ): Animation = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], easing = js.Any.fromFunction0(easing), end = end.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Animation]
  }
}


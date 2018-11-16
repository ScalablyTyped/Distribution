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


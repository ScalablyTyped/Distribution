package typings
package aframeLib.aframeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Custom elements augment document methods to return custom HTML
	 */
@js.native
trait Document extends js.Object {
  def createElement(tagName: java.lang.String): aframeLib.aframeMod.Entity[
    aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
  ] = js.native
  def querySelector(selectors: java.lang.String): aframeLib.aframeMod.Entity[_] = js.native
  def querySelectorAll(selectors: java.lang.String): stdLib.NodeListOf[aframeLib.aframeMod.Entity[_] | stdLib.Element] = js.native
  @JSName("querySelector")
  def querySelector_ascene(selectors: aframeLib.aframeLibStrings.`a-scene`): aframeLib.aframeMod.Scene = js.native
}


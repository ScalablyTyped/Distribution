package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aframe.aframeStrings.`enter-vr`
  - typings.aframe.aframeStrings.`exit-vr`
  - typings.aframe.aframeStrings.loaded
  - typings.aframe.aframeStrings.renderstart
*/
trait SceneEvents extends js.Object

object SceneEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `enter-vr`: typings.aframe.aframeStrings.`enter-vr` = this.cast("enter-vr")
  @scala.inline
  def `exit-vr`: typings.aframe.aframeStrings.`exit-vr` = this.cast("exit-vr")
  @scala.inline
  def loaded: typings.aframe.aframeStrings.loaded = this.cast("loaded")
  @scala.inline
  def renderstart: typings.aframe.aframeStrings.renderstart = this.cast("renderstart")
}


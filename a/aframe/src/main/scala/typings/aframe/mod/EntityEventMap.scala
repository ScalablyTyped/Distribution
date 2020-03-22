package typings.aframe.mod

import typings.aframe.AnonComponentName
import typings.aframe.AnonEl
import typings.aframe.AnonId
import typings.aframe.AnonName
import typings.aframe.AnonState
import typings.std.EventListener
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityEventMap extends js.Object {
  var `child-attached`: DetailEvent[AnonEl] = js.native
  var `child-detached`: DetailEvent[AnonEl] = js.native
  var componentchanged: DetailEvent[AnonId] = js.native
  var componentremoved: DetailEvent[AnonName] = js.native
  @JSName("loaded")
  var loaded_Original: EventListener = js.native
  @JSName("pause")
  var pause_Original: EventListener = js.native
  @JSName("play")
  var play_Original: EventListener = js.native
  var schemachanged: DetailEvent[AnonComponentName] = js.native
  var stateadded: DetailEvent[AnonState] = js.native
  var stateremoved: DetailEvent[AnonState] = js.native
  def loaded(evt: Event_): Unit = js.native
  def pause(evt: Event_): Unit = js.native
  def play(evt: Event_): Unit = js.native
}


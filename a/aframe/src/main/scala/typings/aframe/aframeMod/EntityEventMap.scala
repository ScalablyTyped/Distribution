package typings.aframe.aframeMod

import typings.aframe.Anon_ComponentName
import typings.aframe.Anon_El
import typings.aframe.Anon_Id
import typings.aframe.Anon_IdName
import typings.aframe.Anon_State
import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityEventMap extends js.Object {
  var `child-attached`: DetailEvent[Anon_El] = js.native
  var `child-detached`: DetailEvent[Anon_El] = js.native
  var componentchanged: DetailEvent[Anon_Id] = js.native
  var componentremoved: DetailEvent[Anon_IdName] = js.native
  @JSName("loaded")
  var loaded_Original: EventListener = js.native
  @JSName("pause")
  var pause_Original: EventListener = js.native
  @JSName("play")
  var play_Original: EventListener = js.native
  var schemachanged: DetailEvent[Anon_ComponentName] = js.native
  var stateadded: DetailEvent[Anon_State] = js.native
  var stateremoved: DetailEvent[Anon_State] = js.native
  def loaded(evt: Event): Unit = js.native
  def pause(evt: Event): Unit = js.native
  def play(evt: Event): Unit = js.native
}


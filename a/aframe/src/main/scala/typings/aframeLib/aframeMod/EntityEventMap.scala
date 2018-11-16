package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityEventMap extends js.Object {
  var `child-attached`: DetailEvent[aframeLib.Anon_ElElement] = js.native
  var `child-detached`: DetailEvent[aframeLib.Anon_ElElement] = js.native
  var componentchanged: DetailEvent[aframeLib.Anon_Name] = js.native
  var componentremoved: DetailEvent[aframeLib.Anon_NameOldData] = js.native
  @JSName("loaded")
  var loaded_Original: stdLib.EventListener = js.native
  @JSName("pause")
  var pause_Original: stdLib.EventListener = js.native
  @JSName("play")
  var play_Original: stdLib.EventListener = js.native
  var schemachanged: DetailEvent[aframeLib.Anon_ComponentName] = js.native
  var stateadded: DetailEvent[aframeLib.Anon_State] = js.native
  var stateremoved: DetailEvent[aframeLib.Anon_State] = js.native
  def loaded(evt: stdLib.Event): scala.Unit = js.native
  def pause(evt: stdLib.Event): scala.Unit = js.native
  def play(evt: stdLib.Event): scala.Unit = js.native
}


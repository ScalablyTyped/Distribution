package typings.aframe.mod

import typings.aframe.aframeStrings.`child-attached`
import typings.aframe.aframeStrings.`child-detached`
import typings.aframe.aframeStrings.componentchanged
import typings.aframe.aframeStrings.componentinitialized
import typings.aframe.aframeStrings.componentremoved
import typings.aframe.aframeStrings.loaded
import typings.aframe.aframeStrings.pause
import typings.aframe.aframeStrings.play
import typings.aframe.aframeStrings.position
import typings.aframe.aframeStrings.rotation
import typings.aframe.aframeStrings.scale
import typings.aframe.aframeStrings.schemachanged
import typings.aframe.aframeStrings.stateadded
import typings.aframe.aframeStrings.stateremoved
import typings.aframe.anon.ComponentName
import typings.aframe.anon.Data
import typings.aframe.anon.El
import typings.aframe.anon.Id
import typings.aframe.anon.Name
import typings.aframe.anon.State
import typings.std.Event
import typings.std.EventListener
import typings.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity[C]
  extends StObject
     with ANode {
  
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_childattached(`type`: `child-attached`, listener: js.Function1[/* event */ Event & DetailEvent[El], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_childattached(
    `type`: `child-attached`,
    listener: js.Function1[/* event */ Event & DetailEvent[El], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_childdetached(`type`: `child-detached`, listener: js.Function1[/* event */ Event & DetailEvent[El], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_childdetached(
    `type`: `child-detached`,
    listener: js.Function1[/* event */ Event & DetailEvent[El], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentchanged(`type`: componentchanged, listener: js.Function1[/* event */ Event & DetailEvent[Id], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentchanged(
    `type`: componentchanged,
    listener: js.Function1[/* event */ Event & DetailEvent[Id], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentinitialized(`type`: componentinitialized, listener: js.Function1[/* event */ Event & DetailEvent[Data], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentinitialized(
    `type`: componentinitialized,
    listener: js.Function1[/* event */ Event & DetailEvent[Data], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentremoved(`type`: componentremoved, listener: js.Function1[/* event */ Event & DetailEvent[Name], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentremoved(
    `type`: componentremoved,
    listener: js.Function1[/* event */ Event & DetailEvent[Name], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loaded(`type`: loaded, listener: js.Function1[/* event */ Event & EventListener, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loaded(
    `type`: loaded,
    listener: js.Function1[/* event */ Event & EventListener, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.Function1[/* event */ Event & EventListener, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.Function1[/* event */ Event & EventListener, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.Function1[/* event */ Event & EventListener, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.Function1[/* event */ Event & EventListener, Unit], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_schemachanged(
    `type`: schemachanged,
    listener: js.Function1[/* event */ Event & DetailEvent[ComponentName], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_schemachanged(
    `type`: schemachanged,
    listener: js.Function1[/* event */ Event & DetailEvent[ComponentName], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateadded(`type`: stateadded, listener: js.Function1[/* event */ Event & DetailEvent[State], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateadded(
    `type`: stateadded,
    listener: js.Function1[/* event */ Event & DetailEvent[State], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateremoved(`type`: stateremoved, listener: js.Function1[/* event */ Event & DetailEvent[State], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateremoved(
    `type`: stateremoved,
    listener: js.Function1[/* event */ Event & DetailEvent[State], Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  def addState(name: String): Unit = js.native
  
  var components: C & DefaultComponents = js.native
  
  def destroy(): Unit = js.native
  
  def flushToDOM(): Unit = js.native
  def flushToDOM(recursive: Boolean): Unit = js.native
  
  @JSName("getAttribute")
  def getAttribute_position(`type`: position): Coordinate = js.native
  @JSName("getAttribute")
  def getAttribute_rotation(`type`: rotation): Coordinate = js.native
  @JSName("getAttribute")
  def getAttribute_scale(`type`: scale): Coordinate = js.native
  
  /**
    * @deprecated since 0.4.0
    */
  def getComputedAttribute(attr: String): Component[js.Any, System[js.Any]] = js.native
  
  def getDOMAttribute(attr: String): js.Any = js.native
  
  def getObject3D(`type`: String): Object3D = js.native
  
  def getOrCreateObject3D(`type`: String, construct: js.Any): Object3D = js.native
  
  def is(stateName: String): Boolean = js.native
  
  var isPlaying: Boolean = js.native
  
  var object3D: Object3D = js.native
  
  var object3DMap: ObjectMap[Object3D] = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def removeAttribute(attr: String, property: String): Unit = js.native
  
  def removeObject3D(`type`: String): Unit = js.native
  
  def removeState(stateName: String): Unit = js.native
  
  var sceneEl: js.UndefOr[Scene] = js.native
  
  def setAttribute(attr: String, property: String, componentAttrValue: js.Any): Unit = js.native
  @JSName("setAttribute")
  def setAttribute_position(`type`: position, value: Coordinate): Unit = js.native
  @JSName("setAttribute")
  def setAttribute_rotation(`type`: rotation, value: Coordinate): Unit = js.native
  @JSName("setAttribute")
  def setAttribute_scale(`type`: scale, value: Coordinate): Unit = js.native
  
  def setObject3D(`type`: String, obj: Object3D): Unit = js.native
}

package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entity[C] extends ANode {
  var components: C with DefaultComponents = js.native
  var isPlaying: scala.Boolean = js.native
  var object3D: threeLib.threeMod.Object3D = js.native
  var object3DMap: ObjectMap[threeLib.threeMod.Object3D] = js.native
  var sceneEl: js.UndefOr[Scene] = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def `addEventListener_child-attached`(
    `type`: aframeLib.aframeLibStrings.`child-attached`,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_El], scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def `addEventListener_child-attached`(
    `type`: aframeLib.aframeLibStrings.`child-attached`,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_El], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def `addEventListener_child-detached`(
    `type`: aframeLib.aframeLibStrings.`child-detached`,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_El], scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def `addEventListener_child-detached`(
    `type`: aframeLib.aframeLibStrings.`child-detached`,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_El], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_componentchanged(
    `type`: aframeLib.aframeLibStrings.componentchanged,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_Id], scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentchanged(
    `type`: aframeLib.aframeLibStrings.componentchanged,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_Id], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_componentremoved(
    `type`: aframeLib.aframeLibStrings.componentremoved,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_IdName], scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentremoved(
    `type`: aframeLib.aframeLibStrings.componentremoved,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_IdName], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_loaded(
    `type`: aframeLib.aframeLibStrings.loaded,
    listener: js.Function1[/* event */ stdLib.Event with stdLib.EventListener, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loaded(
    `type`: aframeLib.aframeLibStrings.loaded,
    listener: js.Function1[/* event */ stdLib.Event with stdLib.EventListener, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: aframeLib.aframeLibStrings.pause,
    listener: js.Function1[/* event */ stdLib.Event with stdLib.EventListener, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: aframeLib.aframeLibStrings.pause,
    listener: js.Function1[/* event */ stdLib.Event with stdLib.EventListener, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: aframeLib.aframeLibStrings.play,
    listener: js.Function1[/* event */ stdLib.Event with stdLib.EventListener, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: aframeLib.aframeLibStrings.play,
    listener: js.Function1[/* event */ stdLib.Event with stdLib.EventListener, scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_schemachanged(
    `type`: aframeLib.aframeLibStrings.schemachanged,
    listener: js.Function1[
      /* event */ stdLib.Event with DetailEvent[aframeLib.Anon_ComponentName], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_schemachanged(
    `type`: aframeLib.aframeLibStrings.schemachanged,
    listener: js.Function1[
      /* event */ stdLib.Event with DetailEvent[aframeLib.Anon_ComponentName], 
      scala.Unit
    ],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_stateadded(
    `type`: aframeLib.aframeLibStrings.stateadded,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_State], scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateadded(
    `type`: aframeLib.aframeLibStrings.stateadded,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_State], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_stateremoved(
    `type`: aframeLib.aframeLibStrings.stateremoved,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_State], scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateremoved(
    `type`: aframeLib.aframeLibStrings.stateremoved,
    listener: js.Function1[/* event */ stdLib.Event with DetailEvent[aframeLib.Anon_State], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def addState(name: java.lang.String): scala.Unit = js.native
  def flushToDOM(): scala.Unit = js.native
  def flushToDOM(recursive: scala.Boolean): scala.Unit = js.native
  @JSName("getAttribute")
  def getAttribute_position(`type`: aframeLib.aframeLibStrings.position): Coordinate = js.native
  @JSName("getAttribute")
  def getAttribute_rotation(`type`: aframeLib.aframeLibStrings.rotation): Coordinate = js.native
  @JSName("getAttribute")
  def getAttribute_scale(`type`: aframeLib.aframeLibStrings.scale): Coordinate = js.native
  /**
  	 * @deprecated since 0.4.0
  	 */
  def getComputedAttribute(attr: java.lang.String): Component[_, System[_]] = js.native
  def getDOMAttribute(attr: java.lang.String): js.Any = js.native
  def getObject3D(`type`: java.lang.String): threeLib.threeMod.Object3D = js.native
  def getOrCreateObject3D(`type`: java.lang.String, construct: js.Any): threeLib.threeMod.Object3D = js.native
  def is(stateName: java.lang.String): scala.Boolean = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def removeAttribute(attr: java.lang.String, property: java.lang.String): scala.Unit = js.native
  def removeObject3D(`type`: java.lang.String): scala.Unit = js.native
  def removeState(stateName: java.lang.String): scala.Unit = js.native
  def setAttribute(attr: java.lang.String, property: java.lang.String, componentAttrValue: js.Any): scala.Unit = js.native
  @JSName("setAttribute")
  def setAttribute_position(`type`: aframeLib.aframeLibStrings.position, value: Coordinate): scala.Unit = js.native
  @JSName("setAttribute")
  def setAttribute_rotation(`type`: aframeLib.aframeLibStrings.rotation, value: Coordinate): scala.Unit = js.native
  @JSName("setAttribute")
  def setAttribute_scale(`type`: aframeLib.aframeLibStrings.scale, value: Coordinate): scala.Unit = js.native
  def setObject3D(`type`: java.lang.String, obj: threeLib.threeMod.Object3D): scala.Unit = js.native
}


package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene
  extends Entity[ObjectMap[Component[js.Any, System[js.Any]]]] {
  var behaviors: js.Array[Behavior] = js.native
  var camera: threeLib.threeMod.Camera = js.native
  var canvas: stdLib.HTMLCanvasElement = js.native
  var effect: threeLib.threeMod.VREffect = js.native
  var isMobile: scala.Boolean = js.native
  @JSName("object3D")
  var object3D_Scene: threeLib.threeMod.Scene = js.native
  var renderStarted: scala.Boolean = js.native
  var renderer: threeLib.threeMod.WebGLRenderer = js.native
  var systems: ObjectMap[System[_]] = js.native
  var time: scala.Double = js.native
  def addEventListener(`type`: SceneEvents, listener: stdLib.EventListener): scala.Unit = js.native
  def addEventListener(`type`: SceneEvents, listener: stdLib.EventListener, useCapture: scala.Boolean): scala.Unit = js.native
  def enterVR(): js.Promise[scala.Unit] | scala.Unit = js.native
  def exitVR(): js.Promise[scala.Unit] | scala.Unit = js.native
  def reload(): scala.Unit = js.native
}


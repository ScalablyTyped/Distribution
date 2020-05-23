package typings.aframe.mod

import typings.std.EventListener
import typings.std.HTMLCanvasElement
import typings.three.mod.Camera
import typings.three.mod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene
  extends Entity[ObjectMap[Component[js.Any, System[js.Any]]]] {
  var behaviors: js.Array[Behavior] = js.native
  var camera: Camera = js.native
  var canvas: HTMLCanvasElement = js.native
  var effect: js.UndefOr[js.Any] = js.native
  var isMobile: Boolean = js.native
  @JSName("object3D")
  var object3D_Scene: typings.three.mod.Scene = js.native
  var renderStarted: Boolean = js.native
  var renderer: WebGLRenderer = js.native
   // THREE.VREffect
  var systems: ObjectMap[System[_]] = js.native
  var time: Double = js.native
  def addEventListener(`type`: SceneEvents, listener: EventListener): Unit = js.native
  def addEventListener(`type`: SceneEvents, listener: EventListener, useCapture: Boolean): Unit = js.native
  def enterVR(): js.Promise[Unit] | Unit = js.native
  def exitVR(): js.Promise[Unit] | Unit = js.native
  def reload(): Unit = js.native
}


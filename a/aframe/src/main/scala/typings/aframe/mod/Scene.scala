package typings.aframe.mod

import typings.std.EventListener
import typings.std.HTMLCanvasElement
import typings.three.buildThreeDotmoduleDotminMod.Camera
import typings.three.buildThreeDotmoduleDotminMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scene
  extends StObject
     with Entity[ObjectMap[Component[Any, System[Any]]]] {
  
  def addEventListener(`type`: SceneEvents, listener: EventListener): Unit = js.native
  def addEventListener(`type`: SceneEvents, listener: EventListener, useCapture: Boolean): Unit = js.native
  
  var behaviors: js.Array[Behavior] = js.native
  
  var camera: Camera = js.native
  
  var canvas: HTMLCanvasElement = js.native
  
  var effect: js.UndefOr[Any] = js.native
  
  def enterVR(): js.Promise[Unit] | Unit = js.native
  
  def exitVR(): js.Promise[Unit] | Unit = js.native
  
  var isMobile: Boolean = js.native
  
  @JSName("object3D")
  var object3D_Scene: typings.three.buildThreeDotmoduleDotminMod.Scene = js.native
  
  def reload(): Unit = js.native
  
  var renderStarted: Boolean = js.native
  
  var renderer: WebGLRenderer = js.native
  
  // THREE.VREffect
  var systems: ObjectMap[System[Any]] = js.native
  
  var time: Double = js.native
}

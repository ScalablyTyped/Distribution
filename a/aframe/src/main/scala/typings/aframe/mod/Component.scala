package typings.aframe.mod

import typings.three.buildThreeDotmoduleDotminMod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component[T /* <: js.Object */, S /* <: System[Any] */] extends StObject {
  
  var attrName: js.UndefOr[String] = js.native
  
  var data: T = js.native
  
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  
  var el: Entity[ObjectMap[Component[Any, System[Any]]]] = js.native
  
  var events: js.UndefOr[Any] = js.native
  
  def extendSchema(update: Schema_[js.Object]): Unit = js.native
  
  def flushToDOM(): Unit = js.native
  
  var id: String = js.native
  
  def init(): Unit = js.native
  def init(data: T): Unit = js.native
  
  var initialized: Boolean = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def remove(): Unit = js.native
  
  var schema: Schema_[T] = js.native
  
  var system: js.UndefOr[S] = js.native
  
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.native
  
  var tock: js.UndefOr[
    js.Function3[/* time */ Double, /* timeDelta */ Double, /* camera */ Camera, Unit]
  ] = js.native
  
  def update(oldData: T): Unit = js.native
  
  var updateSchema: js.UndefOr[js.Function0[Unit]] = js.native
}

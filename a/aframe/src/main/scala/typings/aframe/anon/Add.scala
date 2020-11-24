package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.aframe.aframeBooleans.`false`
import typings.std.Record
import typings.tweenjsTweenJs.mod.Group
import typings.tweenjsTweenJs.mod.Tween
import typings.tweenjsTweenJs.mod.UnknownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends js.Object {
  
  var Easing: typings.tweenjsTweenJs.anon.Back = js.native
  
  var Group: Instantiable0[typings.tweenjsTweenJs.mod.Group] = js.native
  
  var Interpolation: typings.tweenjsTweenJs.anon.Bezier = js.native
  
  var Sequence: typings.tweenjsTweenJs.anon.TypeofSequence = js.native
  
  var Tween: Instantiable2[
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* _object */ js.Any, 
    /* _group */ js.UndefOr[Group | `false`], 
    typings.tweenjsTweenJs.mod.Tween[UnknownProps]
  ] = js.native
  
  var VERSION: String = js.native
  
  def add(tween: Tween[Record[String, _]]): Unit = js.native
  
  def getAll(): js.Array[Tween[Record[String, _]]] = js.native
  
  var nextId: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sequence.nextId */ js.Any = js.native
  
  def now(): Double = js.native
  
  def remove(tween: Tween[Record[String, _]]): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def update(): Boolean = js.native
  def update(time: js.UndefOr[scala.Nothing], preserve: Boolean): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}

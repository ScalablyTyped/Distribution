package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.aframe.aframeBooleans.`false`
import typings.std.Record
import typings.tweenjsTweenJs.anon.Back
import typings.tweenjsTweenJs.anon.Bezier
import typings.tweenjsTweenJs.mod.Group
import typings.tweenjsTweenJs.mod.Tween
import typings.tweenjsTweenJs.mod.UnknownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeof extends StObject {
  
  var Easing: Back = js.native
  
  var Group: Instantiable0[typings.tweenjsTweenJs.mod.Group] = js.native
  
  var Interpolation: Bezier = js.native
  
  var Sequence: typings.tweenjsTweenJs.anon.TypeofSequence with Instantiable0[typings.tweenjsTweenJs.mod.Sequence] = js.native
  
  var Tween: Instantiable2[
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* _object */ js.Any, 
    /* _group */ js.UndefOr[Group | `false`], 
    typings.tweenjsTweenJs.mod.Tween[UnknownProps]
  ] = js.native
  
  var VERSION: String = js.native
  
  def add(tween: Tween[Record[String, _]]): Unit = js.native
  
  def getAll(): js.Array[Tween[Record[String, _]]] = js.native
  
  def nextId(): Double = js.native
  @JSName("nextId")
  var nextId_Original: js.Function0[Double] = js.native
  
  def now(): Double = js.native
  
  def remove(tween: Tween[Record[String, _]]): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def update(): Boolean = js.native
  def update(time: js.UndefOr[scala.Nothing], preserve: Boolean): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}

package typings.aframe.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.aframe.anon.TypeofEasing
import typings.aframe.anon.TypeofInterpolation
import typings.aframe.anon.TypeofSequence
import typings.aframe.anon.Typeofdefault
import typings.std.Record
import typings.tweenjsTweenJs.mod.Tween
import typings.tweenjsTweenJs.mod.UnknownProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TweenLib extends StObject {
  
  val default: Typeofdefault = js.native
  
  /**
    * The Ease class provides a collection of easing functions for use with tween.js.
    */
  val Easing: TypeofEasing = js.native
  
  /**
    * Controlling groups of tweens
    *
    * Using the TWEEN singleton to manage your tweens can cause issues in large apps with many components.
    * In these cases, you may want to create your own smaller groups of tween
    */
  var Group: Instantiable0[typings.tweenjsTweenJs.mod.Group] = js.native
  
  /**
    *
    */
  val Interpolation: TypeofInterpolation = js.native
  
  /**
    * Utils
    */
  val Sequence: TypeofSequence & Instantiable0[typings.tweenjsTweenJs.mod.Sequence] = js.native
  
  var Tween: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* _object */ js.Any, 
    typings.tweenjsTweenJs.mod.Tween[UnknownProps]
  ] = js.native
  
  val VERSION: /* "18.6.4" */ String = js.native
  
  def add(tween: Tween[Record[String, js.Any]]): Unit = js.native
  
  def getAll(): js.Array[Tween[Record[String, js.Any]]] = js.native
  
  /* static member */
  /* was `typeof Sequence.nextId` */
  def nextId(): Double = js.native
  
  def now(): Double = js.native
  @JSName("now")
  var now_Original: js.Function0[Double] = js.native
  
  def remove(tween: Tween[Record[String, js.Any]]): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def update(): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
  def update(time: Unit, preserve: Boolean): Boolean = js.native
}

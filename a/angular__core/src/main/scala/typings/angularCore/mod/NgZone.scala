package typings.angularCore.mod

import typings.angularCore.anon.EnableLongStackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "NgZone")
@js.native
open class NgZone protected () extends StObject {
  def this(param0: EnableLongStackTrace) = this()
  
  val hasPendingMacrotasks: Boolean = js.native
  
  val hasPendingMicrotasks: Boolean = js.native
  
  /**
    * Whether there are no outstanding microtasks or macrotasks.
    */
  val isStable: Boolean = js.native
  
  /**
    * Notifies that an error has been delivered.
    */
  val onError: EventEmitter[Any] = js.native
  
  /**
    * Notifies when there is no more microtasks enqueued in the current VM Turn.
    * This is a hint for Angular to do change detection, which may enqueue more microtasks.
    * For this reason this event can fire multiple times per VM Turn.
    */
  val onMicrotaskEmpty: EventEmitter[Any] = js.native
  
  /**
    * Notifies when the last `onMicrotaskEmpty` has run and there are no more microtasks, which
    * implies we are about to relinquish VM turn.
    * This event gets called just once.
    */
  val onStable: EventEmitter[Any] = js.native
  
  /**
    * Notifies when code enters Angular Zone. This gets fired first on VM Turn.
    */
  val onUnstable: EventEmitter[Any] = js.native
  
  /**
    * Executes the `fn` function synchronously within the Angular zone and returns value returned by
    * the function.
    *
    * Running functions via `run` allows you to reenter Angular zone from a task that was executed
    * outside of the Angular zone (typically started via {@link #runOutsideAngular}).
    *
    * Any future tasks or microtasks scheduled from within this function will continue executing from
    * within the Angular zone.
    *
    * If a synchronous error happens it will be rethrown and not reported via `onError`.
    */
  def run[T](fn: js.Function1[/* repeated */ Any, T]): T = js.native
  def run[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any): T = js.native
  def run[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any, applyArgs: js.Array[Any]): T = js.native
  def run[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Unit, applyArgs: js.Array[Any]): T = js.native
  
  /**
    * Same as `run`, except that synchronous errors are caught and forwarded via `onError` and not
    * rethrown.
    */
  def runGuarded[T](fn: js.Function1[/* repeated */ Any, T]): T = js.native
  def runGuarded[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any): T = js.native
  def runGuarded[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any, applyArgs: js.Array[Any]): T = js.native
  def runGuarded[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Unit, applyArgs: js.Array[Any]): T = js.native
  
  /**
    * Executes the `fn` function synchronously in Angular's parent zone and returns value returned by
    * the function.
    *
    * Running functions via {@link #runOutsideAngular} allows you to escape Angular's zone and do
    * work that
    * doesn't trigger Angular change-detection or is subject to Angular's error handling.
    *
    * Any future tasks or microtasks scheduled from within this function will continue executing from
    * outside of the Angular zone.
    *
    * Use {@link #run} to reenter the Angular zone and do work that updates the application model.
    */
  def runOutsideAngular[T](fn: js.Function1[/* repeated */ Any, T]): T = js.native
  
  /**
    * Executes the `fn` function synchronously within the Angular zone as a task and returns value
    * returned by the function.
    *
    * Running functions via `run` allows you to reenter Angular zone from a task that was executed
    * outside of the Angular zone (typically started via {@link #runOutsideAngular}).
    *
    * Any future tasks or microtasks scheduled from within this function will continue executing from
    * within the Angular zone.
    *
    * If a synchronous error happens it will be rethrown and not reported via `onError`.
    */
  def runTask[T](fn: js.Function1[/* repeated */ Any, T]): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any, applyArgs: js.Array[Any]): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any, applyArgs: js.Array[Any], name: String): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Any, applyArgs: Unit, name: String): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Unit, applyArgs: js.Array[Any]): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Unit, applyArgs: js.Array[Any], name: String): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ Any, T], applyThis: Unit, applyArgs: Unit, name: String): T = js.native
}
/* static members */
object NgZone {
  
  @JSImport("@angular/core", "NgZone")
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertInAngularZone(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertInAngularZone")().asInstanceOf[Unit]
  
  inline def assertNotInAngularZone(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNotInAngularZone")().asInstanceOf[Unit]
  
  inline def isInAngularZone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInAngularZone")().asInstanceOf[Boolean]
}

package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "NgZone")
@js.native
class NgZone protected () extends js.Object {
  def this(hasEnableLongStackTrace: atAngularCoreLib.Anon_EnableLongStackTrace) = this()
  val hasPendingMacrotasks: scala.Boolean = js.native
  val hasPendingMicrotasks: scala.Boolean = js.native
  /**
    * Whether there are no outstanding microtasks or macrotasks.
    */
  val isStable: scala.Boolean = js.native
  /**
    * Notifies that an error has been delivered.
    */
  val onError: EventEmitter[_] = js.native
  /**
    * Notifies when there is no more microtasks enqueued in the current VM Turn.
    * This is a hint for Angular to do change detection, which may enqueue more microtasks.
    * For this reason this event can fire multiple times per VM Turn.
    */
  val onMicrotaskEmpty: EventEmitter[_] = js.native
  /**
    * Notifies when the last `onMicrotaskEmpty` has run and there are no more microtasks, which
    * implies we are about to relinquish VM turn.
    * This event gets called just once.
    */
  val onStable: EventEmitter[_] = js.native
  /**
    * Notifies when code enters Angular Zone. This gets fired first on VM Turn.
    */
  val onUnstable: EventEmitter[_] = js.native
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
  def run[T](fn: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def run[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: js.Any): T = js.native
  def run[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: js.Any, applyArgs: js.Array[_]): T = js.native
  /**
    * Same as `run`, except that synchronous errors are caught and forwarded via `onError` and not
    * rethrown.
    */
  def runGuarded[T](fn: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def runGuarded[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: js.Any): T = js.native
  def runGuarded[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: js.Any, applyArgs: js.Array[_]): T = js.native
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
  def runOutsideAngular[T](fn: js.Function1[/* repeated */ js.Any, T]): T = js.native
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
  def runTask[T](fn: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: js.Any): T = js.native
  def runTask[T](fn: js.Function1[/* repeated */ js.Any, T], applyThis: js.Any, applyArgs: js.Array[_]): T = js.native
  def runTask[T](
    fn: js.Function1[/* repeated */ js.Any, T],
    applyThis: js.Any,
    applyArgs: js.Array[_],
    name: java.lang.String
  ): T = js.native
}

/* static members */
@JSImport("@angular/core", "NgZone")
@js.native
object NgZone extends js.Object {
  def assertInAngularZone(): scala.Unit = js.native
  def assertNotInAngularZone(): scala.Unit = js.native
  def isInAngularZone(): scala.Boolean = js.native
}


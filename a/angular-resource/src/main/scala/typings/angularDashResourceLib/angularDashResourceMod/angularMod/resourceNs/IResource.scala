package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance calls always return the the promise of the request which retrieved the object
// https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L538-L546
@js.native
trait IResource[T] extends js.Object {
  /** The promise of the original server interaction that created this instance. */
  @JSName("$promise")
  var $promise: angularLib.angularMod.IPromise[T] = js.native
  @JSName("$resolved")
  var $resolved: scala.Boolean = js.native
  @JSName("$cancelRequest")
  def $cancelRequest(): scala.Unit = js.native
  @JSName("$delete")
  def $delete(): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(
    params: js.Object,
    success: angularLib.angularMod.Global.Function,
    error: angularLib.angularMod.Global.Function
  ): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(success: angularLib.angularMod.Global.Function, error: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object, success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(
    params: js.Object,
    success: angularLib.angularMod.Global.Function,
    error: angularLib.angularMod.Global.Function
  ): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(success: angularLib.angularMod.Global.Function, error: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$query")
  def $query(): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object, success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(
    params: js.Object,
    success: angularLib.angularMod.Global.Function,
    error: angularLib.angularMod.Global.Function
  ): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(success: angularLib.angularMod.Global.Function, error: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$remove")
  def $remove(): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(
    params: js.Object,
    success: angularLib.angularMod.Global.Function,
    error: angularLib.angularMod.Global.Function
  ): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(success: angularLib.angularMod.Global.Function, error: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object, success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(
    params: js.Object,
    success: angularLib.angularMod.Global.Function,
    error: angularLib.angularMod.Global.Function
  ): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(success: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(success: angularLib.angularMod.Global.Function, error: angularLib.angularMod.Global.Function): angularLib.angularMod.IPromise[T] = js.native
  def toJSON(): T = js.native
}


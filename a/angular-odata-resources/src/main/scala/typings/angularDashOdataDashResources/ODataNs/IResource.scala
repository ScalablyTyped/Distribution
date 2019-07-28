package typings.angularDashOdataDashResources.ODataNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance calls always return the the promise of the request which retrieved the object
// https://github.com/angular/angular.js/blob/v1.2.0/src/ngResource/resource.js#L538-L546
@js.native
trait IResource[T] extends js.Object {
  /** the promise of the original server interaction that created this instance. **/
  @JSName("$promise")
  var $promise: IPromise[T] = js.native
  @JSName("$resolved")
  var $resolved: Boolean = js.native
  @JSName("$delete")
  def $delete(): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: js.Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: js.Function, error: js.Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(success: js.Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(success: js.Function, error: js.Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object, success: js.Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object, success: js.Function, error: js.Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(success: js.Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(success: js.Function, error: js.Function): IPromise[T] = js.native
  @JSName("$query")
  def $query(): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object, success: js.Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object, success: js.Function, error: js.Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(success: js.Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(success: js.Function, error: js.Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$remove")
  def $remove(): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: js.Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: js.Function, error: js.Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(success: js.Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(success: js.Function, error: js.Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object, success: js.Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object, success: js.Function, error: js.Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(success: js.Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(success: js.Function, error: js.Function): IPromise[T] = js.native
  @JSName("$update")
  def $update(): IPromise[T] = js.native
  @JSName("$update")
  def $update(params: js.Object): IPromise[T] = js.native
  @JSName("$update")
  def $update(params: js.Object, success: js.Function): IPromise[T] = js.native
  @JSName("$update")
  def $update(params: js.Object, success: js.Function, error: js.Function): IPromise[T] = js.native
  @JSName("$update")
  def $update(success: js.Function): IPromise[T] = js.native
  @JSName("$update")
  def $update(success: js.Function, error: js.Function): IPromise[T] = js.native
}


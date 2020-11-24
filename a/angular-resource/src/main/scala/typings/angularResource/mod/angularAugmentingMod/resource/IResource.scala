package typings.angularResource.mod.angularAugmentingMod.resource

import typings.angular.mod.IPromise
import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Instance calls always return the the promise of the request which retrieved the object
// https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L538-L546
@js.native
trait IResource[T] extends js.Object {
  
  @JSName("$cancelRequest")
  def $cancelRequest(): Unit = js.native
  
  @JSName("$delete")
  def $delete(): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.UndefOr[scala.Nothing], success: js.UndefOr[scala.Nothing], error: Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.UndefOr[scala.Nothing], success: Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.UndefOr[scala.Nothing], success: Function, error: Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: js.UndefOr[scala.Nothing], error: Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: Function, error: Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(success: Function): IPromise[T] = js.native
  @JSName("$delete")
  def $delete(success: Function, error: Function): IPromise[T] = js.native
  
  @JSName("$get")
  def $get(): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.UndefOr[scala.Nothing], success: js.UndefOr[scala.Nothing], error: Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.UndefOr[scala.Nothing], success: Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.UndefOr[scala.Nothing], success: Function, error: Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object, success: js.UndefOr[scala.Nothing], error: Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object, success: Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object, success: Function, error: Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(success: Function): IPromise[T] = js.native
  @JSName("$get")
  def $get(success: Function, error: Function): IPromise[T] = js.native
  
  /** The promise of the original server interaction that created this instance. */
  @JSName("$promise")
  var $promise: IPromise[T] = js.native
  
  @JSName("$query")
  def $query(): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.UndefOr[scala.Nothing], success: js.UndefOr[scala.Nothing], error: Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.UndefOr[scala.Nothing], success: Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.UndefOr[scala.Nothing], success: Function, error: Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object, success: js.UndefOr[scala.Nothing], error: Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object, success: Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object, success: Function, error: Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(success: Function): IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(success: Function, error: Function): IPromise[IResourceArray[T]] = js.native
  
  @JSName("$remove")
  def $remove(): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.UndefOr[scala.Nothing], success: js.UndefOr[scala.Nothing], error: Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.UndefOr[scala.Nothing], success: Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.UndefOr[scala.Nothing], success: Function, error: Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: js.UndefOr[scala.Nothing], error: Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: Function, error: Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(success: Function): IPromise[T] = js.native
  @JSName("$remove")
  def $remove(success: Function, error: Function): IPromise[T] = js.native
  
  @JSName("$resolved")
  var $resolved: Boolean = js.native
  
  @JSName("$save")
  def $save(): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.UndefOr[scala.Nothing], success: js.UndefOr[scala.Nothing], error: Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.UndefOr[scala.Nothing], success: Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.UndefOr[scala.Nothing], success: Function, error: Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object, success: js.UndefOr[scala.Nothing], error: Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object, success: Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object, success: Function, error: Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(success: Function): IPromise[T] = js.native
  @JSName("$save")
  def $save(success: Function, error: Function): IPromise[T] = js.native
  
  def toJSON(): T = js.native
}

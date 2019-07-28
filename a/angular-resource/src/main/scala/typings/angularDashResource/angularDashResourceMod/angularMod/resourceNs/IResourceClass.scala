package typings.angularDashResource.angularDashResourceMod.angularMod.resourceNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.angular.angularMod.Global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Baseclass for everyresource with default actions.
// If you define your new actions for the resource, you will need
// to extend this interface and typecast the ResourceClass to it.
//
// In case of passing the first argument as anything but a function,
// it's gonna be considered data if the action method is POST, PUT or
// PATCH (in other words, methods with body). Otherwise, it's going
// to be considered as parameters to the request.
// https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L461-L465
//
// Only those methods with an HTTP body do have 'data' as first parameter:
// https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L463
// More specifically, those methods are POST, PUT and PATCH:
// https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L432
//
// Also, static calls always return the IResource (or IResourceArray) retrieved
// https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L538-L549
@js.native
trait IResourceClass[T]
  extends Instantiable0[T with IResource[T]]
     with Instantiable1[/* dataOrParams */ js.Any, T with IResource[T]] {
  @JSName("delete")
  var delete_Original: IResourceMethod[T] = js.native
  @JSName("get")
  var get_Original: IResourceMethod[T] = js.native
  @JSName("query")
  var query_Original: IResourceArrayMethod[T] = js.native
  @JSName("remove")
  var remove_Original: IResourceMethod[T] = js.native
  @JSName("save")
  var save_Original: IResourceMethod[T] = js.native
  def delete(): T = js.native
  def delete(params: js.Object): T = js.native
  def delete(params: js.Object, data: js.Object): T = js.native
  def delete(params: js.Object, data: js.Object, success: Function): T = js.native
  def delete(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
  def delete(params: js.Object, success: Function): T = js.native
  def delete(params: js.Object, success: Function, error: Function): T = js.native
  def delete(success: Function): T = js.native
  def delete(success: Function, error: Function): T = js.native
  def get(): T = js.native
  def get(params: js.Object): T = js.native
  def get(params: js.Object, data: js.Object): T = js.native
  def get(params: js.Object, data: js.Object, success: Function): T = js.native
  def get(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
  def get(params: js.Object, success: Function): T = js.native
  def get(params: js.Object, success: Function, error: Function): T = js.native
  def get(success: Function): T = js.native
  def get(success: Function, error: Function): T = js.native
  def query(): IResourceArray[T] = js.native
  def query(params: js.Object): IResourceArray[T] = js.native
  def query(params: js.Object, data: js.Object): IResourceArray[T] = js.native
  def query(params: js.Object, data: js.Object, success: Function): IResourceArray[T] = js.native
  def query(params: js.Object, data: js.Object, success: Function, error: Function): IResourceArray[T] = js.native
  def query(params: js.Object, success: Function): IResourceArray[T] = js.native
  def query(params: js.Object, success: Function, error: Function): IResourceArray[T] = js.native
  def query(success: Function): IResourceArray[T] = js.native
  def query(success: Function, error: Function): IResourceArray[T] = js.native
  def remove(): T = js.native
  def remove(params: js.Object): T = js.native
  def remove(params: js.Object, data: js.Object): T = js.native
  def remove(params: js.Object, data: js.Object, success: Function): T = js.native
  def remove(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
  def remove(params: js.Object, success: Function): T = js.native
  def remove(params: js.Object, success: Function, error: Function): T = js.native
  def remove(success: Function): T = js.native
  def remove(success: Function, error: Function): T = js.native
  def save(): T = js.native
  def save(params: js.Object): T = js.native
  def save(params: js.Object, data: js.Object): T = js.native
  def save(params: js.Object, data: js.Object, success: Function): T = js.native
  def save(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
  def save(params: js.Object, success: Function): T = js.native
  def save(params: js.Object, success: Function, error: Function): T = js.native
  def save(success: Function): T = js.native
  def save(success: Function, error: Function): T = js.native
}


package typings.angularDashOdataDashResources.OData

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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
// https://github.com/angular/angular.js/blob/v1.2.0/src/ngResource/resource.js#L461-L465
//
// Only those methods with an HTTP body do have 'data' as first parameter:
// https://github.com/angular/angular.js/blob/v1.2.0/src/ngResource/resource.js#L463
// More specifically, those methods are POST, PUT and PATCH:
// https://github.com/angular/angular.js/blob/v1.2.0/src/ngResource/resource.js#L432
//
// Also, static calls always return the IResource (or IResourceArray) retrieved
// https://github.com/angular/angular.js/blob/v1.2.0/src/ngResource/resource.js#L538-L549
@js.native
trait IResourceClass[T]
  extends Instantiable0[IResource[T]]
     with Instantiable1[/* dataOrParams */ js.Any, IResource[T]] {
  def delete(): IResource[T] = js.native
  def delete(params: js.Object): IResource[T] = js.native
  def delete(params: js.Object, data: js.Object): IResource[T] = js.native
  def delete(params: js.Object, data: js.Object, success: js.Function): IResource[T] = js.native
  def delete(params: js.Object, data: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def delete(params: js.Object, success: js.Function): IResource[T] = js.native
  def delete(params: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def delete(success: js.Function): IResource[T] = js.native
  def delete(success: js.Function, error: js.Function): IResource[T] = js.native
  def get(): IResource[T] = js.native
  def get(params: js.Object): IResource[T] = js.native
  def get(params: js.Object, data: js.Object): IResource[T] = js.native
  def get(params: js.Object, data: js.Object, success: js.Function): IResource[T] = js.native
  def get(params: js.Object, data: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def get(params: js.Object, success: js.Function): IResource[T] = js.native
  def get(params: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def get(success: js.Function): IResource[T] = js.native
  def get(success: js.Function, error: js.Function): IResource[T] = js.native
  def odata(): Provider[T] = js.native
  def query(): IResourceArray[T] = js.native
  def query(params: js.Object): IResourceArray[T] = js.native
  def query(params: js.Object, data: js.Object): IResourceArray[T] = js.native
  def query(params: js.Object, data: js.Object, success: js.Function): IResourceArray[T] = js.native
  def query(params: js.Object, data: js.Object, success: js.Function, error: js.Function): IResourceArray[T] = js.native
  def query(params: js.Object, success: js.Function): IResourceArray[T] = js.native
  def query(params: js.Object, success: js.Function, error: js.Function): IResourceArray[T] = js.native
  def query(success: js.Function): IResourceArray[T] = js.native
  def query(success: js.Function, error: js.Function): IResourceArray[T] = js.native
  def remove(): IResource[T] = js.native
  def remove(params: js.Object): IResource[T] = js.native
  def remove(params: js.Object, data: js.Object): IResource[T] = js.native
  def remove(params: js.Object, data: js.Object, success: js.Function): IResource[T] = js.native
  def remove(params: js.Object, data: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def remove(params: js.Object, success: js.Function): IResource[T] = js.native
  def remove(params: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def remove(success: js.Function): IResource[T] = js.native
  def remove(success: js.Function, error: js.Function): IResource[T] = js.native
  def save(): IResource[T] = js.native
  def save(data: js.Object): IResource[T] = js.native
  def save(data: js.Object, success: js.Function): IResource[T] = js.native
  def save(data: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def save(params: js.Object, data: js.Object): IResource[T] = js.native
  def save(params: js.Object, data: js.Object, success: js.Function): IResource[T] = js.native
  def save(params: js.Object, data: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def save(success: js.Function): IResource[T] = js.native
  def save(success: js.Function, error: js.Function): IResource[T] = js.native
  def update(): IResource[T] = js.native
  def update(data: js.Object): IResource[T] = js.native
  def update(data: js.Object, success: js.Function): IResource[T] = js.native
  def update(data: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def update(params: js.Object, data: js.Object): IResource[T] = js.native
  def update(params: js.Object, data: js.Object, success: js.Function): IResource[T] = js.native
  def update(params: js.Object, data: js.Object, success: js.Function, error: js.Function): IResource[T] = js.native
  def update(success: js.Function): IResource[T] = js.native
  def update(success: js.Function, error: js.Function): IResource[T] = js.native
}


package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait promiseUtils extends js.Object {
  /**
    * Convenience utility method for creating and resolving a promise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#create)
    *
    * @param executor A function that will be called with two methods, `resolve` and `reject`.
    *
    */
  def create(executor: Executor): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def eachAlways(promises: js.Any): arcgisDashJsDashApiLib.IPromise[js.Array[EachAlwaysResult]] | js.Any = js.native
  /**
    * Convenience utility method to wait for a number of promises to either resolve or reject. The resulting promise resolves to an array of result objects containing the promise and either a value if the promise resolved, or an error if the promise rejected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#eachAlways)
    *
    * @param promises Array of promises, or object where each property is a promise.
    *
    */
  def eachAlways(promises: js.Array[arcgisDashJsDashApiLib.IPromise[_]]): arcgisDashJsDashApiLib.IPromise[js.Array[EachAlwaysResult]] | js.Any = js.native
  /**
    * A convenience utility method for filtering an array of values using an asynchronous predicate function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#filter)
    *
    * @param input The array of input values to filter.
    * @param predicate A predicate function returning a promise. Only array entries for which the returned promise contains `true` are kept.
    *
    */
  def filter[T](input: js.Array[T], predicate: FilterPredicateCallback): arcgisDashJsDashApiLib.IPromise[js.Array[T]] = js.native
  /**
    * Convenience utility method to create a promise that has been rejected with a provided error value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#reject)
    *
    * @param error The error to reject the resulting promise with.
    *
    */
  def reject[T](): arcgisDashJsDashApiLib.IPromise[T] = js.native
  def reject[T](error: js.Any): arcgisDashJsDashApiLib.IPromise[T] = js.native
  /**
    * Convenience utility method to create a promise that will be resolved with a provided value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#resolve)
    *
    * @param value The value to resolve the resulting promise with.
    *
    */
  def resolve[T](): arcgisDashJsDashApiLib.IPromise[T] = js.native
  def resolve[T](value: T): arcgisDashJsDashApiLib.IPromise[T] = js.native
}


package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
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
  def create(executor: Executor): js.Promise[_] = js.native
  /**
    * Creates a special error object which is used to signal aborted requests in promise chains. Promises that are rejected due to [abort signals](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) should reject with this kind of error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#createAbortError)
    *
    *
    */
  def createAbortError(): Error = js.native
  /**
    * A utility for ensuring an input function is not simultaneously invoked more than once at a time. This is useful for highly interactive applications such as those that execute statistic queries on mouse-move or mouse-drag events. Rather than execute the query for each such event, you can "debounce", or cancel the function execution, until the previous execution of the same function call finishes. This improves the performance and user experience of such applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#debounce)
    *
    * @param callback A function to prevent executing during the execution of a previous call to the same function. This is typically a function that may be called on mouse-move or mouse-drag events.
    *
    */
  def debounce[T](callback: T): T = js.native
  def eachAlways(promises: js.Any): js.Promise[js.Array[EachAlwaysResult]] | js.Any = js.native
  /**
    * Convenience utility method to wait for a number of promises to either resolve or reject. The resulting promise resolves to an array of result objects containing the promise and either a value if the promise resolved, or an error if the promise rejected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#eachAlways)
    *
    * @param promises Array of promises, or object where each property is a promise.
    *
    */
  def eachAlways(promises: js.Array[js.Promise[_]]): js.Promise[js.Array[EachAlwaysResult]] | js.Any = js.native
  /**
    * A convenience utility method for filtering an array of values using an asynchronous predicate function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#filter)
    *
    * @param input The array of input values to filter.
    * @param predicate A predicate function returning a promise. Only array entries for which the returned promise contains `true` are kept.
    *
    */
  def filter[T](input: js.Array[T], predicate: FilterPredicateCallback): js.Promise[js.Array[T]] = js.native
  /**
    * Check if the provided error object is the special kind of error with which promises are rejected when they are aborted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#isAbortError)
    *
    * @param error The error object to test.
    *
    */
  def isAbortError(error: Error): Boolean = js.native
  /**
    * Convenience utility method to create a promise that has been rejected with a provided error value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#reject)
    *
    * @param error The error to reject the resulting promise with.
    *
    */
  def reject[T](): js.Promise[T] = js.native
  def reject[T](error: js.Any): js.Promise[T] = js.native
  /**
    * Convenience utility method to create a promise that will be resolved with a provided value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#resolve)
    *
    * @param value The value to resolve the resulting promise with.
    *
    */
  def resolve[T](): js.Promise[T] = js.native
  def resolve[T](value: T): js.Promise[T] = js.native
}

@JSGlobal("__esri.promiseUtils")
@js.native
object promiseUtils extends TopLevel[promiseUtils]


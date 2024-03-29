package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Various utilities and convenience functions for working with promises.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html)
	 */
@js.native
trait promiseUtils extends StObject {
  
  /**
  		 * Creates a special error object which is used to signal aborted requests in promise chains.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#createAbortError)
  		 */
  def createAbortError(): Error = js.native
  
  /**
  		 * A utility for ensuring an input function is not simultaneously invoked more than once at a time.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#debounce)
  		 */
  def debounce[T](callback: T): T = js.native
  
  /**
  		 * Convenience utility method to wait for a number of promises to either resolve or reject.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#eachAlways)
  		 */
  def eachAlways(promises: js.Array[js.Promise[Any]]): js.Promise[js.Array[EachAlwaysResult]] | Any = js.native
  def eachAlways(promises: Any): js.Promise[js.Array[EachAlwaysResult]] | Any = js.native
  
  /**
  		 * A convenience utility method for filtering an array of values using an asynchronous predicate function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#filter)
  		 */
  def filter[T](input: js.Array[T], predicate: FilterPredicateCallback): js.Promise[js.Array[T]] = js.native
  
  /**
  		 * Check if the provided error object is the special kind of error with which promises are rejected when they are aborted.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#isAbortError)
  		 */
  def isAbortError(error: Error): Boolean = js.native
}

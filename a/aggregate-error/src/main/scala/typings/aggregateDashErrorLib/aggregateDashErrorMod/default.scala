package typings
package aggregateDashErrorLib.aggregateDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aggregate-error", JSImport.Default)
@js.native
class default protected () extends AggregateError {
  /**
  	 * @param errors - If a string, a new `Error` is created with the string as the error message. If a non-Error object, a new `Error` is created with all properties from the object copied over.
  	 * @returns An Error that is also an [`Iterable`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Iterators_and_Generators#Iterables) for the individual errors.
  	 */
  def this(errors: js.Array[stdLib.Error | org.scalablytyped.runtime.StringDictionary[_] | java.lang.String]) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[stdLib.Error]] = js.native
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator_AggregateError: js.Function0[stdLib.IterableIterator[stdLib.Error]] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  @JSName("name")
  override val name_AggregateError: aggregateDashErrorLib.aggregateDashErrorLibStrings.AggregateError = js.native
}


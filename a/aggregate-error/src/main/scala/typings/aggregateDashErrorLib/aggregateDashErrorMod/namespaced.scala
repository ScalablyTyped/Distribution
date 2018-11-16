package typings
package aggregateDashErrorLib.aggregateDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aggregate-error", JSImport.Namespace)
@js.native
class namespaced protected () extends AggregateError {
  def this(errors: stdLib.Iterable[stdLib.Error | java.lang.String]) = this()
  /* CompleteClass */
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[stdLib.Iterator[stdLib.Error]] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}


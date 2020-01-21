package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "IntegerIterator")
@js.native
class IntegerIterator () extends AsyncIterator[Double] {
  def this(options: IntegerIteratorOptions) = this()
  var _last: Double = js.native
  var _next: Double = js.native
  var _step: Double = js.native
}


package typings.asynciterator.mod

import typings.asynciterator.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "IntegerIterator")
@js.native
/**
  Creates a new `IntegerIterator`.
  @param {object} [options] Settings of the iterator
  @param {integer} [options.start=0] The first number to emit
  @param {integer} [options.end=Infinity] The last number to emit
  @param {integer} [options.step=1] The increment between two numbers
  */
class IntegerIterator () extends AsyncIterator[Double] {
  def this(hasStartStepEnd: End) = this()
  
  var _last: js.Any = js.native
  
  var _next: js.Any = js.native
  
  var _step: js.Any = js.native
}

package typings.atAngularCompiler.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var descendants: Boolean
  var first: Boolean
  var isViewQuery: Boolean
  var read: js.Any
  var selector: js.Any
  var static: Boolean
}

object Query {
  @scala.inline
  def apply(
    descendants: Boolean,
    first: Boolean,
    isViewQuery: Boolean,
    read: js.Any,
    selector: js.Any,
    static: Boolean
  ): Query = {
    val __obj = js.Dynamic.literal(descendants = descendants, first = first, isViewQuery = isViewQuery, read = read, selector = selector, static = static)
  
    __obj.asInstanceOf[Query]
  }
}


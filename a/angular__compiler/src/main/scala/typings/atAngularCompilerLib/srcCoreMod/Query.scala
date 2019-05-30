package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var descendants: scala.Boolean
  var first: scala.Boolean
  var isViewQuery: scala.Boolean
  var read: js.Any
  var selector: js.Any
  var static: scala.Boolean
}

object Query {
  @scala.inline
  def apply(
    descendants: scala.Boolean,
    first: scala.Boolean,
    isViewQuery: scala.Boolean,
    read: js.Any,
    selector: js.Any,
    static: scala.Boolean
  ): Query = {
    val __obj = js.Dynamic.literal(descendants = descendants, first = first, isViewQuery = isViewQuery, read = read, selector = selector, static = static)
  
    __obj.asInstanceOf[Query]
  }
}


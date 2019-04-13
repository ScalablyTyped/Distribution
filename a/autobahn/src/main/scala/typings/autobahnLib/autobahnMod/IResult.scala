package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResult extends js.Object {
  var args: js.Array[_]
  var kwargs: js.Any
}

object IResult {
  @scala.inline
  def apply(args: js.Array[_], kwargs: js.Any): IResult = {
    val __obj = js.Dynamic.literal(args = args, kwargs = kwargs)
  
    __obj.asInstanceOf[IResult]
  }
}


package typings.autobahn.mod

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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kwargs = kwargs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
}


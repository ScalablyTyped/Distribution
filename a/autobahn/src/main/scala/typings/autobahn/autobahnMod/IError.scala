package typings.autobahn.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IError extends js.Object {
  var args: js.Array[_]
  var error: String
  var kwargs: js.Any
}

object IError {
  @scala.inline
  def apply(args: js.Array[_], error: String, kwargs: js.Any): IError = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], kwargs = kwargs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IError]
  }
}


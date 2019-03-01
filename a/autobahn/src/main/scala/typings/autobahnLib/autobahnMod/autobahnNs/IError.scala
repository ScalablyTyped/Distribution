package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IError extends js.Object {
  var args: js.Array[_]
  var error: java.lang.String
  var kwargs: js.Any
}

object IError {
  @scala.inline
  def apply(args: js.Array[_], error: java.lang.String, kwargs: js.Any): IError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("kwargs")(kwargs)
    __obj.asInstanceOf[IError]
  }
}


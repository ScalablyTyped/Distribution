package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends IError

object Error {
  @scala.inline
  def apply(args: js.Array[_], error: java.lang.String, kwargs: js.Any): Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("kwargs")(kwargs)
    __obj.asInstanceOf[Error]
  }
}


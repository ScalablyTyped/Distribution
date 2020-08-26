package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IError extends js.Object {
  var args: js.Array[_] = js.native
  var error: String = js.native
  var kwargs: js.Any = js.native
}

object IError {
  @scala.inline
  def apply(args: js.Array[_], error: String, kwargs: js.Any): IError = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], kwargs = kwargs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  @scala.inline
  implicit class IErrorOps[Self <: IError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setKwargs(value: js.Any): Self = this.set("kwargs", value.asInstanceOf[js.Any])
  }
  
}


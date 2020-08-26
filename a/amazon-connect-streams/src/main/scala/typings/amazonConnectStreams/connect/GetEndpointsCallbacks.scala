package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEndpointsCallbacks extends js.Object {
  val failure: js.UndefOr[SuccessFailCallback[js.Array[String]]] = js.native
  def success(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[GetEndpointsResult]
  ): Unit = js.native
}

object GetEndpointsCallbacks {
  @scala.inline
  def apply(success: js.Array[GetEndpointsResult] => Unit): GetEndpointsCallbacks = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetEndpointsCallbacks]
  }
  @scala.inline
  implicit class GetEndpointsCallbacksOps[Self <: GetEndpointsCallbacks] (val x: Self) extends AnyVal {
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
    def setSuccess(value: js.Array[GetEndpointsResult] => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setFailure(value: js.Array[String] => Unit): Self = this.set("failure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
  }
  
}


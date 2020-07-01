package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEndpointsCallbacks extends js.Object {
  val failure: js.UndefOr[SuccessFailCallback[js.Array[String]]] = js.undefined
  def success(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[GetEndpointsResult]
  ): Unit
}

object GetEndpointsCallbacks {
  @scala.inline
  def apply(success: js.Array[GetEndpointsResult] => Unit, failure: js.Array[String] => Unit = null): GetEndpointsCallbacks = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction1(failure))
    __obj.asInstanceOf[GetEndpointsCallbacks]
  }
}


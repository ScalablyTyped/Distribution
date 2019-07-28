package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendConnectionErrors extends js.Object {
  /**
    * 
    */
  var ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.undefined
  /**
    * 
    */
  var HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.undefined
  /**
    * 
    */
  var HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.undefined
  /**
    * 
    */
  var OtherCount: js.UndefOr[NullableInteger] = js.undefined
  /**
    * 
    */
  var TimeoutCount: js.UndefOr[NullableInteger] = js.undefined
  /**
    * 
    */
  var UnknownHostCount: js.UndefOr[NullableInteger] = js.undefined
}

object BackendConnectionErrors {
  @scala.inline
  def apply(
    ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.undefined,
    HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.undefined,
    HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.undefined,
    OtherCount: js.UndefOr[NullableInteger] = js.undefined,
    TimeoutCount: js.UndefOr[NullableInteger] = js.undefined,
    UnknownHostCount: js.UndefOr[NullableInteger] = js.undefined
  ): BackendConnectionErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConnectionRefusedCount)) __obj.updateDynamic("ConnectionRefusedCount")(ConnectionRefusedCount)
    if (!js.isUndefined(HTTPCode4XXCount)) __obj.updateDynamic("HTTPCode4XXCount")(HTTPCode4XXCount)
    if (!js.isUndefined(HTTPCode5XXCount)) __obj.updateDynamic("HTTPCode5XXCount")(HTTPCode5XXCount)
    if (!js.isUndefined(OtherCount)) __obj.updateDynamic("OtherCount")(OtherCount)
    if (!js.isUndefined(TimeoutCount)) __obj.updateDynamic("TimeoutCount")(TimeoutCount)
    if (!js.isUndefined(UnknownHostCount)) __obj.updateDynamic("UnknownHostCount")(UnknownHostCount)
    __obj.asInstanceOf[BackendConnectionErrors]
  }
}


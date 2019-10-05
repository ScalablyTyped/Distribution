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
    ConnectionRefusedCount: Int | scala.Double = null,
    HTTPCode4XXCount: Int | scala.Double = null,
    HTTPCode5XXCount: Int | scala.Double = null,
    OtherCount: Int | scala.Double = null,
    TimeoutCount: Int | scala.Double = null,
    UnknownHostCount: Int | scala.Double = null
  ): BackendConnectionErrors = {
    val __obj = js.Dynamic.literal()
    if (ConnectionRefusedCount != null) __obj.updateDynamic("ConnectionRefusedCount")(ConnectionRefusedCount.asInstanceOf[js.Any])
    if (HTTPCode4XXCount != null) __obj.updateDynamic("HTTPCode4XXCount")(HTTPCode4XXCount.asInstanceOf[js.Any])
    if (HTTPCode5XXCount != null) __obj.updateDynamic("HTTPCode5XXCount")(HTTPCode5XXCount.asInstanceOf[js.Any])
    if (OtherCount != null) __obj.updateDynamic("OtherCount")(OtherCount.asInstanceOf[js.Any])
    if (TimeoutCount != null) __obj.updateDynamic("TimeoutCount")(TimeoutCount.asInstanceOf[js.Any])
    if (UnknownHostCount != null) __obj.updateDynamic("UnknownHostCount")(UnknownHostCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendConnectionErrors]
  }
}


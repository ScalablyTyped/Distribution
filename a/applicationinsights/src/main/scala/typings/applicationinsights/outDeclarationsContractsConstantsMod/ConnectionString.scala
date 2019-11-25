package typings.applicationinsights.outDeclarationsContractsConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionString extends js.Object {
  var authorization: js.UndefOr[String] = js.undefined
  var endpointsuffix: js.UndefOr[String] = js.undefined
  var ingestionendpoint: js.UndefOr[String] = js.undefined
  var instrumentationkey: js.UndefOr[String] = js.undefined
  var liveendpoint: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
}

object ConnectionString {
  @scala.inline
  def apply(
    authorization: String = null,
    endpointsuffix: String = null,
    ingestionendpoint: String = null,
    instrumentationkey: String = null,
    liveendpoint: String = null,
    location: String = null
  ): ConnectionString = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (endpointsuffix != null) __obj.updateDynamic("endpointsuffix")(endpointsuffix.asInstanceOf[js.Any])
    if (ingestionendpoint != null) __obj.updateDynamic("ingestionendpoint")(ingestionendpoint.asInstanceOf[js.Any])
    if (instrumentationkey != null) __obj.updateDynamic("instrumentationkey")(instrumentationkey.asInstanceOf[js.Any])
    if (liveendpoint != null) __obj.updateDynamic("liveendpoint")(liveendpoint.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionString]
  }
}


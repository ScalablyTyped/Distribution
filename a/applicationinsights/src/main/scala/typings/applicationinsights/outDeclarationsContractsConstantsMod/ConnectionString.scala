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
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    if (endpointsuffix != null) __obj.updateDynamic("endpointsuffix")(endpointsuffix)
    if (ingestionendpoint != null) __obj.updateDynamic("ingestionendpoint")(ingestionendpoint)
    if (instrumentationkey != null) __obj.updateDynamic("instrumentationkey")(instrumentationkey)
    if (liveendpoint != null) __obj.updateDynamic("liveendpoint")(liveendpoint)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[ConnectionString]
  }
}


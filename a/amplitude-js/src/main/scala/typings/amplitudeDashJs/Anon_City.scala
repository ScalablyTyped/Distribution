package typings.amplitudeDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
  var city: js.UndefOr[Boolean] = js.undefined
  var country: js.UndefOr[Boolean] = js.undefined
  var device_model: js.UndefOr[Boolean] = js.undefined
  var dma: js.UndefOr[Boolean] = js.undefined
  var ip_address: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[Boolean] = js.undefined
  var os_name: js.UndefOr[Boolean] = js.undefined
  var os_version: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[Boolean] = js.undefined
  var region: js.UndefOr[Boolean] = js.undefined
  var version_name: js.UndefOr[Boolean] = js.undefined
}

object Anon_City {
  @scala.inline
  def apply(
    city: js.UndefOr[Boolean] = js.undefined,
    country: js.UndefOr[Boolean] = js.undefined,
    device_model: js.UndefOr[Boolean] = js.undefined,
    dma: js.UndefOr[Boolean] = js.undefined,
    ip_address: js.UndefOr[Boolean] = js.undefined,
    language: js.UndefOr[Boolean] = js.undefined,
    os_name: js.UndefOr[Boolean] = js.undefined,
    os_version: js.UndefOr[Boolean] = js.undefined,
    platform: js.UndefOr[Boolean] = js.undefined,
    region: js.UndefOr[Boolean] = js.undefined,
    version_name: js.UndefOr[Boolean] = js.undefined
  ): Anon_City = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(city)) __obj.updateDynamic("city")(city)
    if (!js.isUndefined(country)) __obj.updateDynamic("country")(country)
    if (!js.isUndefined(device_model)) __obj.updateDynamic("device_model")(device_model)
    if (!js.isUndefined(dma)) __obj.updateDynamic("dma")(dma)
    if (!js.isUndefined(ip_address)) __obj.updateDynamic("ip_address")(ip_address)
    if (!js.isUndefined(language)) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(os_name)) __obj.updateDynamic("os_name")(os_name)
    if (!js.isUndefined(os_version)) __obj.updateDynamic("os_version")(os_version)
    if (!js.isUndefined(platform)) __obj.updateDynamic("platform")(platform)
    if (!js.isUndefined(region)) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(version_name)) __obj.updateDynamic("version_name")(version_name)
    __obj.asInstanceOf[Anon_City]
  }
}


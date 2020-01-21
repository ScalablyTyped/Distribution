package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDevice extends js.Object {
  /**
    * A device unique ID.
    */
  var id: String
  /**
    * The IP address.
    */
  var ip: String
  /**
    * The device language.
    */
  var language: String
  /**
    * The current display language of the operating system.
    */
  var locale: String
  /**
    * The device model for the current device.
    */
  var model: String
  /**
    * The IANA interface type for the internet connected network adapter.
    */
  var network: Double
  /**
    * The device OEM for the current device.
    */
  var oemName: String
  /**
    * The OS name.
    */
  var os: String
  /**
    * The OS version.
    */
  var osversion: String
  /**
    * The application screen resolution.
    */
  var resolution: String
  /**
    * The type for the current device.
    */
  var `type`: String
}

object IDevice {
  @scala.inline
  def apply(
    id: String,
    ip: String,
    language: String,
    locale: String,
    model: String,
    network: Double,
    oemName: String,
    os: String,
    osversion: String,
    resolution: String,
    `type`: String
  ): IDevice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], oemName = oemName.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], osversion = osversion.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDevice]
  }
}


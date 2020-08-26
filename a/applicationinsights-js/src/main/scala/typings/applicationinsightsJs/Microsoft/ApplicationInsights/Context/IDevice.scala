package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDevice extends js.Object {
  /**
    * A device unique ID.
    */
  var id: String = js.native
  /**
    * The IP address.
    */
  var ip: String = js.native
  /**
    * The device language.
    */
  var language: String = js.native
  /**
    * The current display language of the operating system.
    */
  var locale: String = js.native
  /**
    * The device model for the current device.
    */
  var model: String = js.native
  /**
    * The IANA interface type for the internet connected network adapter.
    */
  var network: Double = js.native
  /**
    * The device OEM for the current device.
    */
  var oemName: String = js.native
  /**
    * The OS name.
    */
  var os: String = js.native
  /**
    * The OS version.
    */
  var osversion: String = js.native
  /**
    * The application screen resolution.
    */
  var resolution: String = js.native
  /**
    * The type for the current device.
    */
  var `type`: String = js.native
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
  @scala.inline
  implicit class IDeviceOps[Self <: IDevice] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetwork(value: Double): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def setOemName(value: String): Self = this.set("oemName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setOsversion(value: String): Self = this.set("osversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


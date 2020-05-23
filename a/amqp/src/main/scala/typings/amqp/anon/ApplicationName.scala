package typings.amqp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationName extends js.Object {
  var applicationName: js.UndefOr[String] = js.undefined
  var capabilities: js.UndefOr[Consumercancelnotify] = js.undefined
  /** Default: 'node-' + process.version */
  var platform: js.UndefOr[String] = js.undefined
  /** Default: node-amqp */
  var product: js.UndefOr[String] = js.undefined
  /** Default: 'nodeAMQPVersion' */
  var version: js.UndefOr[String] = js.undefined
}

object ApplicationName {
  @scala.inline
  def apply(
    applicationName: String = null,
    capabilities: Consumercancelnotify = null,
    platform: String = null,
    product: String = null,
    version: String = null
  ): ApplicationName = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationName]
  }
}


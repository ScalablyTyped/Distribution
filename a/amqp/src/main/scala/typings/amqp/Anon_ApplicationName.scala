package typings.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplicationName extends js.Object {
  var applicationName: js.UndefOr[String] = js.undefined
  var capabilities: js.UndefOr[Anon_Consumercancelnotify] = js.undefined
  /** Default: 'node-' + process.version */
  var platform: js.UndefOr[String] = js.undefined
  /** Default: node-amqp */
  var product: js.UndefOr[String] = js.undefined
  /** Default: 'nodeAMQPVersion' */
  var version: js.UndefOr[String] = js.undefined
}

object Anon_ApplicationName {
  @scala.inline
  def apply(
    applicationName: String = null,
    capabilities: Anon_Consumercancelnotify = null,
    platform: String = null,
    product: String = null,
    version: String = null
  ): Anon_ApplicationName = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (product != null) __obj.updateDynamic("product")(product)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_ApplicationName]
  }
}


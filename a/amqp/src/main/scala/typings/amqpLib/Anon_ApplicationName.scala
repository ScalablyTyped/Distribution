package typings
package amqpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplicationName extends js.Object {
  var applicationName: js.UndefOr[java.lang.String] = js.undefined
  var capabilities: js.UndefOr[Anon_Consumercancelnotify] = js.undefined
  /** Default: 'node-' + process.version */
  var platform: js.UndefOr[java.lang.String] = js.undefined
  /** Default: node-amqp */
  var product: js.UndefOr[java.lang.String] = js.undefined
  /** Default: 'nodeAMQPVersion' */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ApplicationName {
  @scala.inline
  def apply(
    applicationName: java.lang.String = null,
    capabilities: Anon_Consumercancelnotify = null,
    platform: java.lang.String = null,
    product: java.lang.String = null,
    version: java.lang.String = null
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


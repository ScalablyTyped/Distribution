package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerProperties
  extends /* key */ StringDictionary[js.UndefOr[String]] {
  var copyright: js.UndefOr[String] = js.undefined
  var host: String
  var information: String
  var platform: String
  var product: String
  var version: String
}

object ServerProperties {
  @scala.inline
  def apply(
    host: String,
    information: String,
    platform: String,
    product: String,
    version: String,
    StringDictionary: /* header */ StringDictionary[js.UndefOr[String]] = null,
    copyright: String = null
  ): ServerProperties = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerProperties]
  }
}


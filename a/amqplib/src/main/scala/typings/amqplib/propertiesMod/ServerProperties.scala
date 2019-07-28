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
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String]] = null,
    copyright: String = null
  ): ServerProperties = {
    val __obj = js.Dynamic.literal(host = host, information = information, platform = platform, product = product, version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    __obj.asInstanceOf[ServerProperties]
  }
}


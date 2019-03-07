package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerProperties
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] {
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String
  var information: java.lang.String
  var platform: java.lang.String
  var product: java.lang.String
  var version: java.lang.String
}

object ServerProperties {
  @scala.inline
  def apply(
    host: java.lang.String,
    information: java.lang.String,
    platform: java.lang.String,
    product: java.lang.String,
    version: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    copyright: java.lang.String = null
  ): ServerProperties = {
    val __obj = js.Dynamic.literal(host = host, information = information, platform = platform, product = product, version = version)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    __obj.asInstanceOf[ServerProperties]
  }
}


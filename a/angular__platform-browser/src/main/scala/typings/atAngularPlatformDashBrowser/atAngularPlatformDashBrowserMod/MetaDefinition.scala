package typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaDefinition extends /* prop */ StringDictionary[String] {
  var charset: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var httpEquiv: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemprop: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object MetaDefinition {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ StringDictionary[String] = null,
    charset: String = null,
    content: String = null,
    httpEquiv: String = null,
    id: String = null,
    itemprop: String = null,
    name: String = null,
    property: String = null,
    scheme: String = null,
    url: String = null
  ): MetaDefinition = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (content != null) __obj.updateDynamic("content")(content)
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemprop != null) __obj.updateDynamic("itemprop")(itemprop)
    if (name != null) __obj.updateDynamic("name")(name)
    if (property != null) __obj.updateDynamic("property")(property)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MetaDefinition]
  }
}


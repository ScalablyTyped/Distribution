package typings
package atAngularPlatformDashBrowserLib.srcBrowserMetaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaDefinition
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var httpEquiv: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var itemprop: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var scheme: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object MetaDefinition {
  @scala.inline
  def apply(
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    charset: java.lang.String = null,
    content: java.lang.String = null,
    httpEquiv: java.lang.String = null,
    id: java.lang.String = null,
    itemprop: java.lang.String = null,
    name: java.lang.String = null,
    property: java.lang.String = null,
    scheme: java.lang.String = null,
    url: java.lang.String = null
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

